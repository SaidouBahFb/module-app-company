package com.groupeisi.metier;

import java.util.Optional;

public interface IEmployees {

    Optional<EmployeeDto> save(EmployeeDto employeeDto);
}
