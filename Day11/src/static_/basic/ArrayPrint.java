package static_.basic;


public class ArrayPrint {
	//1.접근제한자
	//2.객체 생성 않고 메서드 사용 

	private ArrayPrint() {

	}
	public static String printArray(String[] arr) {
		String result="[";

		for(int i=0;i<arr.length;i++) {
			result += arr[i];
			if(i == arr.length-1)break;
			result +=",";
		}
		result+="]";

		return result;
	}


	public static String printArray(int[] arr) {
		String result="[";

		for(int i=0;i<arr.length;i++) {
			result += arr[i];
			if(i == arr.length-1)break;
			result +=",";
		}
		result+="]";

		return result;
	}


	public static String printArray(char[] arr) {
		String result="[";

		for(int i=0;i<arr.length;i++) {
			result += arr[i];
			if(i == arr.length-1)break;
			result +=",";
		}
		result+="]";

		return result;
	}


}
