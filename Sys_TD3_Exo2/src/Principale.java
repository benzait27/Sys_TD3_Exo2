import java.io.IOException;
import java.util.Scanner;


public class Principale{

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
        Nombre nb = new Nombre();
        Threade T1 = new Threade(nb,1);
        Threade T2 = new Threade(nb,2);
        Threade T3 = new Threade(nb,3);
        
        T1.start();
        T2.start();
        T3.start();
        
        Scanner a = new Scanner(System.in);
        a.next();
        
        T1.interrupt();
        T2.interrupt();
        T3.interrupt();
       
        T1.join();
        T2.join();
        T3.join();
       
	}

}
