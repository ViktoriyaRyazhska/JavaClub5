package solutions;

public class Exit implements Executable{

    @Override
    public void execute() {
        System.out.println("Bye!");
        System.exit(0);
    }

}
