/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.DBWelang;
import Model.Feedback;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NAUFAL
 */
public class FeedDAO {
    
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    
    //insert
    public static int add(Feedback b) {
        int status = 0;
        try {
            conn = new DBWelang().setConnection();
            ps = conn.prepareStatement("insert into feedback(feedback) values(?)");
            ps.setString(1, b.getFeedback());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    //view
    public static List<Feedback> getAllRecords() {
        List<Feedback> list = new ArrayList<Feedback>();

        try {
            conn = new DBWelang().setConnection();
            ps = conn.prepareStatement("select * from feedback");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Feedback u = new Feedback();
                u.setFeedback(rs.getString("feedback"));
                list.add(u);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
}
