package com.company;

import java.io.Serializable;

public class dateh implements Serializable {
    public int jour=0;
    public int mois=0;
    public int annee=0;

    dateh(int jour,int mois,int annee){
        this.jour=jour;
        this.mois=mois;
        this.annee=annee;
    }


}
