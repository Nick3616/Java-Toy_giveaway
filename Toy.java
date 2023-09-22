class Toy {
    private int id;
    private String name;
    private int quantity;
    private double weight;

    public Toy(int id, String name, int quantity, double weight) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public String toString() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}