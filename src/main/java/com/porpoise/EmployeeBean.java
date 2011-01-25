package com.porpoise;

import java.util.UUID;

/**
 */
public class EmployeeBean extends PersonBean {
    private UUID employeeId;

    public UUID getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(final UUID employeeId) {
        this.employeeId = employeeId;
    }

}