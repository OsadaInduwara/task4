public class refl3 {
    public static void main(String[] args) {
        mainrefl r = new mainrefl();
        System.out.println("class =" + r.getClass());
        System.out.println("class name =" + r.getClass().getName());
        System.out.println("Simple name =" + r.getClass().getSimpleName());
        System.out.println("Canonical name =" + r.getClass().getCanonicalName());
    }
}
