package com.sujal.unitconverter;

public class VelocidadConvertidor {
    public enum Unit {
        Metros_por_segundo,
        Pies_por_segundo,
        Knot,
        Kilómetro_por_Hora,
        Millas_por_hora;

        // Helper method to convert text to one of the above constants
        public static VelocidadConvertidor.Unit fromString(String text) {
            if (text != null) {
                for (VelocidadConvertidor.Unit unit : VelocidadConvertidor.Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;

    public VelocidadConvertidor(VelocidadConvertidor.Unit from, VelocidadConvertidor.Unit to) {
        double constant = 1;

        switch (from) {
            case Metros_por_segundo:
                if (to == Unit.Pies_por_segundo) {
                    constant = 3.28084;
                } else if (to == VelocidadConvertidor.Unit.Knot) {
                    constant = 1.94384;
                } else if (to == Unit.Kilómetro_por_Hora) {
                    constant = 3.6;
                } else if (to == Unit.Millas_por_hora) {
                    constant = 2.23694;
                }
                break;
            case Pies_por_segundo:
                if (to == Unit.Metros_por_segundo){
                    constant = 0.3048;
                } else if (to == VelocidadConvertidor.Unit.Knot) {
                    constant = 0.592484;
                } else if (to == Unit.Kilómetro_por_Hora) {
                    constant = 1.09728;
                } else if (to == Unit.Millas_por_hora) {
                    constant = 0.681818;
                }
                break;
            case Knot:
                if (to == Unit.Metros_por_segundo) {
                    constant = 0.514444;
                } else if (to == Unit.Pies_por_segundo) {
                    constant = 1.68781;
                } else if (to == Unit.Kilómetro_por_Hora) {
                    constant = 1.852;
                } else if (to == Unit.Millas_por_hora) {
                    constant = 1.15078;
                }
                break;
            case Kilómetro_por_Hora:
                if (to == Unit.Metros_por_segundo) {
                    constant = 0.277778;
                } else if (to == Unit.Pies_por_segundo) {
                    constant = 0.911344;
                } else if (to == VelocidadConvertidor.Unit.Knot) {
                    constant = 0.539957;
                } else if (to == Unit.Millas_por_hora) {
                    constant = 0.621371;
                }
                break;
            case Millas_por_hora:
                if (to == Unit.Metros_por_segundo) {
                    constant = 0.44704;
                } else if (to == Unit.Pies_por_segundo) {
                    constant = 1.46667;
                } else if (to == VelocidadConvertidor.Unit.Knot) {
                    constant = 0.868976;
                } else if (to == Unit.Kilómetro_por_Hora) {
                    constant = 1.60934;
                }
                break;
        }

        multiplier = constant;
    }

    public double convert(double input) {
        return input * multiplier;
    }
}
