package com.thatidiotchinese.expensetrackerserver.services;

import com.thatidiotchinese.expensetrackerserver.model.request.IncomeRequest;
import com.thatidiotchinese.expensetrackerserver.model.response.IncomeResponse;

import java.time.LocalDateTime;
import java.util.List;

public interface IncomeService {

    List<IncomeResponse> getAll();

    IncomeResponse getById(long id);

    IncomeResponse getByDate(LocalDateTime date);

    IncomeResponse create(IncomeRequest incomeRequest);

    IncomeResponse update(long id, IncomeRequest incomeRequest);

    IncomeResponse delete(long id);

}
