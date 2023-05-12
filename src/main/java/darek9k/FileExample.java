package darek9k;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");
        Scanner scanner = new Scanner(file);
        System.out.println("--------------------------0");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        System.out.println("--------------------------1");
        File outfile = new File("out.txt");
        //New try implementation if Closeable interface is implemented.
        try(
                BufferedReader bf = new BufferedReader(new FileReader(file));
                FileWriter fw = new FileWriter(outfile);
        ){
            String line;
            while ((line = bf.readLine()) != null) {
                fw.write(line);
                fw.write(System.lineSeparator());
                System.out.println(line);
            }
            fw.close();
        }

        System.out.println("--------------------------2");

        try(BufferedReader bf = new BufferedReader(new FileReader(file))) {
            bf.lines().forEach(System.out::println);
        }
        System.out.println("--------------------------3");

        List<String> allLines = Files.readAllLines(Path.of("test.txt"));
        allLines.forEach(System.out::println);

        System.out.println("--------------------------4");

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        byte[] bytes = bis.readAllBytes();

        System.out.println(Arrays.toString(bytes));
        bis.close();

    }
}
