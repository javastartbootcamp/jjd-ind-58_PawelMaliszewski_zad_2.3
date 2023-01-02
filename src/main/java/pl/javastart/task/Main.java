package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Drink water = new Drink();
        water.name = "woda";
        water.quantityInMl = 100;

        Drink juice = new Drink();
        juice.name = "sok cytrynowy";
        juice.quantityInMl = 50;

        Drink alkohol = new Drink();
        alkohol.name = "wódka";
        alkohol.quantityInMl = 60;

        Drink drink1 = new Drink();
        drink1.name = "Mojito";
        drink1.price = 13;
        drink1.includingAlkohol = true;
        drink1.water = water.quantityInMl;
        drink1.juice = juice.quantityInMl;
        drink1.alkohol = alkohol.quantityInMl;

        int drink1sumOfAllIngredientsInMiliLiters =
                drink1.water
                + drink1.juice
                + drink1.alkohol;

        String drink1Info =
                "Drink: " + drink1.name + "\n"
                + "Cena: " + drink1.price + "zł\n"
                + "Czy zawiera alkohol? " + drink1.includingAlkohol + "\n"
                + "Składniki:\n"
                + water.name + "\n"
                + juice.name + "\n"
                + alkohol.name + "\n"
                + "Pojemność: " + drink1sumOfAllIngredientsInMiliLiters + "ml";

        Drink drink2 = new Drink();
        drink2.name = "Lemoniada";
        drink2.price = 5.60;
        drink2.includingAlkohol = false;
        drink2.water = water.quantityInMl;
        drink2.juice = juice.quantityInMl;

        int drink2sumOfAllIngredientsInMiliLiters =
                drink2.water
                + drink2.juice;

        String drink2Info =
                "Drink: " + drink2.name + "\n"
                + "Cena: " + drink2.price + "zł\n"
                + "Czy zawiera alkohol? " + drink2.includingAlkohol + "\n"
                + "Składniki:\n"
                + water.name + "\n"
                + juice.name + "\n"
                + "Pojemność: " + drink2sumOfAllIngredientsInMiliLiters + "ml";

        System.out.println(drink1Info);
        System.out.println("-------------------------------------------");
        System.out.println(drink2Info);

    }
}
