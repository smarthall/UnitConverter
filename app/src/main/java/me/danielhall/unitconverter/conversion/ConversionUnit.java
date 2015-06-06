package me.danielhall.unitconverter.conversion;

/**
 * A unit for conversions. Conversions are done with:
 *
 *     result = unitMultiplier * input + unitOffset
 *
 */
public class ConversionUnit {
    private ConversionUnit unitBaseUnit;
    private String unitName;
    private String unitShortName;
    private double unitMultiplier;
    private double unitOffset;

    /**
     * Creates a Unit
     * @param unitBaseUnit The unit that the parameters here convert to
     * @param unitName The full name of this unit eg. Meters
     * @param unitShortName The abbreviation for this unit. eg. m
     * @param unitMultiplier The multiplier to get to the base unit
     * @param unitOffset The offset to get to the base unit
     */
    public ConversionUnit(ConversionUnit unitBaseUnit, String unitName, String unitShortName, double unitMultiplier, double unitOffset) {
        this.unitBaseUnit = unitBaseUnit;
        this.unitName = unitName;
        this.unitShortName = unitShortName;
        this.unitMultiplier = unitMultiplier;
        this.unitOffset = unitOffset;
    }

    public ConversionUnit getUnitBaseUnit() {
        return unitBaseUnit;
    }

    public String getUnitName() {
        return unitName;
    }

    public String getUnitShortName() {
        return unitShortName;
    }

    public double getUnitMultiplier() {
        return unitMultiplier;
    }

    public double getUnitOffset() {
        return unitOffset;
    }

    public double toBaseUnit(double value) {
        return unitMultiplier * value + unitOffset;
    }

    public double fromBaseUnit(double value) {
        return (value - unitOffset) / unitMultiplier;
    }
}
