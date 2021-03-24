package my_project;

public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void increaseFood(int x) {
        food += x;
    }
    public void view() {
        System.out.println("Всего еды: " + food);
    }
}