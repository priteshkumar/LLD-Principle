package Lesson2_OpenClosedPrinciple.TakeHomeTask.bettercode.hw2;

class InsuranceQuote {

}

class Vehicle {

}

class Car extends Vehicle {

}

class Truck extends Vehicle {

}

public class VehicleInsuranceEvaluator {
    public InsuranceQuote evaluateInsurance(Vehicle vehicle,
                                            VehicleInsuranceCalculator vehicleInsuranceCalculator) {
       return vehicleInsuranceCalculator.calculateInsurance();
    }
}
