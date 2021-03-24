package my_project.staty;


import my_project.AnimalInterface;

public class Animal implements AnimalInterface {
    private final String nikName;
    public final int indexHungry;
    private final int animalDistanceRun;
    private final int animalDistanceSwim;
    private  boolean satiety=false;
    private final int TIME = 0;

    Animal(String nikName, int indexHungry, int animalDistanceRun, int animalDistanceSwim, boolean satiety) {
        this.nikName = nikName;
        this.indexHungry = indexHungry;
        this.animalDistanceRun = animalDistanceRun;
        this.animalDistanceSwim = animalDistanceSwim;
        this.satiety = satiety;

    }

    @Override
    public boolean indexHungry(double value) {
        return false;
    }

    @Override
    public boolean run(double value) {
        return animalDistanceRun > value;
    }

    @Override
    public boolean swim(double value) {
        return animalDistanceSwim > value;
    }

    @Override
    public boolean satiety() {
        return false;
    }

    public String getnikName() {
        return nikName;
    }

    public int getIndexHungry() {
        return indexHungry;
    }

    public int getAnimalDistanceRun() {
        return animalDistanceRun;
    }

    public int getAnimalDistanceSwim() {
        return animalDistanceSwim;
    }

    public boolean getsatiety() {
        return satiety;
    }
    public boolean setsatiety() {
        return satiety;
    }

}