import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{

    List<StringDrink> drinkList;
    List<StringRecipe> recipes;

    SmartStrategy() {
        drinkList = new ArrayList<>();
        recipes = new ArrayList<>();
    }
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (!bar.isHappyHour()) {
            drinkList.add(drink);
            recipes.add(recipe);
        }else {
            bar.order(drink, recipe);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for (int i = 0; i < drinkList.size(); i++) {
            bar.order(drinkList.get(i), recipes.get(i));
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {
    }
}
