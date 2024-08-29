package com.app;

import java.awt.*;
import java.util.ArrayList;

class Product
{
    long id;
    String name;
    double price;

public Product(long id,String name,double price) {
    this.id = id;
    this.name = name;
    this.price = price;
}
public String toString() {
    return "Product[id=" + id + ",name=" + name + ",price=" + price + "]";
}

    public class CollectorsAPI {
        public static void main(String[] args) {
            List<Product> products = new ArrayList<Product>();

            products.add(new Product(111,"Lenova laptop",450000));
            products.add(new Product(222,"acer",50000));



            //list of product
            List<>

        }
    }
}
