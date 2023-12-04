package com.thatidiotchinese.expensetrackerserver.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IncomeResponse {

    private long id;

    private long amount;

    private LocalDateTime date;

    private String description;

    private CategoryResponse categoryResponse;

}
