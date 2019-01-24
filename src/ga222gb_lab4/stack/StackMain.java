package ga222gb_lab4.stack;

import java.util.Iterator;

public class StackMain {

    public static void main(String[] args){

        Stack s = new StackImplementation();
        System.out.println("Empty: " + s.isEmpty());                    //Empty ==> true
        s.push(1);                                   //Add element
        s.push(2);                                   //Add element
        s.push(3);                                   //Add element
        s.push(4);                                   //Add element
        s.push(5);                                   //Add element
        System.out.println("Size: " + s.size());            //Size ==> 5
        s.pop();                                            //Remove 5
        System.out.println("Top element: " + s.peek());     //Top element ==> 4
        s.pop();
        s.pop();

        Iterator<Object> it = s.iterator();                 //Print 1 and 2
        while(it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }
    }
}
