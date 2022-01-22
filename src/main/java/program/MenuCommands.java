package program;

import solutions.Executable;
import solutions.basicProgram.*;
import solutions.classes.IsDivisible;

import java.util.Map;
import java.util.TreeMap;

public class MenuCommands {
    public final Map<String, Executable> options;

    public MenuCommands() {
        this.options = new TreeMap<>();

        options.put("You Can't code under pressure 1", new YouCantCodeUnderPressure1());
        options.put("Volume of a cuboid", new VolumeOfCuboid());
        options.put("Beginner series number clock", new BeginnerSeriesNumberClock());
        options.put("Grasshopper", new Grasshopper());
        options.put("PixelArt", new PixelArt());
        options.put("Year to century", new CenturyToYear());
        options.put("IsDivisible",new IsDivisible());


    }
}
