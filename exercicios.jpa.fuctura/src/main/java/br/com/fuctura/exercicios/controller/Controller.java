package br.com.fuctura.exercicios.controller;


import javax.persistence.TypedQuery;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fuctura.exercicios.jpa.model.Usuario;

public class Controller {


	    public static void listarTodosUsuarios(EntityManager em) {
	        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u", Usuario.class);
	        List<Usuario> usuarios = query.getResultList();
	        usuarios.forEach(System.out::println);
	    }

	    public static void listarCodigosENomes(EntityManager em) {
	        TypedQuery<Object[]> query = em.createQuery("SELECT u.codigo, u.nome FROM Usuario u", Object[].class);
	        List<Object[]> usuarios = query.getResultList();
	        usuarios.forEach(u -> System.out.println("Código: " + u[0] + ", Nome: " + u[1]));
	    }

	    public static void listarUsuariosIdadeMaiorQue30(EntityManager em) {
	        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.idade > 30", Usuario.class);
	        List<Usuario> usuarios = query.getResultList();
	        usuarios.forEach(System.out::println);
	    }

	    public static void listarUsuariosNomeComecandoComA(EntityManager em) {
	        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.nome LIKE 'A%'", Usuario.class);
	        List<Usuario> usuarios = query.getResultList();
	        usuarios.forEach(System.out::println);
	    }

	    public static void listarUsuariosOrdenadosPorIdadeAsc(EntityManager em) {
	        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u ORDER BY u.idade ASC", Usuario.class);
	        List<Usuario> usuarios = query.getResultList();
	        usuarios.forEach(System.out::println);
	    }

	    public static void listarUsuariosOrdenadosPorIdadeDesc(EntityManager em) {
	        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u ORDER BY u.idade DESC", Usuario.class);
	        List<Usuario> usuarios = query.getResultList();
	        usuarios.forEach(System.out::println);
	    }

	    public static void listarUsuariosIdadeEntre20e40(EntityManager em) {
	        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.idade BETWEEN 20 AND 40", Usuario.class);
	        List<Usuario> usuarios = query.getResultList();
	        usuarios.forEach(System.out::println);
	    }

	    public static void listarUsuariosIdadeIgualA25(EntityManager em) {
	        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.idade = 25", Usuario.class);
	        List<Usuario> usuarios = query.getResultList();
	        usuarios.forEach(System.out::println);
	    }

	    public static void listar5UsuariosMaisRecentes(EntityManager em) {
	        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u ORDER BY u.codigo DESC", Usuario.class);
	        query.setMaxResults(5);
	        List<Usuario> usuarios = query.getResultList();
	        usuarios.forEach(System.out::println);
	    }

	    public static void listarUsuariosComCPFNaoNulo(EntityManager em) {
	        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.cpf IS NOT NULL", Usuario.class);
	        List<Usuario> usuarios = query.getResultList();
	        usuarios.forEach(System.out::println);
	    }

	    public static void listarUsuariosCPFterminandoEm1234(EntityManager em) {
	        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.cpf LIKE '%1234'", Usuario.class);
	        List<Usuario> usuarios = query.getResultList();
	        usuarios.forEach(System.out::println);
	    }

	    public static void listarMediaDasIdades(EntityManager em) {
	        TypedQuery<Double> query = em.createQuery("SELECT AVG(u.idade) FROM Usuario u", Double.class);
	        Double media = query.getSingleResult();
	        System.out.println("Média das idades: " + media);
	    }

	    public static void listarUsuarioMaisVelho(EntityManager em) {
	        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u ORDER BY u.idade DESC", Usuario.class);
	        query.setMaxResults(1);
	        Usuario usuario = query.getSingleResult();
	        System.out.println("Usuário mais velho: " + usuario);
	    }

	    public static void listarUsuarioMaisJovem(EntityManager em) {
	        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u ORDER BY u.idade ASC", Usuario.class);
	        query.setMaxResults(1);
	        Usuario usuario = query.getSingleResult();
	        System.out.println("Usuário mais jovem: " + usuario);
	    }

	    public static void listarQuantidadeTotalUsuarios(EntityManager em) {
	        TypedQuery<Long> query = em.createQuery("SELECT COUNT(u) FROM Usuario u", Long.class);
	        Long total = query.getSingleResult();
	        System.out.println("Quantidade total de usuários: " + total);
	    }

	    public static void listarUsuariosNomeContendoSilva(EntityManager em) {
	        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.nome LIKE '%Silva%'", Usuario.class);
	        List<Usuario> usuarios = query.getResultList();
	        usuarios.forEach(System.out::println);
	    }

	    public static void listarQuantidadeUsuariosPorIdade(EntityManager em) {
	        TypedQuery<Object[]> query = em.createQuery("SELECT u.idade, COUNT(u) FROM Usuario u GROUP BY u.idade", Object[].class);
	        List<Object[]> resultados = query.getResultList();
	        resultados.forEach(r -> System.out.println("Idade: " + r[0] + ", Quantidade: " + r[1]));
	    }

	    public static void listarNomeECPFUsuariosIdadeMenorQue30(EntityManager em) {
	        TypedQuery<Object[]> query = em.createQuery("SELECT u.nome, u.cpf FROM Usuario u WHERE u.idade < 30", Object[].class);
	        List<Object[]> usuarios = query.getResultList();
	        usuarios.forEach(u -> System.out.println("Nome: " + u[0] + ", CPF: " + u[1]));
	    }

	    public static void listarNomeECPFExcluindoJoao(EntityManager em) {
	        TypedQuery<Object[]> query = em.createQuery("SELECT u.nome, u.cpf FROM Usuario u WHERE u.nome != 'João'", Object[].class);
	        List<Object[]> usuarios = query.getResultList();
	        usuarios.forEach(u -> System.out.println("Nome: " + u[0] + ", CPF: " + u[1]));
	    }

	    public static void listarUsuariosIdadePar(EntityManager em) {
	        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE MOD(u.idade, 2) = 0", Usuario.class);
	        List<Usuario> usuarios = query.getResultList();
	        usuarios.forEach(System.out::println);
	    }
	


}