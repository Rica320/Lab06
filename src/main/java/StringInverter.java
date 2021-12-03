public class StringInverter implements StringTransformer, StringTranformerUndo{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder stringBuilder = new StringBuilder(drink.getText());
        stringBuilder.reverse();
        drink.setText(stringBuilder.toString());
    }

    @Override
    public void undo(StringDrink drink) {
        execute(drink); // Does this make sense ?
    }
}
