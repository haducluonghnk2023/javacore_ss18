package Ex;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex05 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("laptop", 1200);
        map.put("may rua bat", 900);
        map.put("dien thoai", 500);
        map.put("quat", 300);
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 500 && entry.getValue() <= 1500){
                treeMap.put(entry.getValue(), entry.getKey());
            }
        }
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
