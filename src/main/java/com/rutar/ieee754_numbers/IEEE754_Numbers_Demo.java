package com.rutar.ieee754_numbers;

// ............................................................................

import at.syntaxerror.ieee754.binary.Binary80;
import java.awt.*;
import java.math.BigInteger;
import javax.swing.*;

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

        lbl_extended.setText("Число у форматі Extended");

        fld_e0.setHorizontalAlignment(JTextField.CENTER);

        fld_e1.setHorizontalAlignment(JTextField.CENTER);

        fld_e2.setHorizontalAlignment(JTextField.CENTER);

        fld_e3.setHorizontalAlignment(JTextField.CENTER);

        fld_e4.setHorizontalAlignment(JTextField.CENTER);

        fld_e5.setHorizontalAlignment(JTextField.CENTER);

        fld_e6.setHorizontalAlignment(JTextField.CENTER);

        fld_e7.setHorizontalAlignment(JTextField.CENTER);

        fld_e8.setHorizontalAlignment(JTextField.CENTER);

        fld_e9.setHorizontalAlignment(JTextField.CENTER);

        pnl_buttons.setLayout(new GridLayout(1, 0, 5, 0));

        btn_convert.setText("Перетворити");
        btn_convert.setActionCommand("btn_convert");
        pnl_buttons.add(btn_convert);

        btn_clean.setText("Очистити поля");
        btn_clean.setActionCommand("btn_clean");
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
                    .addComponent(lbl_double, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(pnl_buttons, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

public static void main (String args[]) {

    EventQueue.invokeLater(() -> {
        new IEEE754_Numbers_Demo().setVisible(true);
    });
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
