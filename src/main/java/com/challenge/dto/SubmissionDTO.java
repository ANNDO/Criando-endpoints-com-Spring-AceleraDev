package com.challenge.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubmissionDTO {

    @NotNull
    private Long challengeId;

    @NotNull
    private String userId;

    private BigDecimal score;
    private String createdAt;

}
