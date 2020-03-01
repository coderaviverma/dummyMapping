package app;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "app_kyc")
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class AppKyc  extends BaseEntityAudit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("app-kyc-user")
    @JoinColumn(name = "user_ref_id")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("app-kyc-app")
    @JoinColumn(name = "appid")
    private App app;

    @Column(name = "kyc_reference_id1",nullable = true)
    private String kycReferenceId1;
    @Column(name = "id_type1",nullable = true)
    private String IdType1;
    @Column(name = "kyc_reference_id2",nullable = true)
    private String kycReferenceId2;
    @Column(name = "id_type2",nullable = true)
    private String IdType2;
    @Column(name = "kyc_reference_id3",nullable = true)
    private String kycReferenceId3;
    @Column(name = "id_type3",nullable = true)
    private String IdType3;
    @Column(name = "acknowledgment_number",nullable = true)
    private String acknowledgmentNumber;

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

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public String getKycReferenceId1() {
        return kycReferenceId1;
    }

    public void setKycReferenceId1(String kycReferenceId1) {
        this.kycReferenceId1 = kycReferenceId1;
    }

    public String getIdType1() {
        return IdType1;
    }

    public void setIdType1(String idType1) {
        IdType1 = idType1;
    }

    public String getKycReferenceId2() {
        return kycReferenceId2;
    }

    public void setKycReferenceId2(String kycReferenceId2) {
        this.kycReferenceId2 = kycReferenceId2;
    }

    public String getIdType2() {
        return IdType2;
    }

    public void setIdType2(String idType2) {
        IdType2 = idType2;
    }

    public String getKycReferenceId3() {
        return kycReferenceId3;
    }

    public void setKycReferenceId3(String kycReferenceId3) {
        this.kycReferenceId3 = kycReferenceId3;
    }

    public String getIdType3() {
        return IdType3;
    }

    public void setIdType3(String idType3) {
        IdType3 = idType3;
    }

    public String getAcknowledgmentNumber() {
        return acknowledgmentNumber;
    }

    public void setAcknowledgmentNumber(String acknowledgmentNumber) {
        this.acknowledgmentNumber = acknowledgmentNumber;
    }
}
