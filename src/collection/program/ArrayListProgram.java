package collection.program;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram {
    public void simplePrint(){
        ArrayList<String> value =new ArrayList<>();
        value.add("One");
        value.add("Two");
        value.add("Three");
        value.add("Four");
        value.add("Five");
        value.add("Six");
        for(int i = 0; i < value.size(); i++){
            System.out.println(value.get(i));
        }
    }

    public void sortArray(){
        ArrayList<Integer> value =new ArrayList<>();
        value.add(1);
        value.add(5);
        value.add(8);
        value.add(2);
        value.add(3);
        value.add(6);
        value.add(6);
        for(int i = 0; i < value.size(); i++){
            for (int j =0; j < value.size(); j++ )
                if (value.get(j) >= value.get(i)) {
                    int temp = value.get(j);
                    value.set(j, value.get(i));
                    value.set(i, temp);
                }
        }
        System.out.println(value);
    }

    public  void searchValue(){
        ArrayList<String> value =new ArrayList<>();
        value.add("One");
        value.add("Two");
        value.add("Three");
        value.add("Four");
        value.add("Five");
        value.add("Six");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Search Value : ");
        String search = sc.nextLine();
        for(int i = 0; i < value.size(); i++){
            if (search.equals(value.get(i))){
                System.out.println(value.get(i)+" Value is found in "+i+"th Index");
                return;
            }
        }
        System.out.println("Not Fouund........");
    }
    public static void main(String[] args) {
        ArrayListProgram obj = new ArrayListProgram();
        obj.simplePrint();
        obj.sortArray();
        obj.searchValue();
}
}
