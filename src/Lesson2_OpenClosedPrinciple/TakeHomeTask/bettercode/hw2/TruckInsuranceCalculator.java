package Lesson2_OpenClosedPrinciple.TakeHomeTask.bettercode.hw2;

public class TruckInsuranceCalculator implements VehicleInsuranceCalculator{
    @Override
    public InsuranceQuote calculateInsurance() {
        return new InsuranceQuote();
    }
}
