package oop.inheritance;

import java.util.ArrayList;

public class Parent {
    int a;
    int b;
}

class Child extends Parent {
    int c;
}

class Child2 extends  Parent {

}

class GrandChild extends Child {
    int d;
}

class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.a = 10;
        child.b = 11;
        child.c = 15;

        GrandChild grChild = new GrandChild();
        grChild.d = 1;
        grChild.a = 4;


    }
}
