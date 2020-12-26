package main;

public class Main {
    public static void main(String[] args){
        //stringToUpperCase("asik veysel");
        //zeroToHundred();
        //writeNumbers();
        //drawStars();
    }

    public static void stringToUpperCase(String pString){
        String[] seperatedLetters = pString.split(" ");
        String combinedLetter = "";

        for (int i = 0; i<seperatedLetters.length; i++){
            String firstLetter = String.valueOf(seperatedLetters[i].charAt(0));
            seperatedLetters[i] = seperatedLetters[i].replace(firstLetter, firstLetter.toUpperCase());
        }

        for (int i = 0; i<seperatedLetters.length; i++){
            combinedLetter += seperatedLetters[i] + " ";
        }

        System.out.println(pString + ": " + combinedLetter.trim());
    }

    public static void  zeroToHundred(){
        String numberList = "";
        for (int i = 0; i<101; i++){
            numberList += "" + i;
            if (i!=100){
                numberList += ", ";
            }
            if (i!=0 && i%10==0){
                numberList += "\n";
            }
        }
        System.out.println(numberList);
    }

    public static boolean toFindPrimeNumbers(int pN){
        if (pN<=1){
            return false;
        }
        for (int i = 2; i<Math.sqrt(pN); i++){
                if (pN % i == 0) {
                    return false;
                }
        }
        return true;
    }

    public static void writeNumbers(){
        String primeNumbers = "";
        for (int i=0; i<101; i++){
            if (toFindPrimeNumbers(i)){
                primeNumbers += "" + i + ", ";
            }
        }
        System.out.println(primeNumbers);
    }



    public static void drawStars(){
        String stars = "";
        for (int i=0; i<2;i++){
            for (int j=0;j<3;j++){
                stars += "*";
                System.out.println(stars);
            }
        }
    }
}
