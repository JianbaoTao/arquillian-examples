package example

import org.jboss.arquillian.container.test.api.Deployment
import org.jboss.arquillian.spock.ArquillianSputnik
import org.jboss.shrinkwrap.api.ShrinkWrap
import org.jboss.shrinkwrap.api.asset.EmptyAsset
import org.jboss.shrinkwrap.api.spec.JavaArchive
import org.junit.runner.RunWith
import spock.lang.Specification

import javax.inject.Inject

@RunWith(ArquillianSputnik)
class PersonSpec extends Specification {

    @Deployment
    static JavaArchive createDeployment() {
        ShrinkWrap.create(JavaArchive)
            .addAsManifestResource(EmptyAsset.INSTANCE, 'beans.xml')
            .addClasses(Person, LoggerProducer)
    }

    @Inject Person person

    def "person should not be null"() {
        expect:
        person != null
    }
}
