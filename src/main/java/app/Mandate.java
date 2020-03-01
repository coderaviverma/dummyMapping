
package app;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="mandate")
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Mandate  extends BaseEntityAudit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("mandate-app")
    @JoinColumn(name = "appid")
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

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }
}
