import java.util.InputMismatchException;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int numeroConta=0;
        float saldo=0;
        String agencia="", nome="";
        try (Scanner Scan = new Scanner(System.in)) {
            System.out.println("Digite o nome do titular da conta: ");
            nome=Scan.nextLine();
            if (!nome.matches("[a-zA-Z ]+")) {
                throw new IllegalArgumentException("O nome deve conter apenas letras e espaços.");
            }
            System.out.println("Digite a agencia da conta: ");
            agencia=Scan.next();
            System.out.println("Digite o numero da conta: ");
            numeroConta=Scan.nextInt();
            System.out.println("Digite o saldo da conta: ");    
            saldo=Scan.nextFloat();
            System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque.");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite os dados corretamente.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
