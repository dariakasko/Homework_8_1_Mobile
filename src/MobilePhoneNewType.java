public abstract class MobilePhoneNewType {
    private String brand;
    private double displaySize;
    private  String chip;
    private  int frontCameraPixels;
    private int backCameraPixels;
    private int batteryVolume;
    private String operationSystem;
    private int weight;
    public MobilePhoneNewType(String brand, double displaySize, String chip, int frontCameraPixels,
                              int backCameraPixels, int batteryVolume, String operationSystem, int weight) {
        this.brand = brand;
        this.displaySize = displaySize;
        this.chip = chip;
        this.frontCameraPixels = frontCameraPixels;
        this.backCameraPixels = backCameraPixels;
        this.batteryVolume = batteryVolume;
        this.operationSystem = operationSystem;
        this.weight = weight;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return this.brand;
    }
    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }
    public double getDisplaySize() {
        return this.displaySize;
    }
    public void setChip(String chip) {
        this.chip = chip;
    }
    public String getChip() {
        return this.chip;
    }
    public void setFrontCameraPixels(int frontCameraPixels) {
        this.frontCameraPixels = frontCameraPixels;
    }
    public int getFrontCameraPixels() {
        return this.frontCameraPixels;
    }
    public void setBackCameraPixels(int backCameraPixels) {
        this.backCameraPixels = backCameraPixels;
    }
    public int getBackCameraPixels() {
        return this.backCameraPixels;
    }
    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }
    public int getBatteryVolume() {
        return this.batteryVolume;
    }
    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }
    public String getOperationSystem() {
        return this.operationSystem;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return this.weight;
    }
    public abstract void makePhoto();
    public abstract void makeVideo();
    public abstract void useInternet();
    public abstract void navigateGPS();
}
