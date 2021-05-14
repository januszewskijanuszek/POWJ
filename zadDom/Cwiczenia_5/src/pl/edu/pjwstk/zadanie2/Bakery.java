package pl.edu.pjwstk.zadanie2;

import java.util.Arrays;

public class Bakery extends Shop{
    private String[] products;

    public Bakery(String address, int size, String[] products) {
        super(address, size);
        this.products = products;
    }

    public String getInformation() {
        return "Bakery{" +
                "products=" + Arrays.toString(products) +
                ", address='" + address + '\'' +
                ", size=" + size +
                '}';
    }
}
