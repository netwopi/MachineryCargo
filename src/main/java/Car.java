public class Car {
    private Integer truck;
    private Integer сontainer;
    private Integer box;

    public Car() {
    }

    public Car(Integer truck, Integer сontainer, Integer box) {
        this.truck = truck;
        this.сontainer = сontainer;
        this.box = box;
    }

    public Integer getTruck() {
        return truck;
    }

    public void setTruck(Integer truck) {
        this.truck = truck;
    }

    public Integer getСontainer() {
        return сontainer;
    }

    public void setСontainer(Integer сontainer) {
        this.сontainer = сontainer;
    }

    public Integer getBox() {
        return box;
    }

    public void setBox(Integer box) {
        this.box = box;
    }

    @Override
    public String toString() {
        return "Car{" +
                "truck=" + truck +
                ", сontainer=" + сontainer +
                ", box=" + box +
                '}';
    }
}
