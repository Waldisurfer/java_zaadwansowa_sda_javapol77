package typygeneryczne2703;

public class Box<T> {
    T item;

    public T get() {
        return item;
    }
    public void set(T item) {
        this.item = item;
    }
}
