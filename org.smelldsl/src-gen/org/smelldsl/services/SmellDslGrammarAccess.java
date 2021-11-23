/*
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.smelldsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SmellDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class DomainmodelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.smelldsl.SmellDsl.Domainmodel");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsTypeParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Domainmodel:
		//    (elements+=Type)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(elements+=Type)*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Type
		public RuleCall getElementsTypeParserRuleCall_0() { return cElementsTypeParserRuleCall_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.smelldsl.SmellDsl.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSmellTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSmellParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cRuleParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Type:
		//    SmellType | Smell | Rule;
		@Override public ParserRule getRule() { return rule; }
		
		//SmellType | Smell | Rule
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SmellType
		public RuleCall getSmellTypeParserRuleCall_0() { return cSmellTypeParserRuleCall_0; }
		
		//Smell
		public RuleCall getSmellParserRuleCall_1() { return cSmellParserRuleCall_1; }
		
		//Rule
		public RuleCall getRuleParserRuleCall_2() { return cRuleParserRuleCall_2; }
	}
	public class SmellTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.smelldsl.SmellDsl.SmellType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSmelltypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//SmellType:
		//    'smelltype' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'smelltype' name=ID
		public Group getGroup() { return cGroup; }
		
		//'smelltype'
		public Keyword getSmelltypeKeyword_0() { return cSmelltypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class SmellElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.smelldsl.SmellDsl.Smell");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSmellKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeSmellTypeCrossReference_2_1_0 = (CrossReference)cSuperTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeSmellTypeIDTerminalRuleCall_2_1_0_1 = (RuleCall)cSuperTypeSmellTypeCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSmellcontentAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSmellcontentFeatureParserRuleCall_4_0 = (RuleCall)cSmellcontentAssignment_4.eContents().get(0);
		private final Assignment cSymptomAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSymptomSymptomParserRuleCall_5_0 = (RuleCall)cSymptomAssignment_5.eContents().get(0);
		private final Assignment cTreatmentAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cTreatmentTreatmentParserRuleCall_6_0 = (RuleCall)cTreatmentAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Smell:
		//    'smell' name=ID ('extends' superType=[SmellType])? '{'
		//        (smellcontent+=Feature)*
		//        (symptom?=Symptom)?
		//        (treatment?=Treatment)?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'smell' name=ID ('extends' superType=[SmellType])? '{'
		//    (smellcontent+=Feature)*
		//    (symptom?=Symptom)?
		//    (treatment?=Treatment)?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'smell'
		public Keyword getSmellKeyword_0() { return cSmellKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' superType=[SmellType])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//superType=[SmellType]
		public Assignment getSuperTypeAssignment_2_1() { return cSuperTypeAssignment_2_1; }
		
		//[SmellType]
		public CrossReference getSuperTypeSmellTypeCrossReference_2_1_0() { return cSuperTypeSmellTypeCrossReference_2_1_0; }
		
		//ID
		public RuleCall getSuperTypeSmellTypeIDTerminalRuleCall_2_1_0_1() { return cSuperTypeSmellTypeIDTerminalRuleCall_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//(smellcontent+=Feature)*
		public Assignment getSmellcontentAssignment_4() { return cSmellcontentAssignment_4; }
		
		//Feature
		public RuleCall getSmellcontentFeatureParserRuleCall_4_0() { return cSmellcontentFeatureParserRuleCall_4_0; }
		
		//(symptom?=Symptom)?
		public Assignment getSymptomAssignment_5() { return cSymptomAssignment_5; }
		
		//Symptom
		public RuleCall getSymptomSymptomParserRuleCall_5_0() { return cSymptomSymptomParserRuleCall_5_0; }
		
		//(treatment?=Treatment)?
		public Assignment getTreatmentAssignment_6() { return cTreatmentAssignment_6; }
		
		//Treatment
		public RuleCall getTreatmentTreatmentParserRuleCall_6_0() { return cTreatmentTreatmentParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.smelldsl.SmellDsl.Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFeatureKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cOptscalesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cOptscalesOptscaleParserRuleCall_2_0 = (RuleCall)cOptscalesAssignment_2.eContents().get(0);
		private final Keyword cWithThresholdKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMeasuresAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMeasuresMeasureParserRuleCall_4_0 = (RuleCall)cMeasuresAssignment_4.eContents().get(0);
		
		//Feature:
		//    'feature' name=ID (optscales?=Optscale)? 'with threshold' (measures+=Measure)* ;
		@Override public ParserRule getRule() { return rule; }
		
		//'feature' name=ID (optscales?=Optscale)? 'with threshold' (measures+=Measure)*
		public Group getGroup() { return cGroup; }
		
		//'feature'
		public Keyword getFeatureKeyword_0() { return cFeatureKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//(optscales?=Optscale)?
		public Assignment getOptscalesAssignment_2() { return cOptscalesAssignment_2; }
		
		//Optscale
		public RuleCall getOptscalesOptscaleParserRuleCall_2_0() { return cOptscalesOptscaleParserRuleCall_2_0; }
		
		//'with threshold'
		public Keyword getWithThresholdKeyword_3() { return cWithThresholdKeyword_3; }
		
		//(measures+=Measure)*
		public Assignment getMeasuresAssignment_4() { return cMeasuresAssignment_4; }
		
		//Measure
		public RuleCall getMeasuresMeasureParserRuleCall_4_0() { return cMeasuresMeasureParserRuleCall_4_0; }
	}
	public class OptscaleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.smelldsl.SmellDsl.Optscale");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cScaletypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cScaletypeScaletypeEnumRuleCall_1_0 = (RuleCall)cScaletypeAssignment_1.eContents().get(0);
		
		//Optscale:
		//     'is' (scaletype=Scaletype);
		@Override public ParserRule getRule() { return rule; }
		
		//'is' (scaletype=Scaletype)
		public Group getGroup() { return cGroup; }
		
		//'is'
		public Keyword getIsKeyword_0() { return cIsKeyword_0; }
		
		//(scaletype=Scaletype)
		public Assignment getScaletypeAssignment_1() { return cScaletypeAssignment_1; }
		
		//Scaletype
		public RuleCall getScaletypeScaletypeEnumRuleCall_1_0() { return cScaletypeScaletypeEnumRuleCall_1_0; }
	}
	public class MeasureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.smelldsl.SmellDsl.Measure");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_1_0_0 = (RuleCall)cNameAssignment_1_0.eContents().get(0);
		private final Keyword cCommaKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cMeasureAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cMeasureMeasureParserRuleCall_1_2_0 = (RuleCall)cMeasureAssignment_1_2.eContents().get(0);
		
		//Measure: name=ID |  name=ID ',' (measure=Measure) ;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID |  name=ID ',' (measure=Measure)
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//name=ID ',' (measure=Measure)
		public Group getGroup_1() { return cGroup_1; }
		
		//name=ID
		public Assignment getNameAssignment_1_0() { return cNameAssignment_1_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0_0() { return cNameIDTerminalRuleCall_1_0_0; }
		
		//','
		public Keyword getCommaKeyword_1_1() { return cCommaKeyword_1_1; }
		
		//(measure=Measure)
		public Assignment getMeasureAssignment_1_2() { return cMeasureAssignment_1_2; }
		
		//Measure
		public RuleCall getMeasureMeasureParserRuleCall_1_2_0() { return cMeasureMeasureParserRuleCall_1_2_0; }
	}
	public class SymptomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.smelldsl.SmellDsl.Symptom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSymptomKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Symptom:
		//    'symptom' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'symptom' name=ID
		public Group getGroup() { return cGroup; }
		
		//'symptom'
		public Keyword getSymptomKeyword_0() { return cSymptomKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class TreatmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.smelldsl.SmellDsl.Treatment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTreatmentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Treatment:
		//    'treatment' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'treatment' name=ID
		public Group getGroup() { return cGroup; }
		
		//'treatment'
		public Keyword getTreatmentKeyword_0() { return cTreatmentKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.smelldsl.SmellDsl.Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cWhenKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLogicExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLogicExpressionLogicExpressionParserRuleCall_3_0 = (RuleCall)cLogicExpressionAssignment_3.eContents().get(0);
		private final Keyword cThenKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cResultAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cResultResultParserRuleCall_5_0 = (RuleCall)cResultAssignment_5.eContents().get(0);
		
		//Rule:
		//    'rule' name=ID 'when' (logicExpression+=LogicExpression)*  'then' (result+=Result)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'rule' name=ID 'when' (logicExpression+=LogicExpression)*  'then' (result+=Result)*
		public Group getGroup() { return cGroup; }
		
		//'rule'
		public Keyword getRuleKeyword_0() { return cRuleKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'when'
		public Keyword getWhenKeyword_2() { return cWhenKeyword_2; }
		
		//(logicExpression+=LogicExpression)*
		public Assignment getLogicExpressionAssignment_3() { return cLogicExpressionAssignment_3; }
		
		//LogicExpression
		public RuleCall getLogicExpressionLogicExpressionParserRuleCall_3_0() { return cLogicExpressionLogicExpressionParserRuleCall_3_0; }
		
		//'then'
		public Keyword getThenKeyword_4() { return cThenKeyword_4; }
		
		//(result+=Result)*
		public Assignment getResultAssignment_5() { return cResultAssignment_5; }
		
		//Result
		public RuleCall getResultResultParserRuleCall_5_0() { return cResultResultParserRuleCall_5_0; }
	}
	public class LogicExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.smelldsl.SmellDsl.LogicExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cExpressionAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cExpressionExpressionParserRuleCall_0_0 = (RuleCall)cExpressionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cExpressionAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cExpressionExpressionParserRuleCall_1_0_0 = (RuleCall)cExpressionAssignment_1_0.eContents().get(0);
		private final Assignment cLogicOperatorAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cLogicOperatorLogicOperatorEnumRuleCall_1_1_0 = (RuleCall)cLogicOperatorAssignment_1_1.eContents().get(0);
		private final Assignment cLogicExpressionAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cLogicExpressionLogicExpressionParserRuleCall_1_2_0 = (RuleCall)cLogicExpressionAssignment_1_2.eContents().get(0);
		
		//LogicExpression:
		//    (expression=Expression) | (expression=Expression) (logicOperator=LogicOperator) (logicExpression=LogicExpression);
		@Override public ParserRule getRule() { return rule; }
		
		//(expression=Expression) | (expression=Expression) (logicOperator=LogicOperator) (logicExpression=LogicExpression)
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//(expression=Expression)
		public Assignment getExpressionAssignment_0() { return cExpressionAssignment_0; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_0_0() { return cExpressionExpressionParserRuleCall_0_0; }
		
		//(expression=Expression) (logicOperator=LogicOperator) (logicExpression=LogicExpression)
		public Group getGroup_1() { return cGroup_1; }
		
		//(expression=Expression)
		public Assignment getExpressionAssignment_1_0() { return cExpressionAssignment_1_0; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_0_0() { return cExpressionExpressionParserRuleCall_1_0_0; }
		
		//(logicOperator=LogicOperator)
		public Assignment getLogicOperatorAssignment_1_1() { return cLogicOperatorAssignment_1_1; }
		
		//LogicOperator
		public RuleCall getLogicOperatorLogicOperatorEnumRuleCall_1_1_0() { return cLogicOperatorLogicOperatorEnumRuleCall_1_1_0; }
		
		//(logicExpression=LogicExpression)
		public Assignment getLogicExpressionAssignment_1_2() { return cLogicExpressionAssignment_1_2; }
		
		//LogicExpression
		public RuleCall getLogicExpressionLogicExpressionParserRuleCall_1_2_0() { return cLogicExpressionLogicExpressionParserRuleCall_1_2_0; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.smelldsl.SmellDsl.Expression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRelationalOperatorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRelationalOperatorRelationalOperatorEnumRuleCall_2_0 = (RuleCall)cRelationalOperatorAssignment_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cFullStopKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_4_1 = (RuleCall)cGroup_4.eContents().get(1);
		
		//Expression:
		//    ID('.'ID) (relationalOperator+=RelationalOperator) ID('.'ID);
		@Override public ParserRule getRule() { return rule; }
		
		//ID('.'ID) (relationalOperator+=RelationalOperator) ID('.'ID)
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.'ID)
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
		
		//(relationalOperator+=RelationalOperator)
		public Assignment getRelationalOperatorAssignment_2() { return cRelationalOperatorAssignment_2; }
		
		//RelationalOperator
		public RuleCall getRelationalOperatorRelationalOperatorEnumRuleCall_2_0() { return cRelationalOperatorRelationalOperatorEnumRuleCall_2_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_3() { return cIDTerminalRuleCall_3; }
		
		//('.'ID)
		public Group getGroup_4() { return cGroup_4; }
		
		//'.'
		public Keyword getFullStopKeyword_4_0() { return cFullStopKeyword_4_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_4_1() { return cIDTerminalRuleCall_4_1; }
	}
	public class ResultElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.smelldsl.SmellDsl.Result");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Result:
		//    name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	
	public class ScaletypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.smelldsl.SmellDsl.Scaletype");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cNominalEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cNominalNominalKeyword_0_0 = (Keyword)cNominalEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cOrdinalEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cOrdinalOrdinalKeyword_1_0 = (Keyword)cOrdinalEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cIntervalEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cIntervalIntervalKeyword_2_0 = (Keyword)cIntervalEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cRatioEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cRatioRatioKeyword_3_0 = (Keyword)cRatioEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum Scaletype:
		//    Nominal='Nominal' | Ordinal='Ordinal' | Interval='Interval' | Ratio='Ratio';
		public EnumRule getRule() { return rule; }
		
		//Nominal='Nominal' | Ordinal='Ordinal' | Interval='Interval' | Ratio='Ratio'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Nominal='Nominal'
		public EnumLiteralDeclaration getNominalEnumLiteralDeclaration_0() { return cNominalEnumLiteralDeclaration_0; }
		
		//'Nominal'
		public Keyword getNominalNominalKeyword_0_0() { return cNominalNominalKeyword_0_0; }
		
		//Ordinal='Ordinal'
		public EnumLiteralDeclaration getOrdinalEnumLiteralDeclaration_1() { return cOrdinalEnumLiteralDeclaration_1; }
		
		//'Ordinal'
		public Keyword getOrdinalOrdinalKeyword_1_0() { return cOrdinalOrdinalKeyword_1_0; }
		
		//Interval='Interval'
		public EnumLiteralDeclaration getIntervalEnumLiteralDeclaration_2() { return cIntervalEnumLiteralDeclaration_2; }
		
		//'Interval'
		public Keyword getIntervalIntervalKeyword_2_0() { return cIntervalIntervalKeyword_2_0; }
		
		//Ratio='Ratio'
		public EnumLiteralDeclaration getRatioEnumLiteralDeclaration_3() { return cRatioEnumLiteralDeclaration_3; }
		
		//'Ratio'
		public Keyword getRatioRatioKeyword_3_0() { return cRatioRatioKeyword_3_0; }
	}
	public class LogicOperatorElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.smelldsl.SmellDsl.LogicOperator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cANDEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cANDANDKeyword_0_0 = (Keyword)cANDEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cOREnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cORORKeyword_1_0 = (Keyword)cOREnumLiteralDeclaration_1.eContents().get(0);
		
		//enum LogicOperator:
		//    AND='AND' | OR='OR';
		public EnumRule getRule() { return rule; }
		
		//AND='AND' | OR='OR'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AND='AND'
		public EnumLiteralDeclaration getANDEnumLiteralDeclaration_0() { return cANDEnumLiteralDeclaration_0; }
		
		//'AND'
		public Keyword getANDANDKeyword_0_0() { return cANDANDKeyword_0_0; }
		
		//OR='OR'
		public EnumLiteralDeclaration getOREnumLiteralDeclaration_1() { return cOREnumLiteralDeclaration_1; }
		
		//'OR'
		public Keyword getORORKeyword_1_0() { return cORORKeyword_1_0; }
	}
	public class RelationalOperatorElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.smelldsl.SmellDsl.RelationalOperator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cGreaterThanOrEqualToEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cGreaterThanOrEqualToGreaterThanSignEqualsSignKeyword_0_0 = (Keyword)cGreaterThanOrEqualToEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLessThanOrEqualToEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLessThanOrEqualToLessThanSignEqualsSignKeyword_1_0 = (Keyword)cLessThanOrEqualToEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cNotEqualToEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cNotEqualToExclamationMarkEqualsSignKeyword_2_0 = (Keyword)cNotEqualToEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cLessThanEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cLessThanLessThanSignKeyword_3_0 = (Keyword)cLessThanEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cGreaterThanEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cGreaterThanGreaterThanSignKeyword_4_0 = (Keyword)cGreaterThanEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cEqualToEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cEqualToEqualsSignEqualsSignKeyword_5_0 = (Keyword)cEqualToEnumLiteralDeclaration_5.eContents().get(0);
		
		//enum RelationalOperator:
		//    GreaterThanOrEqualTo='>=' | LessThanOrEqualTo='<=' | NotEqualTo='!=' | LessThan='<' | GreaterThan='>' | EqualTo='==';
		public EnumRule getRule() { return rule; }
		
		//GreaterThanOrEqualTo='>=' | LessThanOrEqualTo='<=' | NotEqualTo='!=' | LessThan='<' | GreaterThan='>' | EqualTo='=='
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GreaterThanOrEqualTo='>='
		public EnumLiteralDeclaration getGreaterThanOrEqualToEnumLiteralDeclaration_0() { return cGreaterThanOrEqualToEnumLiteralDeclaration_0; }
		
		//'>='
		public Keyword getGreaterThanOrEqualToGreaterThanSignEqualsSignKeyword_0_0() { return cGreaterThanOrEqualToGreaterThanSignEqualsSignKeyword_0_0; }
		
		//LessThanOrEqualTo='<='
		public EnumLiteralDeclaration getLessThanOrEqualToEnumLiteralDeclaration_1() { return cLessThanOrEqualToEnumLiteralDeclaration_1; }
		
		//'<='
		public Keyword getLessThanOrEqualToLessThanSignEqualsSignKeyword_1_0() { return cLessThanOrEqualToLessThanSignEqualsSignKeyword_1_0; }
		
		//NotEqualTo='!='
		public EnumLiteralDeclaration getNotEqualToEnumLiteralDeclaration_2() { return cNotEqualToEnumLiteralDeclaration_2; }
		
		//'!='
		public Keyword getNotEqualToExclamationMarkEqualsSignKeyword_2_0() { return cNotEqualToExclamationMarkEqualsSignKeyword_2_0; }
		
		//LessThan='<'
		public EnumLiteralDeclaration getLessThanEnumLiteralDeclaration_3() { return cLessThanEnumLiteralDeclaration_3; }
		
		//'<'
		public Keyword getLessThanLessThanSignKeyword_3_0() { return cLessThanLessThanSignKeyword_3_0; }
		
		//GreaterThan='>'
		public EnumLiteralDeclaration getGreaterThanEnumLiteralDeclaration_4() { return cGreaterThanEnumLiteralDeclaration_4; }
		
		//'>'
		public Keyword getGreaterThanGreaterThanSignKeyword_4_0() { return cGreaterThanGreaterThanSignKeyword_4_0; }
		
		//EqualTo='=='
		public EnumLiteralDeclaration getEqualToEnumLiteralDeclaration_5() { return cEqualToEnumLiteralDeclaration_5; }
		
		//'=='
		public Keyword getEqualToEqualsSignEqualsSignKeyword_5_0() { return cEqualToEqualsSignEqualsSignKeyword_5_0; }
	}
	
	private final DomainmodelElements pDomainmodel;
	private final TypeElements pType;
	private final SmellTypeElements pSmellType;
	private final SmellElements pSmell;
	private final FeatureElements pFeature;
	private final OptscaleElements pOptscale;
	private final ScaletypeElements eScaletype;
	private final MeasureElements pMeasure;
	private final SymptomElements pSymptom;
	private final TreatmentElements pTreatment;
	private final RuleElements pRule;
	private final LogicExpressionElements pLogicExpression;
	private final LogicOperatorElements eLogicOperator;
	private final ExpressionElements pExpression;
	private final RelationalOperatorElements eRelationalOperator;
	private final ResultElements pResult;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SmellDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDomainmodel = new DomainmodelElements();
		this.pType = new TypeElements();
		this.pSmellType = new SmellTypeElements();
		this.pSmell = new SmellElements();
		this.pFeature = new FeatureElements();
		this.pOptscale = new OptscaleElements();
		this.eScaletype = new ScaletypeElements();
		this.pMeasure = new MeasureElements();
		this.pSymptom = new SymptomElements();
		this.pTreatment = new TreatmentElements();
		this.pRule = new RuleElements();
		this.pLogicExpression = new LogicExpressionElements();
		this.eLogicOperator = new LogicOperatorElements();
		this.pExpression = new ExpressionElements();
		this.eRelationalOperator = new RelationalOperatorElements();
		this.pResult = new ResultElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.smelldsl.SmellDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Domainmodel:
	//    (elements+=Type)*;
	public DomainmodelElements getDomainmodelAccess() {
		return pDomainmodel;
	}
	
	public ParserRule getDomainmodelRule() {
		return getDomainmodelAccess().getRule();
	}
	
	//Type:
	//    SmellType | Smell | Rule;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//SmellType:
	//    'smelltype' name=ID;
	public SmellTypeElements getSmellTypeAccess() {
		return pSmellType;
	}
	
	public ParserRule getSmellTypeRule() {
		return getSmellTypeAccess().getRule();
	}
	
	//Smell:
	//    'smell' name=ID ('extends' superType=[SmellType])? '{'
	//        (smellcontent+=Feature)*
	//        (symptom?=Symptom)?
	//        (treatment?=Treatment)?
	//    '}';
	public SmellElements getSmellAccess() {
		return pSmell;
	}
	
	public ParserRule getSmellRule() {
		return getSmellAccess().getRule();
	}
	
	//Feature:
	//    'feature' name=ID (optscales?=Optscale)? 'with threshold' (measures+=Measure)* ;
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}
	
	//Optscale:
	//     'is' (scaletype=Scaletype);
	public OptscaleElements getOptscaleAccess() {
		return pOptscale;
	}
	
	public ParserRule getOptscaleRule() {
		return getOptscaleAccess().getRule();
	}
	
	//enum Scaletype:
	//    Nominal='Nominal' | Ordinal='Ordinal' | Interval='Interval' | Ratio='Ratio';
	public ScaletypeElements getScaletypeAccess() {
		return eScaletype;
	}
	
	public EnumRule getScaletypeRule() {
		return getScaletypeAccess().getRule();
	}
	
	//Measure: name=ID |  name=ID ',' (measure=Measure) ;
	public MeasureElements getMeasureAccess() {
		return pMeasure;
	}
	
	public ParserRule getMeasureRule() {
		return getMeasureAccess().getRule();
	}
	
	//Symptom:
	//    'symptom' name=ID;
	public SymptomElements getSymptomAccess() {
		return pSymptom;
	}
	
	public ParserRule getSymptomRule() {
		return getSymptomAccess().getRule();
	}
	
	//Treatment:
	//    'treatment' name=ID;
	public TreatmentElements getTreatmentAccess() {
		return pTreatment;
	}
	
	public ParserRule getTreatmentRule() {
		return getTreatmentAccess().getRule();
	}
	
	//Rule:
	//    'rule' name=ID 'when' (logicExpression+=LogicExpression)*  'then' (result+=Result)*;
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}
	
	//LogicExpression:
	//    (expression=Expression) | (expression=Expression) (logicOperator=LogicOperator) (logicExpression=LogicExpression);
	public LogicExpressionElements getLogicExpressionAccess() {
		return pLogicExpression;
	}
	
	public ParserRule getLogicExpressionRule() {
		return getLogicExpressionAccess().getRule();
	}
	
	//enum LogicOperator:
	//    AND='AND' | OR='OR';
	public LogicOperatorElements getLogicOperatorAccess() {
		return eLogicOperator;
	}
	
	public EnumRule getLogicOperatorRule() {
		return getLogicOperatorAccess().getRule();
	}
	
	//Expression:
	//    ID('.'ID) (relationalOperator+=RelationalOperator) ID('.'ID);
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//enum RelationalOperator:
	//    GreaterThanOrEqualTo='>=' | LessThanOrEqualTo='<=' | NotEqualTo='!=' | LessThan='<' | GreaterThan='>' | EqualTo='==';
	public RelationalOperatorElements getRelationalOperatorAccess() {
		return eRelationalOperator;
	}
	
	public EnumRule getRelationalOperatorRule() {
		return getRelationalOperatorAccess().getRule();
	}
	
	//Result:
	//    name=ID;
	public ResultElements getResultAccess() {
		return pResult;
	}
	
	public ParserRule getResultRule() {
		return getResultAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}