package com.challenge.endpoints;

import com.challenge.entity.Company;
import com.challenge.service.impl.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;


    @GetMapping("/{id}")
    public Optional<Company> findById(@PathVariable("id") Long id) {
        return this.companyService.findById(id);

    }

    @GetMapping(params = "accelerationId" )
    @ResponseBody
    public List<Company> findByAccelerationId(@RequestParam(name = "accelerationId") Long accelerationId) {
        return this.companyService.findByAccelerationId(accelerationId);
    }


    @GetMapping(params = "userId")
    public List<Company> findByUserId(@RequestParam(name = "userId") Long userId) {
        return this.companyService.findByUserId(userId);

    }
}
