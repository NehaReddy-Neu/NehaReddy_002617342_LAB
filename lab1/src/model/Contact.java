/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nehar
 */
public class Contact {
       long phone;
       String mail;
       
       
public Contact(){
    
}

    public long getPhone(){
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
    
    public String getMail(){
        return mail;
    }
    
    public void setMail(String mail){
        this.mail=mail;
    }
       
}
