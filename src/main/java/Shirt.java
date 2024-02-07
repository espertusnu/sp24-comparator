import java.util.Collections;
import java.util.List;

public class Shirt implements Comparable<Shirt> {
    private int size;
    private String brand;

    public Shirt(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    @Override
    public int compareTo(Shirt otherShirt) {
        return this.size - otherShirt.size;
    }

    @Override
    public String toString() {
        return String.format("%s shirt (size %d)", brand, size);
    }

    public static void main(String[] args) {
        List<Shirt> shirts = List.of(
                new Shirt(10,  "Adidas"),
                new Shirt(6, "Hanes")
        );
        System.out.println(shirts);
        Collections.sort(shirts);
        System.out.println(shirts);
    }
}
