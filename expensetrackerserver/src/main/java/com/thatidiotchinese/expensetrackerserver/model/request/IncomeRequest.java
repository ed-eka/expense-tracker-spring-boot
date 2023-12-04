package com.thatidiotchinese.expensetrackerserver.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IncomeRequest {

    private long amount;

    private LocalDateTime date;

    private String description;

    private long CategoryId;
}
