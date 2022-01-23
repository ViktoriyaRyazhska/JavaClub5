package program;

import solutions.Executable;
import solutions.*;
import solutions.basicProgram.*;

import java.util.Map;
import java.util.TreeMap;

public class MenuCommands {
    private final Map<String, Executable> options;

    public MenuCommands() {
        this.options = new TreeMap<>();

        options.put("You can't code under pressure", new YouCantCodeUnderPressure());
        options.put("Volume of a cuboid", new VolumeOfCuboid());
        options.put("Exit", new Exit());
    }

    public Map<String, Executable> getOptions() {
        return options;
    }
}
