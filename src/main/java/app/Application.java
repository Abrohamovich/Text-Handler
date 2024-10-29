package app;

import java.nio.file.Path;


public class Application {
    private static final String BASE_PATH = "files/";

    public static void main(String[] args) {
        NIOFileHandler fileHandler = new NIOFileHandler();
        String newFileName = "noi-file-test";
        String content = "Super information.";
        String path = BASE_PATH + newFileName + ".txt";
        // Виклики методів маніпуляції з файлом
        getOutput(fileHandler.createFile(path));
        getOutput(fileHandler.writeToFile(Path.of(path), content));
        getOutput("CONTENT: " + fileHandler.readFromFile(path));
    }
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
