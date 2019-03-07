package thread;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrintCHUTest {

    public static void main(String[] args) {



        new Thread(new PrintA()).start();
        //start方法自动调用run方法，而且start方法不是阻塞的.
        new Thread(new PrintB()).start();
        new Thread(new PrintNum()).start();
    }

}