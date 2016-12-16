package add.impl;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import add.api.Adder;
import osgi.enroute.debug.api.Debug;

@Component(
	service = AddCommand.class, 
	property = { 
		Debug.COMMAND_SCOPE + "=add",
		Debug.COMMAND_FUNCTION + "=add" 
	}, 
	name = "add.command"
)
public class AddCommand {
	private Adder target;

	public long add(int a, int b) {
		return target.add(a, b);
	}

	@Reference
	void setAdd(Adder service) {
		this.target = service;
	}

}