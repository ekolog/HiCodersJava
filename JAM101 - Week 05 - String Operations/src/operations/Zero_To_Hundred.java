package operations;

public class Zero_To_Hundred {
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
}
