package four;

public class Task14 implements Comparable<Task14>{
    private final long top;
    private final long bottom;

    public Task14(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() {
        return 17 * Long.hashCode(top) + Long.hashCode(bottom); }
    @Override
    public boolean equals(Object o) {
        return compareTo((Task14)o) == 0; }
    @Override
    public int compareTo(Task14 f2){
        return Long.compare(top * f2.bottom, f2.top * bottom); }

    // Your work here!

    //Add two fractions
    public Task14 add(Task14 f2) {

        return null;
    }

    //...and make this class string representable
}
