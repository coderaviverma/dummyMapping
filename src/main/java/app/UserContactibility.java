
package app;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user_contactibility")
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserContactibility  extends BaseEntityAudit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("user-contactibility-user")
    @JoinColumn(name = "user_ref_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("user-contactibility-app")
    @JoinColumn(name = "appid")
    private App app;

    @OneToOne(mappedBy = "user_contactibility", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference("app-references-user-contactibility")
    private AppReferences appReferences;

    @OneToOne(mappedBy = "user_contactibility", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference("app-insurance-user-contactibility")
    private AppInsurance appInsurance;

    @Column(name="address_belongs_to",nullable=true)
    private String addressBelongsTo;

    @Column(name="address_line1",length=60,nullable=true)
    private String addressLine1;

    @Column(name="address_line2",length=60,nullable=true)
    private String addressLine2;

    @Column(name="address_line3",length=60,nullable=true)
    private String addressLine3;

    @Column(name="address_verification_id",nullable=true)
    private String addressVerificationId;

    @Column(name="city",nullable=true)
    private String city;

    @Column(name="contact_type",nullable=true)
    private String contactType;

    @Column(name="country",nullable=true)
    private String country;

    @Column(name="duration_of_stay_in_months",nullable=true)
    private String durationOfStayInMonths;

    @Column(name="email",nullable=true)
    private String email;

    @Column(name="email_verification_id",nullable=true)
    private String emailVerificationId;

    @Column(name="landmark",nullable=true)
    private String landmark;

    @Column(name="locality",nullable=true)
    private String locality;

    @Column(name="ownership_type",nullable=true)
    private String ownershipType;

    @Column(name="phone_number",nullable=true)
    private Long phoneNumber;

    @Column(name="phone_verification_id",nullable=true)
    private String phoneVerificationId;

    @Column(name="pincode",nullable=true)
    private String pincode;

    @Column(name="state",nullable=true)
    private String state;

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

    public String getAddressBelongsTo() {
        return addressBelongsTo;
    }

    public void setAddressBelongsTo(String addressBelongsTo) {
        this.addressBelongsTo = addressBelongsTo;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getAddressVerificationId() {
        return addressVerificationId;
    }

    public void setAddressVerificationId(String addressVerificationId) {
        this.addressVerificationId = addressVerificationId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDurationOfStayInMonths() {
        return durationOfStayInMonths;
    }

    public void setDurationOfStayInMonths(String durationOfStayInMonths) {
        this.durationOfStayInMonths = durationOfStayInMonths;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailVerificationId() {
        return emailVerificationId;
    }

    public void setEmailVerificationId(String emailVerificationId) {
        this.emailVerificationId = emailVerificationId;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getOwnershipType() {
        return ownershipType;
    }

    public void setOwnershipType(String ownershipType) {
        this.ownershipType = ownershipType;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneVerificationId() {
        return phoneVerificationId;
    }

    public void setPhoneVerificationId(String phoneVerificationId) {
        this.phoneVerificationId = phoneVerificationId;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public AppReferences getAppReferences() {
        return appReferences;
    }

    public void setAppReferences(AppReferences appReferences) {
        if (appReferences == null) {
            if (this.appReferences != null) {
                this.appReferences.setUserContactibility(null);
            }
        } else {
            appReferences.setUserContactibility(this);
        }
        this.appReferences = appReferences;
    }

    public AppInsurance getAppInsurance() {
        return appInsurance;
    }

    public void setAppInsurance(AppInsurance appInsurance) {
        if (appInsurance == null) {
            if (this.appInsurance != null) {
                this.appInsurance.setUserContactibility(null);
            }
        } else {
            appInsurance.setUserContactibility(this);
        }
        this.appInsurance = appInsurance;
    }
}
