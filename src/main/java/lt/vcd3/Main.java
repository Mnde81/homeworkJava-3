package lt.vcd3;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite sveikaji skaiciu nuo 0 iki 12: ");
        int n= in.nextInt();

        int f = 1;

        for (int i = 1; i <=n; i++) {

            f =f *i;

        }

        System.out.println("Factorialas: " + f);

    }
}
