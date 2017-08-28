class ArrayLink{
	public static void main(String args[]){
		int[] oldArray = new int[10];
		int[] newArray = new int[20];

		for(int i = 0;i < oldArray.length;i++){
			newArray[i] = oldArray[i];
		}

		oldArray = newArray;
	}
}
