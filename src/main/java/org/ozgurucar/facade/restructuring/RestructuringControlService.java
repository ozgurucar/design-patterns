package org.ozgurucar.facade.restructuring;

import org.ozgurucar.facade.latency.DateUtil;

import java.util.Date;

public class RestructuringControlService {
    /*
    * If 90 days or more passed the over due date, restructuring must be ended.
    * */
    public boolean isRestructuringMustEnd(Date dueDate) {
        Date todaysDate = DateUtil.getTodaysDate();
        long dateDifference = DateUtil.calculateDateDifference(dueDate, todaysDate);

        boolean isRestructuringMustEnd = dateDifference > 90;

        if(isRestructuringMustEnd) {
            System.out.println("Restructuring of debt must be ended! Transaction Failed.");
        }
         return isRestructuringMustEnd;
    }
}
