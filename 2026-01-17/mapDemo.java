/*
    Map:
        - It is an interface, present in java.util package.
        - It is used to store key value pair.
        - One key value pair is known as one entry.
        - Keys must be unique, values can be duplicate.
        - Map does not comes under collection because in collection we store only objects but in map it is in the form of key value pair.
        - Map interface has 3 implementing classes: HashMap, LinkedHashMap and TreeMap.

    put(Object key, Object value): 
        - It is used to add entry inside map.
        - return type is object.
        - It returns previous value of the key or null if there is no previous value.

    remove(Object key):
        - It is used to remove entry from map.
        - return type is object.
        - It returns the value of the removed key or null if there is no such key.

    get(Object key):
        - It is used to get value of a particular key.
        - return type is object.
        - It returns the value of the specified key or null if there is no such key.

    containsKey(Object key):
        - It is used to check whether the specified key is present or not.
        - return type is boolean.
        - It returns true if the specified key is present otherwise false.

    containsValue(Object value):
        - It is used to check whether the specified value is present or not.
        - return type is boolean.
        - It returns true if the specified value is present otherwise false.

    size():
        - It is used to get the size of the map.
        - return type is int.
        - It returns the number of entries present in the map.

    entrySet():
        - It is used to get all the entries present in the map.
        - return type is Set.
        - It returns a set view of the mappings contained in this map.

    keySet():
        - It is used to get all the keys present in the map.
        - return type is Set.
        - It returns a set view of the keys contained in this map.

    values():
        - It is used to get all the values present in the map.
        - return type is Collection.
        - It returns a collection view of the values contained in this map.
*/

import java.util.HashMap;
import java.util.Map;

public class mapDemo {
    public static void main(String[] args) {
        Map hm = new HashMap();

        System.out.println(hm.put(1, "Kabir")); // null
        System.out.println(hm.put(12.2, 12.5)); // null
        System.out.println(hm.put(1, "Mohit")); // Kabir
        
        System.out.println(hm); // {1=Mohit, 12.2=12.5}
        System.out.println(hm.size()); // 2
        System.out.println(hm.get(1)); // Mohit
        System.out.println(hm.containsKey(12.2)); // true
        System.out.println(hm.containsValue("Kabir")); // false
        System.out.println(hm.remove(12.2)); // 12.5
        System.out.println(hm); // {1=Mohit}
        
        System.out.println(hm.put(12.2, 12.5)); // null
        System.out.println(hm.put(true, 10)); // null
        System.out.println(hm.entrySet()); // [1=Mohit, 12.2=12.5, true=10]
        System.out.println(hm.keySet()); // [1, 12.2, true]
        System.out.println(hm.values()); // [Mohit, 12.5, 10]


    }
}
