package operations;

import java.util.Random;

public class Create_Password {
    static Random random = new Random();

    public static String createPassword(){
        String password = "";
        int passwordLength;

        for (int i=0;i<random.nextInt(8)+8;i++){

        }



        return password;
    }

    public static void randomRandomMethods(int pRandomNumber){
        switch (pRandomNumber){
            case 0:
                randomLowerCaseCharacter();
                break;
            case 1:
                randomDigits();
                break;
            case 2:
                randomUpperCaseCharacter();
                break;
            case 3:
                randomSymbols();
                break;
        }
    }

    public static char randomLowerCaseCharacter(){
        String randomChar = "abcdefghijklmnopqrstvyzwx";
        return randomChar.charAt(random.nextInt(randomChar.length()));
    }

    public static char randomUpperCaseCharacter(){
        String randomChar = "ABCDEFGHIJKLMNOPQRSTVYZWX";
        return  randomChar.charAt(random.nextInt(randomChar.length()));
    }

    public static char randomDigits(){
        String randomDigits = "0123456789";
        return randomDigits.charAt(random.nextInt(randomDigits.length()));
    }

    public static char randomSymbols(){
        String randomSymbols = "+*%&/()=?¦@#°§¬|¢0^[]!$£}{-_.:<>";
        return randomSymbols.charAt(random.nextInt(randomSymbols.length()));
    }
}