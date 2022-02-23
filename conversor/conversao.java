package conversor; 
public class conversao {
    //Atributos 
    private double polegadas, milhas, pes;
    private double centimetros;
    private double quilometros;

public static void polegadasEmCentimetros(double polegadas){
    double resposta = polegadas * 2.54;
     System.out.println( polegadas+ " Polegadas " + "equivale a " + resposta + "centimetros");
    
}

public static void pesParaCentimetros(double pes){
    double resposta =  pes * 30.48;
    System.out.println( pes + " Pes equivale a " + resposta + "centimetros");
}


public  static void milhasParaQuilometros(double milhas){
    double resposta =  milhas * (1.609);
    System.out.println( milhas+ " Milhas " + "equivale a " + resposta + "km");
   
}


//Métodos GETs e SETs:
public double getpes(){
return this.pes;
}

public void setpes(int pes){
    this.pes = pes;
}

public double getpolegadas(){
return this.polegadas;
}

public void setpolegadas(int polegadas){
this.polegadas = polegadas;
}

public double getmilhas(){
return this.milhas;
}

public void setmilhas(int milhas){
this.milhas = milhas;
}
public double getquilometros(){
return this.quilometros;
}

public void setquilometros(double quilometros){
this.quilometros = quilometros;
}


public double getcentimetros(){
return this.centimetros;
}

public void setcentimetros(int centimetros){
this.centimetros = centimetros;
}

    
}
