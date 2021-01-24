package manager;

import aidat.Aidat;
import daire.Daire;

import java.util.ArrayList;
import java.util.Random;

public class Manager {
    /**
     * Manager classinin elemanlari listOfApartments ve annualDueses
     */
    private final ArrayList<Daire> listOfApartments = new ArrayList<>();
    private static final double annualDueses = 3000;

    /**
     * ramdomizeIsPaid rasgele üetilen sayinin verilen kosula uyup uymamasina göre boolean deger döndürür.
     * @return
     */
    private boolean randomizeIsPaid(){
        double randomNumber = Math.random();
        return !(randomNumber < 0.1);
    }

    /**
     * createDues Aidat objeleri olusturarak bunlari tipi Aidat olan bir ArrayListe ekler.
     * @return
     */
    private ArrayList<Aidat> createDues(){
        ArrayList<Aidat> dues = new ArrayList<>();
        for (int index = 0;index < 12; index++){
            double random = new Random().nextDouble();
            Aidat aidat = new Aidat(index + 1, Math.floor(0 + (random * 600)), randomizeIsPaid());
            if (!aidat.isPaid()){
                aidat.setPaidAmount(0);
            }
            dues.add(aidat);
        }
        return dues;
    }

    /**
     * createApartments Manager classinin icinde bulunan tipi Daire olan bir ArrayListe olusturulan Daire objelerini ekler.
     */
    private void createApartments(){
        for (int index = 0;index < 10;index++){
            Daire daire = new Daire(createDues(),index + 1);
            listOfApartments.add(daire);
        }
    }

    /**
     * renderPeriodicalDuesOfApartments aylik periotlarla her dairenin yillik ödedigi aidatlari bir tablo halinda döndürür.
     * @param pListOfApartments
     */
    private void renderPeriodicalDuesOfApartments(ArrayList<Daire> pListOfApartments){
        for (Daire daire:pListOfApartments){
            System.out.print("\n" + daire.getApartmentNo() + " nolu apartman ==> ");
            for (Aidat aidat:daire.getListOfDues()){
                System.out.print(aidat.getMonthNumber() + ".month " + aidat.getPaidAmount() + " | ");
            }
        }
    }

    /**
     * sumOfDues parametre olarak verilen tipi Aidat olan bir ArrayListteki aidatlari toplar.
     * @param pAidat
     * @return
     */
    private double sumOfDues(ArrayList<Aidat> pAidat){
        double total = 0.0;
        for (Aidat aidat:pAidat){
            total += aidat.getPaidAmount();
        }
        return total;
    }

    /**
     * calculateStateOfDues parametre olarak verilen toplamdan yillik ödenmesi gereken miktari cikararak yillik bilancoyu bulur.
     * @param pTotalDuesForApartment
     * @return
     */
    private double calculateStateOfDues(double pTotalDuesForApartment){
        double result = pTotalDuesForApartment - annualDueses;
        return result;
    }

    /**
     * calculateAnnualDuesForEachApartment her bir dairenin bilancosunu ayri ayri yazdirir.
     * @param pListOfApartments
     */
    private void calculateAnnualDuesForEachApartment(ArrayList<Daire> pListOfApartments){
        for (Daire daire:pListOfApartments){
            System.out.println(daire.getApartmentNo() + " nolu apartmanin bilancosu: " + calculateStateOfDues(sumOfDues(daire.getListOfDues())));
        }
    }

    /**
     * private olarak olusturulan fonksiyonlari disari acarak calistirir.
     */
    public void chart(){
        createApartments();
        renderPeriodicalDuesOfApartments(listOfApartments);
        calculateAnnualDuesForEachApartment(listOfApartments);
    }

}
