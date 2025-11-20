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
}