package santa.david.g1087.decorator;

public class ArgumentD implements InterfataArgumentD {
    String tip = "pro";//pro sau contra

    public ArgumentD(String tip) {
        this.tip = tip;
    }

    @Override
    public String decorate() {
        return "Argument " + tip;
    }
}
