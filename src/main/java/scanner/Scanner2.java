package scanner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Scanner2 {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        try (Scanner sc = new Scanner(new FileReader("poem.txt"))) {
            sc.useDelimiter("\\W");
            while (sc.hasNext()) {
                set.add(sc.next());
            }
            for (String word : set) {
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
