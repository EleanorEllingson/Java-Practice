package academy.ObjectOrientedProgramming.Classes1;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public SimpleCalculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return getFirstNumber() + getSecondNumber();
    }

    public double getSubtractionResult(){
        return getFirstNumber() - getSecondNumber();
    }

    public double getMultiplicationResult(){
        return getFirstNumber() * getSecondNumber();
    }

    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }else {
            return getFirstNumber() / getSecondNumber();
        }
    }

}
