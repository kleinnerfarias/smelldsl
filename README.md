# Smelldsl
SmellDSL: A domain-specific language to assist developers in specifying code smell
patterns


# Abstract
_Context_: The current literature has widely investigated code smell patterns over the years, which describe specific source code
characteristics that indicate potential problems or areas for improvements. Empirical studies suggest that (i) metric-based strategies
for code smell detection are not effective and overload the developers with several false positives; (ii) code smell specifications
are informal, ambiguous, and not supported by traditional IDEs like Eclipse platform; and (iii) the identification of code smells
depends on the perception of software development teams. _Objective_: This article, therefore, proposes SmellDSL, a tool-supported
domain-specific language to assist developers when specifying code smell patterns. SmellDSL benefits developers by introducing
Eclipse built-in constructs that enable the specification of team-sensitive code smell patterns. Developers can write rules to specify
single or composite architectural problems (e.g. Misplaces Concerns) and suggest code refactorings regarding severe architectural
degradation symptoms. Method: We conducted an empirical study with 35 developers who specified eight code smells using
SmellDSL, generating 280 evaluation scenarios. _Results_: The main results, supported by statistical tests, suggest that SmellDSL
requires low effort to specify code smell patterns, and promotes a high rate of correctly code smell specifications. SmellDSL helped
to reduce the gap between participants with low and high ability and experience. _Conclusion_: We contribute with a domain-specific
language for the specification of code smell patterns, empirical evidence on its usefulness, and draw worth-investigating research
challenges by the research community.
