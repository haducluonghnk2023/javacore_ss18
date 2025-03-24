package Ex;

import java.util.*;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("Nhap so phan tu cua mang :");
            if(sc.hasNextInt()){
                n = Integer.parseInt(sc.next());
                if(n>0){
                    break;
                }else {
                    System.err.println("so phan tu cua mang khong hop le, vui long nhap lao");
                }
            }else {
                System.err.println("n khong hop le , vui long nhap lai");
                sc.next();
            }
        }
        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : arr) {
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else {
                map.put(num, 1);
            }
        }
        List<Map.Entry<Integer,Integer>>  list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println(entry.getKey() + "xuat hien " + entry.getValue() + " lan");
        }
    }
}
