package ru.learnup.lesson18;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Calculator.class);

    public static void main(String[] args) {

        LOG.debug("Start our program...");

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        Calculator calculator = context.getBean(Calculator.class);

        System.out.println();
        System.out.printf("Результат сложения 3 и 6: %d\n", calculator.sum(3, 6));
        System.out.printf("Резултат вычитания 6 из 13: %d\n", calculator.subtract(13, 6));
        System.out.printf("Результат деления 21 на 7: %d\n", calculator.divide(21, 7));
        System.out.printf("Результат умножения 5 на 3: %d\n", calculator.multiply(5, 3));
        System.out.println();

        LOG.debug("Program ended successfully.");
    }
}
