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
public class DataFacade implements DataFacadeIF {
    DataMapper dm = new DataMapper();
    UserMapper um = new UserMapper();


@Override
    public List<Kunstner> getAllKunstner(){
        return dm.getAllKunstner();
    }

@Override
    public List<Plade> getAllPlader(){
        return dm.getAllPlader();
    }

@Override
    public void addKunstner(String kunstner_navn, String country){
        dm.addKunstner(kunstner_navn, country);
    }    

@Override
    public void addPlade(String pladenavn, int indspillet_year){
        dm.addPlade(pladenavn, indspillet_year);
    } 
    
@Override
    public List<User> getAllUsers(){
    return um.getAllUsers();
    }

@Override
    public User getUser(int id){
    return um.getUser(id);
    }

@Override
    public boolean authenticate(String username, String password){
    return um.authenticate(username, password);
    }

@Override
    public User getUserFromName(String username){
    return um.getUserByName(username);
    }
}
