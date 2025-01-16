package day2.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
/*
Переместить файл в папку
 */
public class Task4 {
    public static void main(String[] args) {
        Path srcPath = Paths.get("src/test1.txt");
        Path dstPath = Paths.get("src/newFol/test1.txt");
        try {
            Files.move(srcPath, dstPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
