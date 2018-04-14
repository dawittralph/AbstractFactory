package br.exemplo.abstractFactory;

/**
 *
 * @author Antônio Francisco
 * @author Dawitt Ralph
 */
public class MainFactory {
    private static Infraestrutura montarInfraestrutura(String marca){
        InfraestruturaFactory infraf = null;
        switch(marca){
            case "cisco":
                infraf = new CiscoFactory();
                break;
            case "hp":
                infraf = new HPFactory();
                break;
            case "datacom":
                infraf = new DatacomFactory();
                break;
        }
        Infraestrutura infraestrutura = new Infraestrutura();
        infraestrutura.setRouter(infraf.montarRouter());
        infraestrutura.setSw(infraf.montarSwitch());
        return infraestrutura;
    }
    
    public static void main(String[] args) {
        Infraestrutura infraCisco = montarInfraestrutura("cisco");
        Infraestrutura infraHP = montarInfraestrutura("hp");
        Infraestrutura infraDatacom = montarInfraestrutura("datacom");
        System.out.println("End");
    }
    
}
