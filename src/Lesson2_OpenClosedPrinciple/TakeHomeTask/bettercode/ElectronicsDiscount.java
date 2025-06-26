package Lesson2_OpenClosedPrinciple.TakeHomeTask.bettercode;

public class ElectronicsDiscount implements ProductDiscountCalculator{
    @Override
    public double calculateDiscount(double price) {
        return price * 0.10;
    }
}
