public class Input {
    public static int readInt(String message) {
        // for(;;)
        while (true) {
            try {
                String valor = IO.readln(message);
                return Integer.parseInt(valor);
            } catch (Exception e) {
                IO.println("Valor inválido! Digite um número inteiro.");
            }
        }
    }

}