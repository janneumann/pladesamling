/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author JNE
 */
public class DB {
  public static final String driver = "com.mysql.jdbc.Driver";
    public static final String url = "jdbc:mysql://localhost:3306/pladesamling";
    public static final String username = "root";
    public static final String password = "root";
    
    Connection conn;
    public static Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(DB.url,DB.username,DB.password);
            
        } catch(ClassNotFoundException se){
           se.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }
    public static void close(Statement stmt, ResultSet rs, Connection conn){
        try{
            if(rs != null)
                rs.close();
            stmt.close();
            conn.close();
        } catch(SQLException se){
            
        } catch(Exception ex){
            
        }
        finally{
            try{
              if(stmt!=null)
                 stmt.close();
           }catch(SQLException se2){
           }// nothing we can do
           try{
              if(conn!=null)
                 conn.close();
           }catch(SQLException se){
              se.printStackTrace();
           }
        }
    }  
}
