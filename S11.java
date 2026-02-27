package s11;

import java.util.Scanner;

public class S11 {

    public static void main(String[] args) {
        Scanner s11 = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("ingrese un valor para [" + i + "][" + j + "]:");
                matriz[i][j] = s11.nextInt();

            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");

            }
            System.out.println("");
        }
        s11.close();
    }

}
