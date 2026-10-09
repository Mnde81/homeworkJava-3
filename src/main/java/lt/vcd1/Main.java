package lt.vcd1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite sveikaji skaiciu: ");
        int x= in.nextInt();
        int s = 0;
        for (int i=1; i<=10; i++ ) {
            s= x * i;
            System.out.println(x+" x "+i+" = "+s);
        }
    }
}
