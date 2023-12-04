package com.thatidiotchinese.expensetrackerserver.services;

import com.thatidiotchinese.expensetrackerserver.model.request.ExpenseRequest;
import com.thatidiotchinese.expensetrackerserver.model.response.ExpenseResponse;

import java.time.LocalDateTime;
import java.util.List;

public interface ExpenseService {

    List<ExpenseResponse> getAll();

    ExpenseResponse getById(long id);

    ExpenseResponse getByDate(LocalDateTime date);

    ExpenseResponse create(ExpenseRequest expenseRequest);

    ExpenseResponse update(long id, ExpenseRequest expenseRequest);

    ExpenseResponse delete(long id);

}
