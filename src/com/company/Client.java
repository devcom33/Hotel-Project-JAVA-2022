package com.company;
import java.io.Serializable;
import java.util.ArrayList;

public class Client implements Serializable {
    private String Name;
    private String Address;
    private int id;
    public ArrayList<Sejour> liststays=new ArrayList<Sejour>();
    public ArrayList<Hotelbooking> listHotels=new ArrayList<Hotelbooking>();
    public ArrayList<Ticket> listTickets=new ArrayList<Ticket>();

    public Client(String name,String address,int id){
        this.Name=name;
        this.Address=address;
        this.id=id;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Client: "+Name+"  Adress: "+Address+"  id: "+id;
    }


}