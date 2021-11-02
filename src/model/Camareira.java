package model;

import interfaces.ICamareira;

public class Camareira extends Pessoa implements ICamareira{

    public Camareira(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void arrumarCama() {
        System.out.println("Sei muito bem arrumar a cama");
        System.out.println();
    }

    @Override
    public void limparQuarto() {
        System.out.println("Sei muito bem limpar o quarto");  
        System.out.println();
    }
    
}
