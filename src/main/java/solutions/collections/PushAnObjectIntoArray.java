package solutions.collections;

import solutions.Executable;

import java.util.ArrayList;
import java.util.List;

public class PushAnObjectIntoArray implements Executable {
    public List<String> push(){
        List<String> items = new ArrayList<>();
        items.add("an object");
        return items;
    }

    @Override
    public void execute() {
        System.out.println("Create the array and push an object to it");
        System.out.println(push());
    }
}
