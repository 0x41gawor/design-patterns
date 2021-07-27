package com.gawor.tutorials.designpatterns.commands;

import com.gawor.tutorials.designpatterns.Editor;

// copy selected text to clipboard
//---// C O M M A N D   1
public class CopyCommand extends Command{

    //---// `receiver` is a field in base class
    //---// no params in this example

    //---// C O M M A N D  1  ( R E C E I V E R , P A R A M S )
    public CopyCommand(Editor editor) {
        super(editor);
    }
    //---// E X E C U T E ( )
    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
