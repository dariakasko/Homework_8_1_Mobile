// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        NewPhoneModel mobileNew1 = new NewPhoneModel("Samsung", 5.5, "Snapdragon9999", 10,
                40, 3500, "Android", 300, "Galaxy S22 Ultra",
                true, false);
        System.out.println(mobileNew1.toString());
        mobileNew1.doAllFunctions();

        System.out.println("");

        OldPhoneModel oldMobile1 = new OldPhoneModel("Nokia", "3310");
        System.out.println(oldMobile1.toString());
        oldMobile1.text();
        oldMobile1.ring();
    }

}