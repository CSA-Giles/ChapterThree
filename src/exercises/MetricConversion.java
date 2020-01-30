package exercises;

import java.util.Scanner;

public class MetricConversion {

    public static void main(String[] args){

        double convertCent;
        double convertLiter;
        double userEntry;
        GetMetric centNum1 = new GetMetric();
        GetMetric litNum1 = new GetMetric();
        GetMetric inchNum1 = new GetMetric();
        GetMetric gallNum1 = new GetMetric();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for conversion>>> ");
        userEntry = input.nextDouble();
        convertCent = convertCentimeters(userEntry);
        convertLiter = convertLiters(userEntry);
        centNum1.setCentimeters(convertCent);
        litNum1.setLiters(convertLiter);
        inchNum1.setInches(userEntry);
        gallNum1.setGallons(userEntry);

        System.out.println(userEntry + " in inches equals " + convertCent + " centimeters,\n" +
                "and in gallons it equals " + convertLiter + " liters.");
        System.out.println(centNum1.getCentimeters() + " centimeter conversion.");
        System.out.println(litNum1.getLiters() + " liter conversion.");
        System.out.println(inchNum1.getInches() + " inch conversion.");
        System.out.println(gallNum1.getGallons() + " gallon conversion.");
    }
    public static double convertCentimeters(double entry){
        double centimeters;
        centimeters = entry * 2.54;
        return centimeters;
    }
    public static double convertLiters(double entry){
        double liters;
        liters = entry * 3.7854;
        return liters;
    }
}
