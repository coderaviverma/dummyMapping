
package app;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import enms.UserType;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cuid")
    private Long cuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("user-user")
    @JoinColumn(name = "app_id")
    private App app;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("user-user")
    @JoinColumn(name = "appid")
    private AppSourcing appSourcing;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference("bank-detail-user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<BankDetail> bankDetails;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference("contactibilities-user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<UserContactibility> contactibilities;

    @Column(name = "corporate_structure", nullable = true)
    private String corporateStructure;

    @Column(name = "dateOfBirth_Incorporation", length = 10, nullable = true)
    private String dateOfBirthIncorporation;

    @Column(name = "display_name", length = 152, nullable = true)
    private String displayName;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference("educations-user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Education> educations;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference("employments-user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Employment> employments;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference("entity-officers-user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<EntityOfficer> entityOfficers;

    @Column(name = "first_name", length = 50, nullable = true)
    private String firstName;


    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference("identities-user")
    private Identities identities;

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

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference("user-apps-user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<UserApp> userApps;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference("user-details-user")
    private UserDetails userDetails;

    @Column(name = "type", nullable = true)
    private UserType type;

    public Long getCuid() {
        return cuid;
    }

    public void setCuid(Long cuid) {
        this.cuid = cuid;
    }

    public Set<BankDetail> getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(Set<BankDetail> bankDetails) {
        if (bankDetails != null) {
            for (BankDetail bankDetail : bankDetails) {
                bankDetail.setUser(this);
            }
        }
        this.bankDetails = bankDetails;
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

    public Set<Education> getEducations() {
        return educations;
    }

    public void setEducations(Set<Education> educations) {
        if (educations != null) {
            for (Education education : educations) {
                education.setUser(this);
            }
        }
        this.educations = educations;
    }

    public Set<Employment> getEmployments() {
        return employments;
    }

    public void setEmployments(Set<Employment> employments) {
        if (employments != null) {
            for (Employment employment : employments) {
                employment.setUser(this);
            }
        }
        this.employments = employments;
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


    public Identities getIdentities() {
        return identities;
    }

    public void setIdentities(Identities identities) {
        if (identities == null) {
            if (this.identities != null) {
                this.identities.setUser(null);
            }
        } else {
            identities.setUser(this);
        }
        this.identities = identities;
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

    public Set<UserApp> getUserApps() {
        return userApps;
    }

    public void setUserApps(Set<UserApp> userApps) {
        if (userApps != null) {
            for (UserApp obj : userApps) {
                obj.setUser(this);
            }
        }
        this.userApps = userApps;
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
}
