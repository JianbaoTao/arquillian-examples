package greeter;

import java.io.PrintStream;

public class Greeter {

    public void greet( PrintStream out, String name ) {
        out.println( createGreeting( name ));
    }

    public String createGreeting( String name ) {
        return "Hello, " + name + "!";
    }

    public String hello() {
        return "Hello, World!";
    }

}
