package map.program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProgramHashMap {
    public void print(){
        HashMap<Integer,String> value = new HashMap<>();
        value.put(1,"Yogesh");
        value.put(2,"Shadab");
        value.put(3,"Raju");
        value.put(4,"Yogita");
        value.put(5,"Ketan");
        System.out.println(value);
        for(Map.Entry m : value.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
    public void  remove(){
        HashMap<Integer,String> value = new HashMap<>();
        value.put(1,"Yogesh");
        value.put(2,"Shadab");
        value.put(3,"Raju");
        value.put(4,"Yogita");
        value.put(5,"Ketan");
        System.out.println("Before Removing Value : "+value);
        value.remove(5);
            System.out.println("After Removing Value : "+value);
    }
    public void replaceValue(){
        HashMap<Integer,String> value = new HashMap<>();
        value.put(1,"Yogesh");
        value.put(2,"Shadab");
        value.put(3,"Raju");
        value.put(4,"Yogita");
        value.put(5,"Ketan");
        System.out.println("Before Replacing Value : "+value);
        value.replace(4,"Yogita","Nikita");
        System.out.println("After Replacing Value : "+value);
    }

    public static void main(String[] args) {
        ProgramHashMap obj =new ProgramHashMap();
        obj.print();
        obj.remove();
        obj.replaceValue();
    }
}
