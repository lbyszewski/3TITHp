package src;

public class TestClass {


    public double Silnia(double n){
        if(n == 0 ){
            return 1;
        } else {
            return  n*Silnia(n-1);
        }
    }
}
