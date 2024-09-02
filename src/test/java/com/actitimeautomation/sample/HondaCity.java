package com.actitimeautomation.sample;

public class HondaCity  implements Car{
    @Override
    public void engine(String ccType)
    {
        System.out.println("The Engine has cc"+ccType);
    }
    @Override
    public void fuelType(String type)
    {
        System.out.println("Fuel Type"+type);
    }
    public void airBags(int number)
    {
        System.out.println("Total airbags"+number);
    }
    public static void main(String[] args)
    {
        HondaCity hondaCity=new HondaCity();
        hondaCity.engine("1000cc");
        hondaCity.airBags(6);
        hondaCity.fuelType("petrol");
    }
}
