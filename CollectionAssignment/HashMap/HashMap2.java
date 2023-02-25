package CollectionAssignment;

import java.util.*;

public class HashMap2 {

    public static Map<String, Integer> mergeMaps(Map<String, Integer> mapOne, Map<String, Integer> mapTwo){


        for (String key : mapTwo.keySet()){

            if (mapOne.containsKey(key)){
                if (mapOne.get(key).equals(mapTwo.get(key))){
                    continue;
                }

                mapOne.put(key + "new", mapTwo.get(key));
            }else {
                mapOne.put(key, mapTwo.get(key));
            }
        }
        return mapOne;
    }

    public static void main(String args[]) {
        Map<String, Integer> mapOne = new HashMap<String, Integer>();
        mapOne.put("Kelly", 10);
        mapOne.put("Michael", 20);
        mapOne.put("Ryan", 30);

        Map<String, Integer> mapTwo = new HashMap<String, Integer>();
        mapTwo.put("Jim", 15);
        mapTwo.put("Andy", 45);
        mapTwo.put("Michael", 60);

        Map<String, Integer> mergedMap = mergeMaps(mapOne, mapTwo);

        System.out.println("Merged Map\n===========");
        for (Map.Entry<String, Integer> entry : mergedMap.entrySet()) {
            System.out.println(entry.getKey()+" -- "+entry.getValue());
        }

    }
}
