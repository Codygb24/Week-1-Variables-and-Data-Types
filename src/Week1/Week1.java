package Week1;

public class Week1 {
  public static void main(String[] args) {
    double jeepSoftTopPrice = 2000.00;
    double debitCardBalance = 3000.59385996576;
    int tireSize = 17 + 18;
    int jeepWeight = 3970;
    char directionIAmGettingLostIn = 'W';
    String lastKnownLocation = "Maob, UT";
    float engineSize = 2.0f;

    debitCardBalance -= jeepSoftTopPrice;
    String price = String.format("%.2f", jeepSoftTopPrice);
    String balance = String.format("%.2f", debitCardBalance);

    System.out.println("After buying a soft top for $" + price
        + ", my balance is $" + balance);

    double tireWeight = jeepWeight / 4.0;
    System.out.println("Tire weight=" + tireWeight);

    System.out.println("I am heading " + directionIAmGettingLostIn + " from "
        + lastKnownLocation);
    
    int age = 2350;
    byte myAge = (byte)age;
    System.out.println("myAge=" + myAge);
  }
}