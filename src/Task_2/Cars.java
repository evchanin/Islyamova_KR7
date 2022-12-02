package Task_2;

public enum Cars {
    Car1("Lada", "Vesta", "150", "950000", "Silver"),
    Car2("Pejo","05X7", "250", "1100000", "Black"),
    Car3("BMW", "3", "260", "5500000", "Grey"),
    Car4("Mustang", "10", "300", "4500000", "Black"),
    Car5("Tesla", "3", "209", "2000000", "Red" );
    public final String model;
    public final String speed;
    public final String mark;
    public final String price;
    public final String color;

    public String getSpeed() {
        return speed;
    }

    public String getMark() {
        return mark;
    }

    Cars(String mark, String model, String speed, String price, String color) {
        this.model = model;
        this.speed = speed;
        this.mark = mark;
        this.price = price;
        this.color = color;

    }}
