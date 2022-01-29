package com.nelkinda.training;

import java.util.Date;
import java.util.List;

public class ExpenseReport {
  public void printReport(List<Expense> expenses) {
    printReport(expenses, new Date());
  }

  public void printReport(List<Expense> expenses, Date date) {
    int total = 0;
    int mealExpenses = 0;

    System.out.println("Expenses " + date);

    for (Expense expense : expenses) {
      if (expense.isMeal()) {
        mealExpenses += expense.getAmount();
      }
      String expenseName = expense.getName();
      String mealOverExpensesMarker = expense.isOverLimit(expense.type) ? "X" : " ";
      System.out.println(expenseName + "\t" + expense.getAmount() + "\t" + mealOverExpensesMarker);
      total += expense.getAmount();
    }

    System.out.println("Meal expenses: " + mealExpenses);
    System.out.println("Total expenses: " + total);
  }

}
