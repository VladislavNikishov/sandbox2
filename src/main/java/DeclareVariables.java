public class DeclareVariables {
    private static String customerName = "Sasha";
    private static int cupsOfCoffee = 1;
    private static double costOfCoffee = 99.9;
    private static boolean tip = true;

    public static String declareVariables() {
        String response = "";
        response = "Dear " + customerName + ", thank you for supporting our business!\n"
                + "Cups of coffee bought: " + cupsOfCoffee + ".Cost of 1 cup of coffee: $"
                + costOfCoffee + ".\nYour total is: $99.9.\nTip is included? " + tip + ".";
        return response;
    }

    public static void main(String[] args) {
        System.out.println(declareVariables());

    }
}