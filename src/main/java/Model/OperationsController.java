package Model;

public class OperationsController implements Operations{

    public float Add(float a, float b) {
        return a+b;
    }

    public float Subtract(float a, float b) {
        return a-b;
    }

    public float Multiply(float a, float b) {
        return a*b;
    }

    public float Divide(float a, float b) {
        return a/b;
    }
}
