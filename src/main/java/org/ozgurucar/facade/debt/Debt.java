package org.ozgurucar.facade.debt;

import java.math.BigDecimal;
import java.util.Date;

public class Debt {
    private Long id;
    private EnumDebtType debtType;
    private BigDecimal debtAmount;
    private Date dueDate;

    public Debt() {

    }

    public Debt(Long id, EnumDebtType debtType, BigDecimal debtAmount, Date dueDate) {
        this.id = id;
        this.debtType = debtType;
        this.debtAmount = debtAmount;
        this.dueDate = dueDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnumDebtType getDebtType() {
        return debtType;
    }

    public void setDebtType(EnumDebtType debtType) {
        this.debtType = debtType;
    }

    public BigDecimal getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
