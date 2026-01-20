/*
    Q. WAJP to manage employee salary details using map.
	1. add atleast 6 employee records 
	2. print only those employees whose salary  is greater than 50000
*/

import java.util.HashMap;
import java.util.Map;
public class mapP1 {
    public static void main(String[] args) {
        Map<String, Integer> emp = new HashMap<>();
        emp.put("Aditya", 60000);
        emp.put("Rahul", 45000);
        emp.put("Sneha", 75000);
        emp.put("Priya", 55000);
        emp.put("Vikram", 85000);
        emp.put("Neha", 48000);

        for(String e : emp.keySet()) {
            if (emp.get(e) > 50000) {
                System.out.println(e + ": " + emp.get(e));
            }
        }
    }
}
    