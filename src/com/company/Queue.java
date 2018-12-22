package com.company;

public class Queue<T> {
    private final int SIZE = 20;
    private Object[] queArray;
    private int front;
    private int rear;

    Queue() {
        queArray = new Object[SIZE];
        front = 0;
        rear = -1;
    }

    void insert(T t) {
        if (rear == SIZE - 1) {
            rear = -1;
        }
        queArray[++rear] = t;
    }

    T remove() {
        T temp = (T) queArray[front++];
        if (front == SIZE) {
            front = 0;
        }
        return (T) temp;
    }


    public boolean isEmpty() {
        return (rear + 1 == front || (front + SIZE - 1 == rear));
    }


}
