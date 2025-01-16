package day2.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/*
Создать папку и подпаку в src/
 */
public class Task2 {
    public static void main(String[] args) {
        Path path = Paths.get("src/newFol/");
        Path path2 = Paths.get("src/newFol/subFol");

        try{
            Files.createDirectory(path);
            Files.createDirectory(path2);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
