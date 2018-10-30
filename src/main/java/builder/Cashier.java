package builder;

public class Cashier {
    Builder builder;

    public Cashier(Builder builder) {
        this.builder = builder;
    }

    public void constructMeal() {
        builder.buildMainItem();
        builder.buildSideItem();
        builder.buildDrink();
        builder.buildToy();
        builder.buildPacking();
    }
}
