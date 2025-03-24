package Ex;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ex06 {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("ha duc luong",8);
        map.put("nguyen van a",5);
        map.put("nguyen van b",6);
        map.put("nguyen van c",9);
        map.put("nguyen van d",7);
        map.put("nguyen van e",10);
        map.put("nguyen van f",4);
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        int avg = 0;
        for (Integer i : map.values()) {
            avg += i;
        }
        System.out.println("diem trung binh la "+avg/map.size());
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Integer> entry = iterator.next();
            if (entry.getValue() <5) {
                iterator.remove();
            }
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
