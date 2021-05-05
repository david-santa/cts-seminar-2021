package santa.david.g1087.decorator;

public class DecoratorArgumentD implements InterfataArgumentD {
    private ArgumentD argumentD;

    public DecoratorArgumentD(InterfataArgumentD argument) {
        this.argumentD = (ArgumentD) argument;
    }

    @Override
    public String decorate() {
        return argumentD.decorate();
    }
}
