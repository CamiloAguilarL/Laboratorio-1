
import java.lang.*;

public class ExtendsThread extends Thread{

	private int num;
	
	private boolean par;

	public ExtendsThread(int n, boolean par){
		this.num = n;
		this.par = par;
	}

	public void run(){
		try {
			for (int i = 1; i < this.num+1; i++) {
				if(i%2==0 & par){
					System.out.println(i);
					Thread.sleep(500);
				}
				else if(i%2==1 & !par){
					System.out.println(i);
					Thread.sleep(500);
				}
			}

		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	public static void main(String[] args) {
		ExtendsThread t1 = new ExtendsThread(10, true);
		ExtendsThread t2 = new ExtendsThread(10, false);
		t2.start();
		t1.start();
	}

}
