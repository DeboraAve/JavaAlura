package org.example;

public class TesteFuncionario {
    public static void main(String[] args){
        Funcionario nico = new Funcionario();
        nico.setNome("Nico Steves");
        nico.setCpf("11112222-434");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());
    }
}
