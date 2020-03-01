
package mod;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import enms.UserType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "user")
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class User extends BaseEntityAudit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @GenericGenerator(
            name = "user_seq",
            strategy = "app.StringPrefixedSequenceIdGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "1000_"),
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
    private Long id;

    @Column(name = "cuid")
    private Long cuid;

/*
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("user-app")
    @JoinColumn(name = "appid")
    private App app;
*/

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference("user-contactibility-user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<UserContactibility> contactibilities;

   @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference("app_document-user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<AppDocument> appDocuments;

    @Column(name = "corporate_structure", nullable = true)
    private String corporateStructure;

    @Column(name = "dateOfBirth_Incorporation", length = 10, nullable = true)
    private String dateOfBirthIncorporation;

    @Column(name = "display_name", length = 152, nullable = true)
    private String displayName;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference("user-education-user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<UserEducation> userEducations;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference("user-employment-user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<UserEmployment> userEmployments;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference("entity-officers-user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<EntityOfficer> entityOfficers;

    @Column(name = "first_name", length = 50, nullable = true)
    private String firstName;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference("user-identities-user")
    private UserIdentities userIdentities;

    @Column(name = "last_name", length = 50, nullable = true)
    private String lastName;

    @Column(name = "middle_name", length = 50, nullable = true)
    private String middleName;

    @Column(name = "new_cuid", nullable = true)
    private String newCuid;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference("obligation-user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Obligation obligation;

    @Column(name = "preferred_email", nullable = true)
    private String preferredEmail;

    @Column(name = "preferred_phone", nullable = true)
    private String preferredPhone;

    @Column(name = "registered_name", length = 50, nullable = true)
    private String registeredName;

    @Column(name = "risk_level", nullable = true)
    private String riskLevel;

    @Column(name = "salutation", nullable = true)
    private String salutation;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference("user-details-user")
    private UserDetails userDetails;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference("app-lms-user")
    private AppLMS appLMS;

    @Column(name = "type", nullable = true)
    private UserType type;

    public Long getCuid() {
        return cuid;
    }

    public void setCuid(Long cuid) {
        this.cuid = cuid;
    }

    public Set<UserContactibility> getContactibilities() {
        return contactibilities;
    }

    public void setContactibilities(Set<UserContactibility> contactibilities) {
        if (contactibilities != null) {
            for (UserContactibility userContactibility : contactibilities) {
                userContactibility.setUser(this);
            }
        }
        this.contactibilities = contactibilities;
    }

    public String getCorporateStructure() {
        return corporateStructure;
    }

    public void setCorporateStructure(String corporateStructure) {
        this.corporateStructure = corporateStructure;
    }

    public String getDateOfBirthIncorporation() {
        return dateOfBirthIncorporation;
    }

    public void setDateOfBirthIncorporation(String dateOfBirthIncorporation) {
        this.dateOfBirthIncorporation = dateOfBirthIncorporation;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Set<UserEducation> getUserEducations() {
        return userEducations;
    }

    public void setUserEducations(Set<UserEducation> userEducations) {
        if (userEducations != null) {
            for (UserEducation userEducation : userEducations) {
                userEducation.setUser(this);
            }
        }
        this.userEducations = userEducations;
    }

    public Set<UserEmployment> getUserEmployments() {
        return userEmployments;
    }

    public void setUserEmployments(Set<UserEmployment> userEmployments) {
        if (userEmployments != null) {
            for (UserEmployment userEmployment : userEmployments) {
                userEmployment.setUser(this);
            }
        }
        this.userEmployments = userEmployments;
    }

    public Set<EntityOfficer> getEntityOfficers() {
        return entityOfficers;
    }

    public void setEntityOfficers(Set<EntityOfficer> entityOfficers) {
        if (entityOfficers != null) {
            for (EntityOfficer obj : entityOfficers) {
                obj.setUser(this);
            }
        }
        this.entityOfficers = entityOfficers;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public UserIdentities getUserIdentities() {
        return userIdentities;
    }

    public void setUserIdentities(UserIdentities userIdentities) {
        if (userIdentities == null) {
            if (this.userIdentities != null) {
                this.userIdentities.setUser(null);
            }
        } else {
            userIdentities.setUser(this);
        }
        this.userIdentities = userIdentities;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNewCuid() {
        return newCuid;
    }

    public void setNewCuid(String newCuid) {
        this.newCuid = newCuid;
    }

    public Obligation getObligation() {
        return obligation;
    }

    public void setObligation(Obligation obligation) {
        if (obligation == null) {
            if (this.obligation != null) {
                this.obligation.setUser(null);
            }
        } else {
            obligation.setUser(this);
        }
        this.obligation = obligation;
    }

    public String getPreferredEmail() {
        return preferredEmail;
    }

    public void setPreferredEmail(String preferredEmail) {
        this.preferredEmail = preferredEmail;
    }

    public String getPreferredPhone() {
        return preferredPhone;
    }

    public void setPreferredPhone(String preferredPhone) {
        this.preferredPhone = preferredPhone;
    }

    public String getRegisteredName() {
        return registeredName;
    }

    public void setRegisteredName(String registeredName) {
        this.registeredName = registeredName;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }


    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        if (userDetails == null) {
            if (this.userDetails != null) {
                this.userDetails.setUser(null);
            }
        } else {
            userDetails.setUser(this);
        }
        this.userDetails = userDetails;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
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

    public Set<AppDocument> getAppDocuments() {
        return appDocuments;
    }

    public void setAppDocuments(Set<AppDocument> appDocuments) {
        if (appDocuments != null) {
            for (AppDocument obj : appDocuments) {
                obj.setUser(this);
            }
        }
        this.appDocuments = appDocuments;
    }

    public AppLMS getAppLMS() {
        return appLMS;
    }

    public void setAppLMS(AppLMS appLMS) {
        if (appLMS == null) {
            if (this.appLMS != null) {
                this.appLMS.setUser(null);
            }
        } else {
            appLMS.setUser(this);
        }
        this.appLMS = appLMS;
    }
}
