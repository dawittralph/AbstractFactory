package br.exemplo.abstractFactory;

/**
 *
 * @author Antônio Francisco
 * @author Dawitt Ralph
 */
public class DatacomFactory extends InfraestruturaFactory{

    public Router montarRouter() {
        return new RouterDatacom();
    }

    public Switch montarSwitch() {
        return new SwitchDatacom();
    }
    
}
