package etc;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("zero", 0);
        System.out.println(map);
        int a = map.get("zero");
        System.out.println(a);
    }
}