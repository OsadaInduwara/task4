import testpack.kunit;
import static testpack.kunit.checkEquals;
import static testpack.kunit.checkNotEquals;

public class test {
    void testConstructorAndAccess() {
        mainrefl s = new mainrefl (5,10,15);
        checkEquals(s.getX(),5);
        checkEquals(s.getY(),10);
        checkEquals(s.getZ(),15);
        checkNotEquals(s.getX(),5);
        checkNotEquals(s.getY(),10);
        checkNotEquals(s.getZ(),15);
    }
    void testSqrX() {
        mainrefl s=new mainrefl(5,10,15);
        s.sqrX();
        checkEquals(s.getX(),25);
        checkNotEquals(s.getX(),25);
        checkEquals(s.getX(),5);
    }
    void testSqrY() {
        mainrefl s=new mainrefl(5,10,15);
        s.sqrY();
        checkEquals(s.getY(),100);
        checkNotEquals(s.getY(),100);
        checkEquals(s.getY(),10);
    }
    void testSqrZ() {
        mainrefl s=new mainrefl(5,10,15);
        s.sqrZ();
        checkEquals(s.getZ(),225);
        checkNotEquals(s.getZ(),225);
        checkEquals(s.getZ(),15);
    }
    public static void main(String[] args) {
        test ts=new test();
        ts.testConstructorAndAccess();
        ts.testSqrX();
        ts.testSqrY();
        ts.testSqrZ();
        kunit.report();

    }

}