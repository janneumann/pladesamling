/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author JNE
 */
public class Kunstner {
    int id;
    private String kunsternavn;
    private String country;

    public Kunstner(int id, String kunsternavn, String country) {
        this.id = id;
        this.kunsternavn = kunsternavn;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKunsternavn() {
        return kunsternavn;
    }

    public void setKunsternavn(String kunsternavn) {
        this.kunsternavn = kunsternavn;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
}
