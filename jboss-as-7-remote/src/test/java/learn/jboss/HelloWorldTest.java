package learn.jboss;

import arquillian.ArquillianWarBase;
import org.junit.Test;

public class HelloWorldTest extends ArquillianWarBase {
    @Test
    public void test() {
        System.out.println( "Nice, it's working." );
    }
}
