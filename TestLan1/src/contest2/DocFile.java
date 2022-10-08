package contest2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DocFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String content = scanner.nextLine();
            System.out.println(content);
        }

    }
}
