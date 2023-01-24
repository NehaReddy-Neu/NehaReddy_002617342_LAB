/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nehar
 */
public class Address {
    String StreetName;
    String AptNo;
    String City;
    String ZipCode;
    
    public Address(){    
     this.StreetName="";
    this.AptNo="";
    this.City="";
    this.ZipCode="";
}

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        this.StreetName = streetName;
    }

    public String getAptNo() {
        return AptNo;
    }

    public void setAptNo(String AptNo) {
        this.AptNo = AptNo;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }
    
}

