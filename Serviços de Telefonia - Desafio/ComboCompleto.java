import java.util.Scanner;

public class ComboCompleto {

    public static String verificarComboCompleto(String[] servicosContratados) {
        
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        for (String servico : servicosContratados) {
            switch (servico.trim().toLowerCase()) {
                case "movel":
                    movelContratado = true;
                    break;
                case "banda larga":
                    bandaLargaContratada = true;
                    break;
                case "tv":
                    tvContratada = true;
                    break;
            }
        }

        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] servicosContratados = input.split(",");
        
        String resultado = verificarComboCompleto(servicosContratados);

        System.out.println(resultado);

        scanner.close();
    }
}
