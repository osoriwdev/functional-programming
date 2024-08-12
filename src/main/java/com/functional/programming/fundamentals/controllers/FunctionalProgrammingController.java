package com.functional.programming.fundamentals.controllers;

import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;
import java.util.function.Function;

@RestController
@RequestMapping("/functionalProgramming")
public class FunctionalProgrammingController {

    /**
     * Uses a functional interface function to obtain a lowercase string from the parameter passed as PathVariable.
     *
     * @param param the string
     * @return the string in lowercase
     */
    @GetMapping("/functionalInterface/function/{param}")
    public ResponseEntity<String> useFunctionInterface(@PathVariable("param") String parameter) {
        Function<String, String> function = String::toLowerCase;
        return new ResponseEntity<>(function.apply(parameter), HttpStatus.OK);
    }

}
