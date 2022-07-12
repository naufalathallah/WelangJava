/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.DBWelang;
import Model.Bid;
import Model.Lelang;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NAUFAL
 */
public class LelangDAO {
    
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    
    //insert
    public static int add(Lelang b) {
        int status = 0;
        try {
            conn = new DBWelang().setConnection();
            ps = conn.prepareStatement("insert into datalelang(item,kondisi,kode,lokasi) values(?,?,?,?)");
            ps.setString(1, b.getItem());
            ps.setString(2, b.getKondisi());
            ps.setString(3, b.getKode());
            ps.setString(4, b.getLokasi());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    //delete
    public static int delete(Lelang b) {
        int status = 0;
        try {
            conn = new DBWelang().setConnection();
            ps = conn.prepareStatement("delete from datalelang where id_lelang=?");
            ps.setInt(1, b.getId());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }

        return status;
    }
    
    //update
    public static int update(Lelang b) {
        int status = 0;
        try {
            conn = new DBWelang().setConnection();
            ps = conn.prepareStatement("update datalelang set item=?,kondisi=?,kode=?,lokasi=? where id_lelang=?");
            ps.setString(1, b.getItem());
            ps.setString(2, b.getKondisi());
            ps.setString(3, b.getKode());
            ps.setString(4, b.getLokasi());
            ps.setInt(5, b.getId());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    //view
    public static List<Lelang> getAllRecords() {
        List<Lelang> list = new ArrayList<Lelang>();

        try {
            conn = new DBWelang().setConnection();
            ps = conn.prepareStatement("select * from datalelang");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Lelang u = new Lelang();
                u.setId(rs.getInt("id_lelang"));
                u.setItem(rs.getString("item"));
                u.setKondisi(rs.getString("kondisi"));
                u.setKode(rs.getString("kode"));
                u.setLokasi(rs.getString("lokasi"));
                list.add(u);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
    public static Lelang getRecordById(int id) {
        Lelang u = null;
        try {
            conn = new DBWelang().setConnection();
            ps = conn.prepareStatement("select * from datalelang where id_lelang=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u = new Lelang();
                u.setId(rs.getInt("id_lelang"));
                u.setItem(rs.getString("item"));
                u.setKondisi(rs.getString("kondisi"));
                u.setKode(rs.getString("kode"));
                u.setLokasi(rs.getString("lokasi"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return u;
    }
}
