package Assignment_02;
import java.util.Scanner;

import session_03.Student;
public class Test extends Product {
	
	
	
	public static int maxPricePid(Product[] pro) 
	{
		 int HtPid=pro[0].getPid();
		 int HtPrice=pro[0].getPrice();
		 
		 for(int i=1; i<pro.length; i++)
		 {
			 if(pro[i].getPrice() > HtPrice)
			 {
				 HtPrice = pro[i].getPrice();
				 HtPid=pro[i].getPid();
			 }
		 }
		 
		return HtPid;
	}
	
	public static int TotalSp(Product[] pro)
	{
		int totalPr=0;
		
		for(int i=0;i<pro.length;i++)
		{
			totalPr=totalPr+pro[i].getPrice()*pro[i].getQuantity();
		}
		
		
		return totalPr;
	}
	
	
	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("How many product:->");
		int size=s1.nextInt();
		
		Product pro[]=new Product[size];
		System.out.println("Enter Product datils:->");
		
		for(int i=0;i<pro.length;i++)
		{
			System.out.println("Enter Product ID=->");
			int id=s1.nextInt();
			System.out.println("Enter Product Price=->");
			int pr=s1.nextInt();
			System.out.println("Enter Product Quantity=->");
			int qu=s1.nextInt();
			
			pro[i]=new Product(id,pr,qu);	
		}
		
		System.out.println("Product Are as Folows=->");
		
		
		int PPID = maxPricePid(pro);
		System.out.println("Highest price Prodeuct Id is => "+PPID);
		
		
		int TSPP =TotalSp(pro);
		System.out.println("Total price of Prodeuct  is => "+TSPP);
//		for(int i=0;i<pro.length;i++)
//		{
//			System.out.println(pro[i].getPid()+"  "+pro[i].getPrice()+"  "+pro[i].getQuantity()+" "+pro[i].highestPrise());
//		}
		
		
		
				
		
		
	}

}
