import java.util.List;

public class StringRecipe {
    List<StringTransformer> stringTransformers;

    public StringRecipe(List<StringTransformer> transformers) {
        this.stringTransformers = transformers;
    }

    public void mix(StringDrink drink) {
        for (StringTransformer stringTransformer: stringTransformers) {
            stringTransformer.execute(drink);
        }
    }
}
