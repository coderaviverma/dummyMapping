
package model;

import javax.annotation.Generated;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.google.gson.annotations.Expose;
import enms.ColletionType;

@Entity
@Table(name="bank_detail")
public class BankDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bank_detail_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("bank-detail-user")
    @JoinColumn(name = "cuid")
    private User user;

    @Column(name="collection_acc_holder_name",length=152,nullable=true)
    private String collectionAccHolderName;

    @Column(name="collection_acc_number",nullable=true)
    private String collectionAccNumber;

    @Column(name="collection_acc_type",nullable=true)
    private ColletionType collectionAccType;

    @Column(name="collection_bank_branch",length=150,nullable=true)
    private String collectionBankBranch;

    @Column(name="collection_bank_ifsc",length=11,nullable=true)
    private String collectionBankIfsc;

    @Column(name="collection_bank_name",length=60,nullable=true)
    private String collectionBankName;

    @Column(name="disbursment_acc_holder_name",length=152,nullable=true)
    private String disbursmentAccHolderName;

    @Column(name="disbursment_acc_number",length=50,nullable=true)
    private String disbursmentAccNumber;

    @Column(name="disbursment_acc_type",nullable=true)
    private ColletionType disbursmentAccType;

    @Column(name="disbursment_bank_branch",length=150,nullable=true)
    private String disbursmentBankBranch;

    @Column(name="disbursment_bank_ifsc",length=11,nullable=true)
    private String disbursmentBankIfsc;

    @Column(name="disbursment_bank_name",length=50,nullable=true)
    private String disbursmentBankName;

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

    public String getCollectionAccHolderName() {
        return collectionAccHolderName;
    }

    public void setCollectionAccHolderName(String collectionAccHolderName) {
        this.collectionAccHolderName = collectionAccHolderName;
    }

    public String getCollectionAccNumber() {
        return collectionAccNumber;
    }

    public void setCollectionAccNumber(String collectionAccNumber) {
        this.collectionAccNumber = collectionAccNumber;
    }

    public ColletionType getCollectionAccType() {
        return collectionAccType;
    }

    public void setCollectionAccType(ColletionType collectionAccType) {
        this.collectionAccType = collectionAccType;
    }

    public String getCollectionBankBranch() {
        return collectionBankBranch;
    }

    public void setCollectionBankBranch(String collectionBankBranch) {
        this.collectionBankBranch = collectionBankBranch;
    }

    public String getCollectionBankIfsc() {
        return collectionBankIfsc;
    }

    public void setCollectionBankIfsc(String collectionBankIfsc) {
        this.collectionBankIfsc = collectionBankIfsc;
    }

    public String getCollectionBankName() {
        return collectionBankName;
    }

    public void setCollectionBankName(String collectionBankName) {
        this.collectionBankName = collectionBankName;
    }

    public String getDisbursmentAccHolderName() {
        return disbursmentAccHolderName;
    }

    public void setDisbursmentAccHolderName(String disbursmentAccHolderName) {
        this.disbursmentAccHolderName = disbursmentAccHolderName;
    }

    public String getDisbursmentAccNumber() {
        return disbursmentAccNumber;
    }

    public void setDisbursmentAccNumber(String disbursmentAccNumber) {
        this.disbursmentAccNumber = disbursmentAccNumber;
    }

    public ColletionType getDisbursmentAccType() {
        return disbursmentAccType;
    }

    public void setDisbursmentAccType(ColletionType disbursmentAccType) {
        this.disbursmentAccType = disbursmentAccType;
    }

    public String getDisbursmentBankBranch() {
        return disbursmentBankBranch;
    }

    public void setDisbursmentBankBranch(String disbursmentBankBranch) {
        this.disbursmentBankBranch = disbursmentBankBranch;
    }

    public String getDisbursmentBankIfsc() {
        return disbursmentBankIfsc;
    }

    public void setDisbursmentBankIfsc(String disbursmentBankIfsc) {
        this.disbursmentBankIfsc = disbursmentBankIfsc;
    }

    public String getDisbursmentBankName() {
        return disbursmentBankName;
    }

    public void setDisbursmentBankName(String disbursmentBankName) {
        this.disbursmentBankName = disbursmentBankName;
    }
}
