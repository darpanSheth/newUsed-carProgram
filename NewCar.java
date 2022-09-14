public class NewCar extends Car {
     private String color;

    NewCar(double cost, String color) {
        super(cost);
        this.color = color;
    }

    public boolean equals(Object obj) {
        NewCar car = (NewCar) obj;

        if(car.getPrice() != this.getPrice()){
            return false;
        }
        if(!car.color.equals(this.color)){
            return false;
        }

        return true;
    }

    public void display(){
        System.out.printf("price = $%.2f, color = %s \n", this.getPrice(), this.color);
    }
}
