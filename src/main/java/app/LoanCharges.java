package app;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;



@Entity
@Table(name = "loan_charges")
public class LoanCharges {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("loan-charges-app")
    @JoinColumn(name = "appid")
    private App app;


    @Column(name = "charge_code",nullable = true)
    private String chargeCode;
    @Column(name = "amount",nullable = true)
    private String amount;


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

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
