import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class GradeServiceImpl extends UnicastRemoteObject implements GradeService {
    private Map<String, Double> grades;

    public GradeServiceImpl() throws RemoteException {
        super();
        grades = new HashMap<>();
    }

    @Override
    public void uploadGrade(String studentName, double grade) throws RemoteException {
        grades.put(studentName, grade);
    }

    @Override
    public double getAverageGrade(String studentName) throws RemoteException {
        if (grades.containsKey(studentName)) {
            return grades.get(studentName);
        }
        return 0.0;
    }
    
    
    public double calculateAverage(double num1, double num2) throws RemoteException {
        double average = (num1 + num2) / 2;
        return average;
    }
}
