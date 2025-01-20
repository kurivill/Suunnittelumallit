package View;


public class BFactory extends UIFactory{

    @Override
    public TextFieldAbstract createTextField(String text) {
        return new TextFieldB(text);
    }

    @Override
    public CheckBoxAbstract createCheckBox(String text) {
        return new CheckBoxB(text);
    }

    @Override
    public ButtonAbstract createButton(String text) {
        return new ButtonB(text);
    }
}
