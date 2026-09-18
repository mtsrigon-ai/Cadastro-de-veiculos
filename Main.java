import java.time.LocalDate;
import java.util.ArrayList;

ArrayList<Veiculo> veiculos = new ArrayList<>();

void main() {

    String menu = """
            ===CadVeiculos===
            1 - Cadastrar Veiculos;
            2 - Listar veiculos;
            3 - Consultar veiculos;
            0 - Sair;
            =================
            """;

    int opcao;
    do {
        IO.println(menu);
        opcao = Input.readInt("Digite uma opção: ");
        switch (opcao) {
            case 1 -> cadastrarVeiculo();

            case 2 -> listarVeiculos();

            case 3 -> consultarVeiculo();

            case 0 -> IO.println("Saindo do programa...");
            default -> {
                IO.println("Opção Inválida");
            }
        }
    } while (opcao != 0);

}

void cadastrarVeiculo() {

    String marca = IO.readln("Digite a marca do veiculo: ");
    String modelo = IO.readln("Digite o Modelo do seu veiculo: ");
    String placa = IO.readln("Digite a placa do veiculo: ");
    int ano = Input.readInt("Digite o ano do seu veiculo: ");
    placa = padronizarPlaca(placa);

    if (marca.isEmpty() || modelo.isEmpty() || placa.isEmpty()) {
        IO.println("Todos os espaços devem ser preenchidos!");
        return;
    }
    if (placaExiste(placa)) {
        IO.println("Essa placa já está cadastrada no sistema!");
        return;
    }

    int anoAtual = LocalDate.now().getYear();
    if (ano < 1900 || ano > anoAtual + 1) {
        IO.println("Ano do veiculo invalido para cadastro. ");
        return;
    }

    Veiculo novoVeiculo = new Veiculo(marca, modelo, ano, placa);
    veiculos.add(novoVeiculo);

    IO.println("Veiculo cadastrado com sucesso!");

}

void listarVeiculos() {
    for (int i = 0; i < veiculos.size(); i++) {
        IO.println((i + 1) + "-" + veiculos.get(i));

    }
}

void consultarVeiculo() {

    String placaProcurada = IO.readln("Digite a placa do veiculo que deseja consultar: ");
    placaProcurada = padronizarPlaca(placaProcurada);

    for (Veiculo v : veiculos){
        if (v.getPlaca().equals(placaProcurada)) {
            IO.println("Veiculo encontrado: " + v);
            return;
        }
    }

    IO.println("Veiculo não encontrado.");




}   




String padronizarPlaca(String placa) {
    return placa.trim().toUpperCase();
}


boolean placaExiste(String placa) {

    for (Veiculo v : veiculos) {
        if (v.getPlaca().equals(placa)) {
            return true;
        }
    }

    return false;
}