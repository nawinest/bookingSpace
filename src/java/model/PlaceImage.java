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
public class PlaceImage {
    private int img_id;
    private String img_name;
    
    public PlaceImage(){
    }
    
    public void setPlaceImage(int img_id, String img_name){
        this.img_id = img_id;
        this.img_name = img_name;
    }

    public int getImg_id() {
        return img_id;
    }

    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }

    public String getImg_name() {
        return img_name;
    }

    public void setImg_name(String img_name) {
        this.img_name = img_name;
    }
    
}
