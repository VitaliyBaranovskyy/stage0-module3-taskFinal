package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        
        System.out.println(number>=0);

    }
    
    public static void main(String[] args) {
        NumbersPrinter main = new NumbersPrinter() ;
        main.printIsPositive(5);
        
    }
}
