package com.nelkinda.training;

public enum ExpenseType {
  DINNER("Dinner", true, 5000),
  BREAKFAST("Breakfast", true, 1000),
  CAR_RENTAL("Car Rental", false, Integer.MAX_VALUE),
  LUNCH("Lunch", true, 2000);

  private final String name;
  private final boolean meal;
  private final int limit;

  ExpenseType(String name, boolean meal, int limit) {
    this.name = name;
    this.meal = meal;
    this.limit = limit;
  }

  int getLimit() {
    return limit;
  }

  String getName() {
    return name;
  }

  boolean isMeal() {
    return meal;
  }

}
