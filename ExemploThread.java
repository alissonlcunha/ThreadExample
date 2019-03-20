public class ExemploThread extends Thread{
	public ExemploThread(String str){
		super(str);
	}
	public void run(){
		for (int i = 100; i<1000 ; i+=100){
			System.out.println(getName() + " percorreu " + i + " metros!");
			try {
				sleep((long)(Math.random() * 1000 ));
			} catch (InterruptedException e) {}
		}
		System.out.println(getName() + " FINALIZOU A CORRIDA!");
	}
}
