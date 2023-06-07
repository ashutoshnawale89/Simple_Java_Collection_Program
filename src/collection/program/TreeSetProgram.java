package collection.program;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProgram {
    public void printTreeSet(){
        TreeSet<String> value=new TreeSet<String>();
        value.add("Ravi");
        value.add("Vijay");
        value.add("Ravi");
        value.add("Ajay");
        //Traversing elements
        Iterator<String> itr=value.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public void decendingOrder(){
        TreeSet<String> set=new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ajay");
        System.out.println("Traversing element through Iterator in descending order");
        Iterator i=set.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
    public void highestAndLowestValue(){
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        System.out.println("Lowest Value: "+set.pollFirst());
        System.out.println("Highest Value: "+set.pollLast());
    }
    public void removeValue(){
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        System.out.println("Before Delete value : "+set);
        set.remove(66);
        System.out.println("After Delete value : "+set);
    }

    public static void main(String[] args) {
        TreeSetProgram obj = new TreeSetProgram();
        obj.printTreeSet();
        obj.decendingOrder();
        obj.highestAndLowestValue();
        obj.removeValue();
    }

}
