package mod;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "loan_offer")
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoanOffer  extends BaseEntityAudit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
/*
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("loan-offer-app")
    @JoinColumn(name = "appid")
    private App app;*/

    @Column(name = "loan_amount",nullable = true)
    private String loanAmount;
    @Column(name = "loan_tenure",nullable = true)
    private String loanTenure;
    @Column(name = "roi",nullable = true)
    private String roi;
    @Column(name = "advance_emi",nullable = true)
    private String advanceEMI;
    @Column(name = "estimated_emi",nullable = true)
    private String estimatedEMI;

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

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanTenure() {
        return loanTenure;
    }

    public void setLoanTenure(String loanTenure) {
        this.loanTenure = loanTenure;
    }

    public String getRoi() {
        return roi;
    }

    public void setRoi(String roi) {
        this.roi = roi;
    }

    public String getAdvanceEMI() {
        return advanceEMI;
    }

    public void setAdvanceEMI(String advanceEMI) {
        this.advanceEMI = advanceEMI;
    }

    public String getEstimatedEMI() {
        return estimatedEMI;
    }

    public void setEstimatedEMI(String estimatedEMI) {
        this.estimatedEMI = estimatedEMI;
    }
}
