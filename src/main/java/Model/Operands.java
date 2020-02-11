package Model;

public class Operands extends OperationsController {

    float num1 , num2;
    float result=0;
    public Operands(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void Calculation(int n)throws CalculationException
    {
        int i=0;
        switch (n)
        {
            case 1 : result = Add(num1,num2);
                break;
            case 2 : result = Subtract(num1,num2);
                break;
            case 3 : result = Multiply(num1,num2);
                break;
            case 4 : result = Divide(num1,num2);
                break;
            default:
                i = 1;
                System.out.println("Invalid Choice!!");
        }
        if(i==0)
            System.out.println("The Result of the Operation is = "+ result);

    }

}
