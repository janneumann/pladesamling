/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dataaccess;

import java.util.List;
import logic.Kunstner;
import logic.Plade;
import logic.User;

/**
 *
 * @author JNE
 */
public interface DataFacadeIF {
    
    boolean authenticate(String username, String password);

    List<Kunstner> getAllKunstner();

    List<Plade> getAllPlader();
    
    List<User> getAllUsers();
    
    void addKunstner(String kunstner_navn, String country);

    void addPlade(String pladenavn, int indspillet_year);
    
    User getUser(int id);
    
    User getUserFromName(String username);

}
