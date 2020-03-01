package mod;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "app_insurance")
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppInsurance  extends BaseEntityAudit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   /* @OneToOne(fetch = FetchType.LAZY)
    @JsonBackReference("app-insurance-app")
    @JoinColumn(name = "appid")
    private App app;
*/
    @OneToOne(fetch = FetchType.LAZY)
    @JsonBackReference("app-insurance-user-contactibility")
    @JoinColumn(name = "contactibility_ref_id")
    private UserContactibility userContactibility;

     @OneToOne(fetch = FetchType.LAZY)
    @JsonBackReference("app-insurance-user-contactibility")
    @JoinColumn(name = "contactibility_ref_id2")
    private UserContactibility userContactibility2;

    @Column(name = "eligiblity",nullable = true)
    private String eligiblity;
    @Column(name = "partner",nullable = true)
    private String partner;
    @Column(name = "benefit_options",nullable = true)
    private String benefitOptions;

    @Column(name = "type",nullable = true)
    private String type;
    @Column(name = "coverage_term",nullable = true)
    private String coverageTerm;
    @Column(name = "premium_amount",nullable = true)
    private String premiumAmount;
    @Column(name = "sum_assured",nullable = true)
    private String sumAssured;
    @Column(name = "emi",nullable = true)
    private String emi;

    @Column(name = "nominee1_first_name",nullable = true)
    private String nominee1_firstName;
    @Column(name = "nominee1_middle_name",nullable = true)
    private String nominee1_middleName;

    @Column(name = "nominee1_last_name",nullable = true)
    private String nominee1_lastName;
    @Column(name = "contactibility_ref_id",nullable = true)
    private String contactibilityRefId;
    @Column(name = "nominee1_nominee_relation",nullable = true)
    private String nominee1_nomineeRelation;
    @Column(name = "nominee1__date_of_birth",nullable = true)
    private String nominee1_DateOfBirth;

    @Column(name = "nominee1_Gender",nullable = true)
    private String nominee1_Gender;
    @Column(name = "nominee2_firstName",nullable = true)
    private String nominee2_firstName;
    @Column(name = "nominee2_middleName",nullable = true)
    private String nominee2_middleName;
    @Column(name = "nominee2_lastName",nullable = true)
    private String nominee2_lastName;

    @Column(name = "nominee2_nomineeRelation",nullable = true)
    private String nominee2_nomineeRelation;
    @Column(name = "nominee2_DateOfBirth",nullable = true)
    private String nominee2_DateOfBirth;
   @Column(name = "nominee2_Gender",nullable = true)
    private String nominee2_Gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public String getEligiblity() {
        return eligiblity;
    }

    public void setEligiblity(String eligiblity) {
        this.eligiblity = eligiblity;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getBenefitOptions() {
        return benefitOptions;
    }

    public void setBenefitOptions(String benefitOptions) {
        this.benefitOptions = benefitOptions;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoverageTerm() {
        return coverageTerm;
    }

    public void setCoverageTerm(String coverageTerm) {
        this.coverageTerm = coverageTerm;
    }

    public String getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(String premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public String getSumAssured() {
        return sumAssured;
    }

    public void setSumAssured(String sumAssured) {
        this.sumAssured = sumAssured;
    }

    public String getEmi() {
        return emi;
    }

    public void setEmi(String emi) {
        this.emi = emi;
    }

    public String getNominee1_firstName() {
        return nominee1_firstName;
    }

    public void setNominee1_firstName(String nominee1_firstName) {
        this.nominee1_firstName = nominee1_firstName;
    }

    public String getNominee1_middleName() {
        return nominee1_middleName;
    }

    public void setNominee1_middleName(String nominee1_middleName) {
        this.nominee1_middleName = nominee1_middleName;
    }

    public String getNominee1_lastName() {
        return nominee1_lastName;
    }

    public void setNominee1_lastName(String nominee1_lastName) {
        this.nominee1_lastName = nominee1_lastName;
    }

    public String getContactibilityRefId() {
        return contactibilityRefId;
    }

    public void setContactibilityRefId(String contactibilityRefId) {
        this.contactibilityRefId = contactibilityRefId;
    }

    public String getNominee1_nomineeRelation() {
        return nominee1_nomineeRelation;
    }

    public void setNominee1_nomineeRelation(String nominee1_nomineeRelation) {
        this.nominee1_nomineeRelation = nominee1_nomineeRelation;
    }

    public String getNominee1_DateOfBirth() {
        return nominee1_DateOfBirth;
    }

    public void setNominee1_DateOfBirth(String nominee1_DateOfBirth) {
        this.nominee1_DateOfBirth = nominee1_DateOfBirth;
    }

    public String getNominee1_Gender() {
        return nominee1_Gender;
    }

    public void setNominee1_Gender(String nominee1_Gender) {
        this.nominee1_Gender = nominee1_Gender;
    }

    public String getNominee2_firstName() {
        return nominee2_firstName;
    }

    public void setNominee2_firstName(String nominee2_firstName) {
        this.nominee2_firstName = nominee2_firstName;
    }

    public String getNominee2_middleName() {
        return nominee2_middleName;
    }

    public void setNominee2_middleName(String nominee2_middleName) {
        this.nominee2_middleName = nominee2_middleName;
    }

    public String getNominee2_lastName() {
        return nominee2_lastName;
    }

    public void setNominee2_lastName(String nominee2_lastName) {
        this.nominee2_lastName = nominee2_lastName;
    }

    public String getNominee2_nomineeRelation() {
        return nominee2_nomineeRelation;
    }

    public void setNominee2_nomineeRelation(String nominee2_nomineeRelation) {
        this.nominee2_nomineeRelation = nominee2_nomineeRelation;
    }

    public String getNominee2_DateOfBirth() {
        return nominee2_DateOfBirth;
    }

    public void setNominee2_DateOfBirth(String nominee2_DateOfBirth) {
        this.nominee2_DateOfBirth = nominee2_DateOfBirth;
    }

    public String getNominee2_Gender() {
        return nominee2_Gender;
    }

    public void setNominee2_Gender(String nominee2_Gender) {
        this.nominee2_Gender = nominee2_Gender;
    }

    public UserContactibility getUserContactibility() {
        return userContactibility;
    }

    public void setUserContactibility(UserContactibility userContactibility) {
        this.userContactibility = userContactibility;
        setUserContactibility2(this.userContactibility);
    }

    public UserContactibility getUserContactibility2() {
        return userContactibility2;
    }

    public void setUserContactibility2(UserContactibility userContactibility2) {
        this.userContactibility2 = userContactibility2;
    }
}
