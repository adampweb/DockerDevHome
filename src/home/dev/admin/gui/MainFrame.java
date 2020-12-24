package home.dev.admin.gui;

import home.dev.admin.control.*;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.PrintStream;

public class MainFrame {
    private final JFrame frame;
    private JPanel rootPanel;
    private JTabbedPane tabbedPane1;
    private JPanel projectsPanel;
    private JPanel containersPanel;
    private JPanel logsPanel;
    private JTextArea eventLogs;
    private JTable projectsTable;
    private JTable containersTable;

    public JFrame getFrame(){
        return frame;
    }
    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JTabbedPane getTabbedPane1() {
        return tabbedPane1;
    }

    public JPanel getProjectsPanel() {
        return projectsPanel;
    }

    public JPanel getContainersPanel() {
        return containersPanel;
    }

    public JPanel getLogsPanel() {
        return logsPanel;
    }

    public JTextArea getEventLogs() {
        return eventLogs;
    }

    public JTable getProjectsTable() {
        return projectsTable;
    }

    public JTable getContainersTable() {
        return containersTable;
    }

    public MainFrame() throws IOException {
        ConfigControl configControl = new ConfigControl();
        frame = new JFrame(configControl.getPropValues("config.properties").getProperty("main_frame_title"));

        frame.setContentPane(rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(1000, 600));

        CommonControl.centreWindow(frame);

        PrintStream printStream = new PrintStream(new CustomOutputStream(this.getEventLogs()));
        System.setOut(printStream);
        System.setErr(printStream);

        frame.pack();
        frame.setVisible(true);
    }
}
