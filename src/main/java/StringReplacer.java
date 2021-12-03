public class StringReplacer implements StringTransformer, StringTranformerUndo{
    char a, x;

    public StringReplacer(char a, char x) {
        this.a = a;
        this.x = x;
    }

    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(a,x));
    }

    @Override
    public void undo(StringDrink drink) {
        drink.setText(drink.getText().replace(x,a));
    }
}
