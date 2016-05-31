import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {

	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> intersection = new ArrayList<Integer>();
		
		for (int i : nums1)
			set.add(i);

		for (int i : nums2) {
			if (set.contains(i) && !intersection.contains(i)) {
				intersection.add(i);
			}
		}

		int[] nums3 = new int[intersection.size()];

		for(int i = 0; i < intersection.size(); i++){
			nums3[i] = intersection.get(i);
		}
		
		return nums3;
	}

}
