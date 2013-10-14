package example;

import org.slf4j.Logger;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

public class Person {
    private String firstName;
    private String lastName;

    @Inject
    Logger logger;

    @PostConstruct
    void initialize() {
        logger.info( "A new instance of person is created with hashcode {}.", this.hashCode() );
    }
}
