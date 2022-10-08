package contest2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SoKhacNhauTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner scanner = new Scanner(file);
        Map<Integer, Integer> map = new TreeMap<>();
        while (scanner.hasNextInt()) {
            int key = scanner.nextInt();
            int count = 0;
            if (map.containsKey(key)) {
                count = map.get(key) + 1;
                map.put(key, count);
            } else {
                map.put(key, 1);
            }
        }
        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
