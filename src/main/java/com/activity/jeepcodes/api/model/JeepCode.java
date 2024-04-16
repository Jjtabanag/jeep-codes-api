package com.activity.jeepcodes.api.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class JeepCode {

    private String code;

    private List<String> route;
}
