package foo

import org.jboss.arquillian.container.test.api.Deployment
import org.jboss.arquillian.spock.ArquillianSputnik
import org.jboss.shrinkwrap.api.ShrinkWrap
import org.jboss.shrinkwrap.api.spec.WebArchive
import org.junit.runner.RunWith
import spock.lang.Specification

@RunWith(ArquillianSputnik)
abstract class ArquillianSpecBase extends Specification {
    @Deployment
    static WebArchive createDeployment() {
        WebArchive war = ShrinkWrap.create(WebArchive)
                .addAsWebInfResource('beans-test.xml','beans.xml')
                .addAsResource('persistence-test.xml', 'META-INF/persistence.xml')
                .addClasses(Person, PersonBean)
        println war.toString(true)
        return war
    }
}
