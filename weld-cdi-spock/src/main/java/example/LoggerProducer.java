package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LoggerProducer {

    @Produces
    private Logger logger( InjectionPoint injectionPoint) {
        return LoggerFactory.getLogger( injectionPoint.getMember().getDeclaringClass() );
    }
}
