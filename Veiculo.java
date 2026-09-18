import java.time.LocalDate;

public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;

    public Veiculo() {

    }

    public Veiculo(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (!marca.equalsIgnoreCase("Peugeot")) {
            this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int CalculaTempoUso() {
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - this.ano;
    }

    public int calculaTempoUso(int anoBase) {
        return anoBase - this.ano;
    }


    @Override
    public String toString() {
        return marca + " " + modelo
                + " | Placa: " + placa
                + " | Ano: " + ano;
    }

    

}