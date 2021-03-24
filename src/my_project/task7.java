package my_project;

import my_project.staty.Cat;
import my_project.staty.Dog;
import java.util.Scanner;
import my_project.Plate;

public class task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sizeArr = 3;
        int action = 0;
        Cat[] cat = new Cat[sizeArr];// Вначале объявляем массив объектов
        cat[0] = new Cat("Барсик", 50, 200, 0, false); // потом для каждой ячейки массива задаем объект
        cat[1] = new Cat("Мурзик", 90, 150, 5, false);
        cat[2] = new Cat("Дарсик", 60, 300, 0, false);

        Dog[] dog = new Dog[sizeArr];// Вначале объявляем массив объектов
        dog[0] = new Dog("Шарик", 50, 500, 15,false ); // потом для каждой ячейки массива задаем объект
        dog[1] = new Dog("Бобик", 90, 700, 5,false );
        dog[2] = new Dog("Тузик", 60, 900, 20, false );

        Plate plate = new Plate(200);
        int i = 0;

        System.out.println("Кот " + cat[i].getnikName() + " бежит " + (int) cat[i].getAnimalDistanceRun() + " м. " + cat[i + 1].getnikName() + " бежит " + (int) cat[i + 1].getAnimalDistanceRun() + " м." + cat[i + 2].getnikName() + " бежит " + (int) cat[i + 2].getAnimalDistanceRun() + " м.");
        System.out.println("Собака " + dog[i].getnikName() + " бежит " + (int) dog[i].getAnimalDistanceRun() + " м. " + dog[i + 1].getnikName() + " бежит " + (int) dog[i + 1].getAnimalDistanceRun() + " м." + dog[i + 2].getnikName() + " бежит " + (int) dog[i + 2].getAnimalDistanceRun() + " м.");
        System.out.println("Введите дистанцию для бега:");
        int distance = scanner.nextInt();
        for (i = 0; i < cat.length; i++) {

            System.out.print(cat[i].getnikName() + " ");
            if (!cat[i].run(distance)) {
                System.out.println(" не пробежал");
            } else {
                System.out.println(" пробежал");
            }
            System.out.print(dog[i].getnikName() + " ");
            if (!dog[i].run(distance)) {
                System.out.println(" не  пробежал");
            } else {
                System.out.println(" пробежал");
            }
            System.out.println();
        }
        i = 0;
        System.out.println("Кот " + cat[i].getnikName() + " может плыть на  " + (int) cat[i].getAnimalDistanceSwim() + " м. " + cat[i + 1].getnikName() + " может плыть на " + (int) cat[i + 1].getAnimalDistanceSwim() + " м." + cat[i + 2].getnikName() + " может плыть на " + (int) cat[i + 2].getAnimalDistanceSwim() + " м.");
        System.out.println("Собака " + dog[i].getnikName() + " может плыть на " + (int) dog[i].getAnimalDistanceSwim() + " м. " + dog[i + 1].getnikName() + " может плыть на " + (int) dog[i + 1].getAnimalDistanceSwim() + " м." + dog[i + 2].getnikName() + " может плыть на " + (int) dog[i + 2].getAnimalDistanceSwim() + " м.");

        System.out.println("Введите дистанцию для плавания:");
        distance = scanner.nextInt();

        for (i = 0; i < cat.length; i++) {
            System.out.print(cat[i].getnikName() + " ");
            if (!cat[i].swim(distance)) {
                System.out.println(" не проплывет так как не умеет");
            } else {
                System.out.println(" проплыл");
            }
            System.out.print(dog[i].getnikName() + " ");
            if (!dog[i].swim(distance)) {
                System.out.println(" утонул");
            } else {
                System.out.println(" проплыл");
            }
        }
        plate.view();

        for (i = 0; i < cat.length; i++) {
            if (cat[i].getsatiety() == false && cat[i].indexHungry < plate.food){
                cat[i].eat(plate);
              // cat[i].setsatiety() = true;
                System.out.println( cat[i].getnikName() + " поел!");
            } else {
                System.out.println( cat[i].getnikName() + " не поел!");
            }
        }
        plate.view();
        System.out.println("Сколько грамм корма добавить еще в миску?");
        distance = scanner.nextInt();
        plate.increaseFood(action);
        plate.view();






    }
}