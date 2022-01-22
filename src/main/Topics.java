package main;

import java.util.List;

public class Topics {
    private static List<String> menu = getList();

    private static List<String> getList() {
        return List.of(
                "1: \"Basic program\"",
                "2: \"Classes\"",
                "3: \"Conditions\"",
                "4: \"Loops\"",
                "5: \"OOP\"",
                "6: \"String\"",
                "7: \"Collections\""
        );
    }

    public List<String> getMenu (){
        for (String str : Topics.menu) {
            System.out.println(str);
        }
        return menu;
    }
}
