
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class MenuPanel extends JPanel {
    
    private JButton plusButton;
    private JButton minusButton;
    private JButton zButton;
    
    public MenuPanel(){
        super(new GridLayout(1, 3));
        this.plusButton = new JButton("+");
        this.minusButton = new JButton("-");
        this.zButton = new JButton("Z");
        createComponents();
    }
    
    private void createComponents(){
        add(plusButton);
        add(minusButton);
        add(zButton);
    }

    public JButton getPlusButton() {
        return plusButton;
    }

    public JButton getMinusButton() {
        return minusButton;
    }

    public JButton getZButton() {
        return zButton;
    }
    
    
    
    
}