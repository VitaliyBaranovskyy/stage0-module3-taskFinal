package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        int res = number % 10;
        sum = sum + res ;
        number = number /10 ;
        res = number % 10;
        sum = sum + res;
        number = number / 10 ;
        res = number % 10 ;
        sum = sum + res ;
        number = number /10 ;
        sum = sum + number;
        
        System.out.println(sum);
        
    }
    
    public static void main(String[] args) {
       DigitsSumCalculator main = new DigitsSumCalculator();
        main.calculateSum(2222);
    }  
}
