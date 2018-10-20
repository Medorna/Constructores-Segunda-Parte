import javax.swing.JOptionPane;

public class Dispositivos {
    
    public String Marca;
    public int AnoProduccion;
    public String Periferico;
    
    //constructor sin parametros
    public Dispositivos(){
        
        System.out.println("Constructor sin parametros");

    }
    //constructor con atributos
      public Dispositivos(String Marca, int AnoProduccion, String Periferico){
        
        System.out.println("Constructor con parametros");
        
        this.Marca = Marca;
        this.AnoProduccion = AnoProduccion;
        this.Periferico = Periferico;

    }
    
    public static void main (String[] Args){
        
        System.out.println("Hola dispositivo");
        
        Dispositivos d1 = new Dispositivos();
        
        d1.Marca = "Genius";
        d1.AnoProduccion= 1994;
        d1.Periferico = "Mouse";
        
        JOptionPane.showMessageDialog(null, "Primer Objeto sin parametros cargados: "+ "\r\n"+d1.Marca+"\r\n"+d1.AnoProduccion+"\r\n"+ d1.Periferico);
        
        Dispositivos d2 = new Dispositivos("Microsoft", 2014,"Teclado");
        
        JOptionPane.showMessageDialog(null, "Segundo Objeto con parametros cargados: "+ "\r\n"+d2.Marca + "\r\n" + d2.AnoProduccion + "\r\n" + d2.Periferico);
        
        Dispositivos d3 = new Dispositivos("Asus", 2015, "Headset");
        JOptionPane.showMessageDialog(null, "Tercer Objeto con parametros cargados: "+ "\r\n"+d3.Marca + "\r\n" + d3.AnoProduccion + "\r\n" + d3.Periferico);
        
        Dispositivos d4 = new Dispositivos("Razer", 2017, "Teclado mecanico");
        JOptionPane.showMessageDialog(null, "Cuarto Objeto con parametros cargados: "+ "\r\n"+d4.Marca + "\r\n" + d4.AnoProduccion + "\r\n" + d4.Periferico);

        Dispositivos d5 = new Dispositivos("Corsair", 2018, "Mouse gamer");
        JOptionPane.showMessageDialog(null, "Quinto Objeto con parametros cargados: "+ "\r\n"+d5.Marca + "\r\n" + d5.AnoProduccion + "\r\n" + d5.Periferico);
        
    }
    
} 
