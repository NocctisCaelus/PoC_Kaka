import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            GradeService gradeService = new GradeServiceImpl();

            LocateRegistry.createRegistry(1099);

            Naming.rebind("GradeService", gradeService);

            System.out.println("Servidor RMI está ativo.");
        } catch (Exception e) {
            System.err.println("Erro no servidor: " + e.getMessage());
        }
    }
}
