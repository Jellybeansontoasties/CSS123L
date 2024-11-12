package com.carrentalmanagement.mylibs;

import java.util.List;

public interface FilterStrategy {
    List<Car> filter(List<Car> cars);
}
