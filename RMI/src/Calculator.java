import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;

public interface Calculator extends Remote {
    int add(int a, int b) throws RemoteException;
    int subtract(int a, int b) throws RemoteException;
    int multiply(int a, int b) throws RemoteException;
    int divide(int a, int b) throws RemoteException;
}

class CalculatorServer extends UnicastRemoteObject implements Calculator {
    protected CalculatorServer() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public int divide(int a, int b) throws RemoteException {
        if (b == 0) {
            throw new RemoteException("Cannot divide by zero");
        }
        return a / b;
    }

static void main(String[] args) {
    try {
        CalculatorServer server = new CalculatorServer();
        java.rmi.registry.LocateRegistry.createRegistry(1099); // Start registry
        java.rmi.Naming.rebind("//localhost/CalculatorService", server);
        System.out.println("Server started...");
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}

class CalculatorClient {
    public static void main(String[] args) {
        try {
            Calculator calculator = (Calculator) Naming.lookup("//localhost/CalculatorService");

            // Test the methods
            int a = 10;
            int b = 5;
            System.out.println("Addition: " + calculator.add(a, b));
            System.out.println("Subtraction: " + calculator.subtract(a, b));
            System.out.println("Multiplication: " + calculator.multiply(a, b));
            System.out.println("Division: " + calculator.divide(a, b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
