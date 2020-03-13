package com.raymond.chapter1.compileTest;

/**
 * When Scala is running, it's making a wrapper
 */
public class TestScala {
    public static void main(String[] args) {
        TestScala$.MODULE$.main(args);
    }
}

final class TestScala$ {
    public static final TestScala$ MODULE$;

    static {
        MODULE$ = new TestScala$();
    }

    public void main(String[] args) {
        System.out.println("Hello Scala!");
    }
}
