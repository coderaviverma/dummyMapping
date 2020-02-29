
package app;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;


@Entity
@Table(name="employment")
public class Employment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("employments-user")
    @JoinColumn(name = "cuid")
    private User user;

    @Column(name="claimed_income_in_months",nullable=true)
    private String claimedIncomeInMonths;

    @Column(name="company_alias_name",nullable=true)
    private String companyAliasName;

    @Column(name="company_indutry",nullable=true)
    private String companyIndutry;

    @Column(name="company_name",nullable=true)
    private String companyName;

    @Column(name="company_type",nullable=true)
    private String companyType;

    @Column(name="current_exp_in_months",nullable=true)
    private Long currentExpInMonths;

    @Column(name="employment_type",nullable=true)
    private String employmentType;

    @Column(name="official_email",length=60,nullable=true)
    private String officialEmail;

    @Column(name="profession",nullable=true)
    private String profession;

    @Column(name="total_experience_in_months",nullable=true)
    private Long totalExperienceInMonths;

    @Column(name="total_income_in_months",nullable=true)
    private Long totalIncomeInMonths;

    @Column(name="verified_income_in_months_id",nullable=true)
    private String verifiedIncomeInMonthsId;


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

    public String getClaimedIncomeInMonths() {
        return claimedIncomeInMonths;
    }

    public void setClaimedIncomeInMonths(String claimedIncomeInMonths) {
        this.claimedIncomeInMonths = claimedIncomeInMonths;
    }

    public String getCompanyAliasName() {
        return companyAliasName;
    }

    public void setCompanyAliasName(String companyAliasName) {
        this.companyAliasName = companyAliasName;
    }

    public String getCompanyIndutry() {
        return companyIndutry;
    }

    public void setCompanyIndutry(String companyIndutry) {
        this.companyIndutry = companyIndutry;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public Long getCurrentExpInMonths() {
        return currentExpInMonths;
    }

    public void setCurrentExpInMonths(Long currentExpInMonths) {
        this.currentExpInMonths = currentExpInMonths;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getOfficialEmail() {
        return officialEmail;
    }

    public void setOfficialEmail(String officialEmail) {
        this.officialEmail = officialEmail;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Long getTotalExperienceInMonths() {
        return totalExperienceInMonths;
    }

    public void setTotalExperienceInMonths(Long totalExperienceInMonths) {
        this.totalExperienceInMonths = totalExperienceInMonths;
    }

    public Long getTotalIncomeInMonths() {
        return totalIncomeInMonths;
    }

    public void setTotalIncomeInMonths(Long totalIncomeInMonths) {
        this.totalIncomeInMonths = totalIncomeInMonths;
    }

    public String getVerifiedIncomeInMonthsId() {
        return verifiedIncomeInMonthsId;
    }

    public void setVerifiedIncomeInMonthsId(String verifiedIncomeInMonthsId) {
        this.verifiedIncomeInMonthsId = verifiedIncomeInMonthsId;
    }
}
