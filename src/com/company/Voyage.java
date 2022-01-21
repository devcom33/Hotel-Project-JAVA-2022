package com.company;
import java.io.FileInputStream;

import java.io.ObjectInputStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class Voyage {
    public static void main(String[] args) {
	// write your code
        Client client = new Client("Farrissi","Agadir",20);
        Ticket Tic=new Ticket("GH4FC");
        Vector vec = new Vector();
        Hotelbooking Hotel=new Hotelbooking(10,Room.SINGLE,2,false);

        Hotel.setStart(2,10,2020);
        Hotel.setEnd(10,11,2020);

        Sejour sejourone=new Sejour(Tic,Hotel); //Creation d'objets

        sejourone.setStart(02,01,2021);
        sejourone.setEnd(10,11,2021);
        sejourone.calculatePrice();

        client.listTickets.add(Tic);
        client.listHotels.add(Hotel);
        client.liststays.add(sejourone);

        vec.addElement(client);
        vec.addElement(Tic);
        vec.addElement(sejourone);
        vec.addElement(Hotel);

        System.out.println(vec);

        try{



            FileOutputStream file=new FileOutputStream("voyageHotel.txt");
            ObjectOutputStream out=new ObjectOutputStream(file);

            out.writeObject(vec);

            out.close();
            System.out.println("L'objet a ete serialize");

        }
        catch(Exception e){
            System.out.println("{----------Eurreur Serialization}");
        }
        try {
            FileInputStream file = new FileInputStream("voyageHotel.txt");
            ObjectInputStream in = new ObjectInputStream(file);

            vec=(Vector)in.readObject();
            System.out.println(vec);
            System.out.println("success");

            in.close();
        } catch (Exception e) {
            System.out.print("{------------------Eurreur deserialization}");
        }



    }
}