package com.javarush.task.task32.task3209.actions;

import com.javarush.task.task32.task3209.View;

import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class SuperscriptAction extends StyledEditorKit.StyledTextAction {
    private View view;

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public SuperscriptAction() {
        super(null);
    }
}
