
package app;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name="identities")
public class Identities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JsonBackReference("identities-user")
    @JoinColumn(name = "cuid")
    private User user;

    @Column(name="aadhar",length=12,nullable=true)
    private String aadhar;
    @Column(name="aadhar_kyc_id",nullable=true)
    private String aadharKycId;
    @Column(name="cin",nullable=true)
    private String cin;
    @Column(name="ckyc_kyc_id",nullable=true)
    private String ckycKycId;
    @Column(name="ckyc_number",length=20,nullable=true)
    private String ckycNumber;
    @Column(name="driving_license",length=30,nullable=true)
    private String drivingLicense;
    @Column(name="driving_license_kyc_id",nullable=true)
    private String drivingLicenseKycId;
    @Column(name="nrega",length=20,nullable=true)
    private String nrega;
    @Column(name="nrega_kyc_id",nullable=true)
    private String nregaKycId;
    @Column(name="pan",length=10,nullable=true)
    private String pan;
    @Column(name="pan_kyc_id",nullable=true)
    private String panKycId;
    @Column(name="passport",length=30,nullable=true)
    private String passport;
    @Column(name="passport_kyc_id",nullable=true)
    private String passportKycId;
    @Column(name="tan",nullable=true)
    private String tan;
    @Column(name="udyog_aadhar_number",nullable=true)
    private String udyogAadharNumber;
    @Column(name="voter_id",length=20,nullable=true)
    private String voterId;
    @Column(name="voter_kyc_id",nullable=true)
    private String voterKycId;

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

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getAadharKycId() {
        return aadharKycId;
    }

    public void setAadharKycId(String aadharKycId) {
        this.aadharKycId = aadharKycId;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getCkycKycId() {
        return ckycKycId;
    }

    public void setCkycKycId(String ckycKycId) {
        this.ckycKycId = ckycKycId;
    }

    public String getCkycNumber() {
        return ckycNumber;
    }

    public void setCkycNumber(String ckycNumber) {
        this.ckycNumber = ckycNumber;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public String getDrivingLicenseKycId() {
        return drivingLicenseKycId;
    }

    public void setDrivingLicenseKycId(String drivingLicenseKycId) {
        this.drivingLicenseKycId = drivingLicenseKycId;
    }

    public String getNrega() {
        return nrega;
    }

    public void setNrega(String nrega) {
        this.nrega = nrega;
    }

    public String getNregaKycId() {
        return nregaKycId;
    }

    public void setNregaKycId(String nregaKycId) {
        this.nregaKycId = nregaKycId;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getPanKycId() {
        return panKycId;
    }

    public void setPanKycId(String panKycId) {
        this.panKycId = panKycId;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPassportKycId() {
        return passportKycId;
    }

    public void setPassportKycId(String passportKycId) {
        this.passportKycId = passportKycId;
    }

    public String getTan() {
        return tan;
    }

    public void setTan(String tan) {
        this.tan = tan;
    }

    public String getUdyogAadharNumber() {
        return udyogAadharNumber;
    }

    public void setUdyogAadharNumber(String udyogAadharNumber) {
        this.udyogAadharNumber = udyogAadharNumber;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getVoterKycId() {
        return voterKycId;
    }

    public void setVoterKycId(String voterKycId) {
        this.voterKycId = voterKycId;
    }
}
