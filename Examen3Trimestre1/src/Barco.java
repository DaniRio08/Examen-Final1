import java.util.ArrayList;

public abstract class Barco {
    
    //ATRIBUTOS
    private String matrícula;
    private String nombre;
    private float tamaño;

    //CONSTRUCTOR
    public Barco(String matrícula, String nombre, float tamaño) {
        this.setMatrícula(matrícula);
        this.setNombre(nombre);
        this.setTamaño(tamaño);
    }

    //toString
    @Override
    public String toString() {
        return "[matrícula=" + matrícula + ", nombre=" + nombre + ", tamaño=" + tamaño;
    }

    //MÉTODOS

    //Método que recibe una lista de barcos y devuelve el de mayor tamaño
    public static Barco mayorTamaño(ArrayList<Barco> barcosEntrantes) {
        float mayorTamaño = 0;
        int mayorPosición = 0;
        for (int i = 0; i < barcosEntrantes.size(); i++) {
            if (barcosEntrantes.get(i).getTamaño() > mayorTamaño) {
                mayorTamaño = barcosEntrantes.get(i).getTamaño();
                mayorPosición = i;
            }
        }
        return barcosEntrantes.get(mayorPosición);
    }

    //Método que recibe como parámetro un objeto de tipo pantalan y devuelve true en caso de que sea del mismo tipo que el barco
    public abstract boolean encajaTipo(Pantalan pantalan);

    /*Método que recibe como parámetro un objeto de tipo amarre y devuelve un float de la 
    diferencia entre el tamaño del barco y el amarre*/
    public float encajaTamaño(Amarre amarre) {
        float tamañoBarco = this.getTamaño();
        float tamañoAmarre = amarre.getTamaño();
        float diferencia = tamañoAmarre - tamañoBarco;
        return diferencia;
    }

    //Método que recibe una lista de barcos y añade en el array dos barcos
    public static void cargarBarcosEntrantes(ArrayList<Barco> barcosEntrantes) {
        Comercial comercial1 = new Comercial("1234", "Poseidón", 80f, "Carga téxtil");
        barcosEntrantes.add(comercial1);
        Recreo recreo1 = new Recreo("2345", "Tritón", 6f, "Permiso Recreativo");
        barcosEntrantes.add(recreo1);
    }

    //GETTERS Y SETTERS
    public String getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
}