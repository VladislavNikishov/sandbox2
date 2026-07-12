public class Main {
    public static void main(String[] args) {
        // Задание 1
        Book book = new Book("Title", "Author", 988);
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.pages);

        // Задание 2
        BankAccount ac1 = new BankAccount(1000, "Name", 321312);

        ac1.deposit(1000);
        System.out.println("После пополнения: ");
        ac1.showBalance();

        ac1.withdraw(100);
        System.out.println("После снятия: ");
        ac1.showBalance();

        // Задание 3
        Rectangle rectangle = new Rectangle(1, 1);

        rectangle.area();
        rectangle.perimeter ();

        // Задание 4
        Product product = new Product("Tomato", 3223, 333);

        product.showProduct();

        System.out.println("После изменения: ");
        product.newSum(2222);
        product.changePrice(3232);

    }
}