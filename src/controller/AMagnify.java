package controller;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import easylib.controller.SuperAction;
import easylib.controller.Usecase;


class AMagnify extends SuperAction {

	AMagnify(Usecase usecase) {
		super(usecase);
		putValue(Action.SHORT_DESCRIPTION, "Forstørr");
		putValue(Action.LONG_DESCRIPTION, "Forstørr valgt utsnitt");
	}

	public void actionPerformed(ActionEvent e) {
		Controller.magnify();
	}

}