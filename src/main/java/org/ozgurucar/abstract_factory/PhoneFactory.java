package org.ozgurucar.abstract_factory;

public interface PhoneFactory {
    Phone getPhone(String model, String battery, int width, int height);
}
