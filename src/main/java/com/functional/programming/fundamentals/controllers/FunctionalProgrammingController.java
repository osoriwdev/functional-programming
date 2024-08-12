package com.functional.programming.fundamentals.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;

@RestController
@RequestMapping("/functionalInterface")
public class FunctionalProgrammingController {

    /**
     * Uses a functional interface function to obtain a lowercase string from the parameter passed as PathVariable.
     *
     * @param param the string
     * @return the string in lowercase
     */
    @GetMapping("/function/{param}")
    public ResponseEntity<String> useFunctionInterface(@PathVariable("param") String parameter) {
        Function<String, String> function = String::toLowerCase;
        return new ResponseEntity<>(function.apply(parameter), HttpStatus.OK);
    }

}
