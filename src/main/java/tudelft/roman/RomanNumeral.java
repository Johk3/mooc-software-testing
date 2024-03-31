package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private static Map<Character, Integer> map;

    static {
        map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int convert(String s) {
        int num = 0;
        System.out.println("s: " + s);

        if (s.length() == 1){
            return map.get(s.charAt(0));
        }

        for (int i=0; i < s.length()-1; i++){
            if (map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                num -= map.get(s.charAt(i));
                System.out.println("-: " + map.get(s.charAt(i)));
            } else {
                num += map.get(s.charAt(i));
                System.out.println("+: " + map.get(s.charAt(i)));
            }

        }
        num += map.get(s.charAt(s.length()-1));
        System.out.println("RESULT: " + num);
        return num;
    }
}
