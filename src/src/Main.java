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
        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPrice() + " руб.");
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount() + " руб.");
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getTotalVegetarianPrice() + " руб.");
    }
}