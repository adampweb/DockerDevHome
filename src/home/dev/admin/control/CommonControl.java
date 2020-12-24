package home.dev.admin.control;

import java.awt.*;

public class CommonControl {

    /**
     * A paraméretben kapott ablakot a képernyő közepére pozicionálja.
     * @param window Field name of a Window
     */
    public static void centreWindow(Window window)
    {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int)((dimension.getWidth() - window.getWidth()) / 2.0D);
        int y = (int)((dimension.getHeight() - window.getHeight()) / 2.0D);
        window.setLocation(x, y);
    }
}
