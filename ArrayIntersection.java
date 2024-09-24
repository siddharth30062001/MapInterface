package MapInterface;
import java.util.*;

public class ArrayIntersection {
    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num); 
                map.put(num, map.get(num) - 1); 
            }
        }
        return result;
    }

    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};

        
        List<Integer> intersection = findIntersection(arr1, arr2);
        
        System.out.println("Intersection of arrays: " + intersection);
    }
}
