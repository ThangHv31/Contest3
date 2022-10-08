package contest2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TinhTongFile {
//    static boolean isInt(String a){
//        if ((0 - Math.pow(2,31)) <= Double.parseDouble(a)&&
//                (Math.pow(2,31) -1) >= Double.parseDouble(a))
//            return true;
//        return false;
//    }
public static boolean isInt(String number ){
    try{
        Integer.parseInt(number);
    }catch(Exception e ){
        return false;
    }
    return true;
}
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner scanner = new Scanner(file);
        Long  result = Long.valueOf(0);
        while (scanner.hasNext()){
            String content = scanner.next();
            if (isInt(content.trim()))
                result += Integer.parseInt(content);
        }
        System.out.println(result);
    }
}
