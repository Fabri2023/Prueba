package Herencia;
public class Departamento extends Casa{
    //atributo
    private int n_Cuartos;
    //constructor
    public Departamento(double area, double precio, int n_Cuartos){
        super(area,precio);
        this.n_Cuartos=n_Cuartos;
        
    }
            
    public void mostrardatos(){
        System.out.println("El area es: "+getArea());
        System.out.println("El precio es: "+getPrecio());
        System.out.println("El # de cuartos es: "+n_Cuartos);
        
        
    }
    
}
