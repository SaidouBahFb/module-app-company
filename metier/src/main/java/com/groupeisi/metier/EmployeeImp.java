package com.groupeisi.metier;

import java.util.Optional;

public class EmployeeImp implements IEmployees{
    @Override
    public Optional<EmployeeDto> save(EmployeeDto employeeDto) {
        return Optional.of(new EmployeeDto("Saidou", "Bah"));
    }
}
