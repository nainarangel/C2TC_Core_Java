package Multithreading;

public class main extends Thread{
	int st;
	String msg;

	public main( String msg,int st) {
		this.st = st;
		this.msg = msg;
	}

	@Override
	public void run() {
		for (int i=1;i<=1;i++){
			try
			{
				Thread.sleep(st);
			}
			catch(Exception e)
			{
			
			}
		System.out.print(msg+ " ");
		}
	}
}
