package movingfigure;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure figure;
    private DrawingBoard db;
    private KeyboardListener listener;
    
    public UserInterface(Figure figure){
        frame = new JFrame();
        this.figure = figure;
    }
    
    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addListeners();

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        db = new DrawingBoard(figure);
        container.add(db);
        addListeners();
        frame.addKeyListener(listener);
    }

    private void addListeners() {
        listener = new KeyboardListener(db, figure);
    }

    public JFrame getFrame() {
        return frame;
    }
}
