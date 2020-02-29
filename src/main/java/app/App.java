package app;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "app")
public class App {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "app_id")
    private Long appId;

    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
    @JsonManagedReference("app-pdc-details-app")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<AppPdcDetails> appPdcDetails;

    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
    @JsonManagedReference("app-documents-app")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<AppDocument> appDocuments;


    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
    @JsonManagedReference("app-collaterals-app")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<AppCollateral> appCollaterals;

    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
    @JsonManagedReference("user-contactibilities-app")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<UserContactibility> userContactibilities;

    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
    @JsonManagedReference("user-app")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<User> users;

    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
    @JsonManagedReference("loan-offer-app")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<LoanOffer> loanOffers;


    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
    @JsonManagedReference("loan-actors-histories-app")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<LoanActorsHistory> loanActorsHistories;


    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
    @JsonManagedReference("loan-charges-app")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<LoanCharges> loanCharges;


    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
    @JsonManagedReference("app-lms-app")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<AppLMS> appLMS;


    @OneToOne(mappedBy = "app", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference("obligation-app")
    private Obligation obligation;


    @OneToOne(mappedBy = "app", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference("mandate-app")
    private Mandate mandate;


    @OneToOne(mappedBy = "app", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference("bank-detail-app")
    private BankDetail bankDetail;


    @OneToOne(mappedBy = "app", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference("app-sourcing-app")
    private AppSourcing appSourcing;


    @OneToOne(mappedBy = "app", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference("app-insurance-app")
    private AppInsurance appInsurance;

    @Column(name = "product", nullable = true)
    private String product;
    @Column(name = "partner", nullable = true)
    private String partner;
    @Column(name = "loan_purpose", nullable = true)
    private String loanPurpose;
    @Column(name = "application_status", nullable = true)
    private String applicationStatus;
    @Column(name = "reject_reason", nullable = true)
    private String rejectReason;
    @Column(name = "customer_lead_ref_id", nullable = true)
    private String customerLeadRefId;
    @Column(name = "step_up_down_loan", nullable = true)
    private String stepUpDownLoan;
    @Column(name = "tds_applicable", nullable = true)
    private String tdsApplicable;
    @Column(name = "psl_tagging", nullable = true)
    private String pslTagging;
    @Column(name = "scheme", nullable = true)
    private String scheme;
    @Column(name = "risk_segment", nullable = true)
    private String riskSegment;
    @Column(name = "deliquency_status", nullable = true)
    private String deliquencyStatus;
    @Column(name = "dpd_days", nullable = true)
    private String dpdDays;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getCustomerLeadRefId() {
        return customerLeadRefId;
    }

    public void setCustomerLeadRefId(String customerLeadRefId) {
        this.customerLeadRefId = customerLeadRefId;
    }

    public String getStepUpDownLoan() {
        return stepUpDownLoan;
    }

    public void setStepUpDownLoan(String stepUpDownLoan) {
        this.stepUpDownLoan = stepUpDownLoan;
    }

    public String getTdsApplicable() {
        return tdsApplicable;
    }

    public void setTdsApplicable(String tdsApplicable) {
        this.tdsApplicable = tdsApplicable;
    }

    public String getPslTagging() {
        return pslTagging;
    }

    public void setPslTagging(String pslTagging) {
        this.pslTagging = pslTagging;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getRiskSegment() {
        return riskSegment;
    }

    public void setRiskSegment(String riskSegment) {
        this.riskSegment = riskSegment;
    }

    public String getDeliquencyStatus() {
        return deliquencyStatus;
    }

    public void setDeliquencyStatus(String deliquencyStatus) {
        this.deliquencyStatus = deliquencyStatus;
    }

    public String getDpdDays() {
        return dpdDays;
    }

    public void setDpdDays(String dpdDays) {
        this.dpdDays = dpdDays;
    }

}
