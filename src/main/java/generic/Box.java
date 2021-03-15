package generic;

public class Box<T> {
    T item;

    T get() {
        return item;
    }
    void set(T item) {
        this.item = item;
    }
}
