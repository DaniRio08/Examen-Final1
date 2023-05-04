public class Amarre {

    //ATRIBUTOS
    private int id;
    private float tamaño;
    private boolean ocupado = false;
    private Barco barco;
    private static int contador = 0;

    //CONSTRUCTOR
    public Amarre(float tamaño) {
        this.setId();
        this.setTamaño(tamaño);
    }

    //toString
    @Override
    public String toString() {
        if (!ocupado) {
            return "El Amarre con id " + id + " de tamaño " + tamaño + " NO ESTA OCUPADO";
        } else {
            return "Amarre: id=" + id + ", tamaño=" + tamaño + ", ocupado=" + ocupado + ", barco en este amarre: " + barco;
        }
        
    }

    //GETTERS Y SETTERS
    public int getId() {
        return id;
    }
    
    public void setId() {
        this.id = contador;
        contador++;
    }
    public float getTamaño() {
        return tamaño;
    }
    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
    public boolean isOcupado() {
        return ocupado;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    public Barco getBarco() {
        return barco;
    }
    public void setBarco(Barco barco) {
        this.barco = barco;
    }
}
