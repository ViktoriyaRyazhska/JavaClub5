package three;

//Task53. Welcome to the City
public class Task53 {

    public String sayHello(String [] name, String city, String state){
        StringBuilder welcome = new StringBuilder("Hello, ");

        for (int i = 0; i < name.length; i++) {
            welcome.append(name[i]);
            if (name[i] != name[name.length - 1]) {
                welcome.append(" ");
            }
        }

        return welcome.append("! Welcome to ")
                .append(city)
                .append(", ")
                .append(state)
                .append("!")
                .toString();
    }
}