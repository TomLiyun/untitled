public interface I {
    private int fun(){
        return 0;
    }


    public static final int i = 1;
    public abstract void f();
    public static void g() {

    }
    public default void h(){
        fun();
    }
}
