package com.rutar.ieee754_numbers;

// ............................................................................

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import static javax.swing.JOptionPane.*;
import static com.rutar.ieee754_numbers.IEEE754_Numbers.*;
import java.lang.reflect.Field;
import java.util.HexFormat;

/**
 * Клас IEEE754_Numbers_Demo.
 * Демонструє роботу бібліотеки IEEE754_Numbers
 * @author Rutar_Andriy
 * 22.06.2024
 */

public class IEEE754_Numbers_Demo extends JFrame {

///////////////////////////////////////////////////////////////////////////////

public IEEE754_Numbers_Demo() { initComponents(); }

///////////////////////////////////////////////////////////////////////////////

@SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        lbl_double = new JLabel();
        fld_double = new JTextField();
        sp_double = new JSeparator();
        lbl_extended = new JLabel();
        fld_e0 = new JTextField();
        fld_e1 = new JTextField();
        fld_e2 = new JTextField();
        fld_e3 = new JTextField();
        fld_e4 = new JTextField();
        fld_e5 = new JTextField();
        fld_e6 = new JTextField();
        fld_e7 = new JTextField();
        fld_e8 = new JTextField();
        fld_e9 = new JTextField();
        sp_e9 = new JSeparator();
        pnl_buttons = new JPanel();
        btn_convert = new JButton();
        btn_clean = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("IEEE754 Numbers Demo");
        setResizable(false);

        lbl_double.setText("Число у форматі Double");

        fld_double.setActionCommand(null);

        lbl_extended.setText("Число у форматі Extended");

        fld_e0.setHorizontalAlignment(JTextField.CENTER);
        fld_e0.setActionCommand("e0");
        fld_e0.addKeyListener(listener);

        fld_e1.setHorizontalAlignment(JTextField.CENTER);
        fld_e1.setActionCommand("e1");
        fld_e1.addKeyListener(listener);

        fld_e2.setHorizontalAlignment(JTextField.CENTER);
        fld_e2.setActionCommand("e2");
        fld_e2.addKeyListener(listener);

        fld_e3.setHorizontalAlignment(JTextField.CENTER);
        fld_e3.setActionCommand("e3");
        fld_e3.addKeyListener(listener);

        fld_e4.setHorizontalAlignment(JTextField.CENTER);
        fld_e4.setActionCommand("e4");
        fld_e4.addKeyListener(listener);

        fld_e5.setHorizontalAlignment(JTextField.CENTER);
        fld_e5.setActionCommand("e5");
        fld_e5.addKeyListener(listener);

        fld_e6.setHorizontalAlignment(JTextField.CENTER);
        fld_e6.setActionCommand("e6");
        fld_e6.addKeyListener(listener);

        fld_e7.setHorizontalAlignment(JTextField.CENTER);
        fld_e7.setActionCommand("e7");
        fld_e7.addKeyListener(listener);

        fld_e8.setHorizontalAlignment(JTextField.CENTER);
        fld_e8.setActionCommand("e8");
        fld_e8.addKeyListener(listener);

        fld_e9.setHorizontalAlignment(JTextField.CENTER);
        fld_e9.setActionCommand("e9");
        fld_e9.addKeyListener(listener);

        pnl_buttons.setLayout(new GridLayout(1, 0, 5, 0));

        btn_convert.setText("Перетворити");
        btn_convert.setActionCommand("btn_convert");
        btn_convert.addActionListener(this::btn_convertActionPerformed);
        pnl_buttons.add(btn_convert);

        btn_clean.setText("Очистити поля");
        btn_clean.setActionCommand("btn_clean");
        btn_clean.addActionListener(this::btn_convertActionPerformed);
        pnl_buttons.add(btn_clean);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(sp_e9)
                    .addComponent(sp_double)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_extended)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fld_e0, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fld_e1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fld_e2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fld_e3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fld_e4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fld_e5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fld_e6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fld_e7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fld_e8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fld_e9, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(fld_double)
                    .addComponent(lbl_double, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_buttons, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lbl_double)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fld_double, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp_double, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_extended)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(fld_e0, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                    .addComponent(fld_e1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                    .addComponent(fld_e2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                    .addComponent(fld_e3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                    .addComponent(fld_e4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                    .addComponent(fld_e5, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                    .addComponent(fld_e6, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                    .addComponent(fld_e7, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                    .addComponent(fld_e8, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                    .addComponent(fld_e9, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp_e9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_buttons, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
        setLocationRelativeTo(null);
    }//GEN-END:initComponents

///////////////////////////////////////////////////////////////////////////////

    private void btn_convertActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn_convertActionPerformed
        
    switch (evt.getActionCommand()) {

    // Очищення полів .........................................................
    case "btn_clean" -> { 
        
    for (int z = 0; z < 10; z++) { getField("e" + z).setText(null); }
    
    fld_double.setText(null);
    fld_double.requestFocus(); }

    // Конвертування чисел ....................................................
    case "btn_convert" -> {
        
    double doubleNumber;
    byte[] extendedNumber;

    String[] texts = new String[10];
    String dText = fld_double.getText();
    
    boolean allExtFldFull = true;
    boolean allExtFldEmpty = true;
    
    for (int z = 0; z < texts.length; z++) {
        JTextField field = getField("e"+z);
        texts[z] = field.getText();
        if (texts[z].isBlank()) { allExtFldFull  = false; }
        else                    { allExtFldEmpty = false; }
    }

    // Усі поля порожні .......................................................
    if (dText.isBlank() && allExtFldEmpty) {
        
    String message = "Усі поля порожні";
    showErrorMessage(message, fld_double,
                              fld_e0, fld_e1, fld_e2, fld_e3, fld_e4,
                              fld_e5, fld_e6, fld_e7, fld_e8, fld_e9);
    break; }

    // Конфлікт полів .........................................................
    else if (!dText.isEmpty() && !allExtFldEmpty) {
        
    String message = """
                     Заповненими мають бути
                     або лише верхнє поле,
                     або усі нижні поля""";
    showErrorMessage(message, fld_double,
                              fld_e0, fld_e1, fld_e2, fld_e3, fld_e4,
                              fld_e5, fld_e6, fld_e7, fld_e8, fld_e9);
    break; }
    
    // double -> Extended .....................................................
    else if (!dText.isEmpty()) {
        
    try { doubleNumber = Double.parseDouble(fld_double.getText()); }
    catch (NumberFormatException e)
        { showErrorMessage("Помилка запису числа", fld_double);
          break; }
    
    extendedNumber = doubleToExtendedBytes(doubleNumber);
    
    for (int z = 0; z < extendedNumber.length; z++) {
        JTextField field = getField("e" + z);
        field.setText(String.format("%02X", extendedNumber[z])); } }

    // Не всі нижні поля заповнені ............................................
    else if (!allExtFldFull) {
        
    String message = "Не всі нижні поля заповнені";
    showErrorMessage(message, fld_e0, fld_e1, fld_e2, fld_e3, fld_e4,
                              fld_e5, fld_e6, fld_e7, fld_e8, fld_e9);
    break; }
    
    // Extended -> double .....................................................
    else { 
    
    String value;
    extendedNumber = new byte[10];
    HexFormat hex = HexFormat.of();
        
    for (int z = 0; z < 10; z++) {
        JTextField field = getField("e" + z);
        value = field.getText();
        try { extendedNumber[z] = hex.parseHex(value)[0]; }
        catch (Exception e) {
            String message = "Некоректне hex-число: " + value;
            showErrorMessage(message, field);
            break; } }
    
    double result = extendedBytesToDouble(extendedNumber);
    fld_double.setText(Double.toString(result));
    
    } } }
    }//GEN-LAST:event_btn_convertActionPerformed

///////////////////////////////////////////////////////////////////////////////

private JTextField getField (String name) {
    
    name = "fld_" + name;
    
    try { return (JTextField) getClass().getDeclaredField(name).get(this); }
    catch (IllegalAccessException | IllegalArgumentException |
           NoSuchFieldException | SecurityException e) { return null; }
}

///////////////////////////////////////////////////////////////////////////////

private void showErrorMessage (String message, JTextField ... fields) {

    Color defaultColor = fields[0].getBackground();
    Color errorColor = new Color(0xFFAAAA);

    for (JTextField fld : fields) { fld.setBackground(errorColor); }

    JOptionPane.showMessageDialog(this, message, "Помилка", ERROR_MESSAGE);

    for (JTextField fld : fields) { fld.setBackground(defaultColor); }

}

///////////////////////////////////////////////////////////////////////////////

public static void main (String args[]) {

    EventQueue.invokeLater(() -> {
        new IEEE754_Numbers_Demo().setVisible(true);
    });
}

///////////////////////////////////////////////////////////////////////////////

private final KeyListener listener = new KeyAdapter() {

    @Override
    public void keyTyped (KeyEvent e) {
        
        Object source = e.getSource();
        
        if      (source.equals(fld_e0)) { processField(e, fld_e0, fld_e1); }
        else if (source.equals(fld_e1)) { processField(e, fld_e1, fld_e2); }
        else if (source.equals(fld_e2)) { processField(e, fld_e2, fld_e3); }
        else if (source.equals(fld_e3)) { processField(e, fld_e3, fld_e4); }
        else if (source.equals(fld_e4)) { processField(e, fld_e4, fld_e5); }
        else if (source.equals(fld_e5)) { processField(e, fld_e5, fld_e6); }
        else if (source.equals(fld_e6)) { processField(e, fld_e6, fld_e7); }
        else if (source.equals(fld_e7)) { processField(e, fld_e7, fld_e8); }
        else if (source.equals(fld_e8)) { processField(e, fld_e8, fld_e9); }
        else if (source.equals(fld_e9)) { processField(e, fld_e9, null);   }

    }
};

///////////////////////////////////////////////////////////////////////////////

private void processField (KeyEvent e, JTextField now, JTextField next) {
    
    int lenght = now.getText().length();

    if      (lenght >= 2) { e.consume(); }
    else if (lenght == 1) { if (next != null) { next.requestFocus(); } }

}

///////////////////////////////////////////////////////////////////////////////

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btn_clean;
    private JButton btn_convert;
    private JTextField fld_double;
    private JTextField fld_e0;
    private JTextField fld_e1;
    private JTextField fld_e2;
    private JTextField fld_e3;
    private JTextField fld_e4;
    private JTextField fld_e5;
    private JTextField fld_e6;
    private JTextField fld_e7;
    private JTextField fld_e8;
    private JTextField fld_e9;
    private JLabel lbl_double;
    private JLabel lbl_extended;
    private JPanel pnl_buttons;
    private JSeparator sp_double;
    private JSeparator sp_e9;
    // End of variables declaration//GEN-END:variables

// Кінець класу IEEE754_Numbers_Demo //////////////////////////////////////////

}
