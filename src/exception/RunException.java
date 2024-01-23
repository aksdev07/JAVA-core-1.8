package exception;

public class RunException {
    public void run() throws RuntimeCustomException {
        throw new RuntimeCustomException();
    }
    RunException() throws RuntimeCustomException {
        run();
    }
    public static void main(String[] args) throws RuntimeCustomException {
      RunException obj = new RunException();
    }
}
