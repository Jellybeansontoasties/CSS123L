package com.carrentalmanagement.mylibs.Filter;

import java.util.List;
import java.util.stream.Collectors;
import com.carrentalmanagement.mylibs.*;

public class PriceRangeFilter implements FilterStrategy {
    private double minPrice;
    private double maxPrice;

    public PriceRangeFilter(double minPrice, double maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    @Override
    public List<Car> filter(List<Car> cars) {
        return cars.stream()
                .filter(car -> car.getPrice() >= minPrice && car.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }
}

