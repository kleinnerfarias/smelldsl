/*
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.smelldsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SmellDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/smelldsl/parser/antlr/internal/InternalSmellDsl.tokens");
	}
}