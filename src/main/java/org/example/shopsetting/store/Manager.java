package org.example.shopsetting.store;

import org.example.shopsetting.interfaces.ManagerDuty;

public class Manager extends Staff implements ManagerDuty {

    public Manager(String name, String identity, String staffId) {
        super(name, identity, staffId);
    }



    @Override
    public void iCanHire(Cashier cashier) {
        if (cashier.getIdentity() == "applicant") {
            System.out.println("You are hired");
        }else {
            System.out.println("Sorry, you didn't meet the condition");
        }
    }
}
