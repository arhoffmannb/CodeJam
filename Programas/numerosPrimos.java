public class numerosPrimos {
    public static void main(String[] args) {

	int numero = Integer.parseInt(args[0].toString());
	int prueba = 1;
	int resultado = 0;
	int contadorPrueba = 1;
	int contador = 1;

	for (contador = 1; contador < numero; contador++) {
  	   for (contadorPrueba=1; contadorPrueba<(contador); contadorPrueba++){
	      if(prueba%contadorPrueba == 0){
	      resultado++;
	      }
	   }

	   if(resultado==2){
	      System.out.println(""+prueba+", ");

	   }

	}
    }
}