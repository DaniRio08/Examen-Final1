import java.util.ArrayList;

public class Puerto {
        
    //ATRIBUTOS
    private ArrayList<Barco> barcosEntrantes;
    private ArrayList<Pantalan> listaPantalan;

    //CONSTRUCTOR
    public Puerto() {
        this.setBarcosEntrantes();
        this.setListaPantalan();
    }

    //toString
    @Override
    public String toString() {
        return "Puerto [barcosEntrantes=" + barcosEntrantes + ", listaPantalan=" + listaPantalan + "]";
    }

    //MÉTODOS

    /*Método que recibe una lista de Pantalanes y de barcos y asigna a cada amarre del pantalan el barco de mayor tamaño
    siempre y cuando coincida con el tipo del pantalan y quepa en el amarre*/
    public static void buscarAmarre(ArrayList<Pantalan> listaPantalan, ArrayList<Barco> barcosEntrantes) {
        for (int i = 0; i < listaPantalan.size(); i++) {
            Pantalan pantalan = listaPantalan.get(i);
            for (int j = 0; j < pantalan.getListaAmarres().size(); j++) {
                Amarre amarre = pantalan.getListaAmarres().get(j);
                if (barcosEntrantes.size() != 0) {
                    Barco barco = Barco.mayorTamaño(barcosEntrantes);
                    if ((barco.encajaTipo(pantalan) && (barco.encajaTamaño(amarre) > 0))) { //Cuando el barco sea del mismo tipo y menor que el pantalan
                        amarre.setOcupado(true);
                        amarre.setBarco(barco);
                        barcosEntrantes.remove(barco);
                    }
                }
            }
        }
    }

    //Método que muestra por pantalla todos los amarres del puerto
    public static void verAmarres(ArrayList<Pantalan> listaPantalan) {
        for (int i = 0; i < listaPantalan.size(); i++) {
            System.out.println(listaPantalan.get(i).toString());
        }
    }

    //Método que simula la inserción de datos para poder probar el resto de métodos
    public static void simular(ArrayList<Pantalan> listaPantalan) {
        //Creamos pantalanes
        Pantalan pantalan1 = new Pantalan("Comercial");
        Pantalan pantalan2 = new Pantalan("Comercial");
        Pantalan pantalan3 = new Pantalan("Recreo");
        Pantalan pantalan4 = new Pantalan("Recreo");
        listaPantalan.add(pantalan1);
        listaPantalan.add(pantalan2);
        listaPantalan.add(pantalan3);
        listaPantalan.add(pantalan4);

        //Creamos amarres para los diferentes pantalanes
        Amarre amarre1 = new Amarre(150f);
        Amarre amarre2 = new Amarre(100f);
        Amarre amarre3 = new Amarre(200f);
        Amarre amarre4 = new Amarre(160f);
        Amarre amarre5 = new Amarre(5f);
        Amarre amarre6 = new Amarre(50f);
        Amarre amarre7 = new Amarre(100f);
        Amarre amarre8 = new Amarre(150f);
        pantalan1.getListaAmarres().add(amarre1);
        pantalan1.getListaAmarres().add(amarre2);
        pantalan2.getListaAmarres().add(amarre3);
        pantalan2.getListaAmarres().add(amarre4);
        pantalan3.getListaAmarres().add(amarre5);
        pantalan3.getListaAmarres().add(amarre6);
        pantalan4.getListaAmarres().add(amarre7);
        pantalan4.getListaAmarres().add(amarre8);
    }

    //GETTERS Y SETTERS
    public ArrayList<Barco> getBarcosEntrantes() {
        return barcosEntrantes;
    }
    
    public void setBarcosEntrantes() {
        this.barcosEntrantes = new ArrayList<>();
    }
    public ArrayList<Pantalan> getListaPantalan() {
        return listaPantalan;
    }
    public void setListaPantalan() {
        this.listaPantalan = new ArrayList<>();
    }
}
