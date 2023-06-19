package exercicio5;

public class Caneta{
	  private String marca, cor;
	  private int tamanho;

	  public Caneta(){}
	  public Caneta(String marca, String cor, int tamanho){
	    this.marca = marca;
	    this.cor = cor;
	    this.tamanho = tamanho;
	  }
	  //getters
	  public String getMarca(){
	    return this.marca;
	  }
	  public String getCor(){
	    return this.cor;
	  }
	  public int getTamanho(){
	    return this.tamanho;
	  }

	  //setters
	  public void setMarca(String marca){
	    this.marca = marca;
	  }
	  public void setCor(String cor){
	    this.cor = cor;
	  }
	  public void setTamanho(int tamanho){
	    this.tamanho = tamanho;
	  }

	  //toString
	  public String toString(){
	    return "Caneta\n\tTamanho: "+this.tamanho+"\n\tCor: "+this.cor+"\n\tTamanho: "+this.tamanho+"\n";
	  }
	}
