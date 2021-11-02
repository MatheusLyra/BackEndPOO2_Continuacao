package model;

import interfaces.ICamareira;
import interfaces.IRecepcionista;

public class Gerente extends Pessoa implements IRecepcionista, ICamareira{

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void arrumarCama() {
        System.out.println("Sei arrumar a cama");
        System.out.println();
        
    }

    @Override
    public void limparQuarto() {
        System.out.println("Sei limpar o quarto mais ou menos");
        System.out.println();
        
    }

    @Override
    public void saberAtenderTelefone() {
        System.out.println("Sei atender o telefone mais ou menos");
        System.out.println();
        
    }

    @Override
    public void saberFalarIngles() {
        System.out.println("Sei falar o inglês muito bem");
        System.out.println();
        
    }
    
}
