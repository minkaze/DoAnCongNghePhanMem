package DTO;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.LookAndFeel;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class MyComboBoxUI extends BasicComboBoxUI {
    @Override
    protected void installDefaults() {
        super.installDefaults();
        LookAndFeel.uninstallBorder(comboBox); //Uninstalls the LAF border for both button and label of combo box.
    }

    @Override
    protected JButton createArrowButton() {
        JButton button = new BasicArrowButton(BasicArrowButton.SOUTH, SharedData.GREY, Color.black, Color.black, Color.white);
        LookAndFeel.uninstallBorder(button);
        button.setName("ComboBox.arrowButton"); //Mandatory, as per BasicComboBoxUI#createArrowButton().
        return button;
    }
    
}