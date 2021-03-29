package generic;

public class GenericToolsApp {
    public static <T> void hasDuplicate(T[] arrayT) {
        for (int i = 0; i < arrayT.length; i++) {
            for (int j = i + 1; j < arrayT.length; j++) {
                if (arrayT[i].equals(arrayT[j])) {
                    System.out.println("This method has Duplicate of " + arrayT[i] + " :c");
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 2};
        String[] strings = new String[]{"Jacek", "Ola", "Piotrek", "Jacek"};
        hasDuplicate(integers);
        hasDuplicate(strings);
    }
}
