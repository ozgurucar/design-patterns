package org.ozgurucar.facade.juridical;

import java.util.List;

public class JuridicalControlService {
    private JuridicalEntityService juridicalEntityService;

    public JuridicalControlService() {
        juridicalEntityService = new JuridicalEntityService();
    }

    public boolean isInLawCase(Long debtId) {
        List<Long> juridicalOperations = juridicalEntityService.finAllJuridicalOperations();

    boolean isInLawCase = juridicalOperations.contains(debtId);

    if(isInLawCase) {
        System.out.println("Debt is in law case : Collection can't be done");
    }
    return isInLawCase;
    }
}
