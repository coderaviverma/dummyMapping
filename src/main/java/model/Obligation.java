
package model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="obligation")
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Obligation  extends BaseEntityAudit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
