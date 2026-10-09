package lt.vcd2;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite sveikaji skaiciu: ");
        int n= in.nextInt();
        int count =0;

        for (int i = 1; i <=n; i++) {
            if (i % 2 == 0) {
                count++;

                System.out.print(i+ " ");
            }

        }
        System.out.println("Count: " + count);

    }
}
