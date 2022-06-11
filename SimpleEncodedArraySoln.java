
               for(int i=input2-2;i>=0;i--){
                  input1[i]=input1[i]-input1[i+1];
		}
		int arr[]=input1; int sum=0;
		for(int i=0;i<input2;i++){
                   sum+=input1[i];
		}
		return new Result(arr[0],sum);
