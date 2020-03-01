package app;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import model.User;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "app_sourcing")
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppSourcing  extends BaseEntityAudit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JsonBackReference("app-sourcing-app")
    @JoinColumn(name = "appid")
    private App app;

    @Column(name = "channel", nullable = true)
    private String channel;
    @Column(name = "sourcing_company", nullable = true)
    private String sourcingCompany;
    @Column(name = "sourcing_branch_name", nullable = true)
    private String sourcingBranchName;
    @Column(name = "clix_branch", nullable = true)
    private String clixBranch;
    @Column(name = "sourcing_executive", nullable = true)
    private String sourcingExecutive;
    @Column(name = "sales_manager", nullable = true)
    private String salesManager;
    @Column(name = "sales_agent", nullable = true)
    private String salesAgent;
    @Column(name = "regional_sales_manager", nullable = true)
    private String regionalSalesManager;
    @Column(name = "zonal_sales_manager", nullable = true)
    private String zonalSalesManager;
    @Column(name = "national_sales_manager", nullable = true)
    private String nationalSalesManager;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getSourcingCompany() {
        return sourcingCompany;
    }

    public void setSourcingCompany(String sourcingCompany) {
        this.sourcingCompany = sourcingCompany;
    }

    public String getSourcingBranchName() {
        return sourcingBranchName;
    }

    public void setSourcingBranchName(String sourcingBranchName) {
        this.sourcingBranchName = sourcingBranchName;
    }

    public String getClixBranch() {
        return clixBranch;
    }

    public void setClixBranch(String clixBranch) {
        this.clixBranch = clixBranch;
    }

    public String getSourcingExecutive() {
        return sourcingExecutive;
    }

    public void setSourcingExecutive(String sourcingExecutive) {
        this.sourcingExecutive = sourcingExecutive;
    }

    public String getSalesManager() {
        return salesManager;
    }

    public void setSalesManager(String salesManager) {
        this.salesManager = salesManager;
    }

    public String getSalesAgent() {
        return salesAgent;
    }

    public void setSalesAgent(String salesAgent) {
        this.salesAgent = salesAgent;
    }

    public String getRegionalSalesManager() {
        return regionalSalesManager;
    }

    public void setRegionalSalesManager(String regionalSalesManager) {
        this.regionalSalesManager = regionalSalesManager;
    }

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

    public String getZonalSalesManager() {
        return zonalSalesManager;
    }

    public void setZonalSalesManager(String zonalSalesManager) {
        this.zonalSalesManager = zonalSalesManager;
    }

    public String getNationalSalesManager() {
        return nationalSalesManager;
    }

    public void setNationalSalesManager(String nationalSalesManager) {
        this.nationalSalesManager = nationalSalesManager;
    }

}
