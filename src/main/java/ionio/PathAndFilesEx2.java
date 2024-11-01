package ionio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("D:\\testing");
        Path directoryCopyPath = Paths.get("copyTest");

//        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(filePath, directoryPath.resolve("test16.txt"));
//        System.out.println("Done!");
//        Files.copy(directoryPath, directoryPath.resolve(directoryCopyPath));
//        System.out.println("Done!");

//        Files.move(filePath, directoryPath.resolve("test15.txt"));

//        Files.move(Paths.get("test10"), Paths.get("test15"));

//        Files.delete(Paths.get("test15"));

//        Files.delete(Paths.get("D:\\").resolve(directoryCopyPath));
    }
}
