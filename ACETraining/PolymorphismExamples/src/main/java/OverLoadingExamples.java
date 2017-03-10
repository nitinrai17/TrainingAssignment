

public class OverLoadingExamples {

	public static void main(String[] args) {
		OverLoadingExamples o = new OverLoadingExamples();
		o.add(5, 6);
		o.print(0);
	}
	
	
	
	/*public void add(int i, int j){
		System.out.println("int i, int j =" + i + " : "+ j );
	}*/
	
	/*public void add(int i, long j){
		System.out.println("int i, long j =" + i + " : "+ j );
	}*/
	
	/*public void add(long i, int j){
		System.out.println("long i, int j =" + i + " : "+ j );
	}*/
	
	public void add(long i, long j){
		System.out.println(" long i, long j "+i + " : "+ j );
	}
	
	/*public void add(Integer i, Integer j){
		System.out.println("Integer i, Integer j ="+i + " : "+ j );
	}
	
	public void add(Long i, Long j){
		System.out.println(" Long i, Long j ="+ i + " : "+ j );
	}*/
	
	/*public void add(int i, Integer j){
		System.out.println(" int i, Integer j ="+i + " : "+ j );
	}*/
	
	/*public void add(long i, Long j){
		System.out.println(" long i, Long j ="+i + " : "+ j );
	}*/
	
	public void print(String x){
		System.out.println(" Inside String ");
	}
	
	public void print(Object x){
		System.out.println(" Inside Object ");
	}
	
	public void print(Integer x){
		System.out.println(" Inside Integer ");
	}

}
