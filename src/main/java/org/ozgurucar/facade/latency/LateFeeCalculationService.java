package org.ozgurucar.facade.latency;

import java.math.BigDecimal;
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
    }
}
