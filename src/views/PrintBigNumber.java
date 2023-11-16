package views;

import java.text.DecimalFormat;

public class PrintBigNumber {
    public static void printBigNumber(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        String formattedNumber = decimalFormat.format(number);

        System.out.print(formattedNumber);

    }
}
