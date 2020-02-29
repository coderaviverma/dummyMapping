
package model;

import javax.annotation.Generated;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.google.gson.annotations.Expose;

@Entity
@Table(name="gst")
public class Gst {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bank_detail_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("gsts-user")
    @JoinColumn(name = "cuid")
    private User user;

    @Column(name="gstn",length=60,nullable=true)
    private String gstn;
    @Column(name="state",length=60,nullable=true)
    private String state;

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

    public String getGstn() {
        return gstn;
    }

    public void setGstn(String gstn) {
        this.gstn = gstn;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
