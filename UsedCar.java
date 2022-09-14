public class UsedCar extends Car{
   private int mileage;


    UsedCar(double cost, int mileage) {
        super(cost);
        this.mileage = mileage;
    }

    public boolean equals(Object obj) {
        UsedCar car = (UsedCar) obj;

        if(car.getPrice() != this.getPrice()){
            return false;
        }
        if(car.mileage != this.mileage){
            return false;
        }

        return true;
    }

    public void display(){
        System.out.printf("price = $%.2f, mileage = %d", this.getPrice(), this.mileage);
    }
}
