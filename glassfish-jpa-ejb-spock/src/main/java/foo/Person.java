package foo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Person implements Serializable {
    private static final long serialVersionUID = -1042149049649061284L;

    @Id @GeneratedValue
    private long id;
    @NotNull
    private String firstName;
    private String lastName;
}
