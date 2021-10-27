package functions;

public abstract class TabulatedFunctions {
    public static TabulatedFunction tabulate(Function function, double leftX, double rightX, int pointsCount) throws IllegalArgumentException {
        if ((function.getLeftDomainBorder() < leftX) || (function.getRightDomainBorder() > rightX)){
            throw new IllegalArgumentException();
        }
        ArrayTabulatedFunction arrayTabulatedFunction = new ArrayTabulatedFunction(leftX, rightX, pointsCount);
        for (int i = 0; i < pointsCount; i++) {
            arrayTabulatedFunction.setPointY(i, function.getFunctionValue(arrayTabulatedFunction.getPointX(i)));
        }
        return arrayTabulatedFunction;
    }
}
