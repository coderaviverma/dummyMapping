package services;


import clix.capital.beans.common.UserResponse;
import clix.capital.beans.entities.User;
import clix.capital.enums.CommonErrorState;
import clix.capital.exceptions.UserServiceException;
import clix.capital.mapper.UserMapper;
import clix.capital.repository.UserRepository;
import clix.capital.services.IUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class AppService /*implements IUserService */{

    private static final Logger logger = LogManager.getLogger(AppService.class);

    @Autowired
    private UserRepository userRepository;


    @Transactional
   // @Override
    public UserResponse createUser(User user) {
        logger.info("request:{} comes in service for create  user as individual ", user);

        if (user != null) {
           User dbUser= userRepository.save(user);
           if (dbUser==null){
               throw new UserServiceException(CommonErrorState.USER_BAD_REQUEST, "user data not found !!");
           }
            UserResponse userResponse = new UserResponse(dbUser.getCuid(),dbUser, HttpStatus.CREATED, true, CommonErrorState.USER_CREATED.getMessage());
            logger.info("user as individual : " + dbUser.getCuid() + " data save successfully!!! ");
            return userResponse;
        } else {
            throw new UserServiceException(CommonErrorState.USER_BAD_REQUEST, "user data not found !!");
        }

    }

    @Override
    public UserResponse updateUser(String id, User user) {

        logger.info("request:{} comes in service for create  user as individual ", user);
        Optional<User> optionalUser= userRepository.findById(id);

        if (optionalUser.isPresent()){
            User dbUser=optionalUser.get();
            UserMapper.INSTANCE.copyFromSourceToTarget(user,dbUser);
             userRepository.save(dbUser);
            UserResponse userResponse = new UserResponse(dbUser.getCuid(),dbUser, HttpStatus.CREATED, true, CommonErrorState.USER_CREATED.getMessage());
            logger.info("user as individual : " + dbUser.getCuid() + " data save successfully!!! ");
            return userResponse;
        }

        return null;
    }

    @Override
    public List<User> findAllUser() {
        return null;
    }

    @Override
    public UserResponse deleteUser(String id) {
        return null;
    }

    @Override
    public UserResponse getOneUserById(String id) {
        return null;
    }
/*

    @Transactional
    @Override
    public UserResponse updateUser(String id, User individual) {
        logger.info("request:{} comes in service for updated user as individual ", individual);

        if (id == null || id.isEmpty()) {
            throw new DataNotFoundException("cuid", id, "cuid not found in request !!");
        }

        String documentId = ConstantsKeys.INDIVIDUAL_APP_NAME + ConstantsKeys.COUCHBASE_KEY_SEPARATOR + id;
        User oldIndividual = template.findById(documentId, Individual.class);

        if (oldIndividual != null) {
            if (individual != null) {
                individual.setId(oldIndividual.getCuid());
                individual.setCuid(oldIndividual.getCuid());
                individual.setDocumentType(oldIndividual.getDocumentType());
                if (oldIndividual.getStatus() == UserStatus.ACTIVE) {
                    individual.setNewCuid(null);
                }
                template.update(individual);
                UserResponse userResponse = new UserResponse(individual.getCuid(), HttpStatus.CREATED, true, CommonErrorState.USER_UPDATED.getMessage());
                logger.info("user as individual : " + individual.getCuid() + " data updated successfully!!! ");
                callUtilityServices.meterApi(apiKey, individual.toString(), userResponse.toString(), "/userservice/v1/individuals/");
                return userResponse;

            } else {
                throw new UserServiceException(CommonErrorState.USER_BAD_REQUEST, "user as individual record not found in request!!");
            }

        } else {
            throw new UserServiceException(CommonErrorState.CUID_NOT_EXISTS, "cuid not found in records!!");

        }

    }

*/
/*
 @Transactional
    @Override
    public UserResponse updatePartialUser(String id, Individual individual, String apiKey,
                                   String apiSecret) {
        logger.info("request:{} comes in service for updated user as individual ", individual);

        if (id == null || id.isEmpty()) {
            throw new DataNotFoundException("cuid", id, "cuid not found in request !!");
        }

        String documentId = ConstantsKeys.INDIVIDUAL_APP_NAME + ConstantsKeys.COUCHBASE_KEY_SEPARATOR + id;
        Individual oldIndividual = template.findById(documentId, Individual.class);

        if (oldIndividual != null) {
            if (individual != null) {
                oldIndividual= IndividualUpdateMapper.sourceToDestination(individual,oldIndividual);
                template.update(oldIndividual);
                UserResponse userResponse = new UserResponse(individual.getCuid(), HttpStatus.CREATED, true, CommonErrorState.USER_UPDATED.getMessage());
                logger.info("user as individual : " + individual.getCuid() + " data updated successfully!!! ");
                callUtilityServices.meterApi(apiKey, individual.toString(), userResponse.toString(), "/userservice/v1/individuals/update_partial/");
                return userResponse;

            } else {
                throw new UserServiceException(CommonErrorState.USER_BAD_REQUEST, "user as individual record not found in partial update record!!");
            }

        } else {
            throw new UserServiceException(CommonErrorState.CUID_NOT_EXISTS, "cuid not found in partial update record!!");

        }

    }//


    @Transactional
    @Override
    public UserResponse getOneUserById(String id) {
        logger.info("start fetch one individual type user in data base!!" + id);
        if (id.isEmpty()) {
            throw new DataNotFoundException("cuid", id, "cuid not found for get user");
        }
        String documentId = ConstantsKeys.INDIVIDUAL_APP_NAME + ConstantsKeys.COUCHBASE_KEY_SEPARATOR + id;
        Individual individual = template.findById(documentId, Individual.class);
        UserResponse userResponse = new UserResponse();

        if (individual != null) {
            //  IndividualResponse individualResponse= IndividualBeanToDto.ref.individualDtoMapper(individual);
            userResponse.setIndividualResponse(individual);
            userResponse.setSuccess(true);
            logger.info(" fetch one company type user in data base successfully!!" + id);
            callUtilityServices.meterApi(apiKey, "App id :" + id, userResponse.toString(), "/userservice/v1/individuals/");
            return userResponse;

        } else {
            throw new UserServiceException(CommonErrorState.CUID_NOT_EXISTS, "user not found in data base");

        }
    }

    @Transactional
    @Override
    public List<User> findAllUser() {
        logger.info("start fetch all user in data base!!");

        List<Individual> list = userServiceRepository.findAllUsers();
        if (list.isEmpty()) {
            throw new UserServiceException(CommonErrorState.USER_NOT_FOUND_IN_DB, "user not found in data base");
        }
        callUtilityServices.meterApi(apiKey, "fetch all user", "successfully", "/userservice/v1/individuals/");
        return list;
    }

    @Transactional
    @Override
    public UserResponse deleteUser(String id) {
        if (id == null || id.isEmpty()) {
            throw new DataNotFoundException("cuid", id, "cuid not found for delete individual user");
        }
        String documentId = ConstantsKeys.INDIVIDUAL_APP_NAME + ConstantsKeys.COUCHBASE_KEY_SEPARATOR + id;
        Individual oldIndividual = template.findById(documentId, Individual.class);

        if (oldIndividual != null) {
            oldIndividual.setStatus(UserStatus.INACTIVE);
            // template.remove(documentId);
              template.update(oldIndividual);
            logger.info("Individual type user : " + id + " data deleted successfully!!!");
            callUtilityServices.meterApi(apiKey, id, "user individual id :" + id + " delete successfully!", "/userservice/v1/individuals/");
            return new UserResponse(oldIndividual.getCuid(), HttpStatus.OK, true, CommonErrorState.USER_DELETED.getMessage());

        } else {
            throw new UserServiceException(CommonErrorState.CUID_NOT_EXISTS, "Individual user's cuid not found in records for soft delete!!");

        }


    }
*/


}