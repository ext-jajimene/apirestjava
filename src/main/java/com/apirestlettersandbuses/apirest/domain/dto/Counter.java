package com.apirestlettersandbuses.apirest.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Counter {

    private String letter;
    private Long numberOfLetters;

}
