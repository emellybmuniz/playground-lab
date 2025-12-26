package ex003;

public class WashingMachine {
    private static final int MAX_WATER = 30;
    private static final int MAX_SHAMPOO = 10;
    private static final int WASH_WATER_COST = 10;
    private static final int WASH_SHAMPOO_COST = 2;
    private static final int CLEAN_WATER_COST = 3;
    private static final int CLEAN_SHAMPOO_COST = 1;
    private static final int REFILL_AMOUNT = 2;
    // Finals again for here... 

    private int washedPetsCounter;
    private boolean isPetInside;
    private boolean needsCleaning;
    private int waterLevel;
    private int shampooLevel;

    public WashingMachine() {
        this.washedPetsCounter = 0;
        this.isPetInside = false;
        this.needsCleaning = false;
        this.waterLevel = 0;
        this.shampooLevel = 0;
    }

    public void washPet() {
        if (!isPetInside) {
            System.out.println("No pet inside the machine. Please place a pet inside first.");
            return;
        }
        if (needsCleaning) {
            System.out.println("Machine is dirty and must be cleaned before washing.");
            return;
        }
        if (waterLevel < WASH_WATER_COST) {
            System.out.println("Not enough water to wash the pet. Please refill water.");
            return;
        }
        if (shampooLevel < WASH_SHAMPOO_COST) {
            System.out.println("Not enough shampoo to wash the pet. Please refill shampoo.");
            return;
        }

        waterLevel -= WASH_WATER_COST;
        shampooLevel -= WASH_SHAMPOO_COST;
        washedPetsCounter++;
        isPetInside = false;
        needsCleaning = false;
        System.out.println(
                "Pet washed successfully and removed from the machine. Total pets washed: " + washedPetsCounter);
    }

    public void refillWater() {
        if (waterLevel >= MAX_WATER) {
            System.out.println("Water tank is already full.");
            return;
        }
        this.waterLevel = Math.min(MAX_WATER, this.waterLevel + REFILL_AMOUNT);
        System.out.println("Water refilled. Current level: " + this.waterLevel + "L");
    }

    public void refillShampoo() {
        if (shampooLevel >= MAX_SHAMPOO) {
            System.out.println("Shampoo tank is already full.");
            return;
        }
        this.shampooLevel = Math.min(MAX_SHAMPOO, this.shampooLevel + REFILL_AMOUNT);
        System.out.println("Shampoo refilled. Current level: " + this.shampooLevel + "L");
    }

    public void placePetInside() {
        if (isPetInside) {
            System.out.println("A pet is already inside the machine.");
            return;
        }
        if (needsCleaning) {
            System.out.println("Machine must be cleaned before another pet can be placed inside.");
            return;
        }
        isPetInside = true;
        System.out.println("Pet placed inside the machine. Ready to wash!");
    }

    public void removePet() {
        if (!isPetInside) {
            System.out.println("There is no pet inside the machine to remove.");
            return;
        }
        isPetInside = false;
        needsCleaning = true;
        System.out.println("Pet removed without washing. The machine now needs to be cleaned.");
    }

    public void cleanMachine() {
        if (!needsCleaning) {
            System.out.println("The machine is already clean.");
            return;
        }
        if (isPetInside) {
            System.out.println("Cannot clean the machine while a pet is inside.");
            return;
        }
        if (waterLevel < CLEAN_WATER_COST) {
            System.out.println("Not enough water to clean the machine.");
            return;
        }
        if (shampooLevel < CLEAN_SHAMPOO_COST) {
            System.out.println("Not enough shampoo to clean the machine.");
            return;
        }

        waterLevel -= CLEAN_WATER_COST;
        shampooLevel -= CLEAN_SHAMPOO_COST;
        needsCleaning = false;
        System.out.println("Machine has been cleaned.");
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public int getShampooLevel() {
        return shampooLevel;
    }

    public String getStatus() {
        String status = "Water: " + waterLevel + "/" + MAX_WATER + "L | Shampoo: " + shampooLevel + "/" + MAX_SHAMPOO
                + "L";
        status += " | Pet Inside: " + (isPetInside ? "Yes" : "No");
        status += " | Needs Cleaning: " + (needsCleaning ? "Yes" : "No");
        return status;
    }

    public boolean isPetInside() {
        return isPetInside;
    }
}
