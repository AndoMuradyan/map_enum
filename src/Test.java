import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(4, "ando");
        map.put(6, "anna");
        map.put(17, "vahe");
        map.put(34, "vahe");
        map.put(null, "arsen");
        System.out.println(map);
        System.out.println(map.get(4));
        System.out.println(map.get(null));

        Set<Entry<Integer, String>> entries = map.entrySet();
        for (Entry<Integer, String> x : entries) {
            System.out.println(x.getKey() + ", " + x.getValue());
        }

        System.out.println("-----------------------------------");
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key + ", " + map.get(key));
        }

//        xndir nayev hayeren grelu depkum my leng class enq sarkum mejy talis enq canstruktrov ev ashxatelu depkum normal tpum e
        System.out.println("-----------------------------------");
        HashMap<Integer, MyLang> numbers = new HashMap<>();
        numbers.put(1, new MyLang("one", "Մեկ"));
        numbers.put(2, new MyLang("two", "երկու"));
        numbers.put(3, new MyLang("three", "երեք"));
        numbers.put(4, new MyLang("four", "չորս"));
        numbers.put(5, new MyLang("five", "հինգ"));
        int a = 3, b = 2;
        System.out.println(numbers.get(a).en + " + " + numbers.get(b).en + " = " + numbers.get(a + b).en);
        System.out.println(numbers.get(a).hy + " + " + numbers.get(b).hy + " = " + numbers.get(a + b).hy);

        System.out.println("-----------------------------------");

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(41, "ando");
        treeMap.put(6, "anna");
        treeMap.put(17, "vahe");
        treeMap.put(34, "vahe");
        treeMap.put(6, "arsen");
        System.out.println(treeMap);

        System.out.println("-----------------------------------");

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(41, "ando");
        linkedHashMap.put(6, "anna");
        linkedHashMap.put(17, "vahe");
        linkedHashMap.put(34, "vahe");
        linkedHashMap.put(6, "arsen");
        System.out.println(linkedHashMap);
    }
}
