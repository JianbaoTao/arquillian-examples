package foo

import org.jboss.arquillian.container.test.api.Deployment
import org.jboss.arquillian.spock.ArquillianSputnik
import org.jboss.shrinkwrap.api.ShrinkWrap
import org.jboss.shrinkwrap.api.spec.WebArchive
import org.junit.runner.RunWith
import spock.lang.Specification

import javax.inject.Inject

@RunWith(ArquillianSputnik)
class PersonBeanSpec extends Specification {
    @Deployment
    static WebArchive createDeployment() {
        WebArchive war = ShrinkWrap.create(WebArchive)
                .addAsWebInfResource('beans-test.xml','beans.xml')
                .addAsResource('persistence-test.xml', 'META-INF/persistence.xml')
                .addClasses(Person, PersonBean)
        println war.toString(true)
        return war
    }

    @Inject
    PersonBean personBean

    def "create persons and count"() {
        when:
        Person john = new Person(firstName: 'John', lastName: 'Smith')
        Person jim = new Person(firstName: 'Jim', lastName: 'Green')
        println "before persist: jim's id: ${jim.id}"
        personBean.create(john)
        personBean.create(jim)
        println "before persist: jim's id: ${jim.id}"
        List<Person> all = personBean.getAll()

        then:
        2 == all.size()
    }

    def "test constraints"() {
        when:
        Person john = new Person(firstName: null, lastName: 'Smith')
        personBean.create(john)

        then:
        thrown(Exception)
    }

}
