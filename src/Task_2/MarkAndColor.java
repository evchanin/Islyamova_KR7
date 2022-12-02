package Task_2;

public enum MarkAndColor {
    Silver("Серебряный"),
    White("Белый"),
    Grey("Серый"),
    Black("Чёрный"),
    Lada("Лада"),
    Pejo("Пежо"),
    BMW("БМВ"),
    Tesla("Тесла"),
    Mustang("Мустанг");
public String name;

    public String getName() {
        return name;
    }

    MarkAndColor(String name) {
        this.name = name;
    }
}
