import javax.swing.JOptionPane;
public class blackJack {
    public static void main(String[] args) {

	int carta1 = (int)( Math.random() *(1-14)+14);
	int carta2 = (int)( Math.random() *(1-14)+14);
	int carta3 = (int)( Math.random() *(1-14)+14);
	int sumatoria1 = carta1 + carta2 +carta3;
	int sumatoria2 = carta1 + carta2;
	int evaluador = 0;	
	String [] botones = {"Si","No"};
	String sumatoriaA = Integer.toString (sumatoria1);
	String sumatoriaB = Integer.toString (sumatoria2);
	String cartaA = Integer.toString (carta1);
	String cartaB = Integer.toString (carta2);
	String cartaC = Integer.toString (carta3);
	

//Cuadro de di�logo donde se pregunta si se quiere o no otra carta

	int ventana = JOptionPane.showOptionDialog( null, " [x], [x]\nQuer�s otra carta? ", 
	"BlackJack", 
	JOptionPane.YES_NO_OPTION, 
	JOptionPane.QUESTION_MESSAGE,
	null,
	botones, botones [0]);

//Condici�n para usar el evaluador	
	if( (sumatoria1 == 21) && (sumatoria2 != 21) )  {
	   evaluador = 0;
	}else if ( (sumatoria1 != 21) && (sumatoria2 != 21) ){	
	   evaluador = 1;
	}else if ( (sumatoria2 == 21) && (sumatoria1 != 21) ){
	   evaluador = 2;
	}else if ( (sumatoria2 != 21) && (sumatoria1 != 21) ){
	   evaluador = 3;
	} 
	

//Dependiendo del resultado de la suma y la cantidad de cartas se mostrar�:
	
	switch (evaluador) {
	   case 0: //Escogi� 3 cartas y sum� 21
	      JOptionPane.showMessageDialog(
	      null, ""+ cartaA +"+" + cartaB +"+"  + cartaC +" = " + sumatoriaA + "Felicidades! 21","Resultado" ,
	      JOptionPane.PLAIN_MESSAGE);
	      break;
	   case 1: //Escogi� 3 cartas y no sum�
	      JOptionPane.showMessageDialog(
	      null, ""+ cartaA +"+" + cartaB +"+"  + cartaC +" = " + sumatoriaA,"Resultado",
	      JOptionPane.PLAIN_MESSAGE);
	      break;
	   case 2: // Escogi� 2 cartas y sum� 21
	      JOptionPane.showMessageDialog(
	      null, ""+ cartaA +"+" + cartaB +" = " + sumatoriaB + "Felicidades! 21","Resultado" ,
	      JOptionPane.PLAIN_MESSAGE);
	      break;
	   case 3: // Escogi� 2 cartas y no sum� 21
	      JOptionPane.showMessageDialog(
	      null, ""+ cartaA +"+" + cartaB +" = " + sumatoriaB,"Resultado",
	      JOptionPane.PLAIN_MESSAGE);
	      break;
	   
	}
	
	
    }
}


