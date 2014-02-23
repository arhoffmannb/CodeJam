public class numerosPrimos {
    public static void main(String[] args) {

	int resultado = 0; 
	int contador =1;
	int numeroActual =0;
	int numero = Integer.parseInt(args[0].toString());

	System.out.print("1,");
	
	for( numeroActual=1; numeroActual < (numero+1); numeroActual++){
	resultado = 0;
	
	   for( contador=1; contador < (numeroActual+1); contador++){
	   if(numeroActual%contador == 0){
	      resultado++;
	      } 
	   }

	if(resultado!=2){
	   System.out.print("");
	}else{
	   System.out.print(""+numeroActual+",");
	}
	
	}
    }
}