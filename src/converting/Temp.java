package converting;

import java.util.Scanner;

public class Temp {

    public static void main(String[] args){
        double convertF;
        double celsiusEntry;
        GetStuff celsiusNum1 = new GetStuff();
        GetStuff fahrNum1 = new GetStuff();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a temperature in celsius>>> ");
        celsiusEntry = input.nextDouble();

        convertF = convertFahrenheit(celsiusEntry);
        celsiusNum1.setCelsiusTemp(celsiusEntry);
        fahrNum1.setFahrenheitTemp(convertF);
        System.out.println("The temperature in fahrenheit is " + convertF + " degrees.");

        System.out.println(celsiusNum1.getCelsiusTemp()+ " celsius temperature.");
        System.out.println(fahrNum1.getFahrenheitTemp()+ " fahrenheit temperature.");
    }
    public static double convertFahrenheit(double cels){

        double convertF;
        convertF = (cels * 9/5) + 32;
        return convertF;
    }
}
