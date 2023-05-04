public class Main {
    public static void main(String[] args) {
        //Creamos un puerto
        Puerto puerto = new Puerto();

        //Llamada al método cargar barcos entrantes
        Barco.cargarBarcosEntrantes(puerto.getBarcosEntrantes());

        //Llamada al método simular
        Puerto.simular(puerto.getListaPantalan());

        //Llamada al método buscar amarre
        Puerto.buscarAmarre(puerto.getListaPantalan() ,puerto.getBarcosEntrantes());

        //Llamada al método ver amarres
        Puerto.verAmarres(puerto.getListaPantalan());
    }
}
