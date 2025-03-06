package Synchronization;

public class Client {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		
		//example without using synchronization
		RaceCondition_Count count =new RaceCondition_Count(0);
		
		 Thread t1 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++) {
	                count.incValue(1);
	            }
	        });

	        Thread t2 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++) {
	                count.decValue(1);
	            }
	        });
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("without using synchonized method : final count :"+ count.getResult());
		
		
		//example using synchronization
		
		Avoid_RaceCondition_Count2 count2= new Avoid_RaceCondition_Count2(0);
		
		Thread t3=new Thread(()->{
			for(int i=0; i<=1000;i++) {
				count2.incValue(1);
			}
		});
		
		Thread t4=new Thread(()->{
			for(int i=0;i<=1000;i++) {
				count2.decValue(1);
			}
		});
		
		t3.start();
		t4.start();
		
		t3.join();
		t4.join();
		
		System.out.println("with using synchonized method : final count :"+ count2.getResult());


	}

}
