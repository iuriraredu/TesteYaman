public class Carro {

    private String cor;
    private String modelo;
    private double velocidadeAtual;
    private final double velocidadeMaxima;
    private Boolean ligado = false;

    //set
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    //get
    public String getCor(){
        return this.cor;
    }
    public String getModelo(){
        return this.modelo;
    }
    public double getVelocidadeAtual(){
        return this.velocidadeAtual;
    }
    public double getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }
    public Boolean getLigado(){
        return this.ligado;
    }

    // construtor
    public Carro(String cor, String modelo, double velocidadeMaxima){
        velocidadeAtual = 0;
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //liga o carro
    public Boolean ligaedesliga() {
        if (!this.ligado){
            this.ligado = true;
            System.out.println("O carro foi ligado");
        } else {
            this.ligado = false;
            System.out.println("O carro foi desligado");
        }
        return this.ligado;
    }

    //acelera uma certa quantidade
    public void acelera(double quantidade) {
        double velocidadeNova = this.velocidadeAtual + quantidade;
        this.velocidadeAtual = (velocidadeNova < this.velocidadeMaxima)? velocidadeNova: this.velocidadeAtual;
    }

    //devolve a marcha do carro
    public Integer pegaMarcha() {
        return (this.velocidadeAtual<0.0)? -1: (this.velocidadeAtual<40)? 1: (this.velocidadeAtual<80)? 2: 3;
    }
}