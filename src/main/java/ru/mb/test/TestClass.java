package ru.mb.test;

public class TestClass {
    private final int testField1;
    private String testField2;
    private double testField3;

    TestClass(int a, int b, int c){
        this.testField1 = a+b+c;
    }

    public int getTestField1() {
        return testField1;
    }
}
