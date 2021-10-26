package functions.meta;

import functions.Function;

public class Shift implements Function {
    private Function function;
    private double shiftX;
    private double shiftY;

    @Override
    public double getLeftDomainBorder() {
        return function.getLeftDomainBorder() + shiftX;
    }

    @Override
    public double getRightDomainBorder() {
        return function.getRightDomainBorder() + shiftX;
    }

    @Override
    public double getFunctionValue(double x) {
        return function.getFunctionValue(x) + shiftY;
    }
}
