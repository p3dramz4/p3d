package classi;

public class calcMinus implements ICalculate{

    @Override
    public float calc(float num1, float num2) {
        float sum = num1-num2;
        return sum;
    }
}