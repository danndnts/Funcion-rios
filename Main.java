import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String r;
        do {

            System.out.println("Digite seu nome: ");
            p.setNome(sc2.nextLine());

            System.out.println("Digite seu salário: ");
            p.setSalario(sc.nextDouble());

            System.out.println("Digite as horas trabalhadas: ");
            p.setHoras(sc.nextInt());

            System.out.println("Nome: " + p.getNome());
            System.out.println("Salário/Hora: " + p.getSalario());
            System.out.println("Horas trabalhadas: " + p.getHoras());

            p.calculaSalHor();
            System.out.println("Salário: " + p.getSalariohora());

            System.out.println("Deseja cadastrar outro usuário, digite S");
            r = sc.next();
        } while (r.equalsIgnoreCase("S"));
    }
}