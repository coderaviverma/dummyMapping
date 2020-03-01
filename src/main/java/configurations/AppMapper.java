package configurations;

import app.*;
import app.BankDetail;
import app.EntityOfficer;
import app.Mandate;
import app.Obligation;
import app.User;
import app.UserDetails;
import model.*;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.HashSet;
import java.util.Set;
//nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,

@Mapper(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface AppMapper {

    AppMapper INSTANCE = Mappers.getMapper(AppMapper.class);

    @Mappings({
            @Mapping(target = "appPdcDetails", ignore = true),
            @Mapping(target = "appDocuments", ignore = true),
            @Mapping(target = "appCollaterals", ignore = true),
            @Mapping(target = "userContactibilities", ignore = true),
            @Mapping(target = "users", ignore = true),
            @Mapping(target = "loanOffers", ignore = true),
            @Mapping(target = "loanActorsHistories", ignore = true),
            @Mapping(target = "userApps", ignore = true),
            @Mapping(target = "loanCharges", ignore = true),
            @Mapping(target = "appLMS", ignore = true),
            @Mapping(target = "mandate", ignore = true),
            @Mapping(target = "bankDetail", ignore = true),
            @Mapping(target = "appSourcing", ignore = true),
            @Mapping(target = "obligation", ignore = true)})
    void copyFromSourceToTarget(App newData, @MappingTarget App dbData);

    @Mapping(target = "user", ignore = true)
    void copyFromSourceToTarget(AppPdcDetails newData, @MappingTarget AppPdcDetails dbData);

    @Mapping(target = "user", ignore = true)
    void copyFromSourceToTarget(Education newData, @MappingTarget Education dbData);

    @Mapping(target = "user", ignore = true)
    void copyFromSourceToTarget(Identities newData, @MappingTarget Identities dbData);

    @Mapping(target = "user", ignore = true)
    void copyFromSourceToTarget(UserDetails newData, @MappingTarget UserDetails dbData);

    @Mapping(target = "user", ignore = true)
    void copyFromSourceToTarget(Employment newData, @MappingTarget Employment dbData);

    @Mapping(target = "user", ignore = true)
    void copyFromSourceToTarget(Gst newData, @MappingTarget Gst dbData);

    @Mapping(target = "user", ignore = true)
    void copyFromSourceToTarget(Mandate newData, @MappingTarget Mandate dbData);

    @Mapping(target = "user", ignore = true)
    void copyFromSourceToTarget(Obligation newData, @MappingTarget Obligation dbData);

    @Mapping(target = "user", ignore = true)
    void copyFromSourceToTarget(EntityOfficer newData, @MappingTarget EntityOfficer dbData);

    @Mapping(target = "user", ignore = true)
    void copyFromSourceToTarget(UserApp newData, @MappingTarget UserApp dbData);

    @Mapping(target = "user", ignore = true)
    void copyFromSourceToTarget(Contactibility newData, @MappingTarget Contactibility dbData);



    @AfterMapping
    default void handleAccounts(User newData, @MappingTarget User dbData) {
        filterData(dbData.getBankDetails(),newData.getBankDetails());
        filterData(dbData.getEducations(),newData.getEducations());
        filterData(dbData.getEmployments(),newData.getEmployments());
        filterData(dbData.getGsts(),newData.getGsts());
        filterData(dbData.getMandates(),newData.getMandates());
        filterData(dbData.getObligations(),newData.getObligations());
        filterData(dbData.getUserApps(),newData.getUserApps());
        filterData(dbData.getContactibilities(),newData.getContactibilities());


        copyFromSourceToTarget(newData.getIdentities(),dbData.getIdentities());
        copyFromSourceToTarget(newData.getUserDetails(),dbData.getUserDetails());

    }

    default void filterData(Set dbDatas, Set newDatas) {
        Set combinedData=new HashSet<>();

        if (dbDatas!=null && newDatas !=null)
        for (Object dbData:dbDatas) {
            for (Object newObj : newDatas) {
                if ( newObj instanceof BankDetail){
                    BankDetail newD= (BankDetail) newObj;
                    BankDetail dbData1= (BankDetail) dbData;
                    if (newD.getId()!=null){
                        if (newD.getId().equals(dbData1.getId())){
                            copyFromSourceToTarget(newD,dbData1);
                            combinedData.add(dbData1);
                        }
                    }else {
                        combinedData.add(newD);
                    }
                } else if (newObj instanceof Education){
                    Education newD= (Education) newObj;
                    Education dbData1= (Education) dbData;
                    if (newD.getId()!=null){
                        if (newD.getId().equals(dbData1.getId())){
                            copyFromSourceToTarget(newD,dbData1);
                            combinedData.add(dbData1);
                        }
                    }else {
                        combinedData.add(newD);
                    }
                } else if (newObj instanceof Employment){
                    Employment newD= (Employment) newObj;
                    Employment dbData1= (Employment) dbData;
                    if (newD.getId()!=null){
                        if (newD.getId().equals(dbData1.getId())){
                            copyFromSourceToTarget(newD,dbData1);
                            combinedData.add(dbData1);
                        }
                    }else {
                        combinedData.add(newD);
                    }
                } else if (newObj instanceof Gst){
                    Gst newD= (Gst) newObj;
                    Gst dbData1= (Gst) dbData;
                    if (newD.getId()!=null){
                        if (newD.getId().equals(dbData1.getId())){
                            copyFromSourceToTarget(newD,dbData1);
                            combinedData.add(dbData1);
                        }
                    }else {
                        combinedData.add(newD);
                    }
                } else if (newObj instanceof Mandate){
                    Mandate newD= (Mandate) newObj;
                    Mandate dbData1= (Mandate) dbData;
                    if (newD.getId()!=null){
                        if (newD.getId().equals(dbData1.getId())){
                            copyFromSourceToTarget(newD,dbData1);
                            combinedData.add(dbData1);
                        }
                    }else {
                        combinedData.add(newD);
                    }
                } else if (newObj instanceof Obligation){
                    Obligation newD= (Obligation) newObj;
                    Obligation dbData1= (Obligation) dbData;
                    if (newD.getId()!=null){
                        if (newD.getId().equals(dbData1.getId())){
                            copyFromSourceToTarget(newD,dbData1);
                            combinedData.add(dbData1);
                        }
                    }else {
                        combinedData.add(newD);
                    }
                } else if (newObj instanceof UserApp){
                    UserApp newD= (UserApp) newObj;
                    UserApp dbData1= (UserApp) dbData;
                    if (newD.getId()!=null){
                        if (newD.getId().equals(dbData1.getId())){
                            copyFromSourceToTarget(newD,dbData1);
                            combinedData.add(dbData1);
                        }
                    }else {
                        combinedData.add(newD);
                    }
                } else if (newObj instanceof Contactibility){
                    Contactibility newD= (Contactibility) newObj;
                    Contactibility dbData1= (Contactibility) dbData;
                    if (newD.getId()!=null){
                        if (newD.getId().equals(dbData1.getId())){
                            copyFromSourceToTarget(newD,dbData1);
                            combinedData.add(dbData1);
                        }
                    }else {
                        combinedData.add(newD);
                    }
                } else if (newObj instanceof EntityOfficer){
                    EntityOfficer newD= (EntityOfficer) newObj;
                    EntityOfficer dbData1= (EntityOfficer) dbData;
                    if (newD.getId()!=null){
                        if (newD.getId().equals(dbData1.getId())){
                            copyFromSourceToTarget(newD,dbData1);
                            combinedData.add(dbData1);
                        }
                    }else {
                        combinedData.add(newD);
                    }
                }

            }
        }

        if (combinedData.size()>0) {
            dbDatas.clear();
            dbDatas.addAll(combinedData);
        }
    }

}