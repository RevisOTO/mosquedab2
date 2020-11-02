package EjerciciosHilos;

class MasHilos {
    public static void main(String[] args) {
        System.out.println("Inicio del hilo main");

        MiHilo miHilo1 = MiHilo.CrearHilo("El hilo 1");
        MiHilo miHilo2 = MiHilo.CrearHilo("El hilo 2");
        MiHilo miHilo3 = MiHilo.CrearHilo("El hilo 3");

        for (int i = 0; i < 25; i++) 
        {
            System.out.print(".");
                try {
					Thread.sleep(80);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

        }
        System.out.println("Fin del hilo main");
    }
}

public class MiHilo implements Runnable 
{
	Thread hilo;

     MiHilo(String unHilo){
         hilo= new Thread(this,unHilo);
     }
     public static MiHilo CrearHilo (String otroHilo){
         MiHilo miHilo=new MiHilo(otroHilo);
         miHilo.hilo.start(); 
         return miHilo;
     }
     public void run(){
         System.out.println(hilo.getName()+" a sido iniciando.");
         try {
             for (int i=0; i<5;i++)
             {
                 Thread.sleep(400);
                 System.out.println(hilo.getName()+ ", a iterado "+i+" veces");
             }
         }catch (InterruptedException exc){
             System.out.println(hilo.getName()+ " a sido interrumpudo.");
         }
         System.out.println(hilo.getName()+" a finalizado.");
     }
	
}
