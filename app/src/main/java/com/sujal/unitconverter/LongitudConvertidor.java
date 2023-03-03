package com.sujal.unitconverter;

public class LongitudConvertidor {
    public enum Unit {
        INCH,
        Centimetros,
        Pies,
        Yardas,
        Metros,
        Millas,
        Kilometros;

        // Helper method to convert text to one of the above constants
        public static Unit fromString(String text) {
            if (text != null) {
                for (Unit unit : Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;

    public LongitudConvertidor(Unit from, Unit to) {
        double constant = 1;

        switch (from) {
            case INCH:
                if (to == Unit.Centimetros) {
                    constant = 2.54;
                } else if (to == Unit.Pies) {
                    constant = 0.0833333;
                } else if (to == Unit.Yardas) {
                    constant = 0.0277778;
                } else if (to == Unit.Millas) {
                    constant = 0.0254;
                } else if (to == Unit.Millas) {
                    constant = 1.5783e-5;
                } else if (to == Unit.Kilometros) {
                    constant = 2.54e-5;
                }
                break;
            case Centimetros:
                if (to == Unit.INCH) {
                    constant = 0.393701;
                } else if (to == Unit.Pies) {
                    constant = 0.0328084;
                } else if (to == Unit.Yardas) {
                    constant = 0.0109361;
                } else if (to == Unit.Metros) {
                    constant = 0.01;
                } else if (to == Unit.Millas) {
                    constant = 6.2137e-6;
                } else if (to == Unit.Kilometros) {
                    constant = 1e-5;
                }
                break;
            case Pies:
                if (to == Unit.INCH) {
                    constant = 12;
                } else if (to == Unit.Centimetros) {
                    constant = 30.48;
                } else if (to == Unit.Yardas) {
                    constant = 0.333333;
                } else if (to == Unit.Metros) {
                    constant = 0.3048;
                } else if (to == Unit.Millas) {
                    constant = 0.000189394;
                } else if (to == Unit.Kilometros) {
                    constant = 0.0003048;
                }
                break;
            case Yardas:
                if (to == Unit.INCH) {
                    constant = 36;
                } else if (to == Unit.Centimetros) {
                    constant = 91.44;
                } else if (to == Unit.Pies) {
                    constant = 3;
                } else if (to == Unit.Metros) {
                    constant = 0.9144;
                } else if (to == Unit.Millas) {
                    constant = 0.000568182;
                } else if (to == Unit.Kilometros) {
                    constant = 0.0009144;
                }
                break;
            case Metros:
                if (to == Unit.INCH) {
                    constant = 39.3701;
                } else if (to == Unit.Centimetros) {
                    constant = 100;
                } else if (to == Unit.Pies) {
                    constant = 3.28084;
                } else if (to == Unit.Yardas) {
                    constant = 1.09361;
                } else if (to == Unit.Millas) {
                    constant = 0.000621371;
                } else if (to == Unit.Kilometros) {
                    constant = 0.001;
                }
                break;
            case Millas:
                if (to == Unit.INCH) {
                    constant = 63360;
                } else if (to == Unit.Centimetros) {
                    constant = 160934;
                } else if (to == Unit.Pies) {
                    constant = 5280;
                } else if (to == Unit.Yardas) {
                    constant = 1760;
                } else if (to == Unit.Metros) {
                    constant = 1609.34;
                } else if (to == Unit.Kilometros) {
                    constant = 1.60934;
                }
                break;
            case Kilometros:
                if (to == Unit.INCH) {
                    constant = 39370.1;
                } else if (to == Unit.Centimetros) {
                    constant = 100000;
                } else if (to == Unit.Pies) {
                    constant = 3280.84;
                } else if (to == Unit.Yardas) {
                    constant = 1093.61;
                } else if (to == Unit.Metros) {
                    constant = 1000;
                } else if (to == Unit.Millas) {
                    constant = 0.621371;
                }
                break;
        }

        multiplier = constant;
    }

    public double convert(double input) {
        return input * multiplier;
    }
}