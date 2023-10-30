import java.rmi.Naming;

public class RMIClient {
    public static void main(String[] args) {
        try {
            GradeService gradeService = (GradeService) Naming.lookup("rmi://localhost/GradeService");

            // Envie dois números para o servidor e calcule a média
            double num1 = 95.5;
            double num2 = 88.0;

            double average = gradeService.calculateAverage(num1, num2);

            System.out.println("Média dos números: " + average);
        } catch (Exception e) {
            System.err.println("Erro no cliente: " + e.getMessage());
        }
    }
}
