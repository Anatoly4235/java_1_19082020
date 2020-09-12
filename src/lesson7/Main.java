package lesson7;


public class Main {
    public static void main(String[] args) {
        int food = 10;
        int giveFood = 10;
        Cat[] cats = {
                new Cat("Barsik", 10, 0),
                new Cat("Tusik", 15, 0),
//                new Cat("Murka", 15, 0),
                new Cat("Mursik", 15, 0)
        };


        Plate plate = new Plate(food);
        plate.giveFood(giveFood);




        for (int i = 0; i < cats.length; i++) {

            cats[i].hungryCat();
            cats[i].eat(plate);
            System.out.println(plate);
            cats[i].hungryCat();

        }

    }


}
