package com.example.regauto.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude ( JsonInclude.Include.NON_NULL )
public class CarResource {
    private String ownerName;
    private String ownerSurname;
    private String plate;
}
