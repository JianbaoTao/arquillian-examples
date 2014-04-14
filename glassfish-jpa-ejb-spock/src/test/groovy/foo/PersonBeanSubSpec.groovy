package foo

import javax.inject.Inject

class PersonBeanSubSpec extends ArquillianSpecBase {
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
