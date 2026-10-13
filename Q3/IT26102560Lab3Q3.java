import java.util.Scanner;

 public class IT26102560Lab3Q3{
	public static void main(String[] args){
	
	int Amount , Notes_5000 , Notes_1000 , Notes_500 , Notes_100 , Notes_50 , Notes_20 , Coins_10 , Coins_5 ,
        Coins_2 , Coins_1 ;
		
	 Scanner input = new Scanner(System.in);
     System.out.println("Enter the Rupee Amount");

	 Amount = input.nextInt();
	
	 Notes_5000 = Amount / 5000;
	 Amount = Amount % 5000;
	 System.out.println("Notes_5000 : " + Notes_5000);
	
	 Notes_1000 = Amount / 1000;
	 Amount = Amount % 1000;
	 System.out.println("Notes_1000 : " + Notes_1000);
	
	 Notes_500 = Amount / 500;
	 Amount = Amount % 500;
	 System.out.println("Notes_500 : " + Notes_500);
	
	 Notes_100 = Amount / 100;
	 Amount = Amount % 100;
	 System.out.println("Notes_100 : " + Notes_100);

	 Notes_50 = Amount / 50;
	 Amount = Amount % 50;
	 System.out.println("Notes_50 ; " + Notes_50);
	
	 Notes_20 = Amount / 20;
	 Amount = Amount % 20;
	 System.out.println("Notes_20 : " + Notes_20);
	
	
	 Coins_10 = Amount / 10;
	 Amount = Amount % 10;
	 System.out.println("Coins_10 : " + Coins_10);
	
	 Coins_5 = Amount / 5;
	 Amount = Amount % 5;
   	 System.out.println("Coins_5 : " + Coins_5);
	
	 Coins_2 = Amount / 2;
     Amount = Amount % 2;
	 System.out.println("Coins_2 : " + Coins_2);
	
	 Coins_1 = Amount / 1;
	 Amount = Amount % 1;
	 System.out.println("Coins_1 : " + Coins_1);
	
	
	}
  }