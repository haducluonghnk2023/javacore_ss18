package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Nguyen Van A");
        map.put(1,"Nguyen Van An");
        map.put(3,"Nguyen Van C");
        map.put(2,"Nguyen Van B");
        System.out.println(map);
        Map<Integer,String> map1 = new LinkedHashMap<>();
        map1.put(1,"Nguyen Van A");
        map1.put(3,"Nguyen Van B");
        map1.put(2,"Nguyen Van C");
        System.out.println(map1);
        Map<Integer,String> map2 = new TreeMap<>();
        map2.put(1,"Nguyen Van A");
        map2.put(3,"Nguyen Van B");
        map2.put(2,"Nguyen Van C");
        System.out.println(map2);
        
        // 2 tra ve value get(obj key): lay gia tri value theo key
        System.out.println("value cua key bang 2 la "+map.get(2));
        // 3 xoa phan tu theo key
        map.remove(2);
        System.out.println("hashmap sau khi xoa key = 2 "+map);
        // 4 containskey : kiem tra trong map co ton tai key hay khong
        System.out.println(map.containsKey(1));// tra ve t/f
        System.out.println(map.size());
        System.out.println(map.isEmpty());// tra ve t/f
        System.out.println(map.keySet());// tra ve 1 set
        System.out.println(map.values());// tra ve 1 collection<String>
//        System.out.println(map.entrySet());tra ve 1 set chua key va value
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        // duyet map voi phuong thuc keyset
        for (Integer key : map.keySet()) {
            System.out.println(key+" "+ map.get(key));
        }
        // duyet map voi phuong thuc value
        for (String str : map.values()) {
            System.out.println(str);
        }
    }
}
