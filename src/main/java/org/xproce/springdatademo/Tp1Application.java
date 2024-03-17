package org.xproce.springdatademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xproce.springdatademo.dao.entities.product;
import org.xproce.springdatademo.dao.repositories.ProductRepositories;

import java.util.Date;

@SpringBootApplication
public class Tp1Application implements CommandLineRunner {
    @Autowired
    private ProductRepositories productRepositories ;

    public static void main(String[] args) {
        SpringApplication.run(Tp1Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        product P = new product(1,"fati",new Date(1996,02,13));
       productRepositories.save(P);

        product ProductById = productRepositories.findById(1).get();
        System.out.println(ProductById);


        P.setName("doha");
        productRepositories.save(P);

       ProductById = productRepositories.findById(1).get();
        System.out.println(ProductById);



    }

}

