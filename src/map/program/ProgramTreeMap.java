package map.program;

import java.util.Map;
import java.util.TreeMap;

public class ProgramTreeMap {
    public void printSortedElement(){
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
    public void remove() {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(100, "Amit");
        map.put(102, "Ravi");
        map.put(101, "Vijay");
        map.put(103, "Rahul");
        System.out.println("Before invoking remove() method");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        map.remove(102);
        System.out.println("After invoking remove() method");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    public static void main(String[] args) {
        ProgramTreeMap obj =new ProgramTreeMap();
        obj.printSortedElement();
        obj.remove();
    }
}
