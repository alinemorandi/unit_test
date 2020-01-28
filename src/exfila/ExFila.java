/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exfila;

import java.util.ArrayList;
import java.util.Collections;


public class ExFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                Fila fila = new Fila();
                Paciente pa1 = new Paciente("Aline", 29, "verde", 1);
                fila.insert(pa1);
		Paciente pa2 = new Paciente("Gabriel", 25, "verde", 1);
                fila.insert(pa2);
		Paciente pa3  = new Paciente("Jose", 23, "vermelho", 3);
                fila.insert(pa3);
		Paciente pa4  = new Paciente("Debora", 39, "vermelho", 3);
                fila.insert(pa4);
		Paciente pa5  = new Paciente("Sheila", 39, "amarelo", 2);
                fila.insert(pa5);
		Paciente pa6  = new Paciente("Eduardo", 31, "verde", 1);
                fila.insert(pa6);
                Paciente pa7  = new Paciente("Pablo", 24, "amarelo", 2);
                fila.insert(pa7);
               
                /*SAIDA CORRETA: [JOSE,DEBORA,SHEILA,PABLO,ALINE,GABRIEL,EDUARDO]*/
                
		
		/*ArrayList<Paciente> listaPaciente = new ArrayList<Paciente>();
		listaPaciente.add(pa1);
		listaPaciente.add(pa2);
		listaPaciente.add(pa3);
		listaPaciente.add(pa4);
		listaPaciente.add(pa5);
		listaPaciente.add(pa6);
                listaPaciente.add(pa7);
		
		Collections.sort(listaPaciente);*/
                
		
		System.out.println(" lista : "+fila.lista5());
        
    }
    
}
