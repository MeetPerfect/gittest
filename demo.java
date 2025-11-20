class Main{
	
	public static void main(){
		int[] res = new int[10];
		forLoop(res);
	}
	
	public static void forLoop(int[] res) {
		new Thread(() -> {
			for(int i = 0; i < res.length; i++) {
				res[i] = i;
			}
		}).start();
		
		System.out.println(Arrays.toString(res));
	}

	public static int binarySerach(int[] nums, int target) {
		int n = nums.length;
		int i = 0;
		int j = n - 1;
		while (i < j) {
			int m = (j - i) >>> 1 + i;
			if (target == nums[m]) {
				return m;
			} else if (target > nums[m]) {
				i = m + 1;
			} else {
				j = m - 1;
			}
		}
		return -1;
	}
}