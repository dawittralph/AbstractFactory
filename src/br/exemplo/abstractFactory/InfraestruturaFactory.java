package br.exemplo.abstractFactory;

/**
 *
 * @author Antônio Francisco
 * @author Dawitt Ralph
 */
public abstract class InfraestruturaFactory {
    public abstract Router montarRouter();
    
    public abstract Switch montarSwitch();
    
}
