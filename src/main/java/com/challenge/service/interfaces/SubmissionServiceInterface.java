package com.challenge.service.interfaces;

import com.challenge.entity.Submission;
import org.mapstruct.Mapper;

import java.util.List;


public interface SubmissionServiceInterface extends ServiceInterface<Submission> {

    List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId);

}
