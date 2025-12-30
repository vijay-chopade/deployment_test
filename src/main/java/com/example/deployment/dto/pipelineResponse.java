package com.example.deployment.dto;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class pipelineResponse {

    private String id = UUID.randomUUID().toString();
    private String message;
//    private String timestamp = ;
}
