package Paninoteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaninotecaGUI extends JFrame {

    private Paninoteca paninoteca;
    private DefaultListModel<Panino> paniniListModel;
    private JList<Panino> paniniList;
    private JButton addIngredientButton;
    private JButton addPaninoButton;
    private JButton removePaninoButton;
    private JButton ordinaPaniniButton;
    private JButton stampaButton;

    public PaninotecaGUI() {
        paninoteca = new Paninoteca();

        // Create and configure the JFrame
        setTitle("Paninoteca");
        setSize(700, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Create the JList and add it to a JScrollPane
        paniniListModel = new DefaultListModel<>();
        paniniList = new JList<>(paniniListModel);
        JScrollPane scrollPane = new JScrollPane(paniniList);
        add(scrollPane, BorderLayout.CENTER);

        // Create the buttons
        addIngredientButton = new JButton("Aggiungi Ingrediente");
        addPaninoButton = new JButton("Aggiungi Panino");
        removePaninoButton = new JButton("Rimuovi Panino");
        ordinaPaniniButton = new JButton("Ordina Panini");
        stampaButton = new JButton("Stampa");

        // Create a JPanel for the buttons and add them to it
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(addIngredientButton);
        buttonPanel.add(addPaninoButton);
        buttonPanel.add(removePaninoButton);
        buttonPanel.add(ordinaPaniniButton);
        buttonPanel.add(stampaButton);

        add(buttonPanel, BorderLayout.SOUTH);

        // Add action listeners to the buttons
        addIngredientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panino selectedPanino = paniniList.getSelectedValue();
                if (selectedPanino != null) {
                    String ingredient = JOptionPane.showInputDialog(PaninotecaGUI.this,
                            "Inserisci l'ingrediente da aggiungere:", "Aggiungi Ingrediente", JOptionPane.PLAIN_MESSAGE);
                    if (ingredient != null && !ingredient.isEmpty()) {
                        selectedPanino.aggiungiIngrediente(ingredient);
                        paniniListModel.setElementAt(selectedPanino, paniniList.getSelectedIndex());
                    }
                } else {
                    JOptionPane.showMessageDialog(PaninotecaGUI.this,
                            "Seleziona un panino dalla lista.", "Errore", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        addPaninoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipoPanino = JOptionPane.showInputDialog(PaninotecaGUI.this,
                        "Inserisci il tipo di panino:", "Aggiungi Panino", JOptionPane.PLAIN_MESSAGE);
                if (tipoPanino != null && !tipoPanino.isEmpty()) {
                    Panino panino = new Panino(tipoPanino);
                    paninoteca.aggiungiPanino(panino);
                    paniniListModel.addElement(panino);
                }
            }
        });

        removePaninoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panino selectedPanino = paniniList.getSelectedValue();
                if (selectedPanino != null) {
                    paninoteca.rimuoviPanino(selectedPanino);
                    paniniListModel.removeElement(selectedPanino);
                } else {
                    JOptionPane.showMessageDialog(PaninotecaGUI.this,
                            "Seleziona un panino dalla lista.", "Errore", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        ordinaPaniniButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paninoteca.ordinaPanini();
                updatePaniniList();
            }
        });

        stampaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = paninoteca.toString();
                JOptionPane.showMessageDialog(PaninotecaGUI.this, message, "Panini", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    private void updatePaniniList() {
        paniniListModel.clear();
        for (Panino panino : paninoteca.getPanini()) {
            paniniListModel.addElement(panino);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PaninotecaGUI paninotecaGUI = new PaninotecaGUI();
                paninotecaGUI.setVisible(true);
            }
        });
    }
}
