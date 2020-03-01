package controller;

import app.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/appservice/v1/apps")
//@Api(tags = {"User-Individual"})
public class Controller {
    //private static final Logger LOG = LogManager.getLogger(Controller.class);

  //  @Autowired
  //  private IBaseService iBaseService;
    @Autowired
    private UserService userService;

    @Autowired
   // private HealthIndicatorRegistry healthIndicatorRegistry;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.OPTIONS})
  /*  @ApiResponses(value = {
            @ApiResponse(code = 201, message = " app Created ", response = User.class),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    @ApiOperation(value = "Create app", nickname = "Create app", notes = "Creates a new  app")*/
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody App app, @RequestHeader(value = "x-api-key", defaultValue = "", required = true) String apiKey,
                                                   @RequestHeader(value = "x-api-secret", defaultValue = "", required = true) String apiSecret, BindingResult bindingResult) {
      //  LOG.info("request received for create  app is :{}", app );
        //Todo validation disable only for dedupe testing by lumic
        // userRequestValidator.validate(individual, bindingResult);
        iBaseService.authorizeApi(apiKey, apiSecret);
        UserResponse userResponse = userService.createUser(user);

        LOG.info(" create  company user request is:{} response  is :{}", user, userResponse);
        iBaseService.meterApi(apiKey, user.toString(), userResponse.toString(), "/userservice/v1/users", Constants.user_bucket_name);

        return new ResponseEntity<>(userResponse, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = {RequestMethod.PUT, RequestMethod.OPTIONS})
    @ApiOperation(value = "Update  user", nickname = "Update  user", notes = "Update individual user")
    public ResponseEntity<UserResponse> updateUser(@PathVariable("id") String id, @RequestHeader(value = "x-api-key", defaultValue = "", required = true) String apiKey,
                                                   @RequestHeader(value = "x-api-secret", defaultValue = "", required = true) String apiSecret, @Valid @RequestBody User user) {
        LOG.info("request received for create and update  user is :{}", user);
//        IndividualUserRequestValidator userRequestValidator = new IndividualUserRequestValidator();
//        userRequestValidator.validateHeaders(apiKey, apiSecret);
        iBaseService.authorizeApi(apiKey, apiSecret);
        UserResponse userResponse = userService.updateUser(id,user);

        iBaseService.meterApi(apiKey, user.toString(), userResponse.toString(), "/userservice/v1/users", Constants.user_bucket_name);
        LOG.info("request received for update Individual user :{} and response is:{}", user, userResponse);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);


}
