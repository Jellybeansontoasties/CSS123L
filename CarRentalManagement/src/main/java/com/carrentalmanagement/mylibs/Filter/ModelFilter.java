package com.carrentalmanagement.mylibs.Filter;

import java.util.ArrayList;
import java.util.List;

public class ModelFilter {
    private int id;
    private String modelName;
    private int brandId;

    // Static list to hold all models
    public static final List<ModelFilter> modelList = new ArrayList<>();

    // Constructor
    public ModelFilter(int id, String modelName, int brandId) {
        this.id = id;
        this.modelName = modelName;
        this.brandId = brandId;
    }

    public int getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public int getBrandId() {
        return brandId;
    }

    static {
        modelList.add(new ModelFilter(1, "Civic", 1));
        modelList.add(new ModelFilter(2, "Accord", 1));
        modelList.add(new ModelFilter(3, "Highlander", 2));
        modelList.add(new ModelFilter(4, "Corolla", 2));
        modelList.add(new ModelFilter(5, "F-150", 3));
        modelList.add(new ModelFilter(6, "Mustang", 3));
        modelList.add(new ModelFilter(7, "Mazda3", 4));
        modelList.add(new ModelFilter(8, "Model 3", 5));
        modelList.add(new ModelFilter(9, "Model X", 5));
        modelList.add(new ModelFilter(10, "RX", 6));
        modelList.add(new ModelFilter(11, "911", 7));
        modelList.add(new ModelFilter(12, "Malibu", 8));
        modelList.add(new ModelFilter(13, "Santa Fe", 9));
        modelList.add(new ModelFilter(14, "A4", 10));
        modelList.add(new ModelFilter(15, "X5", 11));
        modelList.add(new ModelFilter(16, "Golf", 12));
        modelList.add(new ModelFilter(17, "Wrangler", 13));
        modelList.add(new ModelFilter(18, "Odyssey", 1));
        modelList.add(new ModelFilter(19, "Porsche Cayenne", 7));
        modelList.add(new ModelFilter(20, "RAV4", 2));
        modelList.add(new ModelFilter(21, "Camry Hybrid", 2));
        modelList.add(new ModelFilter(22, "M5", 11));
        modelList.add(new ModelFilter(23, "Pilot", 1));
        modelList.add(new ModelFilter(24, "Mini Cooper", 13));
    }

    // Method to get models by brand id
    public static List<ModelFilter> getModelsByBrandId(int brandId) {
        List<ModelFilter> modelsByBrand = new ArrayList<>();
        for (ModelFilter model : modelList) {
            if (model.getBrandId() == brandId) {
                modelsByBrand.add(model);
            }
        }
        return modelsByBrand;
    }
}
