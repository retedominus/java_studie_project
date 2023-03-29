package OOP_HomeProject_07;

public class Triple <First, Second, Third> {
    private First first;
    private Second second;
    private Third third;

    public Triple(First arg1, Second arg2, Third arg3) {
        this.first = arg1;
        this.second = arg2;
        this.third = arg3;
    }

    @Override
    public String toString() {
        return "(" +
                first +
                ", " + second +
                ", " + third +
                ')';
    }
}
