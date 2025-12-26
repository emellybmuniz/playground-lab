package ex002;

public class Car {
    private boolean isEngineOn;
    private int gear;
    private int speed;

    public Car() {
        this.isEngineOn = false;
        this.gear = 0; 
        this.speed = 0;
    }

    public String startEngine() {
        if (!isEngineOn) {
            this.isEngineOn = true;
            return "Engine started!";
        }
        return "Engine is already running.";
    }

    public String turnOffEngine() {
        if (isEngineOn) {
            if (gear == 0 && speed == 0) {
                this.isEngineOn = false;
                return "Engine turned off.";
            } else {
                return "Cannot turn off engine unless in neutral (gear 0) and speed is 0 km/h.";
            }
        }
        return "Engine is already off.";
    }

    public String accelerate() {
        if (isEngineOn) {
            if (gear == 0) {
                return "Cannot accelerate in neutral. Change to gear 1 first.";
            }

            int newSpeed = this.speed + 1;

            if ((gear == 1 && newSpeed > 20) ||
                (gear == 2 && newSpeed > 40) ||
                (gear == 3 && newSpeed > 60) ||
                (gear == 4 && newSpeed > 80) ||
                (gear == 5 && newSpeed > 100) ||
                (gear == 6 && newSpeed > 120)) {
                return "Speed limit for gear " + gear + " reached. Change gear to accelerate further.";
            }

            if (newSpeed > 120) {
                return "Maximum speed of 120 km/h reached.";
            }

            this.speed = newSpeed;
            return "Accelerated. Current speed: " + this.speed + " km/h.";
        }
        return "Engine is off. Cannot accelerate.";
    }

    public String decelerate() {
        if (isEngineOn) {

            int newSpeed = this.speed - 1;

            if (this.speed == 0) {
                return "Car is already stopped.";
            }

            this.speed = Math.max(0, newSpeed);

            if (this.speed == 0) {
                this.gear = 0;
                return "Decelerated. Car stopped. Gear is now Neutral (0).";
            }

            return "Decelerated. Current speed: " + this.speed + " km/h.";
        }
        return "Engine is off. Cannot decelerate.";
    }

    public String changeGearUp() {
        if (!isEngineOn) return "Engine is off. Cannot change gear.";
        if (gear >= 6) return "Already in the highest gear (6).";

        int newGear = this.gear + 1;

        if ((newGear == 1 && speed == 0) || 
            (newGear == 2 && speed >= 20) ||
            (newGear == 3 && speed >= 40) ||
            (newGear == 4 && speed >= 60) ||
            (newGear == 5 && speed >= 80) ||
            (newGear == 6 && speed >= 100)) {
            this.gear = newGear;
            return "Shifted up to gear " + this.gear + ".";
        }
        return "Cannot shift up. Speed is too low for gear " + newGear + ".";
    }

    public String changeGearDown() {
        if (!isEngineOn) return "Engine is off. Cannot change gear.";
        if (gear <= 0) return "Already in neutral.";

        int newGear = this.gear - 1;

        if ((newGear == 0 && speed == 0) ||
            (newGear == 1 && speed <= 20) ||
            (newGear == 2 && speed <= 40) ||
            (newGear == 3 && speed <= 60) ||
            (newGear == 4 && speed <= 80) ||
            (newGear == 5 && speed <= 100)) {
            this.gear = newGear;
            return "Shifted down to gear " + this.gear + ".";
        }
        return "Cannot shift down. Speed is too high for gear " + newGear + ".";
    }

    public String turnLeft() {
        if (isEngineOn) {
            if (speed >= 1 && speed <= 40) {
                return "Turned left.";
            } else {
                return "Cannot turn left at current speed (" + speed + " km/h). Speed must be between 1 and 40 km/h.";
            }
        }
        return "Engine is off. Cannot turn left.";
    }

    public String turnRight() {
        if (isEngineOn) {
            if (speed >= 1 && speed <= 40) {
                return "Turned right.";
            } else {
                return "Cannot turn right at current speed (" + speed + " km/h). Speed must be between 1 and 40 km/h.";
            }
        }
        return "Engine is off. Cannot turn right.";
    }

    public String checkStatus() {
        return "Status: Speed= " + speed + " km/h, Gear= " + gear + ", Engine= " + (isEngineOn ? "On" : "Off");
    }

    public int getGear() {
        return gear;
    }
    
}
