import java.util.HashSet;

public class PPPPPPPPPPPPPPP {
	static int countDistinct(int arr[]) {
		HashSet<Integer>s=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			s.add(arr[i]);
			
		}
		return s.size();
	}
		

	public static void main(String[] args) {
	int arr[]= {15,12,13,12,13,13,18};
	System.out.println(countDistinct(arr));
	}
}
