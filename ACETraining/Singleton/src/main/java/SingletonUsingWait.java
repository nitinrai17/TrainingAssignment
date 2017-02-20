import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonUsingWait {
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
		for(int i=0; i<5 ; i++){
			newFixedThreadPool.submit(new Runnable() {
				public void run() {
					try {
						
						System.out.println(Singleton1.getInstance());
					} catch (InterruptedException e) {
						System.out.println(" Error "+ e.getMessage());
						e.printStackTrace();
					}
				}
			} );
		}
	}
}

class Singleton1 {
	
	private static volatile Singleton1 instance; 
		
		private Singleton1 (){
			if(instance == null){
				
			}
		}
		
		public static Singleton1 getInstance() throws InterruptedException{
			if(instance==null){
				synchronized (Singleton1.class) {
					if(instance==null){
						Singleton1.class.wait(5000);
						instance = new Singleton1();
						Singleton1.class.notify();
					}
				}
			}
			return instance; 
		}
	
}
