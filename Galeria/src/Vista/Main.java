/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Lenovo
 */
    import GestionArchivos.Gestion;
    import Logica.*;
    import java.io.IOException;
    import java.util.*;
    import java.util.logging.Level;
    import java.util.logging.Logger;
/**
 *
 * @author Estudiante
 */
public class Main {
            
    public static void main(String[] args) throws IOException {
        Scanner lectura = new Scanner(System.in);
        Gestion traza = new Gestion("traza.txt");
        ArrayList<Artista> artistas = new ArrayList<>();
        ArrayList<Comprador> compradores = new ArrayList<>();
        ArrayList<Obra> obras = new ArrayList<>();
        ArrayList<Compra> compras = new ArrayList<>();
        int opcion;
        do{
        System.out.println("1. Agregar persona\n2. Agregar obra\n3. Comprar obra\n4. Guardar datos\n0. Salir");
        opcion = lectura.nextInt();
        switch(opcion){
            case 1:
                int opcion2;
                do{
                    System.out.println("Ingresa el tipo de persona que quiere agregar\n 1. Agregar artista\n 2. Agregar comprador\n0. salir");
                    opcion2 = lectura.nextInt();
                    switch (opcion2) {
                        case 1:
                            System.out.println("Ingrese el nombre del artista: ");
                            String nombre = lectura.next();
                            System.out.println("Ingrese el apellido del artista: ");
                            String apellido = lectura.next();
                            System.out.println("Ingrese el curriculum del artista: ");
                            String curriculump = lectura.next();
                            System.out.println("Ingrese las distinciones del artista: ");
                            String distinciones = lectura.next();
                            Artista artista = new Artista(curriculump,distinciones,nombre,apellido);
                            artistas.add(artista);
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre del comprador: ");
                            String nombre1 = lectura.next();
                            System.out.println("Ingrese el apellido del comprador: ");
                            String apellido1 = lectura.next();
                            Comprador comprador = new Comprador(nombre1, apellido1);
                            compradores.add(comprador);
                            break;
                    }
                } while (opcion2 >0 && opcion2 < 3);
                break;
            case 2:
                System.out.println("Ingrese el nombre de la obra");
                String nombreO = lectura.next();
                System.out.println("Ingrese la descripcion de la obra: ");
                String descO = lectura.next();
                System.out.println("Ingrese el estilo de la obra: ");
                String estilo = lectura.next();
                System.out.println("Ingrese el valor de la obra: ");
                float valor = lectura.nextInt();
                Obra obra= new Obra(nombreO,descO,estilo,valor);
                System.out.println("Ingrese el nombre del artista al cual pertenece la obra: ");
                String artista=lectura.next();
                break;
            case 3:
                /*System.out.println("Escoga en cual tienda quiere comprar: ");
                for(int z=0;z<tiendas.size();z++){
                    System.out.println(z + ". " + tiendas.get(z).getNombre());
                }
                int tienda = lectura.nextInt();
                System.out.println("Escoga el producto que quiere comprar: ");
                for(int p=0;p<tiendas.get(tienda).getProduVenta().size();p++){
                    System.out.println(p +". " + tiendas.get(tienda).getProduVenta().get(p).getProductoDistribuido().getNombre());
                }
                int compra = lectura.nextInt();
                System.out.println("Ahora conoce la traza de tu compra: ");
                Venta producto = tiendas.get(tienda).getProduVenta().get(compra);                
                System.out.println("Nombre del producto: " + producto.getProductoDistribuido().getNombre());
                Retail tienda1 = null;
                for(int e=0;e<tiendas.size();e++){
                    if(tiendas.get(e).getNombre().equals(producto.getProductoDistribuido().getDestino()))
                        tienda1 = tiendas.get(e);
                }
                System.out.println("Nombre de la tienda: " + tienda1.getNombre());
                System.out.println("Descripcion: " + tienda1.getDescripcion() + ", longitud: " + tienda1.getDireccion().getLongitud() + ", latitud: " + tienda1.getDireccion().getLatitud());
                System.out.println("Codigo de venta" + producto.getCodVenta());
                System.out.println("Precio" + producto.getPrecio());
                DistributionCenter distribuidora1 = null;
                for(int q=0;q<distribuidoras.size();q++){
                    if(distribuidoras.get(q).getNombre().equals(producto.getProductoDistribuido().getProductoProducido().getDestino()))
                        distribuidora1 = distribuidoras.get(q);
                }
                System.out.println("Nombre del centro de distribucion: " + distribuidora1.getNombre());
                System.out.println("Descripcion: " + distribuidora1.getDescripcion() + ", longitud: " + distribuidora1.getDireccion().getLongitud() + ", latitud: " + distribuidora1.getDireccion().getLatitud());
                System.out.println("Fecha de llegada del producto: " + producto.getProductoDistribuido().getFechaLlegada().getDia() + "," + producto.getProductoDistribuido().getFechaLlegada().getMes() + "," + producto.getProductoDistribuido().getFechaLlegada().getAnnio());
                System.out.println("Fecha de salida del producto: " + producto.getProductoDistribuido().getFechaSalida().getDia() + "," + producto.getProductoDistribuido().getFechaSalida().getMes() + "," + producto.getProductoDistribuido().getFechaSalida().getAnnio());
                Manufacturer manufacturer = null;
                for(int y=0;y<manufacturas.size();y++){
                    if(manufacturas.get(y).getNombre().equals(producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(0).getDestino()))
                        manufacturer = manufacturas.get(y);
                }
                System.out.println("Nombre del centro de manufactura: " + manufacturer.getNombre());
                System.out.println("Descripcion: " + manufacturer.getDescripcion() + ", longitud: " + manufacturer.getDireccion().getLongitud() + ", latitud: " + manufacturer.getDireccion().getLatitud());
                System.out.println("Fecha de llegada del producto: " + producto.getProductoDistribuido().getProductoProducido().getFechaLlegada().getDia() + "," + producto.getProductoDistribuido().getProductoProducido().getFechaLlegada().getMes() + "," + producto.getProductoDistribuido().getProductoProducido().getFechaLlegada().getAnnio());
                System.out.println("Fecha de salida del producto: " + producto.getProductoDistribuido().getProductoProducido().getFechaSalida().getDia() + "," + producto.getProductoDistribuido().getProductoProducido().getFechaSalida().getMes() + "," + producto.getProductoDistribuido().getProductoProducido().getFechaSalida().getAnnio());
                System.out.println("Numero de lote: " + producto.getProductoDistribuido().getProductoProducido().getNumLote());
                for (int i = 0; i < producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().size(); i++) {
                    Farmer granja = null;
                    for (int x = 0; x < granjas.size(); x++) {
                        if (granjas.get(x).getNombre().equals(producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getGranja())){
                            granja = granjas.get(x);
                        }
                    }
                    System.out.println("Nombre de la granja: " + granja.getNombre());
                    System.out.println("Descripcion: " + granja.getDescripcion() + ", longitud: " + granja.getDireccion().getLongitud() + ", latitud: " + granja.getDireccion().getLatitud());
                    System.out.println("Nombre de la materia prima: " + producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getNombre());
                    System.out.println("Fecha de llegada del producto: " + producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getFechaLlegada().getDia() + "," + producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getFechaLlegada().getMes() + "," + producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getFechaLlegada().getAnnio());
                    System.out.println("Fecha de llegada del producto: " + producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getFechaLlegada().getDia() + "," + producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getFechaLlegada().getMes() + "," + producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getFechaLlegada().getAnnio());

                }*/                
                break;
                case 4:
                traza.guardar(artistas, compradores, obras);
                    
                    break;
        }    
        }while(opcion>0 && opcion<5);  
    }       
}
