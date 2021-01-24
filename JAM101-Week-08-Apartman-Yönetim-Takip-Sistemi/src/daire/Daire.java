package daire;

import aidat.Aidat;

import java.util.ArrayList;

public class Daire {

    /**
     * Daire classinin elemanlari listOfDues ve apartmentNo
     */
    private ArrayList<Aidat> listOfDues;
    private int apartmentNo;

    /**
     * Daire constructor
     * @param pListOfDues
     * @param pApartmentNo
     */
    public Daire(ArrayList<Aidat> pListOfDues, int pApartmentNo) {
        this.listOfDues = pListOfDues;
        this.apartmentNo = pApartmentNo;
    }

    /**
     * listOfDues getter
     * @return
     */
    public ArrayList<Aidat> getListOfDues() {
        return listOfDues;
    }

    /**
     * listOfDues setter
     * @param pListOfDues
     */
    public void setListOfDues(ArrayList<Aidat> pListOfDues) {
        this.listOfDues = pListOfDues;
    }

    /**
     * apartmentNo getter
     * @return
     */
    public int getApartmentNo() {
        return apartmentNo;
    }

    /**
     * apartmentNo setter
     * @param pApartmentNo
     */
    public void setApartmentNo(int pApartmentNo) {
        this.apartmentNo = pApartmentNo;
    }
}
