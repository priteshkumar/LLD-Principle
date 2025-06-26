package Lesson2_OpenClosedPrinciple.TakeHomeTask.bettercode.hw1;

public class ElectronicsDiscount implements ProductDiscountCalculator {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.10;
    }
}
