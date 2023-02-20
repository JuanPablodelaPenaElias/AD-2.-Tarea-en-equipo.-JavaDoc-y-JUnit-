package Soldado;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before; import org.junit.Test; 

public class TestSoldado {
	private Soldado soldado1;     
	private Soldado soldado2;
	
	public TestSoldado(Soldado soldado1, Soldado soldado2) {
		super();
		this.soldado1 = soldado1;
		this.soldado2 = soldado2;
	} 
    @Test     
    public void testPuedeDisparar() { 
    	soldado1 = new Soldado(false, 0);       
    	soldado1.setNumeroBalas(0);        
    	assertFalse(soldado1.puedeDisparar()); 
    
    soldado1.setNumeroBalas(1);        
    assertTrue(soldado1.puedeDisparar()); 
} 
    @Test     
    public void testDisparar() {     
    	soldado1 = new Soldado(false, 0);    
    	soldado2 = new Soldado(false, 0); 
    	soldado1.setNumeroBalas(1);       
    	soldado1.disparar(soldado2); 

    	assertFalse(soldado1.puedeDisparar());  
    	assertTrue(soldado2.isEstaMuerto()); 
} 
} 

    



