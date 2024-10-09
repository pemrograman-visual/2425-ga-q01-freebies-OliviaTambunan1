// 12S24029 - Adithya Philip Jona Putra Silaban
// 12S24048 - Olivia Tambunan

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double min, harga, hargasementara;

        harga = 0;
        hargasementara = 0;
        min = 9999;
        do {
            harga = Double.parseDouble(input.nextLine());
            if (harga == 0) {
            } else {
                if (min < harga) {
                } else {
                    min = harga;
                }
                hargasementara = hargasementara + harga;
            }
        } while (harga != 0);
        if (hargasementara >= 100) {
            harga = hargasementara - min;
        } else {
            harga = hargasementara;
        }
        System.out.println(toFixed(harga,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
