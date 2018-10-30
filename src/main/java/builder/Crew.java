package builder;

public class Crew implements Builder {

    Meal meal = new Meal();

    @Override
    public void buildMainItem() {
        meal.setMainItem("Main item");
    }

    @Override
    public void buildSideItem() {
        meal.setSideItem("Side item");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Drink");
    }

    @Override
    public void buildToy() {
        meal.setToy("Toy");
    }

    @Override
    public void buildPacking() {
        System.out.println("Packing meal");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
