package hdt.loaiSo;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class LoaiSo implements Comparable<String>{
    public static boolean isInt(String number ){
        try{
            Integer.parseInt(number);
        }catch(Exception e ){
            return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        File file = new File("DATA.in");
        Scanner scanner = new Scanner(file);
        Set<String> set = new TreeSet<>();
        List<String> strings = new ArrayList<>();
        Collections.sort(strings, String::compareTo);
        while (scanner.hasNext()){
            String s = scanner.next();
            if (isInt(s)){
                continue;
            }else {
                set.add(s);
            }
        }
        for (String str : set){
            System.out.printf(str + " ");
        }

    }


    @Override
    public int compareTo(String o) {
        return 0;
    }
}
