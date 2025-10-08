
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        int[][] arrExample = {
                {2, 5, 0, 1},
                {5, 1, 9, 5},
                {9, 5, 2, 8},
                {4, 0, 0, 4},
                {7, 5, 1, 2}
        };


        for (int i = 0; i < 4; i++) {
            arrExample[i][i] = 0;
        }


        int suma = 0;
        for (int i = 0; i < arrExample.length; i++) {
            for (int j = 0; j < arrExample[i].length; j++) {
                suma += arrExample[i][j];
            }
        }

        System.out.println("Suma: " + suma);
    }
}
