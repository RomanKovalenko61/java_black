package ionio;

import java.io.*;

public class CopyEx2 {
    public static void main(String[] args) {
    try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Downloads\\java.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("java.jpg"))) {
        int i;
        while ((i = bis.read()) != -1) {
            bos.write(i);
        }
        System.out.println("Done!");

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
