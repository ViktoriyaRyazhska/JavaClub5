package javaclub5.OOP.task49;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sergiy Zapadenko on 24.01.2022 19:54
 */
public class Leetspeak extends Encoder{
    Map<String, String> map = new HashMap<String, String>();
    public Leetspeak() {
        map.put("a", "4");
        map.put("e", "3");
        map.put("l", "1");
        map.put("m", "/^^\\");
        map.put("o", "0");
        map.put("u", "(_)");
    }

    public String encode(String source){
        if(source.isEmpty() || source==null || source.equals("")) throw new NullPointerException("Err");
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            String ch = ""+source.charAt(i);
            String str = map.get(ch.toLowerCase());
            s.append(str==null?ch:str);
        }
        return s.toString();
    }
}
