package me.danielhall.unitconverter.conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionData {
    // Data
    private static ConversionUnit unitBytes = new ConversionUnit(null, "Bytes", "b", 1, 0);
    private static ConversionUnit unitBits = new ConversionUnit(null, "Bits", "bit", 0.125, 0);
    private static ConversionCategory categoryData = new ConversionCategory(
            "Data",
            unitBytes,
            unitBits
    );

    // Distance
    private static ConversionUnit unitMeters = new ConversionUnit(null, "Meters", "m", 1, 0);
    private static ConversionUnit unitFeet = new ConversionUnit(null, "Feet", "f", 0.305, 0);
    private static ConversionCategory categoryDistance = new ConversionCategory(
            "Distance",
            unitMeters,
            unitFeet
    );

    private static List<ConversionCategory> categories = Arrays.asList(
            categoryData,
            categoryDistance
    );

    public static List<ConversionCategory> getCategoryList() {
        return categories;
    }
    public static ConversionCategory getCategoryByName(String name) {
        for (ConversionCategory c: categories) {
            if (c.getCategoryName().equals(name)) {
                return c;
            }
        }

        throw new IndexOutOfBoundsException();
    }
}
