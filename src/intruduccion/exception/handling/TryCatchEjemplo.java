package intruduccion.exception.handling;

public class TryCatchEjemplo {
	 public static void main(String[] args) {
		 try {
			 // codigo que genera una excepción
			 int dividePorCero = 5 / 0;
		      System.out.println("Rest of code in try block");
		      System.out.println(dividePorCero);	      }
		 catch (ArithmeticException e) { //crea un objeto y se guarda en la variabe "e"
			 System.out.println("ArithmeticException => " + e.getMessage()); //getMessage es un metodo que devuelve el mensaje del error.
			 e.printStackTrace();
		    }
		  }
}