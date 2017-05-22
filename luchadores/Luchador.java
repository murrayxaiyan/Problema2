package luchadores;
import poderes.MovimientoEspecial;


public abstract class Luchador {
	public String nombre;
	public MovimientoEspecial miMovimiento;
	public String golpear(){
		return "GOLPE POR DEFECTOOOO";
		}
	public String patear(){
		return "PATADA POR DEFECTOOO!";
		}
	public String saltar(){
		return "SALTO POR DEFECTOOOO";
		}
	public int usarMovimientoEspecial(){
		return miMovimiento.ejecutarMovimientoEspecial();
	}
        public String nombreMovimientoEspecial(){
		return miMovimiento.NombreEspecial();
	}


}
