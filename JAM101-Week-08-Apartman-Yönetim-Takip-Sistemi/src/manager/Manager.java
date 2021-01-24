package manager;

import aidat.Aidat;
import daire.Daire;

import java.util.ArrayList;
import java.util.Random;

public class Manager {
    private final ArrayList<Daire> listOfApartments = new ArrayList<>();
    private static final double annualDues = 3000;

    private boolean randomizeIsPaid(){
        double randomNumber = Math.random();
        return !(randomNumber < 0.1);
    }

    private ArrayList<Aidat> createDues(){
        ArrayList<Aidat> dues = new ArrayList<>();
        for (int index = 0;index < 12; index++){
            double random = new Random().nextDouble();
            Aidat aidat = new Aidat(index + 1, Math.floor(0 + (random * 250)), randomizeIsPaid());
            if (!aidat.isPaid()){
                aidat.setPaidAmount(0);
            }
            dues.add(aidat);
        }
        return dues;
    }

    private void createApartments(){
        for (int index = 0;index < 10;index++){
            Daire daire = new Daire(createDues(),index + 1);
            listOfApartments.add(daire);
        }
    }

    private void renderPeriodicalDuesOfApartments(ArrayList<Daire> pListOfApartments){
        for (Daire daire:pListOfApartments){
            System.out.print("\n" + daire.getApartmentNo() + " nolu apartman ==> ");
            for (Aidat aidat:daire.getListOfDues()){
                System.out.print(aidat.getMonthNumber() + ".month " + aidat.getPaidAmount() + " | ");
            }
        }
    }

    private void calculateAnnualDuesForEachApartment(ArrayList<Daire> pListOfApartments){
        for (Daire daire:pListOfApartments){
            for (Aidat aidat:daire.getListOfDues()){
                aidat.setPaidAmount(+aidat.getPaidAmount());
            }
        }
    }

    public void chart(){
        createApartments();
        renderPeriodicalDuesOfApartments(listOfApartments);
        calculateAnnualDuesForEachApartment(listOfApartments);
    }

}
