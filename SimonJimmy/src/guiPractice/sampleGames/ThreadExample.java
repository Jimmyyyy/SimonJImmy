package guiPractice.sampleGames;

public class ThreadExample implements Runnable{

	private int num;
	private int sleepTime;
	
	public static void main (String[] args){
		Thread one = new Thread(new ThreadExample(1));
		Thread two = new Thread(new ThreadExample(2));
		Thread three = new Thread(new ThreadExample(3));
		one.start();
		two.start();
		three.start();
	}
	
	public ThreadExample(int x) {
		num = x;
		sleepTime = (int) (Math.random()*10000);
	}

	public void run() {
		System.out.println("Thread #" + num + " preparing to sleep for " +  sleepTime + "ms.");
		try {
			Thread.sleep(sleepTime);
			System.out.println("Thread #" + num + " is woke.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 

}
