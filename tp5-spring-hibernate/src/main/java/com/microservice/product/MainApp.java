package com.microservice.product;

import com.microservice.product.config.AppConfig;
import com.microservice.product.entity.Product;
import com.microservice.product.service.ProductServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductServiceImpl productService = context.getBean(ProductServiceImpl.class);

        Product p1 = new Product("Laptop Dell XPS", 14500.0, 10);
        Product p2 = new Product("Souris Logitech MX Master", 850.0, 50);

        productService.addProduct(p1);
        productService.addProduct(p2);

        System.out.println("Liste des produits enregistrés :");
        productService.getAllProducts().forEach(System.out::println);

        context.close();
    }
}
