import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WindowsEventLogReader {

    public static void main(String[] args) {
        try {
            // Define the PowerShell command to query the event log
            String powerShellCommand = "Get-WinEvent -LogName Security";

            // Create a ProcessBuilder to run the PowerShell command
            ProcessBuilder processBuilder = new ProcessBuilder("powershell.exe", "-Command", powerShellCommand);

            // Redirect standard output to capture the result
            processBuilder.redirectErrorStream(true);

            // Start the process
            Process process = processBuilder.start();

            // Read and display the output
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Wait for the process to complete
            process.waitFor();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
