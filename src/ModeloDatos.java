import java.util.HashMap;

import javax.swing.JOptionPane;

public class ModeloDatos {
    HashMap<String, carro> mapCarro = new HashMap<String, carro>();
    carro Automoviles = null;

    public void iniciar(ModeloDatos datos) {
        String menu = "Informacion del sistema Danielaa\n";
        menu += "Tipos de Automovil:\n";
        menu += "Carro,Camioneta,Campero\n";
        menu += "1. Ingresar Automovil\n";
        menu += "2. Imprimir HashMap\n";
        menu += "3. Salir\n";
        menu += "Ingrese una opci�n:\n";
        int opc = 0;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            validarDatos(opc);
        } while (opc != 3);
    }

    public void validarDatos(int opc) {
        switch (opc) {
            case 1:
                guardarDatos();
                break;

            case 2:
                if (!mapCarro.isEmpty()) {
                    imprimirHashMap();
                } else {
                    System.out.println("No existe esta mascota registrada");
                }
                break;
            case 4:
                System.out.println("�Salio!");
                break;
            default:
                break;
        }
    }

    public void guardarDatos() {
        String resp = "";
        do {
            Automoviles = new carro();
            Automoviles.ingresar();
            Automoviles.Encender();
            Automoviles.anda();
            Automoviles.frena();
            mapCarro.put(Automoviles.placa, Automoviles);
            Automoviles.mostrarInformacion();
            resp = JOptionPane.showInputDialog("Diga SI, si quiere continuar");
        } while (resp.equalsIgnoreCase("si"));
    }


    public void imprimirHashMap() {
        System.out.println("HashMap : ");
        for (carro Automoviles: mapCarro.values()) {
            Automoviles.mostrarInformacion();
        }
    }

    public HashMap<String, carro> getSizeMap(){
        return mapCarro;
    }
}
