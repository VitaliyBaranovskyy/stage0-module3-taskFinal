package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        
        int res = number * 2 + 6 ;
        System.out.println(res);
    }
    
    public static void main(String[] args) {
        NumberReverter main = new NumberReverter();
        main.revert(489);
        
    }  
}
