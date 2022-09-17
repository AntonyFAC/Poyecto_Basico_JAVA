package com.calcu.dev.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Calculadora {
    private Integer operador1;
    private Integer operador2;
    private String operando;    
}
