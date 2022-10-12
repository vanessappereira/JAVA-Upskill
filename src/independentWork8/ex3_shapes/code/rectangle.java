package independentWork8.ex3_shapes.code;

public class rectangle extends shape {
    private float length, width;

    public rectangle(position position, float length, float width) {
        super(position);
        this.length=length;
        this.width=width;
    }

    @Override
    public float calcArea() {
        System.out.println("The area of a rectangle is: ");
        return length*width;
    }

    @Override
    public float calcPerimeter() {
        System.out.println("The perimeter of a rectangle is: ");
        return 2*(length+width);
    }
}
