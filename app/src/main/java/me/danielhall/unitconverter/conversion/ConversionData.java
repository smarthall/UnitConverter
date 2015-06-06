package me.danielhall.unitconverter.conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionData {
    private static ConversionUnit unitBytes = new ConversionUnit(null, "Bytes", "b", 1, 0);
    private static ConversionUnit unitBits = new ConversionUnit(null, "Bits", "bit", 0.125, 0);

    private static ConversionCategory categoryData = new ConversionCategory(
            "Data",
            unitBytes,
            unitBits
    );

    private static List<ConversionCategory> categories = Arrays.asList(
            categoryData
    );

    private static List<ConversionCategory> getCategoryList() {
        return categories;
    }
}
