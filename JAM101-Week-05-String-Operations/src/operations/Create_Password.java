package operations;

import java.util.Random;

public class Create_Password {
    static Random random = new Random();

    public static void writeInConsole(){
        for (int i = 0; i<100; i++){
            System.out.println(createPassword());
        }
    }

    public static String createPassword(){
        String password = "";
        int passwordLength;

        for (int i=0;i<random.nextInt(8)+8;i++){
            password += randomRandomMethods(random.nextInt(4));
        }
        return password;
    }

    public static char randomRandomMethods(int pRandomNumber){
        char returnValue = 0;
        switch (pRandomNumber){
            case 0:
                returnValue = randomLowerCaseCharacter();
                break;
            case 1:
                returnValue = randomDigits();
                break;
            case 2:
                returnValue = randomUpperCaseCharacter();
                break;
            case 3:
                returnValue = randomSymbols();
                break;
        }
        return returnValue;
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
