package add.api;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface Adder {

	public long add(int a, int b);

}
