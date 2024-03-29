package com.key.keyboard;

import java.util.HashMap;

public class KeyNameText {

	public static HashMap<String, Integer> mapKeynameKeycodes = new HashMap<String, Integer>();

	/*
	 * see java.awt.event.KeyEvent
	 */
	public static void initMapNameKeycodes() {

		//
		mapKeynameKeycodes.put("VK_CONTROL", 17);
		mapKeynameKeycodes.put("VK_SHIFT", 16);
		mapKeynameKeycodes.put("VK_CAPS_LOCK", 20);
		mapKeynameKeycodes.put("VK_TAB", 9);
		mapKeynameKeycodes.put("VK_WINDOWS", 524);
		mapKeynameKeycodes.put("VK_ALT", 18);
		mapKeynameKeycodes.put("VK_SPACE", 32);
		mapKeynameKeycodes.put("VK_CONTEXT_MENU", 525);
		mapKeynameKeycodes.put("VK_ENTER", 10);
		mapKeynameKeycodes.put("VK_BACK_SPACE", 8);

		// dir
		mapKeynameKeycodes.put("VK_LEFT", 37);
		mapKeynameKeycodes.put("VK_UP", 38);
		mapKeynameKeycodes.put("VK_RIGHT", 39);
		mapKeynameKeycodes.put("VK_DOWN", 40);

		// Esc F1~F12
		mapKeynameKeycodes.put("ESCAPE", 27);
		mapKeynameKeycodes.put("VK_F1", 112);
		mapKeynameKeycodes.put("VK_F2", 113);
		mapKeynameKeycodes.put("VK_F3", 114);
		mapKeynameKeycodes.put("VK_F4", 115);
		mapKeynameKeycodes.put("VK_F5", 116);
		mapKeynameKeycodes.put("VK_F6", 117);
		mapKeynameKeycodes.put("VK_F7", 118);
		mapKeynameKeycodes.put("VK_F8", 119);
		mapKeynameKeycodes.put("VK_F9", 120);
		mapKeynameKeycodes.put("VK_F10", 121);
		mapKeynameKeycodes.put("VK_F11", 122);
		mapKeynameKeycodes.put("VK_F12", 123);

		// 0~9
		mapKeynameKeycodes.put("VK_1", 49);
		mapKeynameKeycodes.put("VK_2", 50);
		mapKeynameKeycodes.put("VK_3", 51);
		mapKeynameKeycodes.put("VK_4", 52);
		mapKeynameKeycodes.put("VK_5", 53);
		mapKeynameKeycodes.put("VK_6", 54);
		mapKeynameKeycodes.put("VK_7", 55);
		mapKeynameKeycodes.put("VK_8", 56);
		mapKeynameKeycodes.put("VK_9", 57);
		mapKeynameKeycodes.put("VK_0", 48);

		// A~Z
		mapKeynameKeycodes.put("VK_A", 65);
		mapKeynameKeycodes.put("VK_B", 66);
		mapKeynameKeycodes.put("VK_C", 67);
		mapKeynameKeycodes.put("VK_D", 68);
		mapKeynameKeycodes.put("VK_E", 69);
		mapKeynameKeycodes.put("VK_F", 70);
		mapKeynameKeycodes.put("VK_G", 71);
		mapKeynameKeycodes.put("VK_H", 72);
		mapKeynameKeycodes.put("VK_I", 73);
		mapKeynameKeycodes.put("VK_J", 74);
		mapKeynameKeycodes.put("VK_K", 75);
		mapKeynameKeycodes.put("VK_L", 76);
		mapKeynameKeycodes.put("VK_M", 77);
		mapKeynameKeycodes.put("VK_N", 78);
		mapKeynameKeycodes.put("VK_O", 79);
		mapKeynameKeycodes.put("VK_P", 80);
		mapKeynameKeycodes.put("VK_Q", 81);
		mapKeynameKeycodes.put("VK_R", 82);
		mapKeynameKeycodes.put("VK_S", 83);
		mapKeynameKeycodes.put("VK_T", 84);
		mapKeynameKeycodes.put("VK_U", 85);
		mapKeynameKeycodes.put("VK_V", 86);
		mapKeynameKeycodes.put("VK_W", 87);
		mapKeynameKeycodes.put("VK_X", 88);
		mapKeynameKeycodes.put("VK_Y", 89);
		mapKeynameKeycodes.put("VK_Z", 90);
	}

	static String[] keyName = { "VK_CONTROL", "VK_SHIFT", "VK_CAPS_LOCK",
			"VK_TAB", "VK_WINDOWS", "VK_ALT", "VK_SPACE", "VK_CONTEXT_MENU",
			"VK_ENTER", "VK_BACK_SPACE",

			"VK_LEFT", "VK_UP", "VK_RIGHT", "VK_DOWN",

			"ESCAPE", "VK_F1", "VK_F2", "VK_F3", "VK_F4", "VK_F5", "VK_F6",
			"VK_F7", "VK_F8", "VK_F9", "VK_F10", "VK_F11", "VK_F12",

			"VK_1", "VK_2", "VK_3", "VK_4", "VK_5", "VK_6", "VK_7", "VK_8",
			"VK_9", "VK_0",

			"VK_A", "VK_B", "VK_C", "VK_D", "VK_E", "VK_F", "VK_G", "VK_H",
			"VK_I", "VK_J", "VK_K", "VK_L", "VK_M", "VK_N", "VK_O", "VK_P",
			"VK_Q", "VK_R", "VK_S", "VK_T", "VK_U", "VK_V", "VK_W", "VK_X",
			"VK_Y", "VK_Z",

	};

}
