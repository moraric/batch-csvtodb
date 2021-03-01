package com.example.batchcsvtodb;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String lastName;
    private String firstName;
    private String flag;  //este es solo de prueba
    
}