package com.thales;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Store {

	private final List<Item> items = Collections.synchronizedList(new ArrayList<Item>());

	
}
