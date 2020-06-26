package com.challenge.endpoints;

import com.challenge.dto.CandidateDTO;
import com.challenge.entity.Candidate;
import com.challenge.repository.CandidateRepository;
import com.challenge.service.impl.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;


    @GetMapping("/{UserId}/{AccelerationId}/{CompanyId}")
    public Optional<Candidate> findById(CandidateDTO candidateDTO) {
        return this.candidateService.findById(candidateDTO.getUserId(),
                candidateDTO.getCompanyId(),candidateDTO.getAccelerationId());
    }

    @GetMapping
    public List<Candidate> findByCompanyId( CandidateDTO candidateDTO, @RequestParam(name = "companyId") Long companyId) {
        return this.candidateService.findByCompanyId(candidateDTO.getCompanyId());
    }

    @GetMapping("/byAccelerationId/{id}")
    public List<Candidate> findByAccelerationId(CandidateDTO candidateDTO) {
        return this.candidateService.findByAccelerationId(candidateDTO.getAccelerationId());
    }
}
