package collection.program;

import java.util.Stack;

public class StackProgram {
    public void stackPrint(){
        Stack<Integer> value = new Stack<>();
        value.push(15);
        value.push(20);
        value.push(18);
        value.push(2);
        value.push(5);
        value.push(9);
        for(int i = value.size(); i > 0; i--){
            System.out.println(value.peek());
            value.pop();
        }
    }

    public static void main(String[] args) {
        StackProgram obj = new StackProgram();
        obj.stackPrint();
    }
}
