package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        
        double fahrenheit = 32 + temperatureCelsius * 1.8 ;
        System.out.println(fahrenheit);
    }
    
    public static void main(String[] args) {
     TemperatureConverter main = new TemperatureConverter();
        main.toFahrenheit(11);
        
    }
}
