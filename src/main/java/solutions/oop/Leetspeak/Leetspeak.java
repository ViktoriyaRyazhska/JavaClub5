package solutions.oop.Leetspeak;


import program.helper.Helper;
import solutions.Executable;

public class Leetspeak extends Encoder implements Executable {

    public String encode(String source){
        if (source == null){return "";}

        java.util.Hashtable<String, String> dict = new java.util.Hashtable<>();
        dict.put("a", "4");
        dict.put("e", "3");
        dict.put("l", "1");
        dict.put("m", "/^^\\");
        dict.put("o", "0");
        dict.put("u", "(_)");

        for (String key:dict.keySet()) {
            source = source.replace(key, dict.get(key));
            source = source.replace(key.toUpperCase(java.util.Locale.ROOT), dict.get(key));
        }

        return source;
    }

    @Override
    public void execute() {
        System.out.println("Encode string you enter. Enter the String: ");
        String str =  Helper.getLine();
        System.out.println("Result: " + encode(str));
    }
}


