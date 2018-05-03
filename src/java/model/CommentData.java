/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mac
 */
public class CommentData {

    private int id;
    private String comment_description;
    private String timecomment;
    private String username;
    private String place_name;
    private String name;

    public CommentData() {

    }

    public void setAlldata(int id,
            String comment_description,
            String timecomment,
            String username,
            String place_name,
            String name) {
        this.id = id;
        this.comment_description = comment_description;
        this.timecomment = timecomment;
        this.username = username;
        this.place_name = place_name;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment_description() {
        return comment_description;
    }

    public void setComment_description(String comment_description) {
        this.comment_description = comment_description;
    }

    public String getTimecomment() {
        return timecomment;
    }

    public void setTimecomment(String timecomment) {
        this.timecomment = timecomment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

}
