package app;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "app_pdc_details")
public class AppPdcDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("app-pdc-details-app")
    @JoinColumn(name = "appid")
    private App app;

    @Column(name = "ifsc")
    private String ifsc;
    @Column(name = "checkNo")
    private String checkNo;
    @Column(name = "dms_doc_id")
    private String dmsDocId;
    @Column(name = "dms_external_doc_id")
    private String dmsExternalDocId;
    @Column(name = "is_presented")
    private String isPresented;

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getCheckNo() {
        return checkNo;
    }

    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }

    public String getDmsDocId() {
        return dmsDocId;
    }

    public void setDmsDocId(String dmsDocId) {
        this.dmsDocId = dmsDocId;
    }

    public String getDmsExternalDocId() {
        return dmsExternalDocId;
    }

    public void setDmsExternalDocId(String dmsExternalDocId) {
        this.dmsExternalDocId = dmsExternalDocId;
    }

    public String getIsPresented() {
        return isPresented;
    }

    public void setIsPresented(String isPresented) {
        this.isPresented = isPresented;
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
}
