package br.exemplo.abstractFactory;

/**
 *
 * @author Antônio Francisco
 * @author Dawitt Ralph
 */
public class CiscoFactory extends InfraestruturaFactory{

    public Router montarRouter() {
        return new RouterCisco();
    }

    public Switch montarSwitch() {
        return new SwitchCisco();
    }
    
    
}
