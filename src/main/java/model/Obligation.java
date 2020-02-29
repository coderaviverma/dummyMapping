
package model;

import javax.annotation.Generated;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.google.gson.annotations.Expose;

@Entity
@Table(name="obligation")
public class Obligation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bank_detail_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "cuid")
    private User user;

    @Column(name="banking",nullable=true)
    private Long banking;
    @Column(name="bureau",nullable=true)
    private Long bureau;
    @Column(name="clix",nullable=true)
    private Long clix;
    @Column(name="declared",nullable=true)
    private Long declared;
    @Column(name="derog_status",nullable=true)
    private String derogStatus;
    @Column(name="foir",nullable=true)
    private String foir;

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

    public Long getBanking() {
        return banking;
    }

    public void setBanking(Long banking) {
        this.banking = banking;
    }

    public Long getBureau() {
        return bureau;
    }

    public void setBureau(Long bureau) {
        this.bureau = bureau;
    }

    public Long getClix() {
        return clix;
    }

    public void setClix(Long clix) {
        this.clix = clix;
    }

    public Long getDeclared() {
        return declared;
    }

    public void setDeclared(Long declared) {
        this.declared = declared;
    }

    public String getDerogStatus() {
        return derogStatus;
    }

    public void setDerogStatus(String derogStatus) {
        this.derogStatus = derogStatus;
    }

    public String getFoir() {
        return foir;
    }

    public void setFoir(String foir) {
        this.foir = foir;
    }
}
