public class Nodo {
    private int dato;//atributos de la clase nodo
    Nodo ligaD,ligaI;
    
    Nodo(int dato)
    {
        this.dato=dato;//atributo que cambia por el dato que recibe
        ligaD=null;
        ligaI=null;//El método constructor le da valores iniciales a la clase
        
    }
    public int getdato()//métodos de acción
    {
        return this.dato;//se refiere a la entidad que llama el método
    }
    public void setdato(int dato)
    {
        this.dato=dato;
    }

    public Nodo getLigaD() {
        return ligaD;
    }

    public Nodo getLigaI() {
        return ligaI;
    }

    public void setLigaD(Nodo ligaD) {
        this.ligaD = ligaD;
    }

    public void setLigaI(Nodo ligaI) {
        this.ligaI = ligaI;
    }
    
    
}