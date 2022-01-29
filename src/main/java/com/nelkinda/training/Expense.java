package com.nelkinda.training;

public class Expense {
  ExpenseType type;
  int amount;

  String getName() {
    return type.getName();
  }

  boolean isMeal() {
    return type.isMeal();
  }

  boolean isOverLimit() {
    return amount > type.getLimit();
  }

  int getAmount() {
    return amount;
  }
}
