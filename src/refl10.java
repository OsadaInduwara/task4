import java.lang.reflect.Method;

public class refl10 {
    public static void main(String[] args) throws Exception {
        mainrefl r = new mainrefl();
        Method m = r.getClass().getDeclaredMethod("setX", long.class);
        m.setAccessible(true);
        m.invoke(r, 50);
        System.out.println(r);
    }
}
