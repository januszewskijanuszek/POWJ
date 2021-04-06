package pl.edu.pjwstk.zadanie5;

public class Zawodnik {
    private Car car;
    private double distance;
    private double speed;
    private double meterPerSecond;
    private int timeCounter;

    public Zawodnik(Car car) {
        this.car = car;
        this.distance = 0;
        this.speed = 0;
        this.meterPerSecond = 0;
        this.timeCounter = 0;
    }

    public void present(){
        System.out.println("Siema jeźdze " + car.getName() + ", co ciśnie " + car.getMaxVelocity() + "km/h i ma " + car.getHorsePower() + " koni mechanicznych");
    }

    public void go(int timeInSeconds){
        this.meterPerSecond = (car.getAcceleration() / 3.6) * timeInSeconds;
        if(this.meterPerSecond >= car.getMaxVelocity() / 3.6) {
            int totalTime = timeInSeconds - this.timeCounter;
            this.meterPerSecond = car.getMaxVelocity() / 3.6;
            double buffer = this.distance;
            this.distance = (car.getMaxVelocity() / 3.6) * totalTime;
            this.distance = this.distance + buffer;
        }
        else{
            this.timeCounter++;
            this.distance = (car.getAcceleration()*Math.pow(timeInSeconds, 2))/2;
        }
        System.out.println(car.getName() + " jedzie z prędkością " + this.meterPerSecond * 3.6 + "km/h i prazebył dystans - " + this.distance + "m");
    }

    public boolean win(int distanceRace){
        if(distanceRace < this.distance){
            System.out.print("Wygrał: "+ car.getName());
            return true;
        }
        return false;
    }

    public Car getCar() {
        return car;
    }

    public double getDistance() {
        return distance;
    }

    public double getSpeed() {
        return speed;
    }
}
