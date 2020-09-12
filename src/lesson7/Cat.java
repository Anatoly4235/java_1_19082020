package lesson7;


public class Cat {
    private String name;
    private int amount;
    private int countEat;


    public Cat(int countEat) {
        this.countEat = countEat;
    }


    public Cat(String name, int amount, int countEat) {
        this.name = name;
        this.amount = amount;
        this.countEat = countEat;

    }

    public void hungryCat() {
        if (countEat < amount) {
            System.out.println("Кот " + name + " голоден");
        } else {
            System.out.println("Кот " + name + " сыт");
        }
    }


    public void eat(Plate plate) {
        System.out.println("Кот " + name + " ест...");

        plate.decreaseFood(amount);


        countEat = countEat + amount;
        System.out.println(countEat);

    }


}


