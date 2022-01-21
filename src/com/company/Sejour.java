package com.company;
import java.io.Serializable;
import java.util.ArrayList;


public class Sejour implements Serializable {
    public Ticket createticket;
    public Hotelbooking createhotel;
    private double price=0.0;
    private dateh Start;
    private dateh End;
    Sejour(Ticket createticket,Hotelbooking createhotel){
        this.createticket=createticket;
        this.createhotel=createhotel;
    }

    public ArrayList<Ticket> lesTickets=new ArrayList<Ticket>();
    public ArrayList<Hotelbooking> lesHotels=new ArrayList<Hotelbooking>();

    public void setStart(int j,int m,int y) {
        Start=new dateh(j,m,y);
    }

    public void setEnd(int j,int m,int y) {

        End=new dateh(j,m,y);
    }

    public String getStart() {

        return this.Start.jour+"-"+this.Start.mois+"-"+this.Start.annee;
    }

    public String getEnd() {

        return this.End.jour+"-"+this.End.mois+"-"+this.End.annee;
    }


    public void calculatePrice(){
        if(createhotel.getRec().equals("SINGLE")){
            this.price=100*(double)createhotel.getN_nights();

        }
        if(createhotel.getRec().equals("DOUBLE")){
            this.price=250*(double)createhotel.getN_nights();
        }
        if(createhotel.getRec().equals("FAMILY")){

            this.price=400*(double)createhotel.getN_nights();
        }
    }

    public String toString() {
        return " Start:  "+getStart()+"  end: "+getEnd()+"  price:  "+this.price+" DH";
    }



}