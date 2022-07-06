package com.shaimeur.controller.Model;

public class Adress {
    private String street ;
    private Integer zipcode ;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String  toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
