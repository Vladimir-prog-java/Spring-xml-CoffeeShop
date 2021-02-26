package ru.itsjava.service;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import ru.itsjava.domain.Coffee;

@RequiredArgsConstructor
public class ServiceCoffeeImpl implements ServiceCoffee {
    private final ServiceMenu menuService;
    private final ServiceScanner scannerService;

    @SneakyThrows
    @Override
    public void printCoffee() {
        menuService.menu("src/main/resources/price.txt");

        Coffee coffee;
        while (true) {
            int price = scannerService.readPrice();
            if (price == 70) {
                coffee = new Coffee("Эспрессо");
                System.out.println("Вы выбрали " + coffee);
                System.out.print("Спасибо за Ваш заказ!");
                //return coffee;
            } else if (price == 90) {
                coffee = new Coffee("Американо");
                System.out.println("Вы выбрали " + coffee);
                System.out.print("Спасибо за Ваш заказ!");
               // return coffee;
            } else if (price == 110) {
                coffee = new Coffee("Капучино");
                System.out.println("Вы выбрали " + coffee);
                System.out.print("Спасибо за Ваш заказ!");
               // return coffee;
            } else {
                System.out.println("Выберите снова!");
            }
        }
    }
}
