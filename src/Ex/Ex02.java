package Ex;

import java.util.HashMap;
import java.util.Map;

public class Ex02 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("laptop", 10000000);
        map.put("iphone", 15000000);

        if(map.containsKey("laptop")){
            System.out.println("co san pham laptop trong map");
        }else {
            System.out.println("khong co san pham laptop trong map");
        }

        boolean isExists = false;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1000) {
                isExists = true;
            }
        }
        if (isExists) {
            System.out.println("co san pham có gia 1000 trong map");
        }else {
            System.out.println("khong có san pham nao co gia 1000 trong map");
        }
    }
}
