package demo

import arquillian.ArquillianWarBase
import ch.qos.logback.classic.Logger
import org.junit.Test
import org.slf4j.LoggerFactory

import javax.inject.Inject

class GreeterTest extends ArquillianWarBase {
    @Inject
    Greeter greeter

    static final Logger logger = LoggerFactory.getLogger( this )

    @Test
    public void should() {
        logger.info('Making assertion')
        assert greeter.greeting() == 'Hello, there'
    }
}
