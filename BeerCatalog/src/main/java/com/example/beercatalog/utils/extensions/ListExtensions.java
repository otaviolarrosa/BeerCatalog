package com.example.beercatalog.utils.extensions;

import java.util.List;

public class ListExtensions {
	public static <T> boolean any(List<T> list) {
		return list.size() > 0;
	}
}
