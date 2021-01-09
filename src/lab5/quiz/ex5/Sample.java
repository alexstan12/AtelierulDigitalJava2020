package lab5.quiz.ex5;

import java.util.Stack;

public class Sample<E> {
    Stack<E> ob = new Stack<>();
    public void push(E obj){
        ob.push(obj);
    }
    public E pop(){
        E obj = ob.pop();
        return obj;
    }
}
