package com.carrentalmanagement.mylibs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rental {
    private Car car;
    private Date startDate;
    private Date endDate;

    // Constructor
    public Rental(Car car, Date startDate, Date endDate) {
        this.car = car;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Static list of hardcoded Rental objects
    public static final List<Rental> rentalList = new ArrayList<>();

    // Date formatter for parsing dates
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    static {
        try {
            rentalList.add(new Rental(Car.carList.get(0), dateFormat.parse("2024-11-01"), dateFormat.parse("2024-11-05")));
            rentalList.add(new Rental(Car.carList.get(1), dateFormat.parse("2024-11-03"), dateFormat.parse("2024-11-07")));
            rentalList.add(new Rental(Car.carList.get(2), dateFormat.parse("2024-10-15"), dateFormat.parse("2024-10-20")));
            rentalList.add(new Rental(Car.carList.get(3), dateFormat.parse("2024-11-02"), dateFormat.parse("2024-11-06")));
            rentalList.add(new Rental(Car.carList.get(4), dateFormat.parse("2024-11-01"), dateFormat.parse("2024-11-05")));
            rentalList.add(new Rental(Car.carList.get(5), dateFormat.parse("2024-09-28"), dateFormat.parse("2024-10-02")));
            rentalList.add(new Rental(Car.carList.get(6), dateFormat.parse("2024-11-03"), dateFormat.parse("2024-11-10")));
            rentalList.add(new Rental(Car.carList.get(7), dateFormat.parse("2024-10-25"), dateFormat.parse("2024-10-30")));
            rentalList.add(new Rental(Car.carList.get(8), dateFormat.parse("2024-10-20"), dateFormat.parse("2024-10-22")));
            rentalList.add(new Rental(Car.carList.get(9), dateFormat.parse("2024-11-01"), dateFormat.parse("2024-11-04")));
            rentalList.add(new Rental(Car.carList.get(10), dateFormat.parse("2024-09-10"), dateFormat.parse("2024-09-14")));
            rentalList.add(new Rental(Car.carList.get(11), dateFormat.parse("2024-11-05"), dateFormat.parse("2024-11-12")));
            rentalList.add(new Rental(Car.carList.get(12), dateFormat.parse("2024-11-01"), dateFormat.parse("2024-11-06")));
            rentalList.add(new Rental(Car.carList.get(13), dateFormat.parse("2024-10-22"), dateFormat.parse("2024-10-29")));
            rentalList.add(new Rental(Car.carList.get(14), dateFormat.parse("2024-11-03"), dateFormat.parse("2024-11-06")));
            rentalList.add(new Rental(Car.carList.get(15), dateFormat.parse("2024-09-15"), dateFormat.parse("2024-09-20")));
            rentalList.add(new Rental(Car.carList.get(16), dateFormat.parse("2024-11-02"), dateFormat.parse("2024-11-04")));
            rentalList.add(new Rental(Car.carList.get(17), dateFormat.parse("2024-10-05"), dateFormat.parse("2024-10-08")));
            rentalList.add(new Rental(Car.carList.get(18), dateFormat.parse("2024-11-01"), dateFormat.parse("2024-11-07")));
            rentalList.add(new Rental(Car.carList.get(19), dateFormat.parse("2024-10-18"), dateFormat.parse("2024-10-22")));
            rentalList.add(new Rental(Car.carList.get(20), dateFormat.parse("2024-11-04"), dateFormat.parse("2024-11-08")));
            rentalList.add(new Rental(Car.carList.get(21), dateFormat.parse("2024-10-10"), dateFormat.parse("2024-10-15")));
            rentalList.add(new Rental(Car.carList.get(22), dateFormat.parse("2024-11-01"), dateFormat.parse("2024-11-03")));
            rentalList.add(new Rental(Car.carList.get(23), dateFormat.parse("2024-09-30"), dateFormat.parse("2024-10-05")));
            rentalList.add(new Rental(Car.carList.get(24), dateFormat.parse("2024-10-12"), dateFormat.parse("2024-10-15")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Car getCar() {
        return car;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
