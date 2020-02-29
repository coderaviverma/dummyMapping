
package model;

import javax.annotation.Generated;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.google.gson.annotations.Expose;

@Entity
@Table(name="mandate")
public class Mandate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bank_detail_id;

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

    public Long getBank_detail_id() {
        return bank_detail_id;
    }

    public void setBank_detail_id(Long bank_detail_id) {
        this.bank_detail_id = bank_detail_id;
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
