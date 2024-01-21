package com.example.regauto.dto;

import com.example.regauto.dto.valid.Name;
import com.example.regauto.dto.valid.Plate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationRequest {
    private Name ownerName;
    private Name ownerSurname;
    private Plate plate;
}
