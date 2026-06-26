public class HomeTask {
    public static void main(String[] args) {
        //Задание 1
        String text = "Automation";
        System.out.println(text.length());

        //Задание 2
        String language = "Java";
        char first = language.charAt(0);
        char last = language.charAt(language.length() - 1);
        System.out.println(first);
        System.out.println(last);

        //Задание 3
        String str1 = "I love Selenium";
        System.out.println(str1.contains("Selenium"));

        //Задание 4
        String str2 = "java";
        System.out.println(str2.toUpperCase());

        //Задание 5
        String str3 = "I love Java";
        System.out.println(str3.replace("Java", "Kotlin"));

        //Задание 6
        String strJava = "Java";
        String strKotlin = "Kotlin";
        System.out.println(strJava == strKotlin);

        //Задание 7
        //возраста человека: int/byte
        //температуры тела: double
        //цены товара с копейками: double/long
        //признака авторизации пользователя: boolean
        //количества жителей на Земле: long

        //Задание 8
        // int age = 25.5; //Некорректный тип переменной. Сейчас int, должно быть double

        boolean isAdmin = true; // Необходимо присвоить переменной isAdmin знаяение false
        System.out.println(isAdmin);

        //Задание 9
        int int1 = 15;
        int int2 = 4;
        int int3 = int1 % int2;
        System.out.println(int3);

        //Задание 10
        int b = 0;
        b = 5 / 2;
        System.out.print(b);
    }

    //Задание 11
    public class DeclareVariables {
        private static String customerName = "Sasha";
        private static int cupsOfCoffee = 1;
        private static double costOfCoffee = 99.9;
        private static boolean tip = true;

        public static String declareVariables() {
            String response = "";
            response = "Dear " + customerName + ", thank you for supporting our business!\n"
                    + "Cups of coffee bought: " + cupsOfCoffee + ".Cost of 1 cup of coffee: $"
                    + costOfCoffee + ".Your total is: $99.9.Tip is included? " + tip + ".";
            return response;
        }

        public static void main(String[] args) {
            System.out.println(declareVariables());

        }
    }

    //Задание 12
    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello, world!");
        }
    }
}

