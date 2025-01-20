package View;

public class AFactory extends UIFactory{


    @Override
    public TextFieldAbstract createTextField(String text) {
        return new TextFieldA(text);
    }

    @Override
    public CheckBoxAbstract createCheckBox(String text) {
        return new CheckBoxA(text);
    }

    @Override
    public ButtonAbstract createButton(String text) {
        return new ButtonA(text);
    }
}
