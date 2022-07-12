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
public class BidDAO {
    
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    
    //view bid
    public static List<Bid> getAllRecords(int id) {
        List<Bid> list = new ArrayList<Bid>();

        try {
            conn = new DBWelang().setConnection();
            ps = conn.prepareStatement("select * from databid WHERE id_lelang="+id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Bid u = new Bid();
                u.setId(rs.getInt("id_bid"));
                u.setUsername(rs.getString("username"));
                u.setNominal(Double.parseDouble(rs.getString("nominal")));
                list.add(u);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
    public static Bid getRecordById(int id) {
        Bid u = null;
        try {
            conn = new DBWelang().setConnection();
            ps = conn.prepareStatement("select * from databid where id_lelang=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u = new Bid();
                u.setId(rs.getInt("id_lelang"));
                u.setUsername(rs.getString("username"));
                u.setNominal(Double.parseDouble(rs.getString("nominal")));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return u;
    }
    
    //bid
    public static int bid(String s, Bid b, int x) {
        int status = 0;
        try {
            conn = new DBWelang().setConnection();
            ps = conn.prepareStatement("insert into databid(username,nominal,id_lelang) values(?,?,?)");
            ps.setString(1, s);
            ps.setDouble(2, b.getNominal());
            ps.setInt(3, x);
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
}
