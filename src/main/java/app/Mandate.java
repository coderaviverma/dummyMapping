
package app;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name="mandate")
public class Mandate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("mandates-app")
    @JoinColumn(name = "app_id")
    private App app;

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
