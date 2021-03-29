package strings;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;

public class StringApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tekst przykladowy");
        list.add("Tekst przykladowy 1");
        list.add("Tekst przykladowy 2");
        list.add("Tekst przykladowy 3");
        list.add("Tekst przykladowy 4");
        list.add("Tekst przykladowy 5");

        ToUpperCase toUpperCase = new ToUpperCase();

        StringOperation textDuplicate = new StringOperation() {
            @Override
            public String modify(String text) {
                return text.concat(text);
            }
        };
        StringOperation subString = new StringOperation() {
            @Override
            public String modify(String text) {
                return text.substring(0, 3);
            }
        };

        StringOperation subStringLambda = (String text) -> {
            return text.substring(0, 3);
        };


        StringOperation addingHelloOperation = StringApp::addingHello;


        StringOperation removeLetter = (String text) -> {
            return text.replace("i", "");
        };


        for (String text : list) {
            System.out.println(toUpperCase.modify(text));
        }
        for (String text1 : list) {
            String duplicate = textDuplicate.modify(text1);
            System.out.println(duplicate);

            String substring = subStringLambda.modify(text1);
            System.out.println(substring);

            String removedLetter = removeLetter.modify(text1);
            System.out.println(removedLetter);
            System.out.println(addingHelloOperation.modify(text1));
        }


    }

    private static String addingHello(String text) {
        return "Hello " + text;
    }
}
