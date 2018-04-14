package br.exemplo.abstractFactory;

/**
 *
 * @author Antônio Francisco
 * @author Dawitt Ralph
 */
public class HPFactory extends InfraestruturaFactory{

    public Router montarRouter() {
        return new RouterHP();
    }

    public Switch montarSwitch() {
        return new SwitchHP();
    }
    
}
