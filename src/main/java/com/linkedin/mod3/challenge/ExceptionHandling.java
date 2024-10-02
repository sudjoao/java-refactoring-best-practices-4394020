package com.linkedin.mod3.challenge;

import java.sql.SQLException;

public class ExceptionHandling {
    // The following code uses a general exception handler instead of specific handlers
    // for each exception. It also swallows exceptions without logging them.
    // Identify the problem areas and make the improvements.
    public void runSQL() {
        try {
            // some code that might throw an exception
            throw new SQLException();
        } catch (SQLException e) {
            System.out.printf("An sql error occurs, details: %s", e.getMessage());
        }
    }
}
