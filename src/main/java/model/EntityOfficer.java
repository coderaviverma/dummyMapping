
package model;

import javax.annotation.Generated;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.google.gson.annotations.Expose;

@Entity
@Table(name="entity_officer")
public class EntityOfficer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long entity_officer_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("entity-officers-user")
    @JoinColumn(name = "cuid")
    private User user;

    @Column(name="belongs_to",length=60,nullable=true)
    private String belongsTo;

    @Column(name="designation",length=60,nullable=true)
    private String designation;

    public Long getEntity_officer_id() {
        return entity_officer_id;
    }

    public void setEntity_officer_id(Long entity_officer_id) {
        this.entity_officer_id = entity_officer_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBelongsTo() {
        return belongsTo;
    }

    public void setBelongsTo(String belongsTo) {
        this.belongsTo = belongsTo;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
