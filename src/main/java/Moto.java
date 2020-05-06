public class Moto {

    private String cor, fabricante;
    private int cilindradas, qtdMarchas, ano;
    private boolean automatica;
    private double velocidadeAtual, velocidadeMaxima;

    //get
    public String getCor() {
        return cor;
    }
    public String getFabricante() {
        return fabricante;
    }
    public int getCilindradas() {
        return cilindradas;
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
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    //set
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
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

    //construtor
    public Moto (String cor,
                 String fabricante,
                 int cilindradas,
                 int qtdMarchas,
                 int ano,
                 boolean automatica,
                 double velocidadeMaxima){
        this.cor = cor;
        this.fabricante = fabricante;
        this.cilindradas = cilindradas;
        this.qtdMarchas = qtdMarchas;
        this.ano = ano;
        this.automatica = automatica;
        this.velocidadeMaxima = velocidadeMaxima;
        velocidadeAtual = 0;
    }

    // ​acelerar e parar
    public void acelerar(double qtd){

    }
    public void parar(){

    }
}
