package thread;

public class PrintNum implements Runnable {

    @Override
    public void run(){
        for (int i = 0; i < 5;  i++){

            System.out.printf("%-3d", i);
        }
    }
}
