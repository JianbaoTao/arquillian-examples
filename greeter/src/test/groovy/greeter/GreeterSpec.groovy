package greeter

import org.jboss.arquillian.container.test.api.Deployment
import org.jboss.arquillian.spock.ArquillianSputnik
import org.jboss.shrinkwrap.api.ShrinkWrap
import org.jboss.shrinkwrap.api.asset.EmptyAsset
import org.jboss.shrinkwrap.api.spec.JavaArchive
import org.junit.runner.RunWith
import spock.lang.Specification

import javax.inject.Inject

@RunWith(ArquillianSputnik)
class GreeterSpec extends Specification {
    @Deployment
    static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive)
                .addClasses(Greeter)
                .addAsManifestResource(EmptyAsset.INSTANCE, 'beans.xml')
    }

    @Inject Greeter greeter

    def "should get hello world"() {

        expect:
        "Hello, World!" == greeter.hello()
    }

}
