package greeter

import org.jboss.arquillian.container.test.api.Deployment
import org.jboss.arquillian.junit.Arquillian
import org.jboss.shrinkwrap.api.ShrinkWrap
import org.jboss.shrinkwrap.api.asset.EmptyAsset
import org.jboss.shrinkwrap.api.spec.JavaArchive
import org.junit.Test
import org.junit.runner.RunWith

import javax.inject.Inject

@RunWith(Arquillian.class)
class GreeterTest {

    @Deployment
    static JavaArchive createDeployment() {
        JavaArchive jar = ShrinkWrap.create( JavaArchive.class )
                    .addClasses( Greeter.class, CdiProducer.class, Hello.class )
                    .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml")
        println jar.toString(true)
        return jar
    }

    @Inject
    Greeter greeter

    @Inject @Hello
    String hello;

    @Test
    void "should create greeting"() {

        assert "Hello, JBT!" == greeter.createGreeting("JBT")
        greeter.greet(System.out, "JBT")
        assert "hello" == hello

    }
}
