import java.lang.reflect.Field;

public class refl7 {
    public static void main(String[] args) throws Exception{
        mainrefl r = new mainrefl();
        Field[] fields = r.getClass().getDeclaredFields();
        System.out.printf("There are %d fields\n", fields.length);

        for (Field f : fields) {
            f.setAccessible(true);
            System.out.printf("field name=%s type=%s value=%d\n", f.getName(),
                    f.getType(), f.getLong(r));
        }
    }
}
