package com.javarush.test.level32.lesson15.big01.actions;

import com.javarush.test.level32.lesson15.big01.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by admin on 30.03.2016.
 */
public class RedoAction extends AbstractAction
{
    private View view;

    public RedoAction(View view)
    {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        view.redo();
    }
}
