package add.impl;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import add.api.Adder;

@Component(
	service = AddCommand.class, 
	property = { 
		"osgi.command.scope=add",
		"osgi.command.function=add" 
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