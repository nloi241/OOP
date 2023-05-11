package oop;
import java.time.LocalDate;
public class Yarn extends Product {
    private String materil;
    private String weight;
    private String color;

    @Override
    public String toString() {
        return "Yarn{" + "materil=" + materil + ", weight=" + weight + ", color=" + color + '}';
    }
    
    public Yarn(String materil, String weight, String color,int count,String name, int price, int id) {
        super(count, name, price, id);
        this.materil = materil;
        this.weight = weight;
        this.color = color;
    }

    public String getMateril() {
        return materil;
    }

    public void setMateril(String materil) {
        this.materil = materil;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   
    
    
    
};
