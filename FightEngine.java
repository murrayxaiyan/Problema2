import java.util.Scanner;

import poderes.Agarrador;
import poderes.AtacadorRapido;
import poderes.LanzaPoderes;
import poderes.MovimientoEspecial;
import luchadores.ChoroPortenho;
import luchadores.GorrionDeConchali;
import luchadores.HalconDeChicureo;
import luchadores.Illuminati;
import luchadores.Luchador;
import luchadores.MineroWarrior;
import luchadores.Nopeleen;
import luchadores.PanchoDelSur;
import luchadores.Tarro;

public class FightEngine {
	public FightEngine(){
		String luchadorPlayer1;
		String accionLuchadorIn, accionApoyoIn;
		int accionLuchador, accionApoyo;
		String opcionChoroPortenho = new String("1");
		String opcionMineroWarrior = new String("2");
		String opcionHalconDeChicureo = new String("3");
		String opcionGorrionDeConchali= new String("4");
		String opcionPanchoDelSur = new String("5");
		
	    System.out.println("Empieza el juego!!!");
		System.out.println("Selecciona tu luchador (1 o 2): 1-Choro Portenho 2-Minero Warrior  3-Halcon de Chicureo  4-Gorrion de Conchali  5-Pancho del Sur");
		
		Scanner seleccion = new Scanner(System.in);
		
		luchadorPlayer1 = seleccion.nextLine();
	
		//System.out.println(luchadorPlayer1);
		
		Luchador player1 = null;
        Luchador aux = null;
		MovimientoEspecial nuevoMovimiento=null;
		
		if (luchadorPlayer1.equals(opcionChoroPortenho)){
			player1 = new ChoroPortenho();
			nuevoMovimiento = new LanzaPoderes();
		}
		if (luchadorPlayer1.equals(opcionMineroWarrior)){
			player1 = new MineroWarrior();
			nuevoMovimiento = new LanzaPoderes();		
		}
		if (luchadorPlayer1.equals(opcionHalconDeChicureo)){
			player1 = new HalconDeChicureo();
			nuevoMovimiento = new AtacadorRapido();
		}
		if (luchadorPlayer1.equals(opcionGorrionDeConchali)){
			player1 = new GorrionDeConchali();
			nuevoMovimiento = new AtacadorRapido();
			}
		if (luchadorPlayer1.equals(opcionPanchoDelSur)){
			player1 = new PanchoDelSur();
			nuevoMovimiento = new Agarrador();
			}
		
		player1.miMovimiento = nuevoMovimiento;
		System.out.println(player1.nombre + " inicia a batalla!");
                
                aux = player1;
                do{
                System.out.println("Escoje tus heroes de apoyo:\n 1-Niño Illuminati 2-Niño no se peleen 3-Tarro 0-Ninguno");
                accionApoyoIn = seleccion.nextLine();
                accionApoyo = Integer.parseInt(accionApoyoIn);
                               
		switch(accionApoyo) {
                    case 0: break;
                    case 1: player1 = new Illuminati(player1);
                                    break;
                    case 2: player1 = new Nopeleen(player1);
                                    break;
                    case 3: player1 = new Tarro(player1);
                                    break;
		}
                }while(accionApoyo!=0);
                
				System.out.println("Ingresa tu accion! :1-Golpe 2-Patada 3-Salto 4-MOVIMIENTO ESPECIAL");

				accionLuchadorIn =seleccion.nextLine();
				accionLuchador = Integer.parseInt(accionLuchadorIn);
                                
				switch(accionLuchador) {
					case 1: System.out.println(aux.golpear());
							break;
					case 2: System.out.println(aux.patear());
							break;
					case 3: System.out.println(aux.saltar());
							break;
					case 4: System.out.println("Cadena de ataques:\n" + player1.nombreMovimientoEspecial()+ "\nDaño total:\n" +player1.usarMovimientoEspecial());
							break;				
                                
				}
                                
		System.out.println("FIN DEL JUEGO. 2...");

	}

}
