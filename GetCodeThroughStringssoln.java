
             String words[]=input1.split(" ");
             int length=words.length;
             int result=0,sum=0;
		for(int i=0;i<length;i++){
			String text=words[i];
			int len=text.length();
			sum+=len;
		}
		while(sum>9){
			int temp=sum%10;;
                        sum/=10;
			result+=temp;
		}
		result+=sum;
		sum=0;
		while(result>9){
			int temp=result%10;;
                         result/=10;
			sum+=temp;
		}
		sum+=result;
                return sum;
