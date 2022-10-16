/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Hanin
 */
public class User implements Serializable{
     
    String userName ;
    ArrayList<String> listItem; 

    public User() {
        userName ="";
        listItem = new ArrayList(); 
    }

    public User(String userName, ArrayList<String>  listItem) {
        this.userName = userName;
        this.listItem = listItem;
    }

    public  ArrayList<String> getListItem() {
        return listItem;
    }

    

    public String getUserName() {
        return userName;
    }

    

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setListItem(ArrayList<String> listItem) {
        this.listItem = listItem;
    }
    
}
