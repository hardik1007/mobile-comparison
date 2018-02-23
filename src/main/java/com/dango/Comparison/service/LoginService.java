package com.dango.Comparison.service;

import com.dango.Comparison.domain.bean.User;
import com.dango.Comparison.domain.entity.UserEntity;
import com.dango.Comparison.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public User getUserDetails(String userName,String password) throws Exception{
        UserEntity userEntity = null;
        User user=new User();
        try{
            userEntity = userRepository.findByUserName(userName);
            if(userEntity==null){
                throw new Exception("No Such User Found");
            }
            else if(userEntity.getPassword().equals(password)){
                user.setDateOfBirth(userEntity.getDateOfBirth());
                user.setUserName(userEntity.getUserName());
                user.setEmail(userEntity.getEmail());
                user.setGender(userEntity.getGender().toString());
                user.setPassword(userEntity.getPassword());
                user.setUserId(userEntity.getUserId());
                user.setUserRole(userEntity.getUserRole().toString());
            }
            else{
              throw new Exception("Invalid Login");
            }
        }
        catch (Exception e){
            throw e;
        }
        return user;
    }
}
