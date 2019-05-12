public enum PlaneCapacity {
    AIRBUS320(5),
    BOEING747(4);

    private final int value;

    PlaneCapacity(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
