package com.lzp.Demo.WangYi;
package test;
import java.util.*;

public class Main {

	public static void main(String[] args) {

	}

	public class Key_Value {

		private Object[] list = new Object[10];

		int globalKey;

		String globalValue;

		public class Object {

			int currentKey;

			String currentValue;

		}

		public void set(int key, String value) {

			Object object = list[key];

			if (object == null) {

				object = new Object();

				list[key] = object;

			}

			object.currentKey = globalKey;

			object.currentValue = value;

		}

		public void setAll(String value) {

			globalKey++;

			globalValue = value;
		}

		public String get(int key) {

			Object object = list[key];

			if (object == null) {
				return null;
			}

			if (object.currentKey < globalKey) {
				return globalValue;
			}

			return object.currentValue;

		}

	}

}
