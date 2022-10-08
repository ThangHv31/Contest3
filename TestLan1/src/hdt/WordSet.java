package hdt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordSet {
    private Set<String> wSet ;

    @Override
    public String toString() {
        String result = "";
        for (String s : wSet){
            result += s + "\n";
        }
        return result;
    }

    public WordSet(String s) throws FileNotFoundException {
        File file = new File(s);
        Scanner scanner = new Scanner(file);
        Set<String> set = new TreeSet<>();
        while (scanner.hasNext()) {
            String key = scanner.next().trim().toLowerCase();
            set.add(key);
        }
        this.wSet = set;
    }
}
