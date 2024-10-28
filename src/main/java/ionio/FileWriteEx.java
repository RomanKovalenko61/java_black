package ionio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
    public static void main(String[] args) throws IOException {
        String s = "sometext";

        try(FileWriter writer = new FileWriter("test1.txt", true)) {
            for (int i = 0; i < s.length(); i++) {
                writer.write(s.charAt(i));
            }
//            writer.write(s);
            System.out.println("done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
