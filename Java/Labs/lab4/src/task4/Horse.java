package task4;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {
    private String name;

    public Horse(int height, int weight, String name) {
        super(height, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
