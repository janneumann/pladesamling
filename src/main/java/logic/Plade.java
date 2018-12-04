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
public class Plade {
    int id;
    private String pladenavn;
    private int indspillet_year;

    public Plade(int id, String pladenavn, int indspillet_year) {
        this.id = id;
        this.pladenavn = pladenavn;
        this.indspillet_year = indspillet_year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPladenavn() {
        return pladenavn;
    }

    public void setPladenavn(String pladenavn) {
        this.pladenavn = pladenavn;
    }

    public int getIndspillet_year() {
        return indspillet_year;
    }

    public void setIndspillet_year(int indspillet_year) {
        this.indspillet_year = indspillet_year;
    }
    
    
}
