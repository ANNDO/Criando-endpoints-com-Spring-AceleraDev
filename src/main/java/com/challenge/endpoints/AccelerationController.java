package com.challenge.endpoints;

import com.challenge.entity.Acceleration;
import com.challenge.repository.AccelerationRepository;
import com.challenge.service.impl.AccelerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping("/acceleration")
public class AccelerationController {

    @Autowired
    private AccelerationService accelerationService;

    @Autowired
    private AccelerationRepository accelerationRepository;


    /*
    @GetMapping
    public List<Acceleration> findAll(){
        List<Acceleration> acc = this.accelerationRepository.findAll();
        return acc;
    }*/

    @GetMapping("/{id}")
    public Optional<Acceleration> findById( @PathVariable("id") Long id) {
        return this.accelerationService.findById(id);
    }

    @GetMapping
    @ResponseBody
    public List<Acceleration> findByCompanyId(@RequestParam(name = "companyId") Long companyId) {
        return this.accelerationService.findByCompanyId(companyId);
    }

}
