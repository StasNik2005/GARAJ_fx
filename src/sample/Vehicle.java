package sample;

public class Vehicle {
    float price;
    int speed;
    int god;

    public Vehicle(float price, int speed, int god) {
        this.price = price;
        this.speed = speed;
        this.god = god;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                ", speed=" + speed +
                ", god=" + god +
                '}';
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price>0?price:-1;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(this.speed>0){
            this.speed = speed;
        }else{
            this.speed = -1;
        }
    }

    public int getGod() {
        return god;
    }

    public void setGod(int god) {
        if(this.god<1900){
            this.god = -1;
        }else{
            this.god = god;
        }
    }
}
