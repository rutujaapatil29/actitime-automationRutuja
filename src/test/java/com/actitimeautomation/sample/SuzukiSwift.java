package com.actitimeautomation.sample;
//Example of Annonymous class
public class SuzukiSwift {
    public static void main(String [] args) {
        Car car = new Car() {//class body starts here->Annonymous class object

            @Override
            public void engine(String ccType) {
                System.out.println("The Engine cc" + ccType);
            }

            @Override
            public void fuelType(String Type) {
                System.out.println("Fuel Type" + Type);
            }


            @Override
            public void airBags(int number) {
                System.out.println("Total Bags" + number);
            }
        };
car.engine("2000cc");
car.fuelType("CNG");
car.airBags(2);
    }

    }

