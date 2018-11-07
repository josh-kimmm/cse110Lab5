package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float temp = (float) ((super.getValue() - 32) * (5.0 / 9.0));
        return new Celsius(temp);
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(super.getValue());
    }

    public String toString()
    {
        return Float.toString(super.getValue()) + " F";
    }
}