package com.javarush.task.task32.task3209.actions;

import com.javarush.task.task32.task3209.View;

import javax.swing.*;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class SuperscriptAction extends StyledEditorKit.StyledTextAction {
    private View view;

    @Override
    public void actionPerformed(ActionEvent e) {
        JEditorPane jEditorPane = getEditor(e);
        if (jEditorPane != null){
            MutableAttributeSet mutableAttributeSet = getStyledEditorKit(jEditorPane).getInputAttributes();
            SimpleAttributeSet simpleAttributeSet = new SimpleAttributeSet();
            StyleConstants.setSuperscript(simpleAttributeSet, !StyleConstants.isSuperscript(mutableAttributeSet));
            setCharacterAttributes(jEditorPane, simpleAttributeSet, false);
        }
    }

    public SuperscriptAction() {
        super(StyleConstants.Superscript.toString());
    }
}
