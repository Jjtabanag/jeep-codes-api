package com.activity.jeepcodes.api.controller;


import com.activity.jeepcodes.api.model.JeepCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/")
public class APIController {

    private static final List<JeepCode> JEEP_CODES = List.of(
            new JeepCode("01A", List.of("Alpha", "Bravo", "Charlie", "Echo", "Golf")),
            new JeepCode("02B", List.of("Alpha", "Delta", "Echo", "Foxtrot", "Golf")),
            new JeepCode("03C", List.of("Charlie", "Delta", "Foxtrot", "Hotel", "India")),
            new JeepCode("04A", List.of("Charlie", "Delta", "Echo", "Foxtrot", "Golf")),
            new JeepCode("04D", List.of("Charlie", "Echo", "Foxtrot", "Golf", "India")),
            new JeepCode("06B", List.of("Delta", "Hotel", "Juliet", "Kilo", "Lima")),
            new JeepCode("06D", List.of("Delta", "Foxtrot", "Golf", "India", "Kilo")),
            new JeepCode("10C", List.of("Foxtrot", "Golf", "Hotel", "India", "Juliet")),
            new JeepCode("10H", List.of("Foxtrot", "Hotel", "Juliet", "Lima", "November")),
            new JeepCode("11A", List.of("Foxtrot", "Golf", "Kilo", "Mike", "November")),
            new JeepCode("11B", List.of("Foxtrot", "Golf", "Lima", "Oscar", "Papa")),
            new JeepCode("20A", List.of("India", "Juliet", "November", "Papa", "Romeo")),
            new JeepCode("20C", List.of("India", "Kilo", "Lima", "Mike", "Romeo")),
            new JeepCode("42C", List.of("Juliet", "Kilo", "Lima", "Mike", "Oscar")),
            new JeepCode("42D", List.of("Juliet", "November", "Oscar", "Quebec", "Romeo"))
    );

    @GetMapping(value = "/jeepcodes")
    public List<String> getAllJeepCodes() {
        List<String> jeepcodes = new ArrayList<>();
        for (JeepCode jeepcode : JEEP_CODES) {
            jeepcodes.add(jeepcode.getCode());
        }
        return jeepcodes;
    }

    @GetMapping(value = "/jeepcodes/{code}")
    public JeepCode getJeepCodeDetails(@PathVariable String code) {
        for (JeepCode jeepcode : JEEP_CODES) {
            if (jeepcode.getCode().equals(code)) {
                return jeepcode;
            }
        }
        return null;
    }

}
