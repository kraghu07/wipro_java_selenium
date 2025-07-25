package day5;

interface Activity {
    void perform();  // abstract

    default void log() {
        System.out.println("Logging activity");
    }

    static void info() {
        System.out.println("Static info about activity");
    }
}

class Task implements Activity {
    public void perform() {
        System.out.println("Performing task");
    }

    public static void main(String[] args) {
        Task t = new Task();
        t.perform();      // abstract method
        t.log();          // default method
        Activity.info();  // static method
    }
}
