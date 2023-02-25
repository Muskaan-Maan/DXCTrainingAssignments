package CollectionAssignment;

import java.util.*;

public class HashMap1 {

    public static List<String> sortSales(Map<String, Integer> sales) {

        List<String> list = new ArrayList<>();

        List<Integer> temp = new ArrayList<>(sales.values());

        Collections.sort(temp);
        Collections.reverse(temp);

        for (Integer val : temp){

            for (String key : sales.keySet()){

                if (sales.get(key) == val){

                    list.add(key);
                    sales.put(key, Integer.MAX_VALUE);
                    break;
                }
            }

        }

        return list;
    }

    public static void main(String args[]) {
        Map<String, Integer> sales = new HashMap<String, Integer>();
        sales.put("Mathew", 50);
        sales.put("Lisa", 76);
        sales.put("Courtney", 45);
        sales.put("David", 49);
        sales.put("Paul", 49);

        List<String> employees = sortSales(sales);

        System.out.println("Employees in the decreasing order of their sales\n=====================================");
        for (String employeeName : employees) {
            System.out.println(employeeName);
        }
    }
}
