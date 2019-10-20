package com.example.demo.utility;

public class PagenatorUtility {

	public static Long calcOffset(Integer pageSize, Integer pageIndex) {

		if (!validate(pageSize, pageIndex)) {

			return Long.valueOf(0);

		}

		return Long.valueOf(pageSize * pageIndex);
	}

	private static Boolean validate(Integer pageSize, Integer pageIndex) {

		if (pageSize == null || pageIndex == null) {
			return false;
		}
		if (pageSize < 0 || pageIndex < 0) {
			return false;
		}

		return true;

	}

}
