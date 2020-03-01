
package app;

import com.fasterxml.jackson.annotation.JsonBackReference;
import enms.Gender;

import javax.persistence.*;

@Entity
@Table(name="user_details")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JsonBackReference("user-details-user")
    @JoinColumn(name = "cuid")
    private User user;

    @Column(name="category",nullable=true)
    private String category;
    @Column(name="citizenship",nullable=true)
    private String citizenship;
    @Column(name="father_name",length=50,nullable=true)
    private String fatherName;
    @Column(name="gender",nullable=true)
    private Gender gender;
    @Column(name="industry",nullable=true)
    private String industry;
    @Column(name="marital_status",nullable=true)
    private String maritalStatus;
    @Column(name="mother_maiden_name",length=50,nullable=true)
    private String motherMaidenName;
    @Column(name="mother_name",length=50,nullable=true)
    private String motherName;
    @Column(name="nature_of_business",nullable=true)
    private String natureOfBusiness;
    @Column(name="no_of_dependents",length=2,nullable=true)
    private Long noOfDependents;
    @Column(name="product",nullable=true)
    private String product;
    @Column(name="residential_status",nullable=true)
    private String residentialStatus;
    @Column(name="segment",nullable=true)
    private String segment;
    @Column(name="spouse_name",length=50,nullable=true)
    private String spouseName;
    @Column(name="sub_industry",nullable=true)
    private String subIndustry;
    @Column(name="tax_residency",nullable=true)
    private String taxResidency;
    @Column(name="turnover",nullable=true)
    private Long turnover;
    @Column(name="years_in_same_industry",nullable=true)
    private String yearsInSameIndustry;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getMotherMaidenName() {
        return motherMaidenName;
    }

    public void setMotherMaidenName(String motherMaidenName) {
        this.motherMaidenName = motherMaidenName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(String natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public Long getNoOfDependents() {
        return noOfDependents;
    }

    public void setNoOfDependents(Long noOfDependents) {
        this.noOfDependents = noOfDependents;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getResidentialStatus() {
        return residentialStatus;
    }

    public void setResidentialStatus(String residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getSubIndustry() {
        return subIndustry;
    }

    public void setSubIndustry(String subIndustry) {
        this.subIndustry = subIndustry;
    }

    public String getTaxResidency() {
        return taxResidency;
    }

    public void setTaxResidency(String taxResidency) {
        this.taxResidency = taxResidency;
    }

    public Long getTurnover() {
        return turnover;
    }

    public void setTurnover(Long turnover) {
        this.turnover = turnover;
    }

    public String getYearsInSameIndustry() {
        return yearsInSameIndustry;
    }

    public void setYearsInSameIndustry(String yearsInSameIndustry) {
        this.yearsInSameIndustry = yearsInSameIndustry;
    }
}
