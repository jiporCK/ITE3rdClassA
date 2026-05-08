package generics;

public class Computer {

    private Integer ram;
    private String brand;

    public Computer(Integer ram, String brand) {
        this.ram = ram;
        this.brand = brand;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", brand='" + brand + '\'' +
                '}';
    }
}
