package MapAndVariant;

import com.sun.source.tree.Tree;

import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
    public static void main(String[] args) {
        Map<Integer, Employee> myEmployeeMap = new TreeMap<>();
        myEmployeeMap.put(100, new Employee("a1", 123));
        myEmployeeMap.put(2000, new Employee("a4", 100));

        for (Integer key :
                myEmployeeMap.keySet()) {
            System.out.println(key);
        }

        for (Employee e :
                myEmployeeMap.values()) {
            System.out.println(e);
        }
    }
}
