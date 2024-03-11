package com.Galaksiya.ws.shared;

import lombok.AllArgsConstructor;
import lombok.Data;

//Lombok annotations for getter, setter, a constructor with all variables...
@Data
@AllArgsConstructor
public class GenericResponse {

//Shows messages after some of the client requests
    private String message;


}
