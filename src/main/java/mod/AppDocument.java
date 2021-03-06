package mod;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "app_document")
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class AppDocument extends BaseEntityAudit implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

/*

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("app-document-app")
    @JoinColumn(name = "appid")
    private App app;
*/
/*

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("app-documents-user")
    @JoinColumn(name = "cuid")
    private User user;
*/


    @Column(name = "fulfilment_ref_id",nullable = true)
    private String fulfilmentRefId;
    @Column(name = "classification",nullable = true)
    private String classification;
    @Column(name = "type",nullable = true)
    private String type;
    @Column(name = "code",nullable = true)
    private String code;
    @Column(name = "dms_id",nullable = true)
    private String dmsId;
    @Column(name = "dms_external_id",nullable = true)
    private String dmsExternalId;
    @Column(name = "status",nullable = true)
    private String status;
    @Column(name = "category",nullable = true)
    private String category;
    @Column(name = "latitude",nullable = true)
    private String latitude;
    @Column(name = "longitude",nullable = true)
    private String longitude;
    @Column(name = "ip_address",nullable = true)
    private String ipAddress;
    @Column(name = "is_required",nullable = true)
    private String isRequired;
    @Column(name = "rank",nullable = true)
    private String rank;
    @Column(name = "is_click_wraped",nullable = true)
    private String isClickWraped;

    public String getFulfilmentRefId() {
        return fulfilmentRefId;
    }

    public void setFulfilmentRefId(String fulfilmentRefId) {
        this.fulfilmentRefId = fulfilmentRefId;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDmsId() {
        return dmsId;
    }

    public void setDmsId(String dmsId) {
        this.dmsId = dmsId;
    }

    public String getDmsExternalId() {
        return dmsExternalId;
    }

    public void setDmsExternalId(String dmsExternalId) {
        this.dmsExternalId = dmsExternalId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(String isRequired) {
        this.isRequired = isRequired;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getIsClickWraped() {
        return isClickWraped;
    }

    public void setIsClickWraped(String isClickWraped) {
        this.isClickWraped = isClickWraped;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

