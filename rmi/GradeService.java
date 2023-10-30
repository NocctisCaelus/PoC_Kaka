import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GradeService extends Remote {
    void uploadGrade(String studentName, double grade) throws RemoteException;
    double getAverageGrade(String studentName) throws RemoteException;
    double calculateAverage(double num1, double num2) throws RemoteException; // Adicionado o novo método
}
