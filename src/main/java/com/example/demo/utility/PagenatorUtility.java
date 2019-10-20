package com.example.demo.utility;

import com.example.demo.entity.dto.request.PagenatorRequestDto;

public class PagenatorUtility {

	public static Long calcOffset(Integer pageSize, Integer pageIndex) {

		if (pageSize == null || pageIndex == null) {
			return Long.valueOf(0);
		}

		if (pageSize < 0 || pageIndex < 0) {
			return Long.valueOf(0);
		}

		return Long.valueOf(pageSize * pageIndex);

	}

	public static void recalculatePageIndex(PagenatorRequestDto pagenatorRequestDto, Long actualRecordCount) {

		Integer requestPageIndex = pagenatorRequestDto.getPageIndex();
		Integer requestPageSize = pagenatorRequestDto.getPageSize();

		if (requestPageSize == null || actualRecordCount == null) {
			pagenatorRequestDto.setPageIndex(0);
			return;
		}

		if (requestPageSize <= 0 || actualRecordCount <= 0) {
			pagenatorRequestDto.setPageIndex(0);
			return;
		}

		int actualPageLastIndex = (int) (actualRecordCount / requestPageSize);
		if (actualPageLastIndex < requestPageIndex) {
			pagenatorRequestDto.setPageIndex(actualPageLastIndex);
		}

	}

}
