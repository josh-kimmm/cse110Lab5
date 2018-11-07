package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(super.getValue());
    }

    @Override
    public Temperature toFahrenheit() {
        float temp = (float) ((super.getValue() * (9.0 / 5.0)) + 32);
        return new Fahrenheit(temp);
    }

    public String toString()
    {
        return Float.toString(super.getValue()) + " C";
    }
}