package vueGraphique;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JPopupMenu;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import problemeVilles.PopulationVilles;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.WindowEvent;

public class MenuBar extends JMenuBar implements ActionListener, MenuListener {

    private JMenuItem menuItem;
    private JMenuItem menuItem2;
    private JMenu menu;
    private JFrame myFrame;
    private PopulationVilles popVilles;

    public MenuBar(Dimension tailleMenu, JFrame myFrame, PopulationVilles popVilles) {

        initMenuBar(tailleMenu, myFrame, popVilles);

    }

    public void initMenuBar(Dimension tailleMenu, JFrame myFrame, PopulationVilles popVilles) {

        menu = new JMenu("A Menu");
        this.add(menu);
        this.setPreferredSize(new Dimension(tailleMenu));
        menu.addMenuListener(this);
        // menu.addMenuListener(this);

        menuItem = new JMenuItem(" Ville ");
        menuItem.setPreferredSize(new Dimension(150, 20));
        menuItem.addActionListener(this);
        menu.add(menuItem);

        // menuItem.addMenuItemListener(this);

        menu.addSeparator();
        menuItem2 = new JMenuItem(" Quitter ");
        menuItem2.setPreferredSize(new Dimension(150, 20));
        menu.add(menuItem2);
        menuItem2.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == menuItem) {

            JOptionPane.showMessageDialog(null, popVilles.toString());

        }

        if (e.getSource() == menuItem2) {

            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.dispose();

        }

    }

    @Override
    public void menuSelected(MenuEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void menuDeselected(MenuEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void menuCanceled(MenuEvent e) {
        // TODO Auto-generated method stub

    }

}