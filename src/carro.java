
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class carro {
	ModeloDatos datos =new ModeloDatos();
	modeloCarro carro = new modeloCarro();
    String placa;
	String modelo;
    String tipo;
    String color;
    String marca;
  
    public carro() {
    	
    }
    
	public void ingresar() {
		carro.setModelo(JOptionPane.showInputDialog("Ingrese el modelo del carro"));
		carro.setPlaca(JOptionPane.showInputDialog("Ingrese la placa del carro"));
		carro.setTipo(JOptionPane.showInputDialog("Ingrese el tipo del carro"));
        carro.setColor(JOptionPane.showInputDialog("Ingrese el color del carro"));
        carro.setMarca(JOptionPane.showInputDialog("Ingrese la marca del carro"));
    }
    public carro(String modelo,String placa, String  tipo,String color, String marca)
    {
    	modelo=carro.getModelo();
    	placa =carro.getPlaca();
    	tipo=carro.getTipo();
    	color=carro.getColor();
    	marca=carro.getMarca();
    }

    public void mostrarInformacion() {
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Tipo: " + carro.getTipo());
        System.out.println("Color: " + carro.getColor());
        System.out.println("Marca: " + carro.getMarca());
    }

    public void Encender() {
        if (carro.getTipo().equalsIgnoreCase("Camion")) {
            System.out.println("El camion encendio");
        } else if (carro.getTipo().equalsIgnoreCase("Carro")) {
        	System.out.println("El carro encendio");
        }else if (carro.getTipo().equalsIgnoreCase("Campero")) {
        	System.out.println("El carro encendio");
        }else {
            System.out.println("El carro no hace sonidos conocidos.");
        }
    }
    public void anda() {
    	if (carro.getTipo().equalsIgnoreCase("Camion")) {
            System.out.println("El camion acelera");
        } else if (carro.getTipo().equalsIgnoreCase("Carro")) {
        	System.out.println("El carro acelera");
        }else if (carro.getTipo().equalsIgnoreCase("Campero")) {
        	System.out.println("El carro acelera");
        }else {
            System.out.println("El carro no hace sonidos conocidos.");
        }
    }
	public void frena() {
    	if (carro.getTipo().equalsIgnoreCase("Camion")) {
            System.out.println("El camion frena");
        } else if (carro.getTipo().equalsIgnoreCase("Carro")) {
        	System.out.println("El carro frena");
        }else if (carro.getTipo().equalsIgnoreCase("Campero")) {
        	System.out.println("El carro frena");
        }else {
            System.out.println("El carro no frena.");
        }
	}
	public void detiene() {
    	if (carro.getTipo().equalsIgnoreCase("Camion")) {
            System.out.println("El camion se detiene y apaga");
        } else if (carro.getTipo().equalsIgnoreCase("Carro")) {
        	System.out.println("El carro se detiene y apaga");
        }else if (carro.getTipo().equalsIgnoreCase("Campero")) {
        	System.out.println("El carro se detiene y apaga");
        }else {
            System.out.println("El carro no se detiene y no se apaga.");
        }
	}
    public void imprimirDatos(ModeloDatos datos) {
   	 HashMap<String, carro> carro = datos.getSizeMap();
   	Iterator iterator = carro.keySet().iterator();
   	carro Automoviles; Integer llave;
		while(iterator.hasNext()) {
           llave = (Integer) iterator.next();
           Automoviles = datos.getSizeMap().get(llave);
           System.out.println("Placa: " + llave + ", Modelo: " + Automoviles.modelo+ ", Tipo: " + Automoviles.tipo
               		+ "Color:" + Automoviles.color + "Marca:" + Automoviles.marca);
		}
		System.out.println("-----");
   }

}