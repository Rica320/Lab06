public class StringCaseChanger implements StringTransformer, StringTranformerUndo{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder stringBuilder = new StringBuilder(drink.getText());
        for (int i = 0; i < drink.getText().length(); i++) {
            if (Character.isLowerCase(stringBuilder.charAt(i))) {
                stringBuilder.setCharAt(i, Character.toUpperCase(stringBuilder.charAt(i)));
            }
            else {
                stringBuilder.setCharAt(i, Character.toLowerCase(stringBuilder.charAt(i)));
            }
        }
        drink.setText(stringBuilder.toString());
    }

    // Undo the Undo  ?... to be more certain of the behaviour i could have copy past and changed a few things
    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
