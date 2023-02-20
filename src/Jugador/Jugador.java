package Jugador;


/** 
 	*Clase Jugador representa a un jugador de un equipo de fútbol. 
 	*Contiene los atributos dorsal, número de tarjetas amarillas y número de tarjetas rojas. 
 */

public class Jugador {

        private int dorsal;

        private int numeroTarjetasAmarillas;

        private int numeroTarjetasRojas;

                     

//Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada

/** 
  *	Asigna el dorsal al jugador. Solo se permiten dorsales entre 1 y 30. 
  *	@param dorsal el número de dorsal a asignar 
   */ 


        public void ponerDorsal(int dorsal) {

                      if(dorsal >= 1 && dorsal <= 30) {

                                    this.dorsal = dorsal;

                      }else {

                                    this.dorsal = -1;

                      }

        }

       

        public int getDorsal() {
			return dorsal;
		}



		public void setDorsal(int dorsal) {
			this.dorsal = dorsal;
		}



		public int getNumeroTarjetasAmarillas() {
			return numeroTarjetasAmarillas;
		}



		public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
			this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		}



		public int getNumeroTarjetasRojas() {
			return numeroTarjetasRojas;
		}



		public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
			this.numeroTarjetasRojas = numeroTarjetasRojas;
		}
		/** 
		*	Indica si el jugador está expulsado del partido. 
		*	Un jugador está expulsado si tiene dos tarjetas amarillas o una tarjeta roja. 
		*	@return true si el jugador está expulsado, false en caso contrario 
		     */ 



		public boolean estaExpulsado() {

                      boolean expulsado = false;                                                  

                      if(numeroTarjetasAmarillas == 2) {

                                    expulsado = true;

                      }                          

                      if(numeroTarjetasRojas == 1) {

                                    expulsado = true;

                      }                          

                      return expulsado;

        }            

}

