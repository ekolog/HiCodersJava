package ch.hicoders.jam101.week02.okul;
import ch.hicoders.jam101.week02.kisi.ogrenci.Ogrenci;

import java.util.ArrayList;
import java.util.Random;

public class Okul {
    public static void main(String[] args){
        ArrayList<Ogrenci> ogrenciler = Okul.ogrenciOlustur();
        for(Ogrenci ogrenci:ogrenciler){
            System.out.println(ogrenci.ogrenciIsmi + ogrenci.almancaNotu + " " + ogrenci.matematikNotu);
        }
    }

    public static ArrayList<Ogrenci> ogrenciOlustur(){
        Random random = new Random();
        int toplamOgrenci = random.nextInt(50);
        ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
        for(int i = 0;i<toplamOgrenci;i++){
            int matematikNotu = random.nextInt(6);
            int almancaNotu = random.nextInt(6);
            Ogrenci ogrenci = new Ogrenci(i+1+" numarali ögrenci ", almancaNotu, matematikNotu);
            ogrenciler.add(ogrenci);
        }
        return ogrenciler;
    }
}
