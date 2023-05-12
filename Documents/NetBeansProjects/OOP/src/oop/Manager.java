package oop;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Product>product;

    public Manager() {
        this.product = new ArrayList<>();
    }
    
    public void addProdcut(Product product){
        this.product.add(product);
    }
    public void showListProduct(){
        this.product.forEach(o -> System.err.println(o.toString()));
    }
}
    