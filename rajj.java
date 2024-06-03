import java.util.HashMap;
import java.util.Map;

public class rajj{
public static void main(String[] args) {
	int arr[]= {1,2,3,4,3,5,1,2,4,5,7};
	Map<Integer, Integer> mp=new  HashMap<Integer, Integer>();
	for(int i=0;i<arr.length;i++) {
		int x=mp.getOrDefault(arr[i], 0)+1;
		
	}
    System.out.println(mp);
	//rajkumar
}
}
