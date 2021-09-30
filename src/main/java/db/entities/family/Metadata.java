package db.entities.family;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

/**
 * A metadata BaseClass. Includes creation/modified data as well an IS_ACTIVE flag for soft deletes
 */
@MappedSuperclass
public class Metadata {

    @Column(name = "CREATED_BY", length = 64)
    protected String createdBy;

    @CreationTimestamp
    @Column(name = "CREATED_ON")
    protected LocalDateTime createdOn;

    @Column(name = "MODIFIED_BY", length = 64)
    protected String modifiedBy;

    @UpdateTimestamp
    @Column(name = "MODIFIED_ON")
    protected LocalDateTime modifiedOn;

    @Column(name = "IS_ACTIVE")
    protected Boolean isActive;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public LocalDateTime getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(LocalDateTime modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @PrePersist
    private void initialize() {
        this.createdBy = "HibernateDbTestApplication";
//        this.modifiedBy = "HibernateDbTestApplication";
        this.isActive = true;
    }

    @PreUpdate
    private void update(){
//        this.modifiedBy = "HibernateDbTestApplication";
    }
}
