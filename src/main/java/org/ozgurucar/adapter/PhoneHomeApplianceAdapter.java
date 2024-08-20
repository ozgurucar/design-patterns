package org.ozgurucar.adapter;

public class PhoneHomeApplianceAdapter implements HomeAppliance{
    private Phone phone;

    public PhoneHomeApplianceAdapter(Phone phone) {
        this.phone = phone;
    }

    @Override
    public int plugIn() {
        return phone.charge();
    }
}
