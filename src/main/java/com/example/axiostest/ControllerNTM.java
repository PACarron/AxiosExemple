package com.example.axiostest;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController(value = "/test")
public class ControllerNTM {

    @GetMapping("/")
    public String test(){
        return "BVN";
    }

    @PostMapping(value = "/")
    public void testNTM(@RequestBody List<Bowling> monTableauDeMort ) {
        System.out.println("On passe la");
        System.out.println(monTableauDeMort);
    }
}
