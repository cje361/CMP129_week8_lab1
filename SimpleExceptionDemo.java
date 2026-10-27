public class SimpleExceptionDemo {

    public static void safeDivide(int numerator, int denominator ){

        try {
            int dividend = numerator / denominator;
            System.out.println(dividend);
        }catch(ArithmeticException e){
            System.out.println("Can't divide by a zero");
        }finally{
            System.out.println("Division operation is complete");
        }
    }

    public static void main(String[] args) {
        safeDivide(15, 5);
        safeDivide(10, 0);
        safeDivide(19, 2);
    }

}
