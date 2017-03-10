import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;


public class TestGCRef {

	public static void main(String[] args) {
		
		
		HashMap< Object, String> hm = new HashMap<Object, String>();
		String s="Hi";
		String s1="hello" ;
		String s2="h" ;
		WeakReference<String> weak = new WeakReference<String>(s);
		PhantomReference<String> phanton = new PhantomReference<String>(s1,null);
		SoftReference<String> soft = new SoftReference<String>(s2);

		/*hm.put(weak, "Weak");
		hm.put(phanton, "phanton");
		hm.put(soft, "soft");
		*/
		/*weak=null;
		phanton=null;
		soft=null;
		s=null;
		s1=null;
		s2=null;*/
		
		
		
		
		WeakReference<HashMap<Object, String>> wMap = new WeakReference<HashMap<Object, String>>(hm); 
		wMap.get().put(weak, "Weak");
		wMap.get().put(phanton, "phanton");
		wMap.get().put(soft, "soft");
		weak=null;
		phanton=null;
		soft=null;
		
		for (int i = 0; i < 1000; i++) {
			System.gc();
			System.out.println("size = : " + hm.size());
		}
		
	}

}
