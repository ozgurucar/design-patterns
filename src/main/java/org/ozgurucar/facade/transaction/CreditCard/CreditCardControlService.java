package org.ozgurucar.facade.transaction.CreditCard;

import org.ozgurucar.facade.debt.PaymentInfoDto;
import org.ozgurucar.facade.latency.DateUtil;

import java.util.Date;

public class CreditCardControlService {
    public boolean isCreditCardValid(PaymentInfoDto paymentInfoDto) {
        Long expireMonth = paymentInfoDto.getExpireMonth();
        Long expireYear = paymentInfoDto.getExpireYear();
        Date todaysDate = DateUtil.getTodaysDate();

        Long daysMonth = DateUtil.datesMonth(todaysDate);
        Long daysYear = DateUtil.datesYear(todaysDate);

        boolean isCreditCardValid = false;

        if(expireYear.compareTo(daysYear) > 0) {
            isCreditCardValid = true;
        } else if (expireYear.compareTo(daysYear) == 0) {
            if(expireMonth.compareTo(daysMonth) >= 0) {
                isCreditCardValid = true;
            }
        }

        if (!isCreditCardValid) {
            System.out.println("Invalid credit card infos");
        }
        return  isCreditCardValid;
    }
}
