package train;

import java.util.Random;
import java.util.Scanner;

public class Train {
    private int score = 100;
    private int totalLife = 4;
    private int guessedWagon;
    private int wagonOfSuspect;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public void initializeGame(){
        System.out.println("Lütfen bir tahminde bulununuz");
        wagonOfSuspect = random.nextInt(10) + 1;
        while(totalLife > 0){
            guessedWagon = scanner.nextInt();
            if (guessedWagon == wagonOfSuspect){
                System.out.println(score);
                break;
            }
            if (guessedWagon != wagonOfSuspect){
                --totalLife;
                score -= 25;
                if (totalLife != 0){
                    System.out.println("Yanlis tahmin. Lütfen tekrar bir tahminde bulununuz");
                }
                continue;
            }
        }
        if (totalLife == 0){
            System.out.println("Kaybettiniz");
        }
    }
}
