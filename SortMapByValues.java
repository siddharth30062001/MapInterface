package MapInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortMapByValues {

    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Mango", 40);

        System.out.println("Original Map: " + map);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

       
        System.out.println("Sorted Map by Values: " + sortedMap);
    }

    }
