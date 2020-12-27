package operations;

public class String_To_Upper_Case {

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
}
