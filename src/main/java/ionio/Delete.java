package ionio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Delete {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\copyHere");
        Files.walkFileTree(path, new MyFileVisitor3());
        System.out.println("Done!");
    }
}

class MyFileVisitor3 extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Delete name " + file.getFileName());
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Delete directory " + dir.getFileName());
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }
}