package com.carrentalmanagement.mylibs.Filter;

import java.util.ArrayList;
import java.util.List;

public class BrandFilter {
    private int id;
    private String brandName;

    // Static list to hold all brands
    public static final List<BrandFilter> brandList = new ArrayList<>();

    // Constructor
    public BrandFilter(int id, String brandName) {
        this.id = id;
        this.brandName = brandName;
    }

    public int getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    static {
        brandList.add(new BrandFilter(1, "Honda"));
        brandList.add(new BrandFilter(2, "Toyota"));
        brandList.add(new BrandFilter(3, "Ford"));
        brandList.add(new BrandFilter(4, "Mazda"));
        brandList.add(new BrandFilter(5, "Tesla"));
        brandList.add(new BrandFilter(6, "Lexus"));
        brandList.add(new BrandFilter(7, "Porsche"));
        brandList.add(new BrandFilter(8, "Chevrolet"));
        brandList.add(new BrandFilter(9, "Hyundai"));
        brandList.add(new BrandFilter(10, "Audi"));
        brandList.add(new BrandFilter(11, "BMW"));
        brandList.add(new BrandFilter(12, "Volkswagen"));
        brandList.add(new BrandFilter(13, "Jeep"));
        brandList.add(new BrandFilter(14, "Mini"));
    }

    // Method to get a brand by its name
    public static BrandFilter getBrandByName(String name) {
        return brandList.stream()
                .filter(brand -> brand.getBrandName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
