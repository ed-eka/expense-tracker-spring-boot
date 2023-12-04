package com.thatidiotchinese.expensetrackerserver.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryResponse {

    private long id;

    private String name;

//    Use List<> when response represented in the object is Homogenous (not changed frequently)
//    Use List<Map<Datatype, Object>> when response represented in the object is Heterogenous (changes frequently or
}
