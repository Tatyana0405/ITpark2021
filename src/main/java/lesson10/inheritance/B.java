package lesson10.inheritance;

import lesson10.inheritance.A;

public class B extends A {

    public void method1() {

    }

    public B(String str) {

        System.out.println("Вызван конструктор класса B");
    }

    @Override
    public void print() {

    }
}
