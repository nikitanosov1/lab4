import functions.*;
import functions.basic.Cos;
import functions.basic.Exp;
import functions.basic.Log;
import functions.basic.Sin;

import java.io.*;

public class Main {
    public static void main(String[] args){
        //task 8
        Sin sin = new Sin();
        Cos cos = new Cos();
        double x = 0;
        while (x < 2 * Math.PI){
            System.out.println("Sin(" + x + ") = " + sin.getFunctionValue(x));
            x = x + 0.1;
        }
        System.out.println();
        x = 0;
        while (x < 2 * Math.PI){
            System.out.println("Cos(" + x + ") = " + cos.getFunctionValue(x));
            x = x + 0.1;
        }

        System.out.println();
        Function f = Functions.sum(Functions.power(sin, 2), Functions.power(cos, 2));
        x = 0;
        while (x < 2 * Math.PI){
            System.out.println("sin^2(" + x + ") + cos^2(" + x + ") = " + f.getFunctionValue(x));
            x = x + 0.1;
        }

        TabulatedFunction exp = TabulatedFunctions.tabulate(new Exp(), 0,10,11);
        try (Writer file = new FileWriter("1.txt");){
            TabulatedFunctions.writeTabulatedFunction(exp, file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Reader fileReader = null;
        try {
            fileReader = new FileReader("1.txt");
            TabulatedFunction tabulatedFunction = TabulatedFunctions.readTabulatedFunction(fileReader);
            for (int i = 0; i < tabulatedFunction.getPointsCount(); i++) {
                System.out.println("X = " + tabulatedFunction.getPointX(i) + " Y = " + tabulatedFunction.getPointY(i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // UIEDGHFIOFGSOIFGSOFSDGFOSEGFEGGEROIFGWEIFEGUIFEGOFUIYEGOFESGOFI

        TabulatedFunction log = TabulatedFunctions.tabulate(new Log(Math.E), 0,10,11);
        try (OutputStream file = new FileOutputStream("2.txt");){
            TabulatedFunctions.outputTabulatedFunction(log, file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("2.txt");
            TabulatedFunction tabulatedFunction = TabulatedFunctions.inputTabulatedFunction(inputStream);
            for (int i = 0; i < tabulatedFunction.getPointsCount(); i++) {
                System.out.println("X = " + tabulatedFunction.getPointX(i) + " Y = " + tabulatedFunction.getPointY(i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }





    }
}