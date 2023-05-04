import java.util.ArrayList;
import java.util.Scanner;

public class Pantalan {
        
    //ATRIBUTOS
    private int id;
    private ArrayList<Amarre> listaAmarres;
    private String tipo;
    private static int contador = 0;

    //Scanner
    Scanner sc = new Scanner(System.in);


    //CONSTRUCTOR
    public Pantalan(String tipo) {
        this.setId();
        this.setTipo(tipo);
        this.setListaAmarres();
    }

    //toString
@Override
    public String toString() {
        return "Pantalan: (id=" + id +  ", tipo=" + tipo + ")\n\n" + imprimirAmarres()
        + "-----------------------------------------------";        
    }

    //Imprimir amarres
    public String imprimirAmarres() {
        String text = "";
        for (int i = 0; i < this.listaAmarres.size(); i++) {
            text+= this.listaAmarres.get(i).toString() + "\n";
        }
        return text;
    }

    //GETTERS Y SETTERS
    public int getId() {
        return id;
    }

    public void setId() {
        this.id = contador;
        contador++;
    }
    public ArrayList<Amarre> getListaAmarres() {
        return listaAmarres;
    }
    public void setListaAmarres() {
        this.listaAmarres = new ArrayList<>();
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        while (!tipo.equals("Comercial") && (!tipo.equals("Recreo"))) {
            System.out.print("El pantalan solo puede ser de tipo 'Comercial' o 'Recreo', vuelve a intentarlo: ");
            tipo = sc.nextLine();
        }
        this.tipo = tipo;
    }
}
