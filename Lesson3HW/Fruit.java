package JavaHomeWork.Lesson3HW;

//* Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;

abstract class Fruit {
    private float weight;
    private String type;

    Fruit(float weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public float getWeight() {
        return weight;
    }
}
class Apple extends Fruit {
    Apple() {
        super(1.0f, "яблоки");
    }

}
class Orange extends Fruit {
    Orange() {
        super(1.5f, "апельсины");
    }

}
