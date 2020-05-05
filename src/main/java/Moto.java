public class Moto {

    private String Cor, modelo, fabricante;
    private int Cilindradas, qtdMarchas, ano;
    private boolean automatica;

    //set
    public void setCor(String cor) {
        Cor = cor;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setCilindradas(int cilindradas) {
        Cilindradas = cilindradas;
    }
    public void setQtdMarchas(int qtdMarchas) {
        this.qtdMarchas = qtdMarchas;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setAutomatica(boolean automatica) {
        this.automatica = automatica;
    }

    //get
    public String getCor() {
        return Cor;
    }
    public String getModelo() {
        return modelo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public int getCilindradas() {
        return Cilindradas;
    }
    public int getQtdMarchas() {
        return qtdMarchas;
    }
    public int getAno() {
        return ano;
    }
    public boolean getAutomatica() {
        return automatica;
    }
}
