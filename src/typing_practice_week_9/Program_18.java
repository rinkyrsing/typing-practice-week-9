package typing_practice_week_9;
import java.util.Scanner;
public class Program_18 {
    double firstNumber;
    double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult()
    {
        return getFirstNumber() + getSecondNumber();
    }
    public double getSubtractionResult(){
        return getFirstNumber() - getSecondNumber();
    }
    public double getMultiplication(){
        return getFirstNumber() * getSecondNumber();
    }
    public double getDivisionResult(){
        if(getSecondNumber() == 0){
           return 0;
        }else
            return getFirstNumber() / getSecondNumber();
    }

    public static void main(String[] args){

        Program_18 calculator = new Program_18();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplication());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
