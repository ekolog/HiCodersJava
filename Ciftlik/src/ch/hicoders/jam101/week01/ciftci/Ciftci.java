package ch.hicoders.jam101.week01.ciftci;
import ch.hicoders.jam101.week01.ciftlik.*;

public class Ciftci {

    public static void main(String[] args){
        Inek inek1 = new Inek("yildiz");
        Tavuk tavuk1 = new Tavuk("sari");

        System.out.println(inek1.inekIsmi + " " + Inek.inekSayisi);
        System.out.println(tavuk1.tavukIsmi + " " + Tavuk.tavukSayisi);
    }
}
