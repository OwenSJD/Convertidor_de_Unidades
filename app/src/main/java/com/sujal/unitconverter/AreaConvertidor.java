package com.sujal.unitconverter;

public class AreaConvertidor {
    public enum Unit {
        Acre,
        Hactarea,
        Metro_cuadrado,
        Pie_cuadrado,
        Pulgada_cuadrada,
        Kilometro_cuadrado,
        Yarda_cuadrada;

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

    public AreaConvertidor(Unit from, Unit to) {
        double constant = 1;

        switch (from) {
            case Acre:
                if (to == Unit.Hactarea) {
                    constant = 0.404686;
                } else if (to == Unit.Metro_cuadrado) {
                    constant = 4046.86;
                } else if (to == Unit.Pie_cuadrado) {
                    constant = 43560;
                } else if (to == Unit.Pulgada_cuadrada) {
                    constant = 6.273e+6;
                } else if (to == Unit.Kilometro_cuadrado) {
                    constant = 0.00404686;
                } else if (to == Unit.Yarda_cuadrada) {
                    constant = 4840;
                }
                break;
            case Hactarea:
                if (to == Unit.Acre) {
                    constant = 2.47105;
                } else if (to == Unit.Metro_cuadrado) {
                    constant = 10000;
                } else if (to == Unit.Pie_cuadrado) {
                    constant = 107639;
                } else if (to == Unit.Pulgada_cuadrada) {
                    constant = 1.55e+7;
                } else if (to == Unit.Kilometro_cuadrado) {
                    constant = 0.01;
                } else if (to == Unit.Yarda_cuadrada) {
                    constant = 11959.9;
                }
                break;
            case Metro_cuadrado:
                if (to == Unit.Acre) {
                    constant = 0.000247105;
                } else if (to == Unit.Hactarea) {
                    constant = 1e-4;
                } else if (to == Unit.Pie_cuadrado) {
                    constant = 10.7639;
                } else if (to == Unit.Pulgada_cuadrada) {
                    constant = 1550;
                } else if (to == Unit.Kilometro_cuadrado) {
                    constant = 1e-6;
                } else if (to == Unit.Yarda_cuadrada) {
                    constant = 1.19599;
                }
                break;
            case Pie_cuadrado:
                if (to == Unit.Acre) {
                    constant = 2.2957e-5;
                } else if (to == Unit.Hactarea) {
                    constant = 9.2903e-6;
                } else if (to == Unit.Metro_cuadrado) {
                    constant = 0.092903;
                } else if (to == Unit.Pulgada_cuadrada) {
                    constant = 144;
                } else if (to == Unit.Kilometro_cuadrado) {
                    constant = 9.2903e-8;
                } else if (to == Unit.Yarda_cuadrada) {
                    constant = 0.111111;
                }
                break;
            case Pulgada_cuadrada:
                if (to == Unit.Acre) {
                    constant = 1.5942e-7;
                } else if (to == Unit.Hactarea) {
                    constant = 6.4516e-8;
                } else if (to == Unit.Metro_cuadrado) {
                    constant = 0.00064516;
                } else if (to == Unit.Pie_cuadrado) {
                    constant = 0.00694444;
                } else if (to == Unit.Kilometro_cuadrado) {
                    constant = 6.4516e-10;
                } else if (to == Unit.Yarda_cuadrada) {
                    constant = 0.000771605;
                }
                break;
            case Kilometro_cuadrado:
                if (to == Unit.Acre) {
                    constant = 247.105;
                } else if (to == Unit.Hactarea) {
                    constant = 100;
                } else if (to == Unit.Metro_cuadrado) {
                    constant = 1e+6;
                } else if (to == Unit.Pie_cuadrado) {
                    constant = 1.076e+7;
                } else if (to == Unit.Pulgada_cuadrada) {
                    constant = 1.55e+9;
                } else if (to == Unit.Yarda_cuadrada) {
                    constant = 1.196e+6;
                }
                break;
            case Yarda_cuadrada:
                if (to == Unit.Acre) {
                    constant = 0.000206612;
                } else if (to == Unit.Hactarea) {
                    constant = 8.3613e-5;
                } else if (to == Unit.Metro_cuadrado) {
                    constant = 0.836127;
                } else if (to == Unit.Pie_cuadrado) {
                    constant = 9;
                } else if (to == Unit.Pulgada_cuadrada) {
                    constant = 1296;
                } else if (to == Unit.Kilometro_cuadrado) {
                    constant = 8.3613e-7;
                }
                break;
        }

        multiplier = constant;
    }

    public double convert(double input) {
        return input * multiplier;
    }
}
