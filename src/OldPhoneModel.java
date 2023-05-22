public class OldPhoneModel extends MobilePhoneOldType implements Mobile{
    private String modelName;

    public OldPhoneModel(String brand, String modelName) {
        super(brand);
        this.modelName = modelName;
    }

    @Override
    public void ring() {
        System.out.println("I can ring");
    }
    @Override
    public void text(){
        System.out.println("I can send and receive text messages");
    }

    @Override
    public String toString() {
        return "Brand: " + getBrand() +
                "\nModel: " + modelName;
    }
}
