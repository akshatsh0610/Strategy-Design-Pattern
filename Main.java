// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Vehicle mersedes = new LuxuryVechile(new LuxuryDrive());
       mersedes.drive();

       Vehicle audi = new SportsVehicle(new LuxuryDrive());
       audi.drive();

       Vehicle bmw=new LuxuryVechile(new NormalDrive());
       bmw.drive();
    }
}