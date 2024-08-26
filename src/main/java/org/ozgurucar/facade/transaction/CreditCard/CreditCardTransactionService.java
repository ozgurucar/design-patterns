package org.ozgurucar.facade.transaction.CreditCard;

import org.ozgurucar.facade.debt.PaymentInfoDto;

public class CreditCardTransactionService {
    private CreditCardControlService creditCardControlService;

    public CreditCardTransactionService() {
        creditCardControlService = new CreditCardControlService();
    }

    //todo
    public boolean tryTransactionFromCreditCard(PaymentInfoDto) {

    }
}
