package com.kosa.myapp.in;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Anonymous {

	public static void main(String[] args) {

		class MyWindowAdapter extends WindowAdapter {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}

		Frame window = new Frame("자바 윈도우");
		window.addWindowListener(new MyWindowAdapter());
		window.setSize(300, 300);
		window.setVisible(true);

	}

}