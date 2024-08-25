package org.ozgurucar.facade.transaction;

import org.ozgurucar.facade.debt.Debt;
import org.ozgurucar.facade.debt.EnumDebtType;
import org.ozgurucar.facade.juridical.JuridicalControlService;
import org.ozgurucar.facade.restructuring.RestructuringControlService;

public class TransactionControlService {
    private RestructuringControlService restructuringControlService;
    private JuridicalControlService juridicalControlService;

    public TransactionControlService() {
        restructuringControlService = new RestructuringControlService();
        juridicalControlService = new JuridicalControlService();
    }

    public boolean isTransactable(Debt debt ) {
        boolean restructuringMustEnd = false;
        if(EnumDebtType.RESTRUCTURING.equals(debt)) {
        restructuringMustEnd = restructuringControlService.isRestructuringMustEnd(debt.getDueDate());
    }
        boolean inLawCase = juridicalControlService.isInLawCase(debt.getId());

        return !(restructuringMustEnd || inLawCase);
    }

}
