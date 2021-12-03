public class HumanClient implements Client{
    OrderingStrategy orderingStrategy;
    public HumanClient(OrderingStrategy strategy) {
    orderingStrategy = strategy;
    }

    @Override
    public void happyHourStarted(Bar bar) {
        orderingStrategy.happyHourStarted((StringBar) bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {
        orderingStrategy.happyHourEnded((StringBar) bar);
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        orderingStrategy.wants(drink,recipe,bar);
    }
}
