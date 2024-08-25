package org.ozgurucar.facade.latency;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LateFeeRatioEntityService {

    public BigDecimal getLateFeeRatio() {

        BigDecimal ratio = new BigDecimal("1.6");

        ratio.divide(new BigDecimal(100), 4, RoundingMode.HALF_DOWN);

        return  ratio;
    }
}
