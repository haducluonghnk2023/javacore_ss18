package Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex08 {
    public static String convert(int num){
        if (num < 1 || num  > 10){
            return "so khong hop le";
        }
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        StringBuilder str = new StringBuilder();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();
            while (num >= value) {
                str.append(symbol);
                num -= value;
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong N (1-10): ");
        int n = scanner.nextInt();
        scanner.close();

        String a = convert(n);
        System.out.println("So la ma tuong ung: " + a);
    }
}
