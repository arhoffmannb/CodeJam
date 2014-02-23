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
	

//Cuadro de diálogo donde se pregunta si se quiere o no otra carta

	int ventana = JOptionPane.showOptionDialog( null, " [x], [x]\nQuerés otra carta? ", 
	"BlackJack", 
	JOptionPane.YES_NO_OPTION, 
	JOptionPane.QUESTION_MESSAGE,
	null,
	botones, botones [0]);

//Condición para usar el evaluador	
	if( (sumatoria1 == 21) && (sumatoria2 != 21) )  {
	   evaluador = 0;
	}else if ( (sumatoria1 != 21) && (sumatoria2 != 21) ){	
	   evaluador = 1;
	}else if ( (sumatoria2 == 21) && (sumatoria1 != 21) ){
	   evaluador = 2;
	}else if ( (sumatoria2 != 21) && (sumatoria1 != 21) ){
	   evaluador = 3;
	} 
	

//Dependiendo del resultado de la suma y la cantidad de cartas se mostrará:
	
	switch (evaluador) {
	   case 0: //Escogió 3 cartas y sumó 21
	      JOptionPane.showMessageDialog(
	      null, ""+ cartaA +"+" + cartaB +"+"  + cartaC +" = " + sumatoriaA + "Felicidades! 21","Resultado" ,
	      JOptionPane.PLAIN_MESSAGE);
	      break;
	   case 1: //Escogió 3 cartas y no sumó
	      JOptionPane.showMessageDialog(
	      null, ""+ cartaA +"+" + cartaB +"+"  + cartaC +" = " + sumatoriaA,"Resultado",
	      JOptionPane.PLAIN_MESSAGE);
	      break;
	   case 2: // Escogió 2 cartas y sumó 21
	      JOptionPane.showMessageDialog(
	      null, ""+ cartaA +"+" + cartaB +" = " + sumatoriaB + "Felicidades! 21","Resultado" ,
	      JOptionPane.PLAIN_MESSAGE);
	      break;
	   case 3: // Escogió 2 cartas y no sumó 21
	      JOptionPane.showMessageDialog(
	      null, ""+ cartaA +"+" + cartaB +" = " + sumatoriaB,"Resultado",
	      JOptionPane.PLAIN_MESSAGE);
	      break;
	   
	}
	
	
    }
}


