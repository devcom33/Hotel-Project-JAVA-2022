package com.company;
import java.io.Serializable;
import java.util.ArrayList;

public class Hotelbooking implements Serializable {
    private int Room_n;
    private dateh Start;
    private dateh End;
    private int N_nights;
    private String Rec;


    private boolean Smoking;
    public ArrayList<Sejour> liststays=new ArrayList<Sejour>();



    Hotelbooking(int room_n,Room rec,int n_nights,boolean smoking){
        Room_n=room_n;
        N_nights = n_nights;
        Rec = rec.toString();
        Smoking = smoking;
    }






    public void setStart(int j,int m,int y) {
        Start=new dateh(j,m,y);
    }

    public void setEnd(int j,int m,int y) {
        End=new dateh(j,m,y);
    }

    public int getRoom_n() {
        return Room_n;
    }

    public String getStart() {

        return this.Start.jour+"-"+this.Start.mois+"-"+this.Start.annee;
    }

    public String getEnd() {

        return this.End.jour+"-"+this.End.mois+"-"+this.End.annee;
    }


    public int getN_nights() {
        return N_nights;
    }




    public String getRec() {
        return Rec;
    }



    public boolean isSmoking() {
        return Smoking;
    }

    public String toString(){
        return " N ROOM: "+Room_n+"  Start Date: "+getStart()+"  End Date: "+getEnd()+"  N NIGHT:"+N_nights+"  Rec: "+Rec+"  Smoking: "+Smoking;
    }


}