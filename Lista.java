import javax.swing.JOptionPane;


public class Lista {
    Nodo punta;
    Nodo cola;

    public Lista() {
        this.punta = null;
    }

    public Nodo getPunta() {
        return punta;
    }

    public void setPunta(Nodo punta) {
        this.punta = punta;
    }


    public void insertarinicio(int dato)
    {
        Nodo x =new Nodo(dato);
        if (punta==null)
        {
            this.punta=x;
            cola=x;
        }
        else
        {
            x.setLigaD(punta);
            punta.setLigaI(x);
            this.punta=x;
        }
        
    }
    public String mostrar()
    {
        String cadena="[";//guarda los datos que tenga P
        Nodo p =punta;
        while (p!=null)
        {
            cadena+="{" +p.getdato()+ "} =>";
            p=p.getLigaD();
        }
        return cadena += " ]";

    }
    

    public void insertarfinal(int dato)
    {
        Nodo p=punta;
        
        Nodo x = new Nodo(dato);
        if (punta==null)
        {
            punta=x;
            cola=x;
        }
        else
        {
            while(p.getLigaD()!=null)
            {
                p=p.getLigaD();
            }
            x.setLigaI(p);
            p.setLigaD(x);
            cola=x;
        }
    }
    public void insertarordenadoasc(int dato)
    {
        Nodo x = new Nodo(dato);
        Nodo p=punta;
        Nodo q=null;
        if (punta==null)// Si lista está vacía e insertará al inicio
        {
            insertarinicio(dato);
        }
        else//Si la lista tiene datos, el entra.
        {
            
            while (p!=null && p.getdato()<dato )//El dato es mayor y lo ordena ascendente
            {
                q=p;
                p=p.getLigaD();
             }
            if (p==null)
            {
                insertarfinal(dato);
            }
            else if (p==punta)
            {
                insertarinicio(dato);
            }
            else
            {
                x.setLigaI(q);
                x.setLigaD(p);
                if (q!=null)
                {
                    q.setLigaD(x);
                }
            }
        }
    }
    
        
        
    
    public boolean busqueda(int datobusq)
    {
       Nodo p=punta;
        boolean enc=false;
        if (punta==null)
        {
            System.out.println("Lista vacia");//otra manera de imprimir por consola
        }
        else 
        {
            while (p!=null&&enc==false)//Si no ha encontrado el dato, sigue iterando hastas encontrarlo
            {
                if (p.getdato()==datobusq)//si p encuentra el dato enc se vuelve true
                {
                    enc=true;                  
                }
                p=p.getLigaD();
            }
        }
        return enc;
    }
    public void ordenarascendente()
    {
        Nodo p=punta;
        Nodo q=p;
        int aux;
        while(p!=null)
        {
            q=punta;
            while (q!=null)
            {
                if (p.getdato()<q.getdato())
                {
                    aux=p.getdato();
                    p.setdato(q.getdato());
                    q.setdato(aux);
                }
                q=q.getLigaD();
            }
            p=p.getLigaD();
        }
    }
       public void ordenardescendente()
    {
        Nodo p=punta;
        Nodo q=p;
        int aux;
        while(p!=null)
        {
            q=punta;
            while (q!=null)
            {
                if (p.getdato()>q.getdato())
                {
                    aux=p.getdato();
                    p.setdato(q.getdato());
                    q.setdato(aux);
                }
                q=q.getLigaD();
            }
            p=p.getLigaD();
        }
    }
       public void eliminar(int dato)
       {
       Nodo p=punta;
       Nodo q=null;
        boolean enc=this.busqueda(dato);
        if (punta==null)
        {
            System.out.println("Lista vacia");
        }
        else 
        {
            if (enc==false)
             {
                 JOptionPane.showMessageDialog(null,"No se encontró el dato en la lista");
             }
            else
            {
                while (p.getdato()!=dato)
                {
                    q=p;
                    p=p.getLigaD();
                }
                if (p==punta)
                {
                    punta=punta.getLigaD();
                    if (punta!=null)
                    {
                        punta.setLigaI(null);
                    }
                }
                else if(p==cola)
                {
                       if (q!=null)
                       {
                           q.setLigaD(null);
                       }
                       cola=cola.getLigaI();
                }
                else
                {
                    q.setLigaD(p.getLigaD());
                    p.getLigaD().setLigaI(q);
                }

            }
        }
        

    }