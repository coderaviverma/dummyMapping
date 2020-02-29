
package model;

import java.io.Serializable;
import java.util.Set;
import javax.annotation.Generated;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import enms.UserType;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cuid")
    private Long cuid;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference("bank-detail-user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<BankDetail> bankDetails;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference("contactibilities-user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Contactibility> contactibilities;

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

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference("gsts-user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Gst> gsts;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference("identities-user")
    private Identities identities;

    @Column(name = "last_name", length = 50, nullable = true)
    private String lastName;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference("mandates-user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Mandate> mandates;

    @Column(name = "middle_name", length = 50, nullable = true)
    private String middleName;

    @Column(name = "new_cuid", nullable = true)
    private String newCuid;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference("obligations-user")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Obligation> obligations;

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

    public Set<Contactibility> getContactibilities() {
        return contactibilities;
    }

    public void setContactibilities(Set<Contactibility> contactibilities) {
        if (contactibilities != null) {
            for (Contactibility contactibility : contactibilities) {
                contactibility.setUser(this);
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

    public Set<Gst> getGsts() {
        return gsts;
    }

    public void setGsts(Set<Gst> gsts) {
        if (gsts != null) {
            for (Gst obj : gsts) {
                obj.setUser(this);
            }
        }
        this.gsts = gsts;
    }

    public Identities getIdentities() {
        return identities;
    }

    public void setIdentities(Identities identities) {
        if (identities == null) {
            if (this.identities != null) {
                this.identities.setUser(null);
            }
        }
        else {
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

    public Set<Mandate> getMandates() {
        return mandates;
    }

    public void setMandates(Set<Mandate> mandates) {
        if (mandates != null) {
            for (Mandate obj : mandates) {
                obj.setUser(this);
            }
        }
        this.mandates = mandates;
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

    public Set<Obligation> getObligations() {
        return obligations;
    }

    public void setObligations(Set<Obligation> obligations) {
        if (obligations != null) {
            for (Obligation obj : obligations) {
                obj.setUser(this);
            }
        }
        this.obligations = obligations;
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
        }
        else {
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
