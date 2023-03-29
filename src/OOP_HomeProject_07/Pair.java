package OOP_HomeProject_07;

public class Pair<First, Second> {
    private First first;
    private Second second;

    public Pair(First arg1, Second arg2) {
        this.first = arg1;
        this.second = arg2;
    }

//    public First getFirst() {
//        return first;
//    }
//
//    public Second getSecond() {
//        return second;
//    }

    @Override
    public String toString() {
        return "Pair{" +
                "arg1=" + first +
                ", arg2=" + second +
                '}';
    }
}
