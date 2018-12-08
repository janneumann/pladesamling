/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import logic.Plade;
import logic.Kunstner;
import static model.dataaccess.DB.getConnection;

/**
 *
 * @author JNE
 */
public class DataMapper {

    private static final String GET_ALL_PLADER = "SELECT id, pladenavn, indspillet_year FROM plade";
    private static final String GET_ALL_KUNSTNER = "SELECT idkunstner, kunstner_navn, country FROM kunstner";
    private static final String ADD_PLADE = "INSERT INTO pladesamling.plade (pladenavn, indspillet_year) VALUES (?,?)";
    private static final String ADD_KUNSTNER = "INSERT INTO pladesamling.kunstner (kunstner_navn, country) VALUES (?,?)";
    private static final String DELETE_KUNSTNER = "DELETE FROM pladesamling.kunstner WHERE id = ?";

    public List<Plade> getAllPlader() {
        List<Plade> plader = new ArrayList();
        Plade plade = null;
        try {

            Connection conn = getConnection(); //create the connections to the database
            PreparedStatement pstmt = conn.prepareStatement(GET_ALL_PLADER); //Create the statement to be run on the database
            ResultSet rs = pstmt.executeQuery(); //Actually execute the statement on the database.
            while (rs.next()) { //loop through each row in the dataset
                int id = rs.getInt("id");
                String pladenavn = rs.getString("pladenavn");
                int indspillet_year = rs.getInt("indspillet_year");
                System.out.println("Pladenavn: " + pladenavn);
                plade = new Plade(id, pladenavn, indspillet_year);
                plader.add(plade); //add each new plade to the list
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return plader;
    }

    public List<Kunstner> getAllKunstner() {
        List<Kunstner> kunstnere = new ArrayList();
        Kunstner kunstner = null;
        try {

            Connection conn = getConnection(); //create the connections to the database
            PreparedStatement pstmt = conn.prepareStatement(GET_ALL_KUNSTNER); //Create the statement to be run on the database
            ResultSet rs = pstmt.executeQuery(); //Actually execute the statement on the database.
            while (rs.next()) { //loop through each row in the dataset
                int id = rs.getInt("idkunstner");
                String kunstnernavn = rs.getString("kunstner_navn");
                String country = rs.getString("country");
                System.out.println("Kunstnernavn: " + kunstnernavn);
                kunstner = new Kunstner(id, kunstnernavn, country);
                kunstnere.add(kunstner); //add each new kunstner to the list
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return kunstnere;
    }
    
    public void addKunstner(String kunstner_navn, String country){
        try {
            PreparedStatement pstmt = getConnection().prepareStatement(ADD_KUNSTNER);
            pstmt.setString(1,kunstner_navn);
            pstmt.setString(2,country);
            pstmt.executeUpdate(); // her bruges executeUpdate istedet for executeQuery (det gælder ved update, create og delete operationer).
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        //new DataMapper().getAllKunstner().forEach((kunstner)->{System.out.println("kunstner: "+kunstner);});
    }

}
