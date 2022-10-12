package independentWork8.ex3_shapes.code;

public abstract class shape {
    private position position;

    public shape(position position) {
        this.position = position;
    }

    public abstract float calcArea();

    public abstract float calcPerimeter();

    public position getPosition() {
        return position;
    }
}
