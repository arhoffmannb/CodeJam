public class numerosPrimos {
    public static void main(String[] args) {

	int numero = Integer.parseInt(args[0].toString());
	int prueba = 1;
	int resultado = 0;
	int contadorPrueba = 1;
	int contador = 1;

	for (contador = 1; contador < (numero+1); contador++) { // Ciclo que muestra todos los n�meros primos desde 1 hasta el n�mero ingresado 
  	   for (contadorPrueba=1; contadorPrueba<(contador); contadorPrueba++){ // Ciclo que prueba si el n�mero actual es primo 
	      if(contador%contadorPrueba == 0){
	      resultado++;
	      }
	   }

	   if(resultado==2){
	      System.out.println(""+prueba+", ");

	   }

	}
    }
}