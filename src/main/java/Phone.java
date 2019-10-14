public class Phone {

    private Calculator calculator;

    public Phone(Calculator calculator){
        this.calculator = calculator;
    }

    public int sum(int a, int b){
        return this.calculator.sum(a, b);
    }

}
