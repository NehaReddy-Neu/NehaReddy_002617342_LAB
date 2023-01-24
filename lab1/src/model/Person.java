/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nehar
 */
public class Person {
    String firstName;
    String lastName;
    Contact contact;
    Contact WorkContact;
    Address address;
    Address permanentAddress;
    String NUID;
    String CollegeName;
   
    
        
        public Person(){
                      
            this.firstName="";
            this.lastName="";
            this.contact= new Contact();
            this.WorkContact= new Contact();
            this.address = new Address();
            this.permanentAddress = new Address();
            this.NUID="";
            this.CollegeName="";
        }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName= lastName;
        
    }
    
    public String getCollegeName() {
        return CollegeName;
    }

    public void setCollegeName(String CollegeName) {
        this.CollegeName= CollegeName;
    }
    
    public Address getAddress(){
      return address;
    } 
    
    public void setAddress(Address address){
        this.address= address;
     
    }
     public Address getPermanentAddress(){
      return permanentAddress;
    } 
    
    public void setPermanentAddress(Address permanentAddress){
        this.permanentAddress= permanentAddress;
     
    }
  
    public Contact getContact(){
        return contact;
    }
    
    public void setContact(Contact contact){
        this.contact= contact;
    }
    
    public Contact getWorkContact(){
        return WorkContact;
    }
    
    public void setWorkContact(Contact WorkContact){
        this.WorkContact= WorkContact;
    }
    
     public String getNUID(){
        return NUID;
    }
    
    public void setNUID(String NUID){
        this.NUID= NUID;
    }
}


