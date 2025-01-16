package day2.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
/*
Копировать файл с контентом
 */
public class Task3 {

    public static void main(String[] args) {
        Path srcPath = Paths.get("src/test.txt");
        Path dstPath = Paths.get("src/test1.txt");

        try {
            Path path = Files.copy(srcPath, dstPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println(path);
            System.out.println("copy: \n" + new String(Files.readAllBytes(path)));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
