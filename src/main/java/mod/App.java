package mod;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


public class App {

       private String appId;


    private Set<AppPdcDetails> appPdcDetails;


    private Set<AppDocument> appDocuments;



    private Set<AppCollateral> appCollaterals;


    private Set<UserContactibility> userContactibilities;



   private Set<User> users;



    private Set<LoanOffer> loanOffers;



    private Set<LoanActorsHistory> loanActorsHistories;


    private Set<LoanCharges> loanCharges;


    private Set<AppLMS> appLMS;


    private Obligation obligation;


        private Mandate mandate;

  private BankDetail bankDetail;

   private AppSourcing appSourcing;


    private AppInsurance appInsurance;

    private String product;
    private String partner;
    private String loanPurpose;
    private String applicationStatus;
    private String rejectReason;
    private String customerLeadRefId;
    private String stepUpDownLoan;
    private String tdsApplicable;
    private String pslTagging;
    private String scheme;
    private String riskSegment;
    private String deliquencyStatus;
    private String dpdDays;


}
