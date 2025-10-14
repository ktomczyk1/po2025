public class Program{
	public static void main(String[] args){
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("Podaj wysokosc choinki");
		
		int wysokosc = scanner.nextInt();*/
		System.out.println("*");
		int h1 = Integer.parseInt(args[0]);
		
		for (int i=1; i<h1; i++)
		{
			int pomocnicza = 0;
			
			while (pomocnicza != i+1)
			{
				System.out.print("*");
				pomocnicza++;
			}
			System.out.println("");

		}
	
	
	
	}
	
	


}
