package DSA.Bind75.p6_anagram;

import java.util.HashMap;
import java.util.Map;

class anagram {
    public static boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()) return false;

        //insert into h.m
        Map<Character,Integer> map = new HashMap<>();
        for (char each :s.toCharArray()){
            if(map.containsKey(each)){
                map.put(each,map.get(each)+1);
            } else map.put(each,1);
        }

        for (int i= 0;i<s.length();i++){

            //check if does not contain
            if(!map.containsKey(t.charAt(i))) return false;

            //if value is 0
            if(map.get(t.charAt(i)) == 0) return false;
            else
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
        }

        return true;
    }
}
