package br.exemplo.abstractFactory;

/**
 *
  * @author Antônio Francisco
  * @author Dawitt Ralph
 */
public class Infraestrutura {
    
    Router router;
    Switch sw;

    public Router getRouter() {
        return router;
    }

    public void setRouter(Router router) {
        this.router = router;
    }

    public Switch getSw() {
        return sw;
    }

    public void setSw(Switch sw) {
        this.sw = sw;
    }
    
    
}
