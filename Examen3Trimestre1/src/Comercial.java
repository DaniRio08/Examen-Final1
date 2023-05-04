public class Comercial extends Barco{
    
    //ATRIBUTOS
    private String carga;

    //CONSTRUCTOR
    public Comercial(String matrícula, String nombre, float tamaño, String carga) {
        super(matrícula, nombre, tamaño);
        this.setCarga(carga);
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + " tipo=Comercial carga=" + carga + "]";
    }

    //Las clases que extienden una clase abstracta tienen que implementar los métodos abstractos de esta
    @Override
    public boolean encajaTipo(Pantalan pantalan) {
        if ((this instanceof Comercial) && (pantalan.getTipo().equals("Comercial"))) {
            return true;
        } else {
            return false;
        }
    }

    //GETTERS Y SETTERS
        public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }
}
