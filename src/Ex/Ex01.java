package Ex;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("ha duc luong", 10);
        map.put("nguyen van a", 8);
        map.put("nguyen van b", 9);
        map.put("nguyen van c", 9);
        map.put("nguyen van d", 7);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey() == "ha duc luong") {
                System.out.println(entry.getValue());
            }
        }
    }
}
