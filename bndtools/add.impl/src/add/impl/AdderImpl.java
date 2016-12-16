package add.impl;

import org.osgi.service.component.annotations.Component;

import add.api.Adder;

@Component
public class AdderImpl implements Adder {

	@Override
	public long add(int a, int b) {
		return a + b;
	}

}
