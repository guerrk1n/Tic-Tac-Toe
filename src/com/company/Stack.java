package com.company;

import org.omg.CORBA.OBJ_ADAPTER;

public class Stack<T> {
    private final int SIZE = 20;
    private Object[] st;
    private int top;

    Stack() {
        st = new Object[SIZE];
        top = -1;
    }

    void push(T t) {
        st[++top] = t;
    }

    T pop() {
        return (T) st[top--];
    }

    T peek() {
        return (T) st[top];
    }

    boolean isEmpty() {
        return (top == -1);
    }
}
