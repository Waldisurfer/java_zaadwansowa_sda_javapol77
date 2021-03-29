package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;

public class OperationsApp {
    public static void main(String[] args) {


        Path relativePath = Paths.get("input.txt");

        System.out.println(relativePath + " istnieje: " + Files.exists(relativePath));

        Path projectRootDitectory = Paths.get("C:\\Users\\Michal\\IdeaProjects\\java_zaadwansowa_sda_javapol77\\src\\main\\java\\io");
        Path inputPath = projectRootDitectory.resolve("input.text");
        System.out.println(projectRootDitectory + " jest plikiem: " + Files.isRegularFile(projectRootDitectory));

        System.out.println(Files.isWritable(Path.of("C:\\Users\\Michal\\IdeaProjects\\java_zaadwansowa_sda_javapol77\\src\\main\\java\\io\\input.txt")));;
//        Files.writeString("C:\\Users\\Michal\\IdeaProjects\\java_zaadwansowa_sda_javapol77\\src\\main\\java\\io\\input.txt", )


        Path path = Paths.get("C:\\Users\\Michal\\IdeaProjects\\java_zaadwansowa_sda_javapol77\\src\\main\\java\\io");

        Path discC = Paths.get("C");
        try {
            Set<Path> pathSet = Files.list(projectRootDitectory).collect(Collectors.toSet());
            System.out.println(pathSet);
        }
        catch (IOException ioe) {
            System.out.println("Error IO");
        }
    }
}
