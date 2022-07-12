/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author NAUFAL
 */
public class Bid {
    
    private int id,id_lelang;
    private String username;
    private Double nominal;

    public int getId_lelang() {
        return id_lelang;
    }

    public void setId_lelang(int id_lelang) {
        this.id_lelang = id_lelang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getNominal() {
        return nominal;
    }

    public void setNominal(Double nominal) {
        this.nominal = nominal;
    }
    
}
