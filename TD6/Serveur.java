package TD6;
import java.io.*;
import java.net.*;

public class Serveur {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1234);
        while (true){
            Socket s = ss.accept();
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String ligne = "";
            while (true)
            {
                ligne = in.readLine();
                out.println("echo : " + ligne);
                if (ligne.equals("quit"))
                    break;
            }
            System.out.println("Fin de connexion");
            in.close();
            out.close();
            s.close();
        }
    }
}
