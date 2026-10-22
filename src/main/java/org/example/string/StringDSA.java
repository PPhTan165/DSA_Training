package org.example.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringDSA {
    private String str;

    public StringDSA(String string) {
        this.str = string;
    }

    public void showVowels(String str){
        List<java.lang.String> vowels = new ArrayList<>();
        StringBuilder vowel = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(isVowel(c)){
                vowel.append(c);

                if(vowel.length() == 3){
                    vowels.add(vowel.toString());
                    vowel.setLength(0);
                }
            }else {
                vowel.setLength(0);
            }
        }
       System.out.println(vowels);

    }

    public void firstNonRepeatCharacter(String str){
        Map<Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.compute(c,(key,val) -> (val + 1));
            }
        }

        for(char c: str.toCharArray()){
            if(map.get(c) == 1){
                System.out.println(c);
                break;
            }
        }
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
