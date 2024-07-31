package br.com.fuctura.exercicios.jpa;

import java.util.Scanner;
import javax.persistence.EntityManager;
import br.com.fuctura.exercicios.controller.Controller;
import util.EntityManagerUtil;

public class Exercicio {

    public static void main(String[] args) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma consulta:");
            System.out.println("1. Selecionar todos os registros");
            System.out.println("2. Selecionar códigos e nomes");
            System.out.println("3. Usuários com idade > 30");
            System.out.println("4. Usuários com nome começando com 'A'");
            System.out.println("5. Usuários ordenados por idade crescente");
            System.out.println("6. Usuários ordenados por idade decrescente");
            System.out.println("7. Usuários com idade entre 20 e 40");
            System.out.println("8. Usuários com idade igual a 25");
            System.out.println("9. 5 usuários mais recentes");
            System.out.println("10. Usuários com CPF não nulo");
            System.out.println("11. Usuários com CPF terminando em '1234'");
            System.out.println("12. Média das idades dos usuários");
            System.out.println("13. Usuário mais velho");
            System.out.println("14. Usuário mais jovem");
            System.out.println("15. Quantidade total de usuários");
            System.out.println("16. Usuários com nome contendo 'Silva'");
            System.out.println("17. Quantidade de usuários por idade");
            System.out.println("18. Nome e CPF de usuários com idade < 30");
            System.out.println("19. Nome e CPF, excluindo 'João'");
            System.out.println("20. Usuários com idade par");
            System.out.println("0. Sair");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    Controller.listarTodosUsuarios(em);
                    break;
                case 2:
                    Controller.listarCodigosENomes(em);
                    break;
                case 3:
                    Controller.listarUsuariosIdadeMaiorQue30(em);
                    break;
                case 4:
                    Controller.listarUsuariosNomeComecandoComA(em);
                    break;
                case 5:
                    Controller.listarUsuariosOrdenadosPorIdadeAsc(em);
                    break;
                case 6:
                    Controller.listarUsuariosOrdenadosPorIdadeDesc(em);
                    break;
                case 7:
                    Controller.listarUsuariosIdadeEntre20e40(em);
                    break;
                case 8:
                    Controller.listarUsuariosIdadeIgualA25(em);
                    break;
                case 9:
                    Controller.listar5UsuariosMaisRecentes(em);
                    break;
                case 10:
                    Controller.listarUsuariosComCPFNaoNulo(em);
                    break;
                case 11:
                    Controller.listarUsuariosCPFterminandoEm1234(em);
                    break;
                case 12:
                    Controller.listarMediaDasIdades(em);
                    break;
                case 13:
                    Controller.listarUsuarioMaisVelho(em);
                    break;
                case 14:
                    Controller.listarUsuarioMaisJovem(em);
                    break;
                case 15:
                    Controller.listarQuantidadeTotalUsuarios(em);
                    break;
                case 16:
                    Controller.listarUsuariosNomeContendoSilva(em);
                    break;
                case 17:
                    Controller.listarQuantidadeUsuariosPorIdade(em);
                    break;
                case 18:
                    Controller.listarNomeECPFUsuariosIdadeMenorQue30(em);
                    break;
                case 19:
                    Controller.listarNomeECPFExcluindoJoao(em);
                    break;
                case 20:
                    Controller.listarUsuariosIdadePar(em);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scan.close();
        em.close();
    }
}
