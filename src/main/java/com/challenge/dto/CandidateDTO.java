package com.challenge.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CandidateDTO {

    @NotNull
    private Long userId;

    @NotNull
    private Long accelerationId;

    @NotNull
    private Long companyId;

    private Integer status;
    private String createdAt;

}
