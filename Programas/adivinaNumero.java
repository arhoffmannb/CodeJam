import javax.swing.JOptionPane;

public class adivinaNumero {
    public static void main(String[] args) {

	int aleatorio = (int) (Math.random()*100+1);
	int numero = Integer.parseInt(args[0].toString());

	do
	{

	if (numero < aleatorio) {

	   numero = Integer.parseInt(JOptionPane.showInputDialog(
	   null, "N�mero menor, introduzco otro",
	   "Adivina el n�mero",
	   JOptionPane.QUESTION_MESSAGE) );
  
	   
	}else if(numero > aleatorio) {

	   numero = Integer.parseInt(JOptionPane.showInputDialog(
	   null, "N�mero mayor, introduzco otro",
	   "Adivina el n�mero",
	   JOptionPane.QUESTION_MESSAGE) );

	}
  

	}while (numero != aleatorio);

	JOptionPane.showMessageDialog(
	   null, "Felicidades!! Adivin�!! :D",
	   "Adivina el n�mero",
	   JOptionPane.INFORMATION_MESSAGE);

    }
}    