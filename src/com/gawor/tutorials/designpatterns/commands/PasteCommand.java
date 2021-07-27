package com.gawor.tutorials.designpatterns.commands;

import com.gawor.tutorials.designpatterns.Editor;

// copy  text from clipboard
//---// C O M M A N D   2
public class PasteCommand  extends Command{

    //---// `receiver` is a field in base class
    //---// no params in this example

    //---// C O M M A N D  2  ( R E C E I V E R , P A R A M S )
    public PasteCommand(Editor editor) {
        super(editor);
    }

    //---// E X E C U T E ( )
    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
