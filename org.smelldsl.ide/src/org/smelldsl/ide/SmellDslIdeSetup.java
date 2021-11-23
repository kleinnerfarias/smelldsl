/*
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.smelldsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.smelldsl.SmellDslRuntimeModule;
import org.smelldsl.SmellDslStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class SmellDslIdeSetup extends SmellDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new SmellDslRuntimeModule(), new SmellDslIdeModule()));
	}
	
}
