package com.otabil;

public interface Rentable {
    void rent(Customer customer, int days);
    void returnVehicle();
}