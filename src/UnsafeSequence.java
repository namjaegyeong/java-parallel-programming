import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
public class UnsafeSequence {
    private int value;

    public int getValue() {
        return value++;
    }
}
