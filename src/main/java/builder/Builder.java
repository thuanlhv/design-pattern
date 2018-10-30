package builder;

public interface Builder {
    void buildMainItem();
    void buildSideItem();
    void buildDrink();
    void buildToy();
    void buildPacking();
    Meal getMeal();
}
