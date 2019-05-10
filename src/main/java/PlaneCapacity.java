public enum PlaneCapacity {
    AIRBUS320(150),
    BOEING747(120);

    private final int value;

    PlaneCapacity(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
