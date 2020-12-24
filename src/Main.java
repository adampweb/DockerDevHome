import home.dev.admin.gui.MainFrame;

import java.io.IOException;

public class Main {
    private MainFrame gui;

    public MainFrame getMainFrame() throws IOException {
        return new MainFrame();
    }

    public Main(){
    }

    public static void main(String[] args) throws IOException {

        MainFrame gui = new Main().getMainFrame();

        System.out.println("Dev Home Management started...");
    }
}
