package com.carrentalmanagement.mylibs;

import java.util.List;

public class ReportManager {
    // Singleton instance
    private static ReportManager instance;

    public ReportManager() {}

    public static ReportManager getInstance() {
        if (instance == null) {
            instance = new ReportManager();
        }
        return instance;
    }

    // Generates a report showing all cars and their status
    public List<Car> generateStatusReport(List<Car> cars) {
        return cars;
    }

    // Generates a filtered report based on the provided strategy
    public List<Car> generateFilteredReport(FilterStrategy strategy, List<Car> cars) {
        return strategy.filter(cars);
    }
}
