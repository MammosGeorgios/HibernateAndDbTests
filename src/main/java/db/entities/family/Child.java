package db.entities.family;

import javax.persistence.*;

/**
 * A child class. He/she will have 2 parents and a number of siblings.
 * Extends MappedSuperclass Human
 */
@Entity
@Table(name = "CHILD")
public class Child extends Human{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_child")
    @SequenceGenerator(name = "seq_child", sequenceName = "SEQ_CHILD",allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
