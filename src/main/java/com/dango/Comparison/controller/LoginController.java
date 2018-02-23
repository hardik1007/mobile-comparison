package com.dango.Comparison.controller;

import com.dango.Comparison.domain.Constants;
import com.dango.Comparison.domain.bean.User;
import com.dango.Comparison.service.LoginService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@RepositoryRestController
@AllArgsConstructor(onConstructor = @__({@Autowired}))
@CrossOrigin(origins = "*")
@RequestMapping("/loginApi")
public class LoginController {


    private LoginService loginService;
    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.POST ,produces = {Constants.HAL_JSON_TYPE,
            MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<User> getUserDetails(@RequestBody User user){
        log.info("Login Controller",user);

        User newUser=new User();
        try{
            newUser=loginService.getUserDetails(user.getUserName(), user.getPassword());
            newUser.setMessage("Login Successfully");
            log.info("Login successfully");
        }catch (Exception e){
            log.error("errrrrrrrrrrrrrrrorrr",e.getMessage());
            newUser.setMessage(e.getMessage());
            log.error("Login unsuccessfully",e);
        }
        return ResponseEntity.ok(newUser);
    }

}
