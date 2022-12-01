import java.util.Scanner;

public class Creditcard_Validate 
   {

	public static void main(String[] args) 
	{
     Creditcard_Validate cv =new Creditcard_Validate();
     cv.find_creditcard_validate();
	}
void find_creditcard_validate()
{
Scanner sc =new Scanner(System.in);  
System.out.println("How many dighits in your creditcard has?");
int digits =sc.nextInt();
int sum=0;

System.out.println("Enter Creditcard Number ");
String cc =sc.next();

int[] ccNo=new int[digits];

for(int i=0;i<cc.length();i++)
{
int ch = cc.charAt(i);
ccNo[i] =Character.getNumericValue(ch);
}
for(int j=0;j<ccNo.length;j++)
{
if(j%2==0)
{
ccNo[j]*=2;
}
//System.out.print(ccNo[j]+" ");

}
for(int k=0;k<ccNo.length;k++)
{

if(ccNo[k]>=10)
{
int num =ccNo[k];
int rem=0;
while(num>0)
{
int rem2=num%10;
rem+=rem2;
num/=10;
}
ccNo[k]=rem;
}
//System.out.println(ccNo[k]);
sum=sum+ccNo[k];
}
//System.out.println(sum);
if(sum%10==0)
{
System.out.println("Your creditcard is valid");
}
else
{
System.out.println("Your creditcard is not valid");
}
}

}
