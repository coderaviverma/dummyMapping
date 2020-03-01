package app;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

public class AppLMS {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JsonBackReference("app-lms-user")
    @JoinColumn(name = "cuid")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("app-lms-app")
    @JoinColumn(name = "appid")
    private App app;

    @Column(name="user_ref_id",length=12,nullable=true)
    private String userRefId;
    @Column(name="role",nullable=true)
    private String role;
    @Column(name="lms_system",nullable=true)
    private String lmsSystem;
    @Column(name="lms_cif",nullable=true)
    private String lmsCif;
    @Column(name="lms_loan_number",nullable=true)
    private String lmsLoanNumber;


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

    public String getUserRefId() {
        return userRefId;
    }

    public void setUserRefId(String userRefId) {
        this.userRefId = userRefId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLmsSystem() {
        return lmsSystem;
    }

    public void setLmsSystem(String lmsSystem) {
        this.lmsSystem = lmsSystem;
    }

    public String getLmsCif() {
        return lmsCif;
    }

    public void setLmsCif(String lmsCif) {
        this.lmsCif = lmsCif;
    }

    public String getLmsLoanNumber() {
        return lmsLoanNumber;
    }

    public void setLmsLoanNumber(String lmsLoanNumber) {
        this.lmsLoanNumber = lmsLoanNumber;
    }
}
