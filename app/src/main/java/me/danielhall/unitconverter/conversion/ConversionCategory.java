package me.danielhall.unitconverter.conversion;

import java.util.Arrays;
import java.util.List;

public class ConversionCategory {
    public String getCategoryName() {
        return categoryName;
    }

    private String categoryName;
    private List<ConversionUnit> units;

    public ConversionCategory(String categoryName, List<ConversionUnit> units) {
        this.categoryName = categoryName;
        this.units = units;
    }

    public ConversionCategory(String categoryName, ConversionUnit ... units) {
        this.categoryName = categoryName;
        this.units = Arrays.asList(units);
    }
}
