package core.basesyntax;

/**
 * <p>Дан класс Rectangle. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры Rectangle по содержимому полей color, width и length,
 * а hashCode() был бы согласованным с реализацией equals().</p>
 */
public class Rectangle {
    private Integer width;
    private Integer length;
    private String color;

    public Rectangle(Integer width, Integer length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) object;
        return this.length.equals(rectangle.length)
                && this.width.equals(rectangle.width)
                && this.color.equals(rectangle.color);
    }

    @Override
    public int hashCode() {
        return 31 * ((width != null ? width.hashCode() : 0)
                 + (color != null ? color.hashCode() : 0)
                + (length != null ? length.hashCode() : 0));
    }
}
