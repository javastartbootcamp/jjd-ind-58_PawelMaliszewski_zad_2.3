package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Ingredient ingredient1 = new Ingredient();
        ingredient1.name = "woda";
        ingredient1.quantity = 100;

        Ingredient ingredient2 = new Ingredient();
        ingredient2.name = "sok cytrynowy";
        ingredient2.quantity = 50;

        Ingredient ingredient3 = new Ingredient();
        ingredient3.name = "wódka";
        ingredient3.quantity = 60;

        Ingredient ingredient4 = new Ingredient();
        ingredient4.name = "cola";
        ingredient4.quantity = 150;

        Ingredient ingredient5 = new Ingredient();
        ingredient5.name = "whiskey";
        ingredient5.quantity = 50;

        Drink drink1 = new Drink();
        drink1.name = "Mojito";
        drink1.price = 13;
        drink1.includingAlkohol = true;
        drink1.ingredient1 = ingredient1.quantity;
        drink1.ingredient2 = ingredient2.quantity;
        drink1.ingredient3 = ingredient3.quantity;

        int drink1sumOfAllIngredientsInMiliLiters =
                drink1.ingredient1
                + drink1.ingredient2
                + drink1.ingredient3;

        String drink1Info =
                "Drink: " + drink1.name + "\n"
                + "Cena: " + drink1.price + "zł\n"
                + "Czy zawiera alkohol? " + drink1.includingAlkohol + "\n"
                + "Składniki:\n"
                + ingredient1.name + "\n"
                + ingredient2.name + "\n"
                + ingredient3.name + "\n"
                + "Pojemność: " + drink1sumOfAllIngredientsInMiliLiters + "ml";

        Drink drink2 = new Drink();
        drink2.name = "Lemoniada";
        drink2.price = 5.60;
        drink2.includingAlkohol = false;
        drink2.ingredient1 = ingredient1.quantity;
        drink2.ingredient2 = ingredient2.quantity;

        int drink2sumOfAllIngredientsInMiliLiters =
                drink2.ingredient1
                + drink2.ingredient2;

        String drink2Info =
                "Drink: " + drink2.name + "\n"
                + "Cena: " + drink2.price + "zł\n"
                + "Czy zawiera alkohol? " + drink2.includingAlkohol + "\n"
                + "Składniki:\n"
                + ingredient1.name + "\n"
                + ingredient2.name + "\n"
                + "Pojemność: " + drink2sumOfAllIngredientsInMiliLiters + "ml";

        Drink drink3 = new Drink();
        drink3.name = "Whiskey z colą";
        drink3.price = 25;
        drink3.includingAlkohol = true;
        drink3.ingredient4 = ingredient4.quantity;
        drink3.ingredient5 = ingredient5.quantity;

        int drink3sumOfAllIngredientsInMiliLiters =
                drink3.ingredient4
                + drink3.ingredient5;

        String drink3Info =
                "Drink: " + drink3.name + "\n"
                        + "Cena: " + drink3.price + "zł\n"
                        + "Czy zawiera alkohol? " + drink1.includingAlkohol + "\n"
                        + "Składniki:\n"
                        + ingredient4.name + "\n"
                        + ingredient5.name + "\n"
                        + "Pojemność: " + drink3sumOfAllIngredientsInMiliLiters + "ml";

        System.out.println(drink1Info);
        System.out.println("-------------------------------------------");
        System.out.println(drink2Info);
        System.out.println("-------------------------------------------");
        System.out.println(drink3Info);

    }
}
