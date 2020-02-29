
package model;

import javax.annotation.Generated;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.google.gson.annotations.Expose;

@Entity
@Table(name="user_app")
public class UserApp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bank_detail_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "cuid")
    private User user;

    @Column(name="appid",length=60,nullable=true)
    private String appid;

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

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }
}
