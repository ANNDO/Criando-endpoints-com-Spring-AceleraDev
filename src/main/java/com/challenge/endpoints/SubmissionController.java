package com.challenge.endpoints;

import com.challenge.dto.SubmissionDTO;
import com.challenge.entity.Submission;
import com.challenge.service.impl.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/submission")
public class SubmissionController {

    @Autowired
    private SubmissionService submissionService;

    @GetMapping
    public List<Submission> findByChallengeIdAndAccelerationId(SubmissionDTO submissionDTO, @RequestParam (name = "accelerationId") Long accelerationId) {
        return this.submissionService.findByChallengeIdAndAccelerationId(submissionDTO.getChallengeId(),accelerationId);
    }
}
