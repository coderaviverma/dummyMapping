package app;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "app_references")
public class AppReferences {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne(fetch = FetchType.LAZY)
    @JsonBackReference("app-references-user-contactibility")
    @JoinColumn(name = "contactibility_ref_id")
    private UserContactibility userContactibility;


    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("app-references-app")
    @JoinColumn(name = "appid")
    private App app;


    @Column(name = "salutation",nullable = true)
    private String salutation;
    @Column(name = "first_name",nullable = true)
    private String firstName;
    @Column(name = "middle_name",nullable = true)
    private String middleName;
    @Column(name = "last_name",nullable = true)
    private String lastName;
    @Column(name = "relationship",nullable = true)
    private String relationship;

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

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public UserContactibility getUserContactibility() {
        return userContactibility;
    }

    public void setUserContactibility(UserContactibility userContactibility) {
        this.userContactibility = userContactibility;
    }
}
