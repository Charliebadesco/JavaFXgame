package Main;

import javafx.scene.input.KeyEvent;

public class ControlKey {
	private boolean upPressed, downPressed, leftPressed, rightPressed;

	public void onKeyPressed(KeyEvent e) {
		switch (e.getCode()) {
		case Z -> {
			upPressed = true;
			System.out.println("Z");
		}
		case S -> {
			downPressed = true;
			System.out.println("S");
		}
		case Q -> {
			leftPressed = true;
			System.out.println("Q");
		}
		case D -> {
			rightPressed = true;
			System.out.println("D");
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + e.getCode());
		}
	}

	public void onKeyReleased(KeyEvent e) {
		switch (e.getCode()) {
		case Z -> {
			upPressed = false;
			System.out.println("Zr");
		}
		case S -> {
			downPressed = false;
			System.out.println("Sr");
		}
		case Q -> {
			leftPressed = false;
			System.out.println("Qr");
		}
		case D -> {
			rightPressed = false;
			System.out.println("Dr");
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + e.getCode());
		}
	}

	public boolean isUpPressed() {
		return upPressed;
	}

	public boolean isDownPressed() {
		return downPressed;
	}

	public boolean isLeftPressed() {
		return leftPressed;
	}

	public boolean isRightPressed() {
		return rightPressed;
	}
}
