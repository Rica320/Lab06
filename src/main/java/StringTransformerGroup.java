import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    List<StringTransformer> transformers;

    public StringTransformerGroup(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    public void execute(StringDrink drink) {
        for (StringTransformer stringTransformer: transformers) {
            stringTransformer.execute(drink);
        }
    }


}
