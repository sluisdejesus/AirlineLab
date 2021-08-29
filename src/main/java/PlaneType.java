public enum PlaneType {
    AIRBUSA380(853, 277),
    BOEING767(375,159),
    AIRBUSA318(132,40),
    BOEING727(189,77);

    private final int capacity;
    private final int weight;


    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
