public class Main{
    public static void main(String[] args) {


        NewCar new1 = new NewCar(8000.33, "Silver");
        NewCar new2 = new NewCar(8000.33, "Silver");

        UsedCar used1 = new UsedCar(2500, 100000);
        UsedCar used2 = new UsedCar(2500, 100000);

        if (new1.equals(new2)) {
            new1.display();
        }
        else{
            System.out.println("The values of price and color are not equal for both object.");
        }

        if (used1.equals(used2)) {
            used1.display();
        }
        else{
            System.out.println("The values of price and mileage are not equal for both object.");
        }
    }
}
