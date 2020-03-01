
package model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="mandate")
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Mandate  extends BaseEntityAudit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;//_id rakh du har jagah

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("mandates-user")
    @JoinColumn(name = "cuid")
    private User user;

    @Column(name="dms_doc_id",nullable=true)
    private String dmsDocId;
    @Column(name="dms_external_doc_id",nullable=true)
    private String dmsExternalDocId;
    @Column(name="umrn",nullable=true)
    private String umrn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDmsDocId() {
        return dmsDocId;
    }

    public void setDmsDocId(String dmsDocId) {
        this.dmsDocId = dmsDocId;
    }

    public String getDmsExternalDocId() {
        return dmsExternalDocId;
    }

    public void setDmsExternalDocId(String dmsExternalDocId) {
        this.dmsExternalDocId = dmsExternalDocId;
    }

    public String getUmrn() {
        return umrn;
    }

    public void setUmrn(String umrn) {
        this.umrn = umrn;
    }
}
