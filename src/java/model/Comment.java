/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class Comment {

    private Connection con;
    private Statement st;
    ArrayList<CommentData> cd_set = new ArrayList<CommentData>();

    public Comment(Connection con) {
        this.con = con;

        try {
            st = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Comment() {
    }

    public String insertCommentData(String comment_description,
            String timecomment,
            String username,
            String place_name_ref,String name) {
        String sql = "INSERT INTO `comment` ( `comment_description`"
                + ", `timecomment`, `username`, `place_name_ref`,`name`) VALUES ( ?, ?, ?, ?,?)";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, comment_description);
            pstmt.setString(2, timecomment);
            pstmt.setString(3, username);
            pstmt.setString(4, place_name_ref);
            pstmt.setString(5, name);
            pstmt.execute();
            pstmt.close();
            return "success";
        } catch (SQLException ex) {
            Logger.getLogger(Comment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "none";
    }

    public ArrayList<CommentData> queryAllCommentOfPlace(String place_name) {
        String sql = "select * from comment where place_name_ref = '" + place_name + "'";
        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String comment_description = rs.getString("comment_description");
                String timecomment = rs.getString("timecomment");
                String username = rs.getString("username");
                String name = rs.getString("name");
                CommentData cd = new CommentData();
                cd.setAlldata(id, comment_description, timecomment, username, place_name ,name);
                cd_set.add(cd);
            }
            st.close();
            return cd_set;

        } catch (SQLException ex) {
            Logger.getLogger(Comment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cd_set;
    }
}
