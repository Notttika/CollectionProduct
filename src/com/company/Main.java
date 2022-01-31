package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Product product = new Product("chair", ProductType.furniture, 500, 4);
        Product product1 = new Product("pullover", ProductType.clothes, 200, 1);
        Product product2 = new Product("meat", ProductType.food, 65, 10);
        Product product3 = new Product("coat", ProductType.clothes, 120, 2);
        Product product4 = new Product("sofa", ProductType.furniture, 980, 20);
        Product product5 = new Product("sausage", ProductType.food, 110, 5);
        Product product6 = new Product("skirt", ProductType.clothes, 250, 3);
        Product product7 = new Product("table", ProductType.furniture, 400, 12);
        Product product8 = new Product("vegetables", ProductType.food, 60, 6);

        Product[] products = {product, product1, product2, product3, product4, product5, product6, product7, product8};
        System.out.println(Arrays.toString(products));

        ArrayList<Product> productList = new ArrayList<>(Arrays.asList(products));
        System.out.println(productList);

        ArrayList<Product> productsClothes = new ArrayList<>();
        ArrayList<Product> productFurniture = new ArrayList<>();
        ArrayList<Product> productsFood = new ArrayList<>();

        int price = 0;
        int withAt = 0;
        Product a;
            for (Product prod : productList) {
                a = prod;
                if (prod.getType().equals(ProductType.clothes)) {
                    productsClothes.add(prod);
                }
                if (prod.getType().equals(ProductType.furniture)) {
                    productFurniture.add(prod);
                }
                if (prod.getType().equals(ProductType.food)) {
                    productsFood.add(prod);
                }
                if (prod.getPrice() < 200) {
                    price = price + 1;
                }
                if (prod.getName().matches("(.*)at(.*)")) {
                    withAt = withAt + 1;

                }

            }

        System.out.println("all products" + (productList));
        System.out.println("clothes" + (productsClothes));
        System.out.println("furniture" + (productFurniture));
        System.out.println("food" + (productsFood));
        System.out.println("price is lower 200 -  " + price);
        System.out.println("at in the text - " + withAt);

        Set<Product> productSet = new TreeSet<>();
        productSet.add(product);
        productSet.add(product1);
        productSet.add(product2);
        productSet.add(product3);
        productSet.add(product4);
        productSet.add(product5);
        productSet.add(product6);
        productSet.add(product7);
        productSet.add(product8);

        System.out.println("sort price :" + productSet );


       /*  Comparator<Product> comparator = new Comparator<Product>() {
             @Override
             public int compare(Product o1, Product o2) {
                 return (o1.getWeight() - o2.getWeight());
             }
         };

        Set<Product> productSet = new TreeSet<>(comparator);
        productSet.add(product);
        productSet.add(product1);
        productSet.add(product2);
        productSet.add(product3);
        productSet.add(product4);
        productSet.add(product5);
        productSet.add(product6);
        productSet.add(product7);
        productSet.add(product8);
        System.out.println("sort weight:" + productSet );*/
    }
}