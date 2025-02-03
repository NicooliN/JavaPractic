package interviewer.oop.task.two;

/*
Реализация стека Напишите класс Stack, который реализует
интерфейс java.util.Stack. Реализуйте методы push(), pop() и peek().
 */

public class Stack<T> {

    private Node top;

    public void push(T data) {
        Node<T> topNode = new Node<>(data);
        topNode.next = top;
        this.top = topNode;
    }

    public Object peek() {
        return top.data;
    }

    public Object pop(){
        Object res = top.data;
        top = top.next;
        return res;
    }

    private static class Node<T> {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }

//    private T [] stack;
//    private int size;
//    private int cap;
//    public Stack (int size) {
//        this.size = size;
//        this.cap = 0;
//        stack = (T[]) new Object[cap];
//    }
//
//    public void push(T val) {
//        stack[cap] = val;
//        cap++;
//    }
//
//    public T peek() {
//        if (cap < 0){
//            return null;
//        } else {
//            return stack[cap];
//        }
//    }
//    public T pop() {
//        if (cap < 0){
//            return null;
//        } else {
//            T res = stack[cap];
//            stack[cap] = null;
//            cap--;
//            return res;
//        }
//    }


}
