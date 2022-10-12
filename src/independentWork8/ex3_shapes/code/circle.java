package independentWork8.ex3_shapes.code;

public class circle extends shape {
    private float r;

    public circle(position position, float r) {
        super(position);
        this.r = r;
    }

    @Override
    public float calcArea() {
        System.out.println("The area of a circle is: ");
        return (float) Math.PI * (r * r);
    }

    @Override
    public float calcPerimeter() {
        System.out.println("The perimeter of a circle is: ");
        return (float) (2 * Math.PI * r);
    }
}
