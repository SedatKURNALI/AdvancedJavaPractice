package TechProEd2021._01_JavaTechProEd.day40_exceptions;

public class Exceptions06 {

	public static void main(String[] args) {
		
	        
	        int sayi1 = 10;
	        int sayi2 = 0;
	        try {
	            System.out.println(sayi1/sayi2);
	        } catch (ArithmeticException e) {
	            System.out.println("Kodda hata var...");
	            e.printStackTrace();             //ArithmeticException
	        } finally {
	            System.out.println("connection'i durdur....");
	        }
	}

}
