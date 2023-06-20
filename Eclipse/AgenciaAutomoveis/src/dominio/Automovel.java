package dominio;

public class Automovel {

	/* Atributos
	 * 
	 * Um automóvel possui as informações de placa 
	 * (String), modelo (String), combustível (byte), 
	 * cor (String) e ano (short).
	 */
	private String placa;
	private String modelo;
	private byte combustivel;
	private String cor;
	private short ano;
	
	// Constantes
	public static final byte GASOLINA = 1;
	public static final byte ALCOOL = 2;
	public static final byte DIESEL = 3;
	public static final byte GAS = 4;
	
/**
 * Construtor parametrizado 
 * @param placa
 * @param modelo
 * @param combustivel
 * @param cor
 * @param ano
 */
	public Automovel(String placa, String modelo, byte combustivel, String cor,
			short ano) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.combustivel = combustivel;
		this.cor = cor;
		this.ano = ano;
	}

	/**
	 * 
	 * @return
	 */
	public double calcularCusto() {
		double custo;
		switch( this.combustivel) {
		case GASOLINA :
			custo =  12.000;
			break;
		case ALCOOL : 
			custo =  10.500;
			break;
		case DIESEL : 
			custo = 11000;
			break;
		case GAS : 
			custo = 13000;
			break;
		default :
			custo = 0;
			break;
		}
		return custo;
	}
	
	// Metodos de Acesso
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public byte getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(byte combustivel) {
		this.combustivel = combustivel;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public short getAno() {
		return ano;
	}

	public void setAno(short ano) {
		this.ano = ano;
	}

	public String toString() {
		return "Automovel [placa=" + placa + ", modelo=" + modelo
				+ ", combustivel=" + combustivel + ", cor=" + cor + ", ano="
				+ ano + "]";
	}
	
	
}
