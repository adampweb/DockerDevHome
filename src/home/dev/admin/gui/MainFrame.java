package home.dev.admin.gui;

import home.dev.admin.control.*;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MainFrame {
    private JFrame frame;
    private JPanel rootPanel;
    private JTabbedPane tabbedPane1;
    private JPanel projectsPanel;
    private JPanel containersPanel;
    private JPanel logsPanel;
    private JTextArea eventLogs;
    private JTable projectsTable;
    private JTable containersTable;

    public JFrame getFrame(){
        return this.frame;
    }

    public MainFrame() throws IOException {
        ConfigControl configControl = new ConfigControl();
        frame = new JFrame(configControl.getPropValues("config.properties").getProperty("main_frame_title"));

        frame.setContentPane(rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(1000, 600));

        CommonControl.centreWindow(frame);

        frame.pack();
        frame.setVisible(true);
    }
}
