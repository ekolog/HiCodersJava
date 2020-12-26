package operations;

public class Write_Prime_Numbers {
    public static boolean toFindPrimeNumbers(int pN){
        if (pN<=1){
            return false;
        }
        for (int i = 2; i<pN; i++){
            if (pN % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void writePrimeNumbers(){
        String primeNumbers = "";
        for (int i=0; i<101; i++){
            if (toFindPrimeNumbers(i)){
                primeNumbers += "" + i + ", ";
            }
        }
        System.out.println(primeNumbers);
    }
}
