package solutions.oop;

import solutions.Executable;

import java.util.Arrays;

public class AdamEndEve implements Executable {

        public static Human[] create() {
            return new Human[]{new Man(), new Woman()};
        }

        @Override
        public void execute() {
            System.out.println(Arrays.toString(create()));
        }
    }

    class Human {

    }

    class Man extends Human {

    }

    class Woman extends Human {

    }

