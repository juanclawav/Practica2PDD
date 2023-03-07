package ej7SingletonChainOfResponsibility;

public interface IAgentePago {
    void setNext(IAgentePago agentePago);

    IAgentePago next();

    void handle(int cantidad);
}
