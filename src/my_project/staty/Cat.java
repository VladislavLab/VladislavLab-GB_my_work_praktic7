package my_project.staty;
import my_project.Plate;
import my_project.staty.Animal;
public class Cat extends Animal {

    public Cat(String nikName, int indexHungry,  int animalDistanceRun, int animalDistanceSwim,boolean satiety) {
        super(nikName, indexHungry,  animalDistanceRun, animalDistanceSwim,satiety);
    }
    public void eat(Plate p) {
        p.decreaseFood(indexHungry);
    }
}
