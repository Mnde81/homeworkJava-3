package lt.vcd4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        for (int or = 10; or <= 99; or++) {
            int tens = or / 10;
            int ones = or % 10;

            if (tens * 2 == ones) {
                int rev = (ones * 10) + tens;

                if (rev - or== 36) {
                    System.out.println("Studentas galvojo apie numeri: " + or);
                    break;
                }
            }
        }
    }
}
