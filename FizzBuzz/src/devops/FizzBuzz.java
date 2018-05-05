package devops;
//import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FizzBuzz
{
  //public void pw(int n,String ch)
  //{
    String  units[]={" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

    String tens[]={" "," ","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

    public String convert(int n){
    	if(n<20){
    		return units[n];
    	}
    	else if(n<100){
    		return tens[n/10]+((n%10>0)?" "+convert(n%10):"");
    	}else{
    		return units[n/100]+" Hundred"+((n%100>0)?" and "+convert(n%100):"");
    		
    	}
    /*if(n > 19) { System.out.print(tens[n/10]+" "+units[n%10]);} 
    else { System.out.print(units[n]);}
    if(n > 0)System.out.print(ch);*/
  }
  public static void main(String[] args) throws IOException
  {
    
	   FizzBuzz a = new FizzBuzz();
	   BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	   while(true){
		   System.out.println("Enter number :: ");
		   String value=reader.readLine();
		   int number=Integer.parseInt(value);
		   if(number==0){
			   System.out.println("Bye");
			   return;
		   }else if(number<0 || number>=1000){
			   System.out.println("Invalid number");
			   return;
		   }else{
			   String result=a.convert(number);
			   System.out.println(result);
		   }
      
    }
  }
}