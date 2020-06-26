package com.challenge.endpoints;

import com.challenge.entity.User;
import com.challenge.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

import static org.hibernate.internal.util.collections.ArrayHelper.toList;

@RestController
@RequestMapping("/user")
public class UerController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable("id") Long userId){
        return this.userService.findById(userId);
    }


    @GetMapping(params = "accelerationName")
    @ResponseBody
    public List<User> findByAccelerationName(@RequestParam(name = "accelerationName") String name){
        return this.userService.findByAccelerationName(name) ;
    }

    @GetMapping(params = "companyId")
    @ResponseBody
    public List<User> findByCompanyId(@RequestParam(name = "companyId") Long companyId){
        return this.userService.findByCompanyId(companyId);
    }
}
