package greeter;

import javax.enterprise.inject.Produces;

public class CdiProducer {

    @Produces @Hello
    public String hello() {
        return "hello";
    }
}
