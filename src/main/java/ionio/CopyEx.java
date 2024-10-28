package ionio;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("text.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("copy_text.txt"))) {
//            int character;
//            while ((character = br.read()) != -1) {
//                bw.write(character);
//            }

            String line;
            while((line = br.readLine()) != null) {
                bw.write(line);
                bw.write('\n');
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
