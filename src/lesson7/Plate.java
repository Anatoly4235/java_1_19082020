package lesson7;

public class Plate {
    public int food;


    public Plate(int food) {
        this.food = food;

    }


    public void giveFood(int give) {
        this.food = this.food + give;

    }


    public void decreaseFood(int amount) {


        if (food <= amount) {
            System.out.println("Еды слишком мало, коты останутся голодными");

        } else {

            food -= amount;
        }


    }



    @Override
    public String toString() {
        return "В тарелке{" +
                "осталось еды=" + food +
                '}';

    }
}
