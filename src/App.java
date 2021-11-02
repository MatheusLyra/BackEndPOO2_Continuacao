import java.util.ArrayList;

import model.Camareira;
import model.Cliente;
import model.EnumTipo;
import model.Gerente;
import model.Quarto;
import model.Recepcionista;

public class App {
    public static void main(String[] args) {

        System.out.println("Hotel JAVA");

        Recepcionista recepcionista1 = new Recepcionista("Rafaela", "(21)94592-9934", "055.820.597-07");

        recepcionista1.saberAtenderTelefone();
        recepcionista1.saberFalarIngles();

        Camareira camareira1 = new Camareira("Joana", "(21)94588-9934", "054.520.597-07");

        camareira1.arrumarCama();
        camareira1.limparQuarto();

        //Aplicando interfaces
        Gerente gerente1 = new Gerente("Flávio", "(21)98772-9664", "055.880.597-07");

        gerente1.saberAtenderTelefone();
        gerente1.saberFalarIngles();
        gerente1.arrumarCama();
        gerente1.limparQuarto();


        //Aplicando Enum (Enumerador)
        Quarto quarto1 = new Quarto();
        quarto1.setNumero("216B");
        quarto1.setValor(150.0);
        quarto1.setTipo(EnumTipo.BASICO);

        Quarto quarto2 = new Quarto();
        quarto2.setNumero("820B");
        quarto2.setValor(800.0);
        quarto2.setTipo(EnumTipo.PRESIDENCIAL);

        System.out.println(quarto2.getTipo());
        System.out.println(quarto2.getTipo().getValor());

        //Aplicando Streams
        Cliente cliente1 = new Cliente("Manoel", "(21)99992-9934", "057.860.597-07", 55);
        Cliente cliente2 = new Cliente("Carlos", "(21)99992-9934", "057.860.597-07",34);
        Cliente cliente3 = new Cliente("Roberta", "(21)99992-9934", "057.860.597-07", 28);
        Cliente cliente4 = new Cliente("Maria", "(21)99992-9934", "057.860.597-07", 34);
        Cliente cliente5 = new Cliente("Lais", "(21)99992-9934", "057.860.597-07", 30);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(cliente1); 
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);

        //qntde de objetos no array
        clientes.stream().count(); // ou 
        clientes.size();

        //stream de cliente com qntde limitada, no caso só apresenta os 2 primeiros clientes do array
        var resultado1 = clientes.stream().limit(2);
        //ou para apresenta uso expressão lambda
        clientes.stream()
        .limit(2)
        .forEach(c -> System.out.println(c.getNome()));

        //pula os dois primeiros clientes do array
        var resultado2 = clientes.stream().skip(2);
         //ou para apresenta uso expressão lambda
        clientes.stream()
        .skip(2)
        .forEach(c -> System.out.println(c.getNome()));

        // var resultado3 = clientes.stream().sorted();

        //retorna uma lista com os clientes acima de 30 anos (predicado é o mesmo que estrutura lambda que é esta expressão"c -> c.getIdade() > 30")
        var resultado4 = clientes.stream().filter(c -> c.getIdade() > 30);
        //ou para apresenta uso expressão lambda
        clientes.stream()
        .filter(c -> c.getIdade() > 30)
        .forEach(c -> System.out.println(c.getNome()));
        //ou
        resultado4.forEach(c -> System.out.println(c.getNome()));
  
        //filtro por nome
        clientes.stream()
        .filter(c -> c.getNome().contains("Manoel"))
        .forEach(c -> System.out.println(c.getNome()));
  
        System.out.println();
        System.out.println();

        //Cliente que começam com as letras Ma
        clientes.stream()
        .filter(c -> c.getNome().startsWith("Ma"))
        .forEach(c -> System.out.println(c.getNome()));

        System.out.println();
        System.out.println(); 

        //o map neste caso retorna uma lista somente com o nome dos clientes. o map mapeia o array.
        var nome = clientes.stream().map(c -> c.getNome());
        //mesma coisa do de cima, porém de forma diferente.
        clientes.stream().map(Cliente :: getNome);
    }
}
