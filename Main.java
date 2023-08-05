package reservasala;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        boolean loginSuccessful = login();
        
        if (loginSuccessful) {
            
            iniciarSistema();
        } else {
           
            System.out.println("Login falhou. Encerrando o programa.");
        }
    }
    
    private static boolean login() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Tela de Login ===");
        System.out.print("Digite seu nome de usuário: ");
        String username = scanner.nextLine();
        
        System.out.print("Digite sua senha: ");
        String password = scanner.nextLine();
        
    
        return username.equals("admin") && password.equals("admin");
    }
    
    private static void iniciarSistema() {
        
        System.out.println("Login bem-sucedido. Iniciando o sistema...");
        
        
    }
}
