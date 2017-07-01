package com.xikai.editor;

import java.beans.PropertyEditorSupport;

/**
 * Created by xikaixiong on 2/19/17.
 */
public class StudentNameEditor extends PropertyEditorSupport {
    @Override
    // the text here is studentName
    public void setAsText(String text) throws IllegalArgumentException {
        if (text.contains("Mr.") || text.contains("Ms.")) {
            setValue(text);
        } else {
            text = "Ms." + text;
            setValue(text);
        }
    }
}
