package Ex;

import java.util.Map;
import java.util.TreeMap;

public class Ex04 {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("NV001", 1000);
        map.put("NV002", 2000);
        map.put("NV003", 3000);
        map.put("NV004", 4000);
        map.put("NV005", 5000);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        map.put("NV005",10000);
        System.out.println("sau khi thay doi :");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        map.remove("NV001");
        System.out.println("sau khi xoa");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
