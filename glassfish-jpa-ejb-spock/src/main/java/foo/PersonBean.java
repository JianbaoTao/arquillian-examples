package foo;

import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Singleton
public class PersonBean {
    @PersistenceContext(unitName = "testPU")
    private EntityManager em;

    public Person create( Person person ) {
        em.persist( person );
        return person;
    }

    public List<Person> getAll() {
        return em.createQuery( "select p from Person p" ).getResultList();
    }
}
