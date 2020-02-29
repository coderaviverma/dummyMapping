
package model;

import javax.annotation.Generated;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.google.gson.annotations.Expose;

@Entity
@Table(name="education")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bank_detail_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("educations-user")
    @JoinColumn(name = "cuid")
    private User user;

    @Column(name="institute",nullable=true)
    private String institute;
    @Column(name="major",nullable=true)
    private String major;
    @Column(name="marks",nullable=true)
    private String marks;
    @Column(name="qualification",nullable=true)
    private String qualification;
    @Column(name="year_of_graduation",nullable=true)
    private String yearOfGraduation;

    public Long getBank_detail_id() {
        return bank_detail_id;
    }

    public void setBank_detail_id(Long bank_detail_id) {
        this.bank_detail_id = bank_detail_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(String yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }
}
