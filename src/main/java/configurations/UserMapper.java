package configurations;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,

@Mapper(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mappings({
            @Mapping(target = "bankDetails", ignore = true),
            @Mapping(target = "educations", ignore = true),
            @Mapping(target = "employments", ignore = true),
            @Mapping(target = "entityOfficers", ignore = true),
            @Mapping(target = "gsts", ignore = true),
            @Mapping(target = "mandates", ignore = true),
            @Mapping(target = "obligations", ignore = true),
            @Mapping(target = "userApps", ignore = true),
            @Mapping(target = "identities", ignore = true),
            @Mapping(target = "userDetails", ignore = true),
            @Mapping(target = "contactibilities", ignore = true)})
    void copyFromSourceToTarget(User newData, @MappingTarget User dbData);

    @Mapping(target = "user", ignore = true)
    void copyFromSourceToTarget(BankDetail newData, @MappingTarget BankDetail dbData);

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

    default void filterData(Set dbDatas,Set newDatas) {
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