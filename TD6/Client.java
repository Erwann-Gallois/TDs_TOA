package TD6;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("127.0.0.1", 1234);
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String ligne = "";
        String entree = "";
        BufferedReader stIn = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            entree = stIn.readLine();
            out.println(entree);
            ligne = in.readLine();
            System.out.println(ligne);
            if (entree.equals("quit"))
                break;
        }
        System.out.println("Fin de connexion");
        s.close();
    }
}
