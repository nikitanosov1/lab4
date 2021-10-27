package functions;

public abstract class Functions {
    public static Function shift(Function f, double shiftX, double shiftY){
        return shift(f, shiftX,shiftY);
    }

    public static Function scale(Function f, double scaleX, double scaleY){
        return scale(f, scaleX, scaleY);
    }

    public static Function power(Function f, double power){
        return power(f, power);
    }

    public static Function sum(Function f1, Function f2){
        return sum(f1, f2);
    }

    public static Function mult(Function f1, Function f2){
        return mult(f1, f2);
    }

    public static Function composition(Function f1, Function f2){
        return composition(f1, f2);
    }
}
