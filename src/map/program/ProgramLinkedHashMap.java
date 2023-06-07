package map.program;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProgramLinkedHashMap {
    public void print(){
        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();

        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
    public void remove(){
        Map<Integer,String> map=new LinkedHashMap<Integer,String>();
        map.put(101,"Amit");
        map.put(102,"Vijay");
        map.put(103,"Rahul");
        System.out.println("Before invoking remove() method: "+map);
        map.remove(102);
        System.out.println("After invoking remove() method: "+map);
    }

    public static void main(String[] args) {
        ProgramLinkedHashMap obj = new ProgramLinkedHashMap();
        obj.print();
        obj.remove();

    }
}
