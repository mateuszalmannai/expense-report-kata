package com.nelkinda.training;

import java.util.Date;

public class ExpenseReport {
  public void printReport(Expenses expenses) {
    printReport(expenses, new Date());
  }

  public void printReport(Expenses expenses, Date date) {

    System.out.println("Expenses " + date);

    for (Expense expense : expenses) {
      printSingleExpense (expense);
    }

    System.out.println("Meal expenses: " + expenses.getMealExpenses());
    System.out.println("Total expenses: " + expenses.getTotal());
  }

  private void printSingleExpense(Expense expense) {
    String mealOverExpensesMarker = expense.isOverLimit() ? "X" : " ";
    System.out.println(expense.getName() + "\t" + expense.getAmount() + "\t" + mealOverExpensesMarker);
  }

}
