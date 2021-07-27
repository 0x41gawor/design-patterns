package com.gawor.tutorials.designpatterns.commands;

import com.gawor.tutorials.designpatterns.Editor;
// cut selected text to clipboard
//---// C O M M A N D   3
public class CutCommand extends Command{

    //---// `receiver` is a field in base class
    //---// no params in this example

    //---// C O M M A N D  3  ( R E C E I V E R , P A R A M S )
    public CutCommand(Editor editor) {
        super(editor);
    }

    //---// E X E C U T E ( )
    @Override
    public boolean execute() {
        if(editor.textField.getSelectedText() == null) return false;


        backup();
        String source = editor.textField.getText();
        editor.clipboard = editor.textField.getSelectedText();
        editor.textField.setText(cutString(source));
        return true;
    }

    private String cutString(String source) {
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd());
        return start + end;
    }
}
