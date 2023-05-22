public class NewPhoneModel extends MobilePhoneNewType implements Mobile {
    private String modelName;
    private boolean chargerIncluded;
    private boolean headPhonesIncluded;
    public NewPhoneModel(String brand, double displaySize, String chip, int frontCameraPixels,
                         int backCameraPixels, int batteryVolume, String operationSystem, int weight,
                         String modelName, boolean chargerIncluded, boolean headPhonesIncluded) {
       super(brand, displaySize, chip, frontCameraPixels, backCameraPixels, batteryVolume, operationSystem, weight);
       this.modelName = modelName;
       this.chargerIncluded = chargerIncluded;
       this.headPhonesIncluded = headPhonesIncluded;
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
    public void makePhoto() {
        System.out.println("I can do photos");
    }
    @Override
    public void makeVideo() {
        System.out.println("I can do videos");
    }
    @Override
    public void useInternet() {
        System.out.println("I can use Internet");
    }
    @Override
    public void navigateGPS() {
        System.out.println("I can enable GPS and use it for navigation");
    }
    public String setCharger() {
        if (chargerIncluded == true) {
            return "Yes";
        }
        else {
            return "No";
        }
    }
    public String setHeadphones() {
        if (headPhonesIncluded == true) {
            return "Yes";
        }
        else {
            return "No";
        }
    }
    @Override
    public String toString() {
        return "Brand: " + getBrand() +
                "\nModel: " + modelName +
                "\nDisplay size: " + getDisplaySize() +
                "\nOS: " + getOperationSystem() +
                "\nChip: " + getChip() +
                "\nFront camera: " + getFrontCameraPixels() + "px" +
                "\nBack camera: " + getBackCameraPixels() + "px" +
                "\nBattery volume: " + getBatteryVolume() +
                "\nWeight: " + getWeight() +
                "\nCharger included: " + setCharger() +
                "\nHeadphones included: " + setHeadphones();
    }
    public void doAllFunctions() {
        ring();
        text();
        makePhoto();
        makeVideo();
        useInternet();
        navigateGPS();
    }
}
