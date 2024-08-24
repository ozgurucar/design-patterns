package org.ozgurucar.facade.debt;

public class PaymentInfoDto {

    private String cardOwner;
    private String cardNo;
    private Long expireMonth;
    private Long expireYear;
    private Long cvv;

    public PaymentInfoDto(String cardOwner, String cardNo, Long expireMonth, Long expireYear, Long cvv) {
        this.cardOwner = cardOwner;
        this.cardNo = cardNo;
        this.expireMonth = expireMonth;
        this.expireYear = expireYear;
        this.cvv = cvv;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public String getCardNo() {
        return cardNo;
    }

    public Long getExpireMonth() {
        return expireMonth;
    }

    public Long getExpireYear() {
        return expireYear;
    }

    public Long getCvv() {
        return cvv;
    }
}
