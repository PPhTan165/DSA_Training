package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        String str = "swiss";

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

//        for(int i =0; i< str.length(); i++){
//            char c = str.charAt(i);
//            int count = 0;
//            for(int j = 0; j < str.length(); j++){
//
//                if(c == str.charAt(j)){
//                    count++;
//                }
//
//            }
//            if(count == 1){
//                System.out.println(c + ": " + count);
//                break;
//            }
//        }
    }
}


