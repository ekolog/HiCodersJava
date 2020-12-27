package operations;

public class Draw_Stars {
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
