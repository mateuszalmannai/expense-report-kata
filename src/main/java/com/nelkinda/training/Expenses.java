package com.nelkinda.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Expenses implements Iterable<Expense> {

  private final List<Expense> expenseList = new ArrayList<>();

  public Expenses(Expense... expenses) {
    expenseList.addAll(Arrays.asList(expenses));
  }

  int getMealExpenses() {
    return expenseList.stream()
        .filter(Expense::isMeal)
        .mapToInt(Expense::getAmount)
        .sum();
  }

  int getTotal() {
    return expenseList.stream()
        .mapToInt(Expense::getAmount)
        .sum();
  }

  @Override
  public Iterator iterator() {
    return expenseList.iterator();
  }
}
