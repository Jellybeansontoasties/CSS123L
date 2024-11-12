package com.carrentalmanagement.mylibs;

import java.util.Date;

public class AvailabilityChecker {
    // Checks if the car is available for the specified dates
    public boolean checkAvailability(Car car, Date startDate, Date endDate) {
        for (Rental rental : Rental.rentalList) {
            if (rental.getCar().equals(car)) {
                Date rentalStart = rental.getStartDate();
                Date rentalEnd = rental.getEndDate();

                // Check if the dates overlap
                if ((startDate.before(rentalEnd) && endDate.after(rentalStart)) || startDate.equals(rentalStart) || endDate.equals(rentalEnd)) {
                    return false;
                }
            }
        }
        return true;
    }
}
