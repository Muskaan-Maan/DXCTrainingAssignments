package CollectionExercise;

import java.util.*;

public class HashMapExercise {

    public static void main(String[] args){

        HashMap<String, Double> hashMap1 = new HashMap<>();

        hashMap1.put("Lily", 90.0);
        hashMap1.put("Robin", 68.0);
        hashMap1.put("Marshall", 76.5);
        hashMap1.put("Neil", 67.0);
        hashMap1.put("Ted", 92.0);

        HashMap<String, Double> hashMap2 = new HashMap<>();

        hashMap2.put("Lily", 85.0);
        hashMap2.put("Robin", 78.5);
        hashMap2.put("Marshall", 86.0);
        hashMap2.put("Neil", 72.0);
        hashMap2.put("Ted", 86.0);

        HashMap<String, Double> marks1 = findMaxMinScorers(hashMap1);
        HashMap<String, Double> marks2 = findMaxMinScorers(hashMap2);

        HashMap[] marks = {marks1, marks2};

        for(HashMap m: marks)
        System.out.println(m);
    }

    public static HashMap<String, Double> findMaxMinScorers(HashMap<String, Double> h1){

        HashMap<String, Double> res = new HashMap<>();
        HashMap<String, Double> mx = new HashMap<>();
        HashMap<String, Double> mn = new HashMap<>();

        Double maxValue = (Collections.max(h1.values()));

        Double minValue = (Collections.min(h1.values()));

        for (Map.Entry<String, Double> entry : h1.entrySet()){

            if (entry.getValue() == maxValue) {

                mx.put(entry.getKey(), entry.getValue());
            }
            if (entry.getValue() == minValue){

                mn.put(entry.getKey(), entry.getValue());
            }

    }

        res.putAll(mx);
        res.putAll(mn);

        return res;
    }

}
