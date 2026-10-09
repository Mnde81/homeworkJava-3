package lt.vcd5;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite auksti: ");
        int height= in.nextInt();
        System.out.println("Iveskite ploti: ");
        int width= in.nextInt();

        if (height < 2 || width < 2) {
            System.out.println("Aukstis ir plotis turi buti bent 2.");
            return;
        }

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {

                if (row == 0 || row == height - 1 || col == 0 || col == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }





        }


    }

