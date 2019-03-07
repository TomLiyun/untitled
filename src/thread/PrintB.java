package thread;

public class PrintB implements Runnable {

    @Override
    public void run() {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++){
                System.out.printf("%-3s", "Z");
            }
        });
        thread.start();
            for (int i = 0; i <= 5; i++) {
                if (i == 0) {
                    try {
                        thread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


                System.out.printf("%-3s", "B");
            }
        }//只要5个Z打印完毕后，还剩下2个及其以上的B，结果都是对的。
    }
