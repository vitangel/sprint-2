import model.Apple;
import model.Meat;
import model.Food;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        //
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        // Создание массива
        Food[] items = {meat, redApple, greenApple};

        // Создание корзины
        ShoppingCart cart = new ShoppingCart(items);

        // Вычисление и вывод результатов
        System.out.printf("Общая сумма товаров без скидки: %.2f руб.%n", cart.getTotalPrice());
        System.out.printf("Общая сумма товаров со скидкой: %.2f руб.%n", cart.getTotalPriceWithDiscount());
        System.out.printf("Сумма всех вегетарианских продуктов без скидки: %.2f руб.%n", cart.getTotalVegetarianPrice());
    }
}