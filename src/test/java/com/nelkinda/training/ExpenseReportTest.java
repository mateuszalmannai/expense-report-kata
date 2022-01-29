package com.nelkinda.training;

import org.approvaltests.ApprovalUtilities;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.Date;

public class ExpenseReportTest {

  @Test
  void emptyReportTest() {
    ByteArrayOutputStream output = new ApprovalUtilities().writeSystemOutToStringBuffer();
    ExpenseReport report = new ExpenseReport();
    report.printReport(Collections.emptyList(), new Date(0));
    Approvals.verify(output);
  }
}
