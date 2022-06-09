
//paste it inside function
// its a brute force code not a optimal code

String input[]=input1.split(" ");
	   int inlen=input.length;
	   int sum[]=new int[inlen];
	   int result=0;
	   for(int i=0;i<inlen;i++){

         String current=input[i];
		 int len=current.length();
		 int count=0;
		 for(int j=0;j<=len/2;j++){
          if(j==(len-1-j)){
			  int ascii=0;
			  int character=current.charAt(j);
			  if(character>=65 && character<=90){
               ascii=character-64;
			  }else if(character>=97 && character<=122){
                ascii=character-96;
			  }
			  sum[i]+=ascii;
		  }
		  else if(j<(len-1-j)){
			  int ascii1=0,ascii2=0;
			  int character1=current.charAt(j);
			  int character2=current.charAt(len-1-j);
			  if(character1>=65 && character1<=90){
               ascii1=character1-64;
			  }else if(character1>=97 && character1<=122){
                ascii1=character1-96;
			  }
			   if(character2>=65 && character2<=90){
               ascii2=character2-64;
			  }else if(character2>=97 && character2<=122){
                ascii2=character2-96;
			  }
		     sum[i]+=Math.abs(ascii1-ascii2);
		  }
		 }
          
		  if(sum[i]>9){
			  result*=100;
			  result+=sum[i];
		  }
		  else{
			  result*=10;
			  result+=sum[i];
		  }

           
	   }
       
     return result;
	   
