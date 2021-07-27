package com.gawor.tutorials.designpatterns.commands;

import com.gawor.tutorials.designpatterns.Editor;

//---// I N T E R F A C E   C O M M A N D
public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    public void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    //---// E X E C U T E ( )
    public abstract boolean execute();
}
