public class Product {
    String name;
    int price;
    int sum;

    Product(String name, int price, int sum) {
        this.name = name;
        this.price = price;
        this.sum = sum;
    }

    void changePrice(int newPrice) {
        price = newPrice;
        System.out.println("Новая цена: " + price);
    }

    void newSum(int sum) {
        this.sum = this.sum + sum;
        System.out.println("Новое количество: " + this.sum);
    }

    void showProduct() {
        System.out.println("Продукт: " + name);
        System.out.println("Цена: " + price);
        System.out.println("Количество: " + sum);
    }
}

