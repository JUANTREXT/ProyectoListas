import javax.swing.JOptionPane;


public class Menu {
    
    public static void menulistas() 
{
  int opcion, dato; 
  Lista l1 = new Lista();
  Lista l2 = new Lista();
  Lista l3 = new Lista();
  Lista l4 = new Lista();
  Lista l5 = new Lista();
  Lista l6= new Lista();
  
   JOptionPane.showMessageDialog(null,"Bienvenido(a)");
  do 
   {
       opcion=Integer.parseInt(JOptionPane.showInputDialog("escoja una opcion:\n1.Mostrar\n2.Insertar ordenado\n3.Insertar final\n4.Insertar inicio\n5.Buscar\n6.Ordenar ascendente\n7.Ordenar descendente\n8.Eliminar\n0.salir"));

       switch (opcion)   
       {
           case 1:
              JOptionPane.showMessageDialog(null,l1.mostrar());
            break;
           case 2:
              dato= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a colocar en la lista"));
               l1.insertarordenadoasc(dato);
            break;
           case 3:
              dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a insertar al final en la lista"));
              l1.insertarfinal(dato);
           break;
           case 4:
                dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a insertar al inicio en la lista"));
              l1.insertarinicio(dato);
            break;
           case 5:
               dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a buscar"));
               if (l1.busqueda(dato)==true)
               {
                    JOptionPane.showMessageDialog(null,"Dato encontrado");
               } 
               else
               {
                   JOptionPane.showMessageDialog(null,"Dato no encontrado");
               }
            break;
           case 6:
                  l1.ordenarascendente();
                  JOptionPane.showMessageDialog(null,l1.mostrar());
               break;
           case 7:
                  l1.ordenardescendente();
                  JOptionPane.showMessageDialog(null,l1.mostrar());
               break;
           case 8:
              dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a eliminar"));
              l1.eliminar(dato);
            break;
       }
   }
 while (opcion!=0);
}
public static void main(String[] args)
  {
      Lista l1 = new Lista();
      menulistas();
  }
}
//PROYECTO PARA EL 22 DE MARZO, TODA LA LISTA DEBE FUNCIONAR. 
