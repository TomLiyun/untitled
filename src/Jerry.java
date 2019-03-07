//
//
//class AA{
//    public static void a(){
//        assert 1>2:"nishishazi";
//    }
//}



//public class Jerry {
//    private int id;
//    private String nema;
//
//
//    public Jerry(int id, String nema) {
//        this.id = id;
//        this.nema = nema;
//    }
//
//    @Override
//    public String toString() {
//        return "Jerry{" +
//                "id=" + id +
//                ", nema='" + nema + '\'' +
//                '}';
//    }
//
//    public static void main(String[] args) {
////        AA.a();
//
//    }
//}

import org.junit.Test;




public class Jerry{

    @Test
    public void print(){
        new Thread(() -> {
            for (int i = 0; i < 10; i++)
                System.out.printf("%-3d", 0);
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++)
                System.out.printf("%-3d", 1);
        }).start();

    }

}