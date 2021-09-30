package db.entities.family;


import javax.persistence.*;

/**
 * This will be a parent class. He/She will have a spouse and children.
 * Extends MappedSuperclass Human.
 */
@Entity
@Table(name = "PARENT")
public class Parent extends Human{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_parent")
    @SequenceGenerator(name = "seq_parent", sequenceName = "SEQ_PARENT", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

//    @Column(name = "SPOUSE_ID")
//    private Long spouseId;
//

    @OneToOne
    @JoinColumn(name = "SPOUSE_ID", referencedColumnName = "id")
    private Parent spouse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Parent getSpouse() {
        return spouse;
    }

    public void setSpouse(Parent spouse) {
        this.spouse = spouse;
    }
}
