package daire;

import aidat.Aidat;

import java.util.ArrayList;

public class Daire {
    private ArrayList<Aidat> listOfDues;
    private int apartmentNo;

    public Daire(ArrayList<Aidat> pListOfDues, int pApartmentNo) {
        this.listOfDues = pListOfDues;
        this.apartmentNo = pApartmentNo;
    }

    public ArrayList<Aidat> getListOfDues() {
        return listOfDues;
    }

    public void setListOfDues(ArrayList<Aidat> pListOfDues) {
        this.listOfDues = pListOfDues;
    }

    public int getApartmentNo() {
        return apartmentNo;
    }

    public void setApartmentNo(int pApartmentNo) {
        this.apartmentNo = pApartmentNo;
    }
}
