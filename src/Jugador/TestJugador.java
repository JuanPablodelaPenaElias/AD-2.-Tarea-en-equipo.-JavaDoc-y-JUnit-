package Jugador;
import org.junit.Test; 
import static org.junit.Assert.*; 

import static org.junit.jupiter.api.Assertions.*;

public class TestJugador {

	//Se comprueba que el dorsal se asigna de forma correcta
    @Test 
    public void ponerDorsal_dorsalValido() {         
    	Jugador jugador = new Jugador();         
    	jugador.ponerDorsal(10);         
    	assertEquals(10, jugador.getDorsal()); 
    } 
    
    //Se comprueba que el dorsal no se asigna si el número no está dentro del rango 
    @Test    
    public void ponerDorsal_dorsalInvalido() {
    	Jugador jugador = new Jugador();       
    	jugador.ponerDorsal(50);         
    	assertEquals(-1, jugador.getDorsal()); 
    }
    
    @Test 
    public void testEstaExpulsadoConDosAmarillas() {
    	Jugador jugador = new Jugador(); 
    	jugador.setNumeroTarjetasAmarillas(2);
    	int NumeroTarjetasAmarillas = 2;
    	assertTrue(jugador.estaExpulsado()); 
    } 
    @Test     
    public void testEstaExpulsadoConUnaRoja() { 
    	Jugador jugador = new Jugador();         
    	jugador.setNumeroTarjetasRojas(1);       
    	assertTrue(jugador.estaExpulsado()); 
    } 
    
    @Test     
    public void testNoEstaExpulsado() {
    	Jugador jugador = new Jugador();         
    	assertFalse(jugador.estaExpulsado());        
    	jugador.setNumeroTarjetasAmarillas(1);         
    	assertFalse(jugador.estaExpulsado()); 
    } 
   
} 



    
    
  




}
