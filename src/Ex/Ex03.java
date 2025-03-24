package Ex;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ex03 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("laptop", 1000);
        map.put("may loc nuoc", 2000);
        map.put("dieu hoa", 3000);
        map.put("di oa", 4000);
        map.put("tu lanh", 5000);
        System.out.println("truoc khi sua");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        map.put("laptop", 6000);
        System.out.println("Sau khi sua");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        map.remove("laptop");
        System.out.println("Sau khi xoa");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
