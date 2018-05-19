package com.vaibhav.mockitoPlayground.data.api;

import java.util.List;

/* External service - Lets say this comes from WunderList */
public interface TodoService {
	public List<String> retrieveTodos(String user);
}
