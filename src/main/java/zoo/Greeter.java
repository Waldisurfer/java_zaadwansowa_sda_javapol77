package zoo;

public class Greeter {


    void greet() {
        System.out.println("Hello, World!");
    }
    void greet(String name) {
        System.out.println("Hello, " + name);
    }
    void greet(String greeting, String name) {
        System.out.println(greeting + " " + name);
    }
}
