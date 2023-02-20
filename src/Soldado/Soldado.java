package Soldado;

/** 
 * @author Nombre del autor del código
 * @version 1.0
 *La clase Soldado representa a un soldado que puede disparar a otro soldado.  
 *
 */ 

public class Soldado {
	
	 private boolean estaMuerto;
	    /** 
	    *Verifica si el soldado puede disparar. El soldado puede disparar si tiene  
	 	*balas disponibles. 
	 	*@param número entero 
	 	*@return true si el soldado puede disparar, false en caso contrario. 
	    */ 


     private int numeroBalas;

    /**
     * Constructor 
     * 
     */

     public Soldado(boolean estaMuerto, int numeroBalas) {
			super();
			this.estaMuerto = estaMuerto;
			this.numeroBalas = numeroBalas;
		}



	//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada

     /** 
     *	Verifica si el soldado puede disparar. El soldado puede disparar si tiene  
     *	balas disponibles. 
     *	@return true si el soldado puede disparar, false en caso contrario. 
          */ 


     public boolean puedeDisparar() {

                   if(this.numeroBalas > 0) {

                                 return true;

                   }                          

                   return false;

     }

    /**
     * 
     * Getters y setters
     */

     public boolean isEstaMuerto() {
		return estaMuerto;
	}



	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}



	public int getNumeroBalas() {
		return numeroBalas;
	}



	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}

    /** 
    *	Este método hace que el soldado dispare a otro soldado, dejándolo muerto. 
    *	@param sol el soldado que será disparado. 
      */ 


	public void disparar(Soldado sol) {

                   this.numeroBalas--;

                   sol.estaMuerto = true;

     }

}

