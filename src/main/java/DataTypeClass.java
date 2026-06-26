public class DataTypeClass {
    static int age = 25;
    static int age3 = 275;
    static int age4 = age;
    static double price;
    static boolean isEqual;

    static String catName = "Neu";
    static String catName2 = "New";

    static String catName3 = catName + ", " + catName2;
    static String catName4 = catName + "," + catName2;

    public static void main(String[] args) {
        isEqual = age == age3;

        System.out.println(catName == catName2);
    }
private int checkTitle() {
        int a = 10;
        int b = 4;
        return a % b;
}

}


