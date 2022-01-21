package com.company;

import java.io.Serializable;

public class Ticket implements Serializable {

    private String Reference;

    public Ticket(String Reference){
        this.Reference=Reference;
    }


    public String getReference() {
        return Reference;
    }


    public String toString(){
        return " Reference: "+Reference;
    }


}