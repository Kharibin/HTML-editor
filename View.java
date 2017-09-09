package com.javarush.task.task32.task3209;

import com.javarush.task.task32.task3209.listeners.FrameListener;
import com.javarush.task.task32.task3209.listeners.TabbedPaneChangeListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private Controller controller;
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JTextPane htmlTextPane = new JTextPane();
    private JEditorPane plainTextPane = new JEditorPane();

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void init() {
        initGui();
        this.addWindowListener(new FrameListener(this));
        this.setVisible(true);
    }

    public void exit() {
        controller.exit();
    }

    public void initMenuBar() {

    }

    public void initEditor() {
        htmlTextPane.setContentType("text/html");
        JScrollPane jScrollPaneHTML = new JScrollPane(htmlTextPane);
        tabbedPane.addTab("HTML", jScrollPaneHTML);
        JScrollPane jScrollPaneTEXT = new JScrollPane(plainTextPane);
        tabbedPane.addTab("Текст", jScrollPaneTEXT);
        TabbedPaneChangeListener editorListener = new TabbedPaneChangeListener(this);
        tabbedPane.addChangeListener(editorListener);
        tabbedPane.setPreferredSize(new Dimension(1500,800));
        this.getContentPane().add(tabbedPane, BorderLayout.CENTER);
    }

    public void initGui() {
        initMenuBar();
        initEditor();
        pack();
    }

    public void selectedTabChanged(){

    }
}
