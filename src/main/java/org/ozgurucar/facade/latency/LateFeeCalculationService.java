package org.ozgurucar.facade.latency;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class LateFeeCalculationService {
    private LateFeeRatioEntityService lateFeeRatioEntityService;

    public LateFeeCalculationService(LateFeeRatioEntityService lateFeeRatioEntityService) {
        lateFeeRatioEntityService = new LateFeeRatioEntityService();
    }

    public BigDecimal calculateLateFee(BigDecimal amount, Date dueDate) {

        BigDecimal lateFee = BigDecimal.ZERO;

        if(dueDate.compareTo(new Date()) > 0) {
            return lateFee;
        }

        lateFee = calculateFee(amount, dueDate);
    }

    private BigDecimal calculateFee(BigDecimal amount, Date dueDate) {
    BigDecimal lateFeeRatio = lateFeeRatioEntityService.getLateFeeRatio();

    Date todaysDate = DateUtil.getTodaysDate();

    long dateDifferenceL = DateUtil.calculateDateDifference(dueDate, todaysDate);

    BigDecimal dateDifference = BigDecimal.valueOf(dateDifferenceL);

    BigDecimal lateFee = lateFeeRatio.multiply(dateDifference).multiply(amount);

    lateFee = lateFee.setScale(2, RoundingMode.HALF_DOWN);

    if(lateFee.compareTo(BigDecimal.ZERO) > 0) {
        System.out.println("Info : Late fee calclated : Late Fee Amount: " + lateFee);
    }

    return  lateFee;
    }
}
