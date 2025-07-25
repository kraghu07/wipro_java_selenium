package day5;

interface A {
    default void show() {
        System.out.println("A's show");
    }
}

interface B {
    default void show() {
        System.out.println("B's show");
    }
}

interface C {
    default void show() {
        System.out.println("C's show");
    }
}

class MyClass implements A, B, C {
    @Override
    public void show() {
        // Resolve ambiguity explicitly
        A.super.show();  // or B.super.show(), etc.
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();  // Calls the overridden method
    }
}