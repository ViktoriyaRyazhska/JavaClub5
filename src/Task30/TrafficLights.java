package Task30;

public class TrafficLights {

    public static String updateLight(String current) {
        String trafficLight = "";
        if (current.equalsIgnoreCase("green")) trafficLight = "yellow";
        else if (current.equalsIgnoreCase("yellow")) trafficLight = "red";
        else if (current.equalsIgnoreCase("red")) trafficLight = "green";
        return trafficLight;
    }

}
