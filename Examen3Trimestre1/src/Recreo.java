public class Recreo extends Barco{

    //ATRIBUTOS
    private String permiso;

    //CONSTRUCTOR
    public Recreo(String matrícula, String nombre, float tamaño, String permiso) {
        super(matrícula, nombre, tamaño);
        this.setPermiso(permiso);
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + " tipo=Recreo permiso=" + permiso + "]";
    }

    //Las clases que extienden una clase abstracta tienen que implementar los métodos abstractos de esta
    @Override
    public boolean encajaTipo(Pantalan pantalan) {
        if ((this instanceof Recreo) && (pantalan.getTipo().equals("Recreo"))) {
            return true;
        } else {
            return false;
        }
    }

    //GETTERS Y SETTERS
        public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }
}