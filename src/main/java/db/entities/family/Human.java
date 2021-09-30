package db.entities.family;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * Base Human class. Extends Metadata class
 */
@MappedSuperclass
public class Human extends Metadata{

    @Column(name = "FIRST_NAME" , length = 64, nullable = false)
    protected String firstName;

    @Column(name = "LAST_NAME", length = 64, nullable = false)
    protected String lastName;

    @Column(name = "FATHER_NAME", length = 64, nullable = false)
    protected String fatherName;

    @Column(name = "DATE_OF_BIRTH", nullable = false)
    protected LocalDateTime dateOfBirth;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
