package org.example;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Gustavo");
        g1.setCpf("123456098-97");
        g1.setSalario(4000.00);

        System.out.println(g1.getCpf());
        System.out.println(g1.getNome());
        System.out.println(g1.getSalario());

        g1.setSenha(222);
        boolean autenticou = g1.autentica(222);

        System.out.println(autenticou);
    }
}
