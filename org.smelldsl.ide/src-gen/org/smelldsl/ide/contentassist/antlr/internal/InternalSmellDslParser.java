package org.smelldsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.smelldsl.services.SmellDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmellDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Nominal'", "'Ordinal'", "'Interval'", "'Ratio'", "'AND'", "'OR'", "'>='", "'<='", "'!='", "'<'", "'>'", "'=='", "'smelltype'", "'smell'", "'{'", "'}'", "'extends'", "'feature'", "'with threshold'", "'is'", "','", "'symptom'", "'treatment'", "'rule'", "'when'", "'then'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmellDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmellDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmellDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmellDsl.g"; }


    	private SmellDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(SmellDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDomainmodel"
    // InternalSmellDsl.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalSmellDsl.g:54:1: ( ruleDomainmodel EOF )
            // InternalSmellDsl.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalSmellDsl.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:66:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // InternalSmellDsl.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // InternalSmellDsl.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            // InternalSmellDsl.g:68:3: ( rule__Domainmodel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            // InternalSmellDsl.g:69:3: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=23 && LA1_0<=24)||LA1_0==34) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSmellDsl.g:69:4: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleType"
    // InternalSmellDsl.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSmellDsl.g:79:1: ( ruleType EOF )
            // InternalSmellDsl.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSmellDsl.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSmellDsl.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSmellDsl.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalSmellDsl.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSmellDsl.g:94:3: ( rule__Type__Alternatives )
            // InternalSmellDsl.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSmellType"
    // InternalSmellDsl.g:103:1: entryRuleSmellType : ruleSmellType EOF ;
    public final void entryRuleSmellType() throws RecognitionException {
        try {
            // InternalSmellDsl.g:104:1: ( ruleSmellType EOF )
            // InternalSmellDsl.g:105:1: ruleSmellType EOF
            {
             before(grammarAccess.getSmellTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSmellType();

            state._fsp--;

             after(grammarAccess.getSmellTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSmellType"


    // $ANTLR start "ruleSmellType"
    // InternalSmellDsl.g:112:1: ruleSmellType : ( ( rule__SmellType__Group__0 ) ) ;
    public final void ruleSmellType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:116:2: ( ( ( rule__SmellType__Group__0 ) ) )
            // InternalSmellDsl.g:117:2: ( ( rule__SmellType__Group__0 ) )
            {
            // InternalSmellDsl.g:117:2: ( ( rule__SmellType__Group__0 ) )
            // InternalSmellDsl.g:118:3: ( rule__SmellType__Group__0 )
            {
             before(grammarAccess.getSmellTypeAccess().getGroup()); 
            // InternalSmellDsl.g:119:3: ( rule__SmellType__Group__0 )
            // InternalSmellDsl.g:119:4: rule__SmellType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SmellType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmellTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSmellType"


    // $ANTLR start "entryRuleSmell"
    // InternalSmellDsl.g:128:1: entryRuleSmell : ruleSmell EOF ;
    public final void entryRuleSmell() throws RecognitionException {
        try {
            // InternalSmellDsl.g:129:1: ( ruleSmell EOF )
            // InternalSmellDsl.g:130:1: ruleSmell EOF
            {
             before(grammarAccess.getSmellRule()); 
            pushFollow(FOLLOW_1);
            ruleSmell();

            state._fsp--;

             after(grammarAccess.getSmellRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSmell"


    // $ANTLR start "ruleSmell"
    // InternalSmellDsl.g:137:1: ruleSmell : ( ( rule__Smell__Group__0 ) ) ;
    public final void ruleSmell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:141:2: ( ( ( rule__Smell__Group__0 ) ) )
            // InternalSmellDsl.g:142:2: ( ( rule__Smell__Group__0 ) )
            {
            // InternalSmellDsl.g:142:2: ( ( rule__Smell__Group__0 ) )
            // InternalSmellDsl.g:143:3: ( rule__Smell__Group__0 )
            {
             before(grammarAccess.getSmellAccess().getGroup()); 
            // InternalSmellDsl.g:144:3: ( rule__Smell__Group__0 )
            // InternalSmellDsl.g:144:4: rule__Smell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Smell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSmell"


    // $ANTLR start "entryRuleFeature"
    // InternalSmellDsl.g:153:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalSmellDsl.g:154:1: ( ruleFeature EOF )
            // InternalSmellDsl.g:155:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalSmellDsl.g:162:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:166:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalSmellDsl.g:167:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalSmellDsl.g:167:2: ( ( rule__Feature__Group__0 ) )
            // InternalSmellDsl.g:168:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalSmellDsl.g:169:3: ( rule__Feature__Group__0 )
            // InternalSmellDsl.g:169:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleOptscale"
    // InternalSmellDsl.g:178:1: entryRuleOptscale : ruleOptscale EOF ;
    public final void entryRuleOptscale() throws RecognitionException {
        try {
            // InternalSmellDsl.g:179:1: ( ruleOptscale EOF )
            // InternalSmellDsl.g:180:1: ruleOptscale EOF
            {
             before(grammarAccess.getOptscaleRule()); 
            pushFollow(FOLLOW_1);
            ruleOptscale();

            state._fsp--;

             after(grammarAccess.getOptscaleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptscale"


    // $ANTLR start "ruleOptscale"
    // InternalSmellDsl.g:187:1: ruleOptscale : ( ( rule__Optscale__Group__0 ) ) ;
    public final void ruleOptscale() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:191:2: ( ( ( rule__Optscale__Group__0 ) ) )
            // InternalSmellDsl.g:192:2: ( ( rule__Optscale__Group__0 ) )
            {
            // InternalSmellDsl.g:192:2: ( ( rule__Optscale__Group__0 ) )
            // InternalSmellDsl.g:193:3: ( rule__Optscale__Group__0 )
            {
             before(grammarAccess.getOptscaleAccess().getGroup()); 
            // InternalSmellDsl.g:194:3: ( rule__Optscale__Group__0 )
            // InternalSmellDsl.g:194:4: rule__Optscale__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Optscale__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptscaleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptscale"


    // $ANTLR start "entryRuleMeasure"
    // InternalSmellDsl.g:203:1: entryRuleMeasure : ruleMeasure EOF ;
    public final void entryRuleMeasure() throws RecognitionException {
        try {
            // InternalSmellDsl.g:204:1: ( ruleMeasure EOF )
            // InternalSmellDsl.g:205:1: ruleMeasure EOF
            {
             before(grammarAccess.getMeasureRule()); 
            pushFollow(FOLLOW_1);
            ruleMeasure();

            state._fsp--;

             after(grammarAccess.getMeasureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeasure"


    // $ANTLR start "ruleMeasure"
    // InternalSmellDsl.g:212:1: ruleMeasure : ( ( rule__Measure__Alternatives ) ) ;
    public final void ruleMeasure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:216:2: ( ( ( rule__Measure__Alternatives ) ) )
            // InternalSmellDsl.g:217:2: ( ( rule__Measure__Alternatives ) )
            {
            // InternalSmellDsl.g:217:2: ( ( rule__Measure__Alternatives ) )
            // InternalSmellDsl.g:218:3: ( rule__Measure__Alternatives )
            {
             before(grammarAccess.getMeasureAccess().getAlternatives()); 
            // InternalSmellDsl.g:219:3: ( rule__Measure__Alternatives )
            // InternalSmellDsl.g:219:4: rule__Measure__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Measure__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasure"


    // $ANTLR start "entryRuleSymptom"
    // InternalSmellDsl.g:228:1: entryRuleSymptom : ruleSymptom EOF ;
    public final void entryRuleSymptom() throws RecognitionException {
        try {
            // InternalSmellDsl.g:229:1: ( ruleSymptom EOF )
            // InternalSmellDsl.g:230:1: ruleSymptom EOF
            {
             before(grammarAccess.getSymptomRule()); 
            pushFollow(FOLLOW_1);
            ruleSymptom();

            state._fsp--;

             after(grammarAccess.getSymptomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSymptom"


    // $ANTLR start "ruleSymptom"
    // InternalSmellDsl.g:237:1: ruleSymptom : ( ( rule__Symptom__Group__0 ) ) ;
    public final void ruleSymptom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:241:2: ( ( ( rule__Symptom__Group__0 ) ) )
            // InternalSmellDsl.g:242:2: ( ( rule__Symptom__Group__0 ) )
            {
            // InternalSmellDsl.g:242:2: ( ( rule__Symptom__Group__0 ) )
            // InternalSmellDsl.g:243:3: ( rule__Symptom__Group__0 )
            {
             before(grammarAccess.getSymptomAccess().getGroup()); 
            // InternalSmellDsl.g:244:3: ( rule__Symptom__Group__0 )
            // InternalSmellDsl.g:244:4: rule__Symptom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Symptom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSymptomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSymptom"


    // $ANTLR start "entryRuleTreatment"
    // InternalSmellDsl.g:253:1: entryRuleTreatment : ruleTreatment EOF ;
    public final void entryRuleTreatment() throws RecognitionException {
        try {
            // InternalSmellDsl.g:254:1: ( ruleTreatment EOF )
            // InternalSmellDsl.g:255:1: ruleTreatment EOF
            {
             before(grammarAccess.getTreatmentRule()); 
            pushFollow(FOLLOW_1);
            ruleTreatment();

            state._fsp--;

             after(grammarAccess.getTreatmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTreatment"


    // $ANTLR start "ruleTreatment"
    // InternalSmellDsl.g:262:1: ruleTreatment : ( ( rule__Treatment__Group__0 ) ) ;
    public final void ruleTreatment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:266:2: ( ( ( rule__Treatment__Group__0 ) ) )
            // InternalSmellDsl.g:267:2: ( ( rule__Treatment__Group__0 ) )
            {
            // InternalSmellDsl.g:267:2: ( ( rule__Treatment__Group__0 ) )
            // InternalSmellDsl.g:268:3: ( rule__Treatment__Group__0 )
            {
             before(grammarAccess.getTreatmentAccess().getGroup()); 
            // InternalSmellDsl.g:269:3: ( rule__Treatment__Group__0 )
            // InternalSmellDsl.g:269:4: rule__Treatment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Treatment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTreatmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTreatment"


    // $ANTLR start "entryRuleRule"
    // InternalSmellDsl.g:278:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalSmellDsl.g:279:1: ( ruleRule EOF )
            // InternalSmellDsl.g:280:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalSmellDsl.g:287:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:291:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalSmellDsl.g:292:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalSmellDsl.g:292:2: ( ( rule__Rule__Group__0 ) )
            // InternalSmellDsl.g:293:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalSmellDsl.g:294:3: ( rule__Rule__Group__0 )
            // InternalSmellDsl.g:294:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleLogicExpression"
    // InternalSmellDsl.g:303:1: entryRuleLogicExpression : ruleLogicExpression EOF ;
    public final void entryRuleLogicExpression() throws RecognitionException {
        try {
            // InternalSmellDsl.g:304:1: ( ruleLogicExpression EOF )
            // InternalSmellDsl.g:305:1: ruleLogicExpression EOF
            {
             before(grammarAccess.getLogicExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicExpression();

            state._fsp--;

             after(grammarAccess.getLogicExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogicExpression"


    // $ANTLR start "ruleLogicExpression"
    // InternalSmellDsl.g:312:1: ruleLogicExpression : ( ( rule__LogicExpression__Alternatives ) ) ;
    public final void ruleLogicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:316:2: ( ( ( rule__LogicExpression__Alternatives ) ) )
            // InternalSmellDsl.g:317:2: ( ( rule__LogicExpression__Alternatives ) )
            {
            // InternalSmellDsl.g:317:2: ( ( rule__LogicExpression__Alternatives ) )
            // InternalSmellDsl.g:318:3: ( rule__LogicExpression__Alternatives )
            {
             before(grammarAccess.getLogicExpressionAccess().getAlternatives()); 
            // InternalSmellDsl.g:319:3: ( rule__LogicExpression__Alternatives )
            // InternalSmellDsl.g:319:4: rule__LogicExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogicExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicExpression"


    // $ANTLR start "entryRuleExpression"
    // InternalSmellDsl.g:328:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalSmellDsl.g:329:1: ( ruleExpression EOF )
            // InternalSmellDsl.g:330:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSmellDsl.g:337:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:341:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalSmellDsl.g:342:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalSmellDsl.g:342:2: ( ( rule__Expression__Group__0 ) )
            // InternalSmellDsl.g:343:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalSmellDsl.g:344:3: ( rule__Expression__Group__0 )
            // InternalSmellDsl.g:344:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleResult"
    // InternalSmellDsl.g:353:1: entryRuleResult : ruleResult EOF ;
    public final void entryRuleResult() throws RecognitionException {
        try {
            // InternalSmellDsl.g:354:1: ( ruleResult EOF )
            // InternalSmellDsl.g:355:1: ruleResult EOF
            {
             before(grammarAccess.getResultRule()); 
            pushFollow(FOLLOW_1);
            ruleResult();

            state._fsp--;

             after(grammarAccess.getResultRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalSmellDsl.g:362:1: ruleResult : ( ( rule__Result__NameAssignment ) ) ;
    public final void ruleResult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:366:2: ( ( ( rule__Result__NameAssignment ) ) )
            // InternalSmellDsl.g:367:2: ( ( rule__Result__NameAssignment ) )
            {
            // InternalSmellDsl.g:367:2: ( ( rule__Result__NameAssignment ) )
            // InternalSmellDsl.g:368:3: ( rule__Result__NameAssignment )
            {
             before(grammarAccess.getResultAccess().getNameAssignment()); 
            // InternalSmellDsl.g:369:3: ( rule__Result__NameAssignment )
            // InternalSmellDsl.g:369:4: rule__Result__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Result__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getResultAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResult"


    // $ANTLR start "ruleScaletype"
    // InternalSmellDsl.g:378:1: ruleScaletype : ( ( rule__Scaletype__Alternatives ) ) ;
    public final void ruleScaletype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:382:1: ( ( ( rule__Scaletype__Alternatives ) ) )
            // InternalSmellDsl.g:383:2: ( ( rule__Scaletype__Alternatives ) )
            {
            // InternalSmellDsl.g:383:2: ( ( rule__Scaletype__Alternatives ) )
            // InternalSmellDsl.g:384:3: ( rule__Scaletype__Alternatives )
            {
             before(grammarAccess.getScaletypeAccess().getAlternatives()); 
            // InternalSmellDsl.g:385:3: ( rule__Scaletype__Alternatives )
            // InternalSmellDsl.g:385:4: rule__Scaletype__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Scaletype__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScaletypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScaletype"


    // $ANTLR start "ruleLogicOperator"
    // InternalSmellDsl.g:394:1: ruleLogicOperator : ( ( rule__LogicOperator__Alternatives ) ) ;
    public final void ruleLogicOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:398:1: ( ( ( rule__LogicOperator__Alternatives ) ) )
            // InternalSmellDsl.g:399:2: ( ( rule__LogicOperator__Alternatives ) )
            {
            // InternalSmellDsl.g:399:2: ( ( rule__LogicOperator__Alternatives ) )
            // InternalSmellDsl.g:400:3: ( rule__LogicOperator__Alternatives )
            {
             before(grammarAccess.getLogicOperatorAccess().getAlternatives()); 
            // InternalSmellDsl.g:401:3: ( rule__LogicOperator__Alternatives )
            // InternalSmellDsl.g:401:4: rule__LogicOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogicOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicOperator"


    // $ANTLR start "ruleRelationalOperator"
    // InternalSmellDsl.g:410:1: ruleRelationalOperator : ( ( rule__RelationalOperator__Alternatives ) ) ;
    public final void ruleRelationalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:414:1: ( ( ( rule__RelationalOperator__Alternatives ) ) )
            // InternalSmellDsl.g:415:2: ( ( rule__RelationalOperator__Alternatives ) )
            {
            // InternalSmellDsl.g:415:2: ( ( rule__RelationalOperator__Alternatives ) )
            // InternalSmellDsl.g:416:3: ( rule__RelationalOperator__Alternatives )
            {
             before(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 
            // InternalSmellDsl.g:417:3: ( rule__RelationalOperator__Alternatives )
            // InternalSmellDsl.g:417:4: rule__RelationalOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationalOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalSmellDsl.g:425:1: rule__Type__Alternatives : ( ( ruleSmellType ) | ( ruleSmell ) | ( ruleRule ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:429:1: ( ( ruleSmellType ) | ( ruleSmell ) | ( ruleRule ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSmellDsl.g:430:2: ( ruleSmellType )
                    {
                    // InternalSmellDsl.g:430:2: ( ruleSmellType )
                    // InternalSmellDsl.g:431:3: ruleSmellType
                    {
                     before(grammarAccess.getTypeAccess().getSmellTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSmellType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getSmellTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmellDsl.g:436:2: ( ruleSmell )
                    {
                    // InternalSmellDsl.g:436:2: ( ruleSmell )
                    // InternalSmellDsl.g:437:3: ruleSmell
                    {
                     before(grammarAccess.getTypeAccess().getSmellParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSmell();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getSmellParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSmellDsl.g:442:2: ( ruleRule )
                    {
                    // InternalSmellDsl.g:442:2: ( ruleRule )
                    // InternalSmellDsl.g:443:3: ruleRule
                    {
                     before(grammarAccess.getTypeAccess().getRuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getRuleParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Measure__Alternatives"
    // InternalSmellDsl.g:452:1: rule__Measure__Alternatives : ( ( ( rule__Measure__NameAssignment_0 ) ) | ( ( rule__Measure__Group_1__0 ) ) );
    public final void rule__Measure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:456:1: ( ( ( rule__Measure__NameAssignment_0 ) ) | ( ( rule__Measure__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==RULE_ID||LA3_1==26||LA3_1==28||(LA3_1>=32 && LA3_1<=33)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==31) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSmellDsl.g:457:2: ( ( rule__Measure__NameAssignment_0 ) )
                    {
                    // InternalSmellDsl.g:457:2: ( ( rule__Measure__NameAssignment_0 ) )
                    // InternalSmellDsl.g:458:3: ( rule__Measure__NameAssignment_0 )
                    {
                     before(grammarAccess.getMeasureAccess().getNameAssignment_0()); 
                    // InternalSmellDsl.g:459:3: ( rule__Measure__NameAssignment_0 )
                    // InternalSmellDsl.g:459:4: rule__Measure__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Measure__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMeasureAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmellDsl.g:463:2: ( ( rule__Measure__Group_1__0 ) )
                    {
                    // InternalSmellDsl.g:463:2: ( ( rule__Measure__Group_1__0 ) )
                    // InternalSmellDsl.g:464:3: ( rule__Measure__Group_1__0 )
                    {
                     before(grammarAccess.getMeasureAccess().getGroup_1()); 
                    // InternalSmellDsl.g:465:3: ( rule__Measure__Group_1__0 )
                    // InternalSmellDsl.g:465:4: rule__Measure__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Measure__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMeasureAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Alternatives"


    // $ANTLR start "rule__LogicExpression__Alternatives"
    // InternalSmellDsl.g:473:1: rule__LogicExpression__Alternatives : ( ( ( rule__LogicExpression__ExpressionAssignment_0 ) ) | ( ( rule__LogicExpression__Group_1__0 ) ) );
    public final void rule__LogicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:477:1: ( ( ( rule__LogicExpression__ExpressionAssignment_0 ) ) | ( ( rule__LogicExpression__Group_1__0 ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSmellDsl.g:478:2: ( ( rule__LogicExpression__ExpressionAssignment_0 ) )
                    {
                    // InternalSmellDsl.g:478:2: ( ( rule__LogicExpression__ExpressionAssignment_0 ) )
                    // InternalSmellDsl.g:479:3: ( rule__LogicExpression__ExpressionAssignment_0 )
                    {
                     before(grammarAccess.getLogicExpressionAccess().getExpressionAssignment_0()); 
                    // InternalSmellDsl.g:480:3: ( rule__LogicExpression__ExpressionAssignment_0 )
                    // InternalSmellDsl.g:480:4: rule__LogicExpression__ExpressionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicExpression__ExpressionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogicExpressionAccess().getExpressionAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmellDsl.g:484:2: ( ( rule__LogicExpression__Group_1__0 ) )
                    {
                    // InternalSmellDsl.g:484:2: ( ( rule__LogicExpression__Group_1__0 ) )
                    // InternalSmellDsl.g:485:3: ( rule__LogicExpression__Group_1__0 )
                    {
                     before(grammarAccess.getLogicExpressionAccess().getGroup_1()); 
                    // InternalSmellDsl.g:486:3: ( rule__LogicExpression__Group_1__0 )
                    // InternalSmellDsl.g:486:4: rule__LogicExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogicExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpression__Alternatives"


    // $ANTLR start "rule__Scaletype__Alternatives"
    // InternalSmellDsl.g:494:1: rule__Scaletype__Alternatives : ( ( ( 'Nominal' ) ) | ( ( 'Ordinal' ) ) | ( ( 'Interval' ) ) | ( ( 'Ratio' ) ) );
    public final void rule__Scaletype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:498:1: ( ( ( 'Nominal' ) ) | ( ( 'Ordinal' ) ) | ( ( 'Interval' ) ) | ( ( 'Ratio' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSmellDsl.g:499:2: ( ( 'Nominal' ) )
                    {
                    // InternalSmellDsl.g:499:2: ( ( 'Nominal' ) )
                    // InternalSmellDsl.g:500:3: ( 'Nominal' )
                    {
                     before(grammarAccess.getScaletypeAccess().getNominalEnumLiteralDeclaration_0()); 
                    // InternalSmellDsl.g:501:3: ( 'Nominal' )
                    // InternalSmellDsl.g:501:4: 'Nominal'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getScaletypeAccess().getNominalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmellDsl.g:505:2: ( ( 'Ordinal' ) )
                    {
                    // InternalSmellDsl.g:505:2: ( ( 'Ordinal' ) )
                    // InternalSmellDsl.g:506:3: ( 'Ordinal' )
                    {
                     before(grammarAccess.getScaletypeAccess().getOrdinalEnumLiteralDeclaration_1()); 
                    // InternalSmellDsl.g:507:3: ( 'Ordinal' )
                    // InternalSmellDsl.g:507:4: 'Ordinal'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getScaletypeAccess().getOrdinalEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSmellDsl.g:511:2: ( ( 'Interval' ) )
                    {
                    // InternalSmellDsl.g:511:2: ( ( 'Interval' ) )
                    // InternalSmellDsl.g:512:3: ( 'Interval' )
                    {
                     before(grammarAccess.getScaletypeAccess().getIntervalEnumLiteralDeclaration_2()); 
                    // InternalSmellDsl.g:513:3: ( 'Interval' )
                    // InternalSmellDsl.g:513:4: 'Interval'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getScaletypeAccess().getIntervalEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSmellDsl.g:517:2: ( ( 'Ratio' ) )
                    {
                    // InternalSmellDsl.g:517:2: ( ( 'Ratio' ) )
                    // InternalSmellDsl.g:518:3: ( 'Ratio' )
                    {
                     before(grammarAccess.getScaletypeAccess().getRatioEnumLiteralDeclaration_3()); 
                    // InternalSmellDsl.g:519:3: ( 'Ratio' )
                    // InternalSmellDsl.g:519:4: 'Ratio'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getScaletypeAccess().getRatioEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scaletype__Alternatives"


    // $ANTLR start "rule__LogicOperator__Alternatives"
    // InternalSmellDsl.g:527:1: rule__LogicOperator__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__LogicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:531:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmellDsl.g:532:2: ( ( 'AND' ) )
                    {
                    // InternalSmellDsl.g:532:2: ( ( 'AND' ) )
                    // InternalSmellDsl.g:533:3: ( 'AND' )
                    {
                     before(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalSmellDsl.g:534:3: ( 'AND' )
                    // InternalSmellDsl.g:534:4: 'AND'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmellDsl.g:538:2: ( ( 'OR' ) )
                    {
                    // InternalSmellDsl.g:538:2: ( ( 'OR' ) )
                    // InternalSmellDsl.g:539:3: ( 'OR' )
                    {
                     before(grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalSmellDsl.g:540:3: ( 'OR' )
                    // InternalSmellDsl.g:540:4: 'OR'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Alternatives"


    // $ANTLR start "rule__RelationalOperator__Alternatives"
    // InternalSmellDsl.g:548:1: rule__RelationalOperator__Alternatives : ( ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '!=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) | ( ( '==' ) ) );
    public final void rule__RelationalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:552:1: ( ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '!=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) | ( ( '==' ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            case 22:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSmellDsl.g:553:2: ( ( '>=' ) )
                    {
                    // InternalSmellDsl.g:553:2: ( ( '>=' ) )
                    // InternalSmellDsl.g:554:3: ( '>=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getGreaterThanOrEqualToEnumLiteralDeclaration_0()); 
                    // InternalSmellDsl.g:555:3: ( '>=' )
                    // InternalSmellDsl.g:555:4: '>='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getGreaterThanOrEqualToEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmellDsl.g:559:2: ( ( '<=' ) )
                    {
                    // InternalSmellDsl.g:559:2: ( ( '<=' ) )
                    // InternalSmellDsl.g:560:3: ( '<=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getLessThanOrEqualToEnumLiteralDeclaration_1()); 
                    // InternalSmellDsl.g:561:3: ( '<=' )
                    // InternalSmellDsl.g:561:4: '<='
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getLessThanOrEqualToEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSmellDsl.g:565:2: ( ( '!=' ) )
                    {
                    // InternalSmellDsl.g:565:2: ( ( '!=' ) )
                    // InternalSmellDsl.g:566:3: ( '!=' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getNotEqualToEnumLiteralDeclaration_2()); 
                    // InternalSmellDsl.g:567:3: ( '!=' )
                    // InternalSmellDsl.g:567:4: '!='
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getNotEqualToEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSmellDsl.g:571:2: ( ( '<' ) )
                    {
                    // InternalSmellDsl.g:571:2: ( ( '<' ) )
                    // InternalSmellDsl.g:572:3: ( '<' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getLessThanEnumLiteralDeclaration_3()); 
                    // InternalSmellDsl.g:573:3: ( '<' )
                    // InternalSmellDsl.g:573:4: '<'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getLessThanEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSmellDsl.g:577:2: ( ( '>' ) )
                    {
                    // InternalSmellDsl.g:577:2: ( ( '>' ) )
                    // InternalSmellDsl.g:578:3: ( '>' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getGreaterThanEnumLiteralDeclaration_4()); 
                    // InternalSmellDsl.g:579:3: ( '>' )
                    // InternalSmellDsl.g:579:4: '>'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getGreaterThanEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSmellDsl.g:583:2: ( ( '==' ) )
                    {
                    // InternalSmellDsl.g:583:2: ( ( '==' ) )
                    // InternalSmellDsl.g:584:3: ( '==' )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getEqualToEnumLiteralDeclaration_5()); 
                    // InternalSmellDsl.g:585:3: ( '==' )
                    // InternalSmellDsl.g:585:4: '=='
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationalOperatorAccess().getEqualToEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalOperator__Alternatives"


    // $ANTLR start "rule__SmellType__Group__0"
    // InternalSmellDsl.g:593:1: rule__SmellType__Group__0 : rule__SmellType__Group__0__Impl rule__SmellType__Group__1 ;
    public final void rule__SmellType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:597:1: ( rule__SmellType__Group__0__Impl rule__SmellType__Group__1 )
            // InternalSmellDsl.g:598:2: rule__SmellType__Group__0__Impl rule__SmellType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SmellType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmellType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmellType__Group__0"


    // $ANTLR start "rule__SmellType__Group__0__Impl"
    // InternalSmellDsl.g:605:1: rule__SmellType__Group__0__Impl : ( 'smelltype' ) ;
    public final void rule__SmellType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:609:1: ( ( 'smelltype' ) )
            // InternalSmellDsl.g:610:1: ( 'smelltype' )
            {
            // InternalSmellDsl.g:610:1: ( 'smelltype' )
            // InternalSmellDsl.g:611:2: 'smelltype'
            {
             before(grammarAccess.getSmellTypeAccess().getSmelltypeKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSmellTypeAccess().getSmelltypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmellType__Group__0__Impl"


    // $ANTLR start "rule__SmellType__Group__1"
    // InternalSmellDsl.g:620:1: rule__SmellType__Group__1 : rule__SmellType__Group__1__Impl ;
    public final void rule__SmellType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:624:1: ( rule__SmellType__Group__1__Impl )
            // InternalSmellDsl.g:625:2: rule__SmellType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmellType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmellType__Group__1"


    // $ANTLR start "rule__SmellType__Group__1__Impl"
    // InternalSmellDsl.g:631:1: rule__SmellType__Group__1__Impl : ( ( rule__SmellType__NameAssignment_1 ) ) ;
    public final void rule__SmellType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:635:1: ( ( ( rule__SmellType__NameAssignment_1 ) ) )
            // InternalSmellDsl.g:636:1: ( ( rule__SmellType__NameAssignment_1 ) )
            {
            // InternalSmellDsl.g:636:1: ( ( rule__SmellType__NameAssignment_1 ) )
            // InternalSmellDsl.g:637:2: ( rule__SmellType__NameAssignment_1 )
            {
             before(grammarAccess.getSmellTypeAccess().getNameAssignment_1()); 
            // InternalSmellDsl.g:638:2: ( rule__SmellType__NameAssignment_1 )
            // InternalSmellDsl.g:638:3: rule__SmellType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SmellType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmellTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmellType__Group__1__Impl"


    // $ANTLR start "rule__Smell__Group__0"
    // InternalSmellDsl.g:647:1: rule__Smell__Group__0 : rule__Smell__Group__0__Impl rule__Smell__Group__1 ;
    public final void rule__Smell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:651:1: ( rule__Smell__Group__0__Impl rule__Smell__Group__1 )
            // InternalSmellDsl.g:652:2: rule__Smell__Group__0__Impl rule__Smell__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Smell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Smell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group__0"


    // $ANTLR start "rule__Smell__Group__0__Impl"
    // InternalSmellDsl.g:659:1: rule__Smell__Group__0__Impl : ( 'smell' ) ;
    public final void rule__Smell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:663:1: ( ( 'smell' ) )
            // InternalSmellDsl.g:664:1: ( 'smell' )
            {
            // InternalSmellDsl.g:664:1: ( 'smell' )
            // InternalSmellDsl.g:665:2: 'smell'
            {
             before(grammarAccess.getSmellAccess().getSmellKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSmellAccess().getSmellKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group__0__Impl"


    // $ANTLR start "rule__Smell__Group__1"
    // InternalSmellDsl.g:674:1: rule__Smell__Group__1 : rule__Smell__Group__1__Impl rule__Smell__Group__2 ;
    public final void rule__Smell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:678:1: ( rule__Smell__Group__1__Impl rule__Smell__Group__2 )
            // InternalSmellDsl.g:679:2: rule__Smell__Group__1__Impl rule__Smell__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Smell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Smell__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group__1"


    // $ANTLR start "rule__Smell__Group__1__Impl"
    // InternalSmellDsl.g:686:1: rule__Smell__Group__1__Impl : ( ( rule__Smell__NameAssignment_1 ) ) ;
    public final void rule__Smell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:690:1: ( ( ( rule__Smell__NameAssignment_1 ) ) )
            // InternalSmellDsl.g:691:1: ( ( rule__Smell__NameAssignment_1 ) )
            {
            // InternalSmellDsl.g:691:1: ( ( rule__Smell__NameAssignment_1 ) )
            // InternalSmellDsl.g:692:2: ( rule__Smell__NameAssignment_1 )
            {
             before(grammarAccess.getSmellAccess().getNameAssignment_1()); 
            // InternalSmellDsl.g:693:2: ( rule__Smell__NameAssignment_1 )
            // InternalSmellDsl.g:693:3: rule__Smell__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Smell__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmellAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group__1__Impl"


    // $ANTLR start "rule__Smell__Group__2"
    // InternalSmellDsl.g:701:1: rule__Smell__Group__2 : rule__Smell__Group__2__Impl rule__Smell__Group__3 ;
    public final void rule__Smell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:705:1: ( rule__Smell__Group__2__Impl rule__Smell__Group__3 )
            // InternalSmellDsl.g:706:2: rule__Smell__Group__2__Impl rule__Smell__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Smell__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Smell__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group__2"


    // $ANTLR start "rule__Smell__Group__2__Impl"
    // InternalSmellDsl.g:713:1: rule__Smell__Group__2__Impl : ( ( rule__Smell__Group_2__0 )? ) ;
    public final void rule__Smell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:717:1: ( ( ( rule__Smell__Group_2__0 )? ) )
            // InternalSmellDsl.g:718:1: ( ( rule__Smell__Group_2__0 )? )
            {
            // InternalSmellDsl.g:718:1: ( ( rule__Smell__Group_2__0 )? )
            // InternalSmellDsl.g:719:2: ( rule__Smell__Group_2__0 )?
            {
             before(grammarAccess.getSmellAccess().getGroup_2()); 
            // InternalSmellDsl.g:720:2: ( rule__Smell__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmellDsl.g:720:3: rule__Smell__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Smell__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmellAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group__2__Impl"


    // $ANTLR start "rule__Smell__Group__3"
    // InternalSmellDsl.g:728:1: rule__Smell__Group__3 : rule__Smell__Group__3__Impl rule__Smell__Group__4 ;
    public final void rule__Smell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:732:1: ( rule__Smell__Group__3__Impl rule__Smell__Group__4 )
            // InternalSmellDsl.g:733:2: rule__Smell__Group__3__Impl rule__Smell__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Smell__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Smell__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group__3"


    // $ANTLR start "rule__Smell__Group__3__Impl"
    // InternalSmellDsl.g:740:1: rule__Smell__Group__3__Impl : ( '{' ) ;
    public final void rule__Smell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:744:1: ( ( '{' ) )
            // InternalSmellDsl.g:745:1: ( '{' )
            {
            // InternalSmellDsl.g:745:1: ( '{' )
            // InternalSmellDsl.g:746:2: '{'
            {
             before(grammarAccess.getSmellAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSmellAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group__3__Impl"


    // $ANTLR start "rule__Smell__Group__4"
    // InternalSmellDsl.g:755:1: rule__Smell__Group__4 : rule__Smell__Group__4__Impl rule__Smell__Group__5 ;
    public final void rule__Smell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:759:1: ( rule__Smell__Group__4__Impl rule__Smell__Group__5 )
            // InternalSmellDsl.g:760:2: rule__Smell__Group__4__Impl rule__Smell__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Smell__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Smell__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group__4"


    // $ANTLR start "rule__Smell__Group__4__Impl"
    // InternalSmellDsl.g:767:1: rule__Smell__Group__4__Impl : ( ( rule__Smell__SmellcontentAssignment_4 )* ) ;
    public final void rule__Smell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:771:1: ( ( ( rule__Smell__SmellcontentAssignment_4 )* ) )
            // InternalSmellDsl.g:772:1: ( ( rule__Smell__SmellcontentAssignment_4 )* )
            {
            // InternalSmellDsl.g:772:1: ( ( rule__Smell__SmellcontentAssignment_4 )* )
            // InternalSmellDsl.g:773:2: ( rule__Smell__SmellcontentAssignment_4 )*
            {
             before(grammarAccess.getSmellAccess().getSmellcontentAssignment_4()); 
            // InternalSmellDsl.g:774:2: ( rule__Smell__SmellcontentAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSmellDsl.g:774:3: rule__Smell__SmellcontentAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Smell__SmellcontentAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSmellAccess().getSmellcontentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group__4__Impl"


    // $ANTLR start "rule__Smell__Group__5"
    // InternalSmellDsl.g:782:1: rule__Smell__Group__5 : rule__Smell__Group__5__Impl rule__Smell__Group__6 ;
    public final void rule__Smell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:786:1: ( rule__Smell__Group__5__Impl rule__Smell__Group__6 )
            // InternalSmellDsl.g:787:2: rule__Smell__Group__5__Impl rule__Smell__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Smell__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Smell__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group__5"


    // $ANTLR start "rule__Smell__Group__5__Impl"
    // InternalSmellDsl.g:794:1: rule__Smell__Group__5__Impl : ( ( rule__Smell__SymptomAssignment_5 )? ) ;
    public final void rule__Smell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:798:1: ( ( ( rule__Smell__SymptomAssignment_5 )? ) )
            // InternalSmellDsl.g:799:1: ( ( rule__Smell__SymptomAssignment_5 )? )
            {
            // InternalSmellDsl.g:799:1: ( ( rule__Smell__SymptomAssignment_5 )? )
            // InternalSmellDsl.g:800:2: ( rule__Smell__SymptomAssignment_5 )?
            {
             before(grammarAccess.getSmellAccess().getSymptomAssignment_5()); 
            // InternalSmellDsl.g:801:2: ( rule__Smell__SymptomAssignment_5 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmellDsl.g:801:3: rule__Smell__SymptomAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Smell__SymptomAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmellAccess().getSymptomAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group__5__Impl"


    // $ANTLR start "rule__Smell__Group__6"
    // InternalSmellDsl.g:809:1: rule__Smell__Group__6 : rule__Smell__Group__6__Impl rule__Smell__Group__7 ;
    public final void rule__Smell__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:813:1: ( rule__Smell__Group__6__Impl rule__Smell__Group__7 )
            // InternalSmellDsl.g:814:2: rule__Smell__Group__6__Impl rule__Smell__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Smell__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Smell__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group__6"


    // $ANTLR start "rule__Smell__Group__6__Impl"
    // InternalSmellDsl.g:821:1: rule__Smell__Group__6__Impl : ( ( rule__Smell__TreatmentAssignment_6 )? ) ;
    public final void rule__Smell__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:825:1: ( ( ( rule__Smell__TreatmentAssignment_6 )? ) )
            // InternalSmellDsl.g:826:1: ( ( rule__Smell__TreatmentAssignment_6 )? )
            {
            // InternalSmellDsl.g:826:1: ( ( rule__Smell__TreatmentAssignment_6 )? )
            // InternalSmellDsl.g:827:2: ( rule__Smell__TreatmentAssignment_6 )?
            {
             before(grammarAccess.getSmellAccess().getTreatmentAssignment_6()); 
            // InternalSmellDsl.g:828:2: ( rule__Smell__TreatmentAssignment_6 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmellDsl.g:828:3: rule__Smell__TreatmentAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Smell__TreatmentAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmellAccess().getTreatmentAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group__6__Impl"


    // $ANTLR start "rule__Smell__Group__7"
    // InternalSmellDsl.g:836:1: rule__Smell__Group__7 : rule__Smell__Group__7__Impl ;
    public final void rule__Smell__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:840:1: ( rule__Smell__Group__7__Impl )
            // InternalSmellDsl.g:841:2: rule__Smell__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Smell__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group__7"


    // $ANTLR start "rule__Smell__Group__7__Impl"
    // InternalSmellDsl.g:847:1: rule__Smell__Group__7__Impl : ( '}' ) ;
    public final void rule__Smell__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:851:1: ( ( '}' ) )
            // InternalSmellDsl.g:852:1: ( '}' )
            {
            // InternalSmellDsl.g:852:1: ( '}' )
            // InternalSmellDsl.g:853:2: '}'
            {
             before(grammarAccess.getSmellAccess().getRightCurlyBracketKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSmellAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group__7__Impl"


    // $ANTLR start "rule__Smell__Group_2__0"
    // InternalSmellDsl.g:863:1: rule__Smell__Group_2__0 : rule__Smell__Group_2__0__Impl rule__Smell__Group_2__1 ;
    public final void rule__Smell__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:867:1: ( rule__Smell__Group_2__0__Impl rule__Smell__Group_2__1 )
            // InternalSmellDsl.g:868:2: rule__Smell__Group_2__0__Impl rule__Smell__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Smell__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Smell__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group_2__0"


    // $ANTLR start "rule__Smell__Group_2__0__Impl"
    // InternalSmellDsl.g:875:1: rule__Smell__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Smell__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:879:1: ( ( 'extends' ) )
            // InternalSmellDsl.g:880:1: ( 'extends' )
            {
            // InternalSmellDsl.g:880:1: ( 'extends' )
            // InternalSmellDsl.g:881:2: 'extends'
            {
             before(grammarAccess.getSmellAccess().getExtendsKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSmellAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group_2__0__Impl"


    // $ANTLR start "rule__Smell__Group_2__1"
    // InternalSmellDsl.g:890:1: rule__Smell__Group_2__1 : rule__Smell__Group_2__1__Impl ;
    public final void rule__Smell__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:894:1: ( rule__Smell__Group_2__1__Impl )
            // InternalSmellDsl.g:895:2: rule__Smell__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Smell__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group_2__1"


    // $ANTLR start "rule__Smell__Group_2__1__Impl"
    // InternalSmellDsl.g:901:1: rule__Smell__Group_2__1__Impl : ( ( rule__Smell__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Smell__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:905:1: ( ( ( rule__Smell__SuperTypeAssignment_2_1 ) ) )
            // InternalSmellDsl.g:906:1: ( ( rule__Smell__SuperTypeAssignment_2_1 ) )
            {
            // InternalSmellDsl.g:906:1: ( ( rule__Smell__SuperTypeAssignment_2_1 ) )
            // InternalSmellDsl.g:907:2: ( rule__Smell__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getSmellAccess().getSuperTypeAssignment_2_1()); 
            // InternalSmellDsl.g:908:2: ( rule__Smell__SuperTypeAssignment_2_1 )
            // InternalSmellDsl.g:908:3: rule__Smell__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Smell__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSmellAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__Group_2__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalSmellDsl.g:917:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:921:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalSmellDsl.g:922:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalSmellDsl.g:929:1: rule__Feature__Group__0__Impl : ( 'feature' ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:933:1: ( ( 'feature' ) )
            // InternalSmellDsl.g:934:1: ( 'feature' )
            {
            // InternalSmellDsl.g:934:1: ( 'feature' )
            // InternalSmellDsl.g:935:2: 'feature'
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalSmellDsl.g:944:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:948:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalSmellDsl.g:949:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalSmellDsl.g:956:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:960:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalSmellDsl.g:961:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalSmellDsl.g:961:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalSmellDsl.g:962:2: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalSmellDsl.g:963:2: ( rule__Feature__NameAssignment_1 )
            // InternalSmellDsl.g:963:3: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalSmellDsl.g:971:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:975:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalSmellDsl.g:976:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalSmellDsl.g:983:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__OptscalesAssignment_2 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:987:1: ( ( ( rule__Feature__OptscalesAssignment_2 )? ) )
            // InternalSmellDsl.g:988:1: ( ( rule__Feature__OptscalesAssignment_2 )? )
            {
            // InternalSmellDsl.g:988:1: ( ( rule__Feature__OptscalesAssignment_2 )? )
            // InternalSmellDsl.g:989:2: ( rule__Feature__OptscalesAssignment_2 )?
            {
             before(grammarAccess.getFeatureAccess().getOptscalesAssignment_2()); 
            // InternalSmellDsl.g:990:2: ( rule__Feature__OptscalesAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSmellDsl.g:990:3: rule__Feature__OptscalesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__OptscalesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getOptscalesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalSmellDsl.g:998:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1002:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalSmellDsl.g:1003:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalSmellDsl.g:1010:1: rule__Feature__Group__3__Impl : ( 'with threshold' ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1014:1: ( ( 'with threshold' ) )
            // InternalSmellDsl.g:1015:1: ( 'with threshold' )
            {
            // InternalSmellDsl.g:1015:1: ( 'with threshold' )
            // InternalSmellDsl.g:1016:2: 'with threshold'
            {
             before(grammarAccess.getFeatureAccess().getWithThresholdKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getWithThresholdKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__4"
    // InternalSmellDsl.g:1025:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1029:1: ( rule__Feature__Group__4__Impl )
            // InternalSmellDsl.g:1030:2: rule__Feature__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4"


    // $ANTLR start "rule__Feature__Group__4__Impl"
    // InternalSmellDsl.g:1036:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__MeasuresAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1040:1: ( ( ( rule__Feature__MeasuresAssignment_4 )* ) )
            // InternalSmellDsl.g:1041:1: ( ( rule__Feature__MeasuresAssignment_4 )* )
            {
            // InternalSmellDsl.g:1041:1: ( ( rule__Feature__MeasuresAssignment_4 )* )
            // InternalSmellDsl.g:1042:2: ( rule__Feature__MeasuresAssignment_4 )*
            {
             before(grammarAccess.getFeatureAccess().getMeasuresAssignment_4()); 
            // InternalSmellDsl.g:1043:2: ( rule__Feature__MeasuresAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSmellDsl.g:1043:3: rule__Feature__MeasuresAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Feature__MeasuresAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getMeasuresAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__Optscale__Group__0"
    // InternalSmellDsl.g:1052:1: rule__Optscale__Group__0 : rule__Optscale__Group__0__Impl rule__Optscale__Group__1 ;
    public final void rule__Optscale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1056:1: ( rule__Optscale__Group__0__Impl rule__Optscale__Group__1 )
            // InternalSmellDsl.g:1057:2: rule__Optscale__Group__0__Impl rule__Optscale__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Optscale__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Optscale__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optscale__Group__0"


    // $ANTLR start "rule__Optscale__Group__0__Impl"
    // InternalSmellDsl.g:1064:1: rule__Optscale__Group__0__Impl : ( 'is' ) ;
    public final void rule__Optscale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1068:1: ( ( 'is' ) )
            // InternalSmellDsl.g:1069:1: ( 'is' )
            {
            // InternalSmellDsl.g:1069:1: ( 'is' )
            // InternalSmellDsl.g:1070:2: 'is'
            {
             before(grammarAccess.getOptscaleAccess().getIsKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getOptscaleAccess().getIsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optscale__Group__0__Impl"


    // $ANTLR start "rule__Optscale__Group__1"
    // InternalSmellDsl.g:1079:1: rule__Optscale__Group__1 : rule__Optscale__Group__1__Impl ;
    public final void rule__Optscale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1083:1: ( rule__Optscale__Group__1__Impl )
            // InternalSmellDsl.g:1084:2: rule__Optscale__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Optscale__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optscale__Group__1"


    // $ANTLR start "rule__Optscale__Group__1__Impl"
    // InternalSmellDsl.g:1090:1: rule__Optscale__Group__1__Impl : ( ( rule__Optscale__ScaletypeAssignment_1 ) ) ;
    public final void rule__Optscale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1094:1: ( ( ( rule__Optscale__ScaletypeAssignment_1 ) ) )
            // InternalSmellDsl.g:1095:1: ( ( rule__Optscale__ScaletypeAssignment_1 ) )
            {
            // InternalSmellDsl.g:1095:1: ( ( rule__Optscale__ScaletypeAssignment_1 ) )
            // InternalSmellDsl.g:1096:2: ( rule__Optscale__ScaletypeAssignment_1 )
            {
             before(grammarAccess.getOptscaleAccess().getScaletypeAssignment_1()); 
            // InternalSmellDsl.g:1097:2: ( rule__Optscale__ScaletypeAssignment_1 )
            // InternalSmellDsl.g:1097:3: rule__Optscale__ScaletypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Optscale__ScaletypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptscaleAccess().getScaletypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optscale__Group__1__Impl"


    // $ANTLR start "rule__Measure__Group_1__0"
    // InternalSmellDsl.g:1106:1: rule__Measure__Group_1__0 : rule__Measure__Group_1__0__Impl rule__Measure__Group_1__1 ;
    public final void rule__Measure__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1110:1: ( rule__Measure__Group_1__0__Impl rule__Measure__Group_1__1 )
            // InternalSmellDsl.g:1111:2: rule__Measure__Group_1__0__Impl rule__Measure__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Measure__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measure__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_1__0"


    // $ANTLR start "rule__Measure__Group_1__0__Impl"
    // InternalSmellDsl.g:1118:1: rule__Measure__Group_1__0__Impl : ( ( rule__Measure__NameAssignment_1_0 ) ) ;
    public final void rule__Measure__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1122:1: ( ( ( rule__Measure__NameAssignment_1_0 ) ) )
            // InternalSmellDsl.g:1123:1: ( ( rule__Measure__NameAssignment_1_0 ) )
            {
            // InternalSmellDsl.g:1123:1: ( ( rule__Measure__NameAssignment_1_0 ) )
            // InternalSmellDsl.g:1124:2: ( rule__Measure__NameAssignment_1_0 )
            {
             before(grammarAccess.getMeasureAccess().getNameAssignment_1_0()); 
            // InternalSmellDsl.g:1125:2: ( rule__Measure__NameAssignment_1_0 )
            // InternalSmellDsl.g:1125:3: rule__Measure__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Measure__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_1__0__Impl"


    // $ANTLR start "rule__Measure__Group_1__1"
    // InternalSmellDsl.g:1133:1: rule__Measure__Group_1__1 : rule__Measure__Group_1__1__Impl rule__Measure__Group_1__2 ;
    public final void rule__Measure__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1137:1: ( rule__Measure__Group_1__1__Impl rule__Measure__Group_1__2 )
            // InternalSmellDsl.g:1138:2: rule__Measure__Group_1__1__Impl rule__Measure__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__Measure__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measure__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_1__1"


    // $ANTLR start "rule__Measure__Group_1__1__Impl"
    // InternalSmellDsl.g:1145:1: rule__Measure__Group_1__1__Impl : ( ',' ) ;
    public final void rule__Measure__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1149:1: ( ( ',' ) )
            // InternalSmellDsl.g:1150:1: ( ',' )
            {
            // InternalSmellDsl.g:1150:1: ( ',' )
            // InternalSmellDsl.g:1151:2: ','
            {
             before(grammarAccess.getMeasureAccess().getCommaKeyword_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMeasureAccess().getCommaKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_1__1__Impl"


    // $ANTLR start "rule__Measure__Group_1__2"
    // InternalSmellDsl.g:1160:1: rule__Measure__Group_1__2 : rule__Measure__Group_1__2__Impl ;
    public final void rule__Measure__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1164:1: ( rule__Measure__Group_1__2__Impl )
            // InternalSmellDsl.g:1165:2: rule__Measure__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Measure__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_1__2"


    // $ANTLR start "rule__Measure__Group_1__2__Impl"
    // InternalSmellDsl.g:1171:1: rule__Measure__Group_1__2__Impl : ( ( rule__Measure__MeasureAssignment_1_2 ) ) ;
    public final void rule__Measure__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1175:1: ( ( ( rule__Measure__MeasureAssignment_1_2 ) ) )
            // InternalSmellDsl.g:1176:1: ( ( rule__Measure__MeasureAssignment_1_2 ) )
            {
            // InternalSmellDsl.g:1176:1: ( ( rule__Measure__MeasureAssignment_1_2 ) )
            // InternalSmellDsl.g:1177:2: ( rule__Measure__MeasureAssignment_1_2 )
            {
             before(grammarAccess.getMeasureAccess().getMeasureAssignment_1_2()); 
            // InternalSmellDsl.g:1178:2: ( rule__Measure__MeasureAssignment_1_2 )
            // InternalSmellDsl.g:1178:3: rule__Measure__MeasureAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Measure__MeasureAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getMeasureAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_1__2__Impl"


    // $ANTLR start "rule__Symptom__Group__0"
    // InternalSmellDsl.g:1187:1: rule__Symptom__Group__0 : rule__Symptom__Group__0__Impl rule__Symptom__Group__1 ;
    public final void rule__Symptom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1191:1: ( rule__Symptom__Group__0__Impl rule__Symptom__Group__1 )
            // InternalSmellDsl.g:1192:2: rule__Symptom__Group__0__Impl rule__Symptom__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Symptom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Symptom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symptom__Group__0"


    // $ANTLR start "rule__Symptom__Group__0__Impl"
    // InternalSmellDsl.g:1199:1: rule__Symptom__Group__0__Impl : ( 'symptom' ) ;
    public final void rule__Symptom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1203:1: ( ( 'symptom' ) )
            // InternalSmellDsl.g:1204:1: ( 'symptom' )
            {
            // InternalSmellDsl.g:1204:1: ( 'symptom' )
            // InternalSmellDsl.g:1205:2: 'symptom'
            {
             before(grammarAccess.getSymptomAccess().getSymptomKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSymptomAccess().getSymptomKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symptom__Group__0__Impl"


    // $ANTLR start "rule__Symptom__Group__1"
    // InternalSmellDsl.g:1214:1: rule__Symptom__Group__1 : rule__Symptom__Group__1__Impl ;
    public final void rule__Symptom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1218:1: ( rule__Symptom__Group__1__Impl )
            // InternalSmellDsl.g:1219:2: rule__Symptom__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Symptom__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symptom__Group__1"


    // $ANTLR start "rule__Symptom__Group__1__Impl"
    // InternalSmellDsl.g:1225:1: rule__Symptom__Group__1__Impl : ( ( rule__Symptom__NameAssignment_1 ) ) ;
    public final void rule__Symptom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1229:1: ( ( ( rule__Symptom__NameAssignment_1 ) ) )
            // InternalSmellDsl.g:1230:1: ( ( rule__Symptom__NameAssignment_1 ) )
            {
            // InternalSmellDsl.g:1230:1: ( ( rule__Symptom__NameAssignment_1 ) )
            // InternalSmellDsl.g:1231:2: ( rule__Symptom__NameAssignment_1 )
            {
             before(grammarAccess.getSymptomAccess().getNameAssignment_1()); 
            // InternalSmellDsl.g:1232:2: ( rule__Symptom__NameAssignment_1 )
            // InternalSmellDsl.g:1232:3: rule__Symptom__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Symptom__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSymptomAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symptom__Group__1__Impl"


    // $ANTLR start "rule__Treatment__Group__0"
    // InternalSmellDsl.g:1241:1: rule__Treatment__Group__0 : rule__Treatment__Group__0__Impl rule__Treatment__Group__1 ;
    public final void rule__Treatment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1245:1: ( rule__Treatment__Group__0__Impl rule__Treatment__Group__1 )
            // InternalSmellDsl.g:1246:2: rule__Treatment__Group__0__Impl rule__Treatment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Treatment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Treatment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Treatment__Group__0"


    // $ANTLR start "rule__Treatment__Group__0__Impl"
    // InternalSmellDsl.g:1253:1: rule__Treatment__Group__0__Impl : ( 'treatment' ) ;
    public final void rule__Treatment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1257:1: ( ( 'treatment' ) )
            // InternalSmellDsl.g:1258:1: ( 'treatment' )
            {
            // InternalSmellDsl.g:1258:1: ( 'treatment' )
            // InternalSmellDsl.g:1259:2: 'treatment'
            {
             before(grammarAccess.getTreatmentAccess().getTreatmentKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTreatmentAccess().getTreatmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Treatment__Group__0__Impl"


    // $ANTLR start "rule__Treatment__Group__1"
    // InternalSmellDsl.g:1268:1: rule__Treatment__Group__1 : rule__Treatment__Group__1__Impl ;
    public final void rule__Treatment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1272:1: ( rule__Treatment__Group__1__Impl )
            // InternalSmellDsl.g:1273:2: rule__Treatment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Treatment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Treatment__Group__1"


    // $ANTLR start "rule__Treatment__Group__1__Impl"
    // InternalSmellDsl.g:1279:1: rule__Treatment__Group__1__Impl : ( ( rule__Treatment__NameAssignment_1 ) ) ;
    public final void rule__Treatment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1283:1: ( ( ( rule__Treatment__NameAssignment_1 ) ) )
            // InternalSmellDsl.g:1284:1: ( ( rule__Treatment__NameAssignment_1 ) )
            {
            // InternalSmellDsl.g:1284:1: ( ( rule__Treatment__NameAssignment_1 ) )
            // InternalSmellDsl.g:1285:2: ( rule__Treatment__NameAssignment_1 )
            {
             before(grammarAccess.getTreatmentAccess().getNameAssignment_1()); 
            // InternalSmellDsl.g:1286:2: ( rule__Treatment__NameAssignment_1 )
            // InternalSmellDsl.g:1286:3: rule__Treatment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Treatment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTreatmentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Treatment__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalSmellDsl.g:1295:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1299:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalSmellDsl.g:1300:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalSmellDsl.g:1307:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1311:1: ( ( 'rule' ) )
            // InternalSmellDsl.g:1312:1: ( 'rule' )
            {
            // InternalSmellDsl.g:1312:1: ( 'rule' )
            // InternalSmellDsl.g:1313:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalSmellDsl.g:1322:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1326:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalSmellDsl.g:1327:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalSmellDsl.g:1334:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1338:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalSmellDsl.g:1339:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalSmellDsl.g:1339:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalSmellDsl.g:1340:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalSmellDsl.g:1341:2: ( rule__Rule__NameAssignment_1 )
            // InternalSmellDsl.g:1341:3: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalSmellDsl.g:1349:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1353:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalSmellDsl.g:1354:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalSmellDsl.g:1361:1: rule__Rule__Group__2__Impl : ( 'when' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1365:1: ( ( 'when' ) )
            // InternalSmellDsl.g:1366:1: ( 'when' )
            {
            // InternalSmellDsl.g:1366:1: ( 'when' )
            // InternalSmellDsl.g:1367:2: 'when'
            {
             before(grammarAccess.getRuleAccess().getWhenKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getWhenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalSmellDsl.g:1376:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1380:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalSmellDsl.g:1381:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalSmellDsl.g:1388:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__LogicExpressionAssignment_3 )* ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1392:1: ( ( ( rule__Rule__LogicExpressionAssignment_3 )* ) )
            // InternalSmellDsl.g:1393:1: ( ( rule__Rule__LogicExpressionAssignment_3 )* )
            {
            // InternalSmellDsl.g:1393:1: ( ( rule__Rule__LogicExpressionAssignment_3 )* )
            // InternalSmellDsl.g:1394:2: ( rule__Rule__LogicExpressionAssignment_3 )*
            {
             before(grammarAccess.getRuleAccess().getLogicExpressionAssignment_3()); 
            // InternalSmellDsl.g:1395:2: ( rule__Rule__LogicExpressionAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSmellDsl.g:1395:3: rule__Rule__LogicExpressionAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Rule__LogicExpressionAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getLogicExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalSmellDsl.g:1403:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1407:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalSmellDsl.g:1408:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalSmellDsl.g:1415:1: rule__Rule__Group__4__Impl : ( 'then' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1419:1: ( ( 'then' ) )
            // InternalSmellDsl.g:1420:1: ( 'then' )
            {
            // InternalSmellDsl.g:1420:1: ( 'then' )
            // InternalSmellDsl.g:1421:2: 'then'
            {
             before(grammarAccess.getRuleAccess().getThenKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getThenKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalSmellDsl.g:1430:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1434:1: ( rule__Rule__Group__5__Impl )
            // InternalSmellDsl.g:1435:2: rule__Rule__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalSmellDsl.g:1441:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__ResultAssignment_5 )* ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1445:1: ( ( ( rule__Rule__ResultAssignment_5 )* ) )
            // InternalSmellDsl.g:1446:1: ( ( rule__Rule__ResultAssignment_5 )* )
            {
            // InternalSmellDsl.g:1446:1: ( ( rule__Rule__ResultAssignment_5 )* )
            // InternalSmellDsl.g:1447:2: ( rule__Rule__ResultAssignment_5 )*
            {
             before(grammarAccess.getRuleAccess().getResultAssignment_5()); 
            // InternalSmellDsl.g:1448:2: ( rule__Rule__ResultAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmellDsl.g:1448:3: rule__Rule__ResultAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Rule__ResultAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getResultAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__LogicExpression__Group_1__0"
    // InternalSmellDsl.g:1457:1: rule__LogicExpression__Group_1__0 : rule__LogicExpression__Group_1__0__Impl rule__LogicExpression__Group_1__1 ;
    public final void rule__LogicExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1461:1: ( rule__LogicExpression__Group_1__0__Impl rule__LogicExpression__Group_1__1 )
            // InternalSmellDsl.g:1462:2: rule__LogicExpression__Group_1__0__Impl rule__LogicExpression__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__LogicExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpression__Group_1__0"


    // $ANTLR start "rule__LogicExpression__Group_1__0__Impl"
    // InternalSmellDsl.g:1469:1: rule__LogicExpression__Group_1__0__Impl : ( ( rule__LogicExpression__ExpressionAssignment_1_0 ) ) ;
    public final void rule__LogicExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1473:1: ( ( ( rule__LogicExpression__ExpressionAssignment_1_0 ) ) )
            // InternalSmellDsl.g:1474:1: ( ( rule__LogicExpression__ExpressionAssignment_1_0 ) )
            {
            // InternalSmellDsl.g:1474:1: ( ( rule__LogicExpression__ExpressionAssignment_1_0 ) )
            // InternalSmellDsl.g:1475:2: ( rule__LogicExpression__ExpressionAssignment_1_0 )
            {
             before(grammarAccess.getLogicExpressionAccess().getExpressionAssignment_1_0()); 
            // InternalSmellDsl.g:1476:2: ( rule__LogicExpression__ExpressionAssignment_1_0 )
            // InternalSmellDsl.g:1476:3: rule__LogicExpression__ExpressionAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__LogicExpression__ExpressionAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLogicExpressionAccess().getExpressionAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpression__Group_1__0__Impl"


    // $ANTLR start "rule__LogicExpression__Group_1__1"
    // InternalSmellDsl.g:1484:1: rule__LogicExpression__Group_1__1 : rule__LogicExpression__Group_1__1__Impl rule__LogicExpression__Group_1__2 ;
    public final void rule__LogicExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1488:1: ( rule__LogicExpression__Group_1__1__Impl rule__LogicExpression__Group_1__2 )
            // InternalSmellDsl.g:1489:2: rule__LogicExpression__Group_1__1__Impl rule__LogicExpression__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__LogicExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpression__Group_1__1"


    // $ANTLR start "rule__LogicExpression__Group_1__1__Impl"
    // InternalSmellDsl.g:1496:1: rule__LogicExpression__Group_1__1__Impl : ( ( rule__LogicExpression__LogicOperatorAssignment_1_1 ) ) ;
    public final void rule__LogicExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1500:1: ( ( ( rule__LogicExpression__LogicOperatorAssignment_1_1 ) ) )
            // InternalSmellDsl.g:1501:1: ( ( rule__LogicExpression__LogicOperatorAssignment_1_1 ) )
            {
            // InternalSmellDsl.g:1501:1: ( ( rule__LogicExpression__LogicOperatorAssignment_1_1 ) )
            // InternalSmellDsl.g:1502:2: ( rule__LogicExpression__LogicOperatorAssignment_1_1 )
            {
             before(grammarAccess.getLogicExpressionAccess().getLogicOperatorAssignment_1_1()); 
            // InternalSmellDsl.g:1503:2: ( rule__LogicExpression__LogicOperatorAssignment_1_1 )
            // InternalSmellDsl.g:1503:3: rule__LogicExpression__LogicOperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicExpression__LogicOperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicExpressionAccess().getLogicOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpression__Group_1__1__Impl"


    // $ANTLR start "rule__LogicExpression__Group_1__2"
    // InternalSmellDsl.g:1511:1: rule__LogicExpression__Group_1__2 : rule__LogicExpression__Group_1__2__Impl ;
    public final void rule__LogicExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1515:1: ( rule__LogicExpression__Group_1__2__Impl )
            // InternalSmellDsl.g:1516:2: rule__LogicExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpression__Group_1__2"


    // $ANTLR start "rule__LogicExpression__Group_1__2__Impl"
    // InternalSmellDsl.g:1522:1: rule__LogicExpression__Group_1__2__Impl : ( ( rule__LogicExpression__LogicExpressionAssignment_1_2 ) ) ;
    public final void rule__LogicExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1526:1: ( ( ( rule__LogicExpression__LogicExpressionAssignment_1_2 ) ) )
            // InternalSmellDsl.g:1527:1: ( ( rule__LogicExpression__LogicExpressionAssignment_1_2 ) )
            {
            // InternalSmellDsl.g:1527:1: ( ( rule__LogicExpression__LogicExpressionAssignment_1_2 ) )
            // InternalSmellDsl.g:1528:2: ( rule__LogicExpression__LogicExpressionAssignment_1_2 )
            {
             before(grammarAccess.getLogicExpressionAccess().getLogicExpressionAssignment_1_2()); 
            // InternalSmellDsl.g:1529:2: ( rule__LogicExpression__LogicExpressionAssignment_1_2 )
            // InternalSmellDsl.g:1529:3: rule__LogicExpression__LogicExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicExpression__LogicExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicExpressionAccess().getLogicExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpression__Group_1__2__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalSmellDsl.g:1538:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1542:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalSmellDsl.g:1543:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalSmellDsl.g:1550:1: rule__Expression__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1554:1: ( ( RULE_ID ) )
            // InternalSmellDsl.g:1555:1: ( RULE_ID )
            {
            // InternalSmellDsl.g:1555:1: ( RULE_ID )
            // InternalSmellDsl.g:1556:2: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalSmellDsl.g:1565:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1569:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // InternalSmellDsl.g:1570:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalSmellDsl.g:1577:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 ) ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1581:1: ( ( ( rule__Expression__Group_1__0 ) ) )
            // InternalSmellDsl.g:1582:1: ( ( rule__Expression__Group_1__0 ) )
            {
            // InternalSmellDsl.g:1582:1: ( ( rule__Expression__Group_1__0 ) )
            // InternalSmellDsl.g:1583:2: ( rule__Expression__Group_1__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalSmellDsl.g:1584:2: ( rule__Expression__Group_1__0 )
            // InternalSmellDsl.g:1584:3: rule__Expression__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group__2"
    // InternalSmellDsl.g:1592:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl rule__Expression__Group__3 ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1596:1: ( rule__Expression__Group__2__Impl rule__Expression__Group__3 )
            // InternalSmellDsl.g:1597:2: rule__Expression__Group__2__Impl rule__Expression__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Expression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__2"


    // $ANTLR start "rule__Expression__Group__2__Impl"
    // InternalSmellDsl.g:1604:1: rule__Expression__Group__2__Impl : ( ( rule__Expression__RelationalOperatorAssignment_2 ) ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1608:1: ( ( ( rule__Expression__RelationalOperatorAssignment_2 ) ) )
            // InternalSmellDsl.g:1609:1: ( ( rule__Expression__RelationalOperatorAssignment_2 ) )
            {
            // InternalSmellDsl.g:1609:1: ( ( rule__Expression__RelationalOperatorAssignment_2 ) )
            // InternalSmellDsl.g:1610:2: ( rule__Expression__RelationalOperatorAssignment_2 )
            {
             before(grammarAccess.getExpressionAccess().getRelationalOperatorAssignment_2()); 
            // InternalSmellDsl.g:1611:2: ( rule__Expression__RelationalOperatorAssignment_2 )
            // InternalSmellDsl.g:1611:3: rule__Expression__RelationalOperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RelationalOperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRelationalOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__2__Impl"


    // $ANTLR start "rule__Expression__Group__3"
    // InternalSmellDsl.g:1619:1: rule__Expression__Group__3 : rule__Expression__Group__3__Impl rule__Expression__Group__4 ;
    public final void rule__Expression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1623:1: ( rule__Expression__Group__3__Impl rule__Expression__Group__4 )
            // InternalSmellDsl.g:1624:2: rule__Expression__Group__3__Impl rule__Expression__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Expression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__3"


    // $ANTLR start "rule__Expression__Group__3__Impl"
    // InternalSmellDsl.g:1631:1: rule__Expression__Group__3__Impl : ( RULE_ID ) ;
    public final void rule__Expression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1635:1: ( ( RULE_ID ) )
            // InternalSmellDsl.g:1636:1: ( RULE_ID )
            {
            // InternalSmellDsl.g:1636:1: ( RULE_ID )
            // InternalSmellDsl.g:1637:2: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_3()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__3__Impl"


    // $ANTLR start "rule__Expression__Group__4"
    // InternalSmellDsl.g:1646:1: rule__Expression__Group__4 : rule__Expression__Group__4__Impl ;
    public final void rule__Expression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1650:1: ( rule__Expression__Group__4__Impl )
            // InternalSmellDsl.g:1651:2: rule__Expression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__4"


    // $ANTLR start "rule__Expression__Group__4__Impl"
    // InternalSmellDsl.g:1657:1: rule__Expression__Group__4__Impl : ( ( rule__Expression__Group_4__0 ) ) ;
    public final void rule__Expression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1661:1: ( ( ( rule__Expression__Group_4__0 ) ) )
            // InternalSmellDsl.g:1662:1: ( ( rule__Expression__Group_4__0 ) )
            {
            // InternalSmellDsl.g:1662:1: ( ( rule__Expression__Group_4__0 ) )
            // InternalSmellDsl.g:1663:2: ( rule__Expression__Group_4__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup_4()); 
            // InternalSmellDsl.g:1664:2: ( rule__Expression__Group_4__0 )
            // InternalSmellDsl.g:1664:3: rule__Expression__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__4__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalSmellDsl.g:1673:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1677:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalSmellDsl.g:1678:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalSmellDsl.g:1685:1: rule__Expression__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1689:1: ( ( '.' ) )
            // InternalSmellDsl.g:1690:1: ( '.' )
            {
            // InternalSmellDsl.g:1690:1: ( '.' )
            // InternalSmellDsl.g:1691:2: '.'
            {
             before(grammarAccess.getExpressionAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalSmellDsl.g:1700:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1704:1: ( rule__Expression__Group_1__1__Impl )
            // InternalSmellDsl.g:1705:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalSmellDsl.g:1711:1: rule__Expression__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1715:1: ( ( RULE_ID ) )
            // InternalSmellDsl.g:1716:1: ( RULE_ID )
            {
            // InternalSmellDsl.g:1716:1: ( RULE_ID )
            // InternalSmellDsl.g:1717:2: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_4__0"
    // InternalSmellDsl.g:1727:1: rule__Expression__Group_4__0 : rule__Expression__Group_4__0__Impl rule__Expression__Group_4__1 ;
    public final void rule__Expression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1731:1: ( rule__Expression__Group_4__0__Impl rule__Expression__Group_4__1 )
            // InternalSmellDsl.g:1732:2: rule__Expression__Group_4__0__Impl rule__Expression__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Expression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_4__0"


    // $ANTLR start "rule__Expression__Group_4__0__Impl"
    // InternalSmellDsl.g:1739:1: rule__Expression__Group_4__0__Impl : ( '.' ) ;
    public final void rule__Expression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1743:1: ( ( '.' ) )
            // InternalSmellDsl.g:1744:1: ( '.' )
            {
            // InternalSmellDsl.g:1744:1: ( '.' )
            // InternalSmellDsl.g:1745:2: '.'
            {
             before(grammarAccess.getExpressionAccess().getFullStopKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getFullStopKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_4__0__Impl"


    // $ANTLR start "rule__Expression__Group_4__1"
    // InternalSmellDsl.g:1754:1: rule__Expression__Group_4__1 : rule__Expression__Group_4__1__Impl ;
    public final void rule__Expression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1758:1: ( rule__Expression__Group_4__1__Impl )
            // InternalSmellDsl.g:1759:2: rule__Expression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_4__1"


    // $ANTLR start "rule__Expression__Group_4__1__Impl"
    // InternalSmellDsl.g:1765:1: rule__Expression__Group_4__1__Impl : ( RULE_ID ) ;
    public final void rule__Expression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1769:1: ( ( RULE_ID ) )
            // InternalSmellDsl.g:1770:1: ( RULE_ID )
            {
            // InternalSmellDsl.g:1770:1: ( RULE_ID )
            // InternalSmellDsl.g:1771:2: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_4_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getIDTerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_4__1__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // InternalSmellDsl.g:1781:1: rule__Domainmodel__ElementsAssignment : ( ruleType ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1785:1: ( ( ruleType ) )
            // InternalSmellDsl.g:1786:2: ( ruleType )
            {
            // InternalSmellDsl.g:1786:2: ( ruleType )
            // InternalSmellDsl.g:1787:3: ruleType
            {
             before(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__SmellType__NameAssignment_1"
    // InternalSmellDsl.g:1796:1: rule__SmellType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SmellType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1800:1: ( ( RULE_ID ) )
            // InternalSmellDsl.g:1801:2: ( RULE_ID )
            {
            // InternalSmellDsl.g:1801:2: ( RULE_ID )
            // InternalSmellDsl.g:1802:3: RULE_ID
            {
             before(grammarAccess.getSmellTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSmellTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmellType__NameAssignment_1"


    // $ANTLR start "rule__Smell__NameAssignment_1"
    // InternalSmellDsl.g:1811:1: rule__Smell__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Smell__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1815:1: ( ( RULE_ID ) )
            // InternalSmellDsl.g:1816:2: ( RULE_ID )
            {
            // InternalSmellDsl.g:1816:2: ( RULE_ID )
            // InternalSmellDsl.g:1817:3: RULE_ID
            {
             before(grammarAccess.getSmellAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSmellAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__NameAssignment_1"


    // $ANTLR start "rule__Smell__SuperTypeAssignment_2_1"
    // InternalSmellDsl.g:1826:1: rule__Smell__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Smell__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1830:1: ( ( ( RULE_ID ) ) )
            // InternalSmellDsl.g:1831:2: ( ( RULE_ID ) )
            {
            // InternalSmellDsl.g:1831:2: ( ( RULE_ID ) )
            // InternalSmellDsl.g:1832:3: ( RULE_ID )
            {
             before(grammarAccess.getSmellAccess().getSuperTypeSmellTypeCrossReference_2_1_0()); 
            // InternalSmellDsl.g:1833:3: ( RULE_ID )
            // InternalSmellDsl.g:1834:4: RULE_ID
            {
             before(grammarAccess.getSmellAccess().getSuperTypeSmellTypeIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSmellAccess().getSuperTypeSmellTypeIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getSmellAccess().getSuperTypeSmellTypeCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Smell__SmellcontentAssignment_4"
    // InternalSmellDsl.g:1845:1: rule__Smell__SmellcontentAssignment_4 : ( ruleFeature ) ;
    public final void rule__Smell__SmellcontentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1849:1: ( ( ruleFeature ) )
            // InternalSmellDsl.g:1850:2: ( ruleFeature )
            {
            // InternalSmellDsl.g:1850:2: ( ruleFeature )
            // InternalSmellDsl.g:1851:3: ruleFeature
            {
             before(grammarAccess.getSmellAccess().getSmellcontentFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getSmellAccess().getSmellcontentFeatureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__SmellcontentAssignment_4"


    // $ANTLR start "rule__Smell__SymptomAssignment_5"
    // InternalSmellDsl.g:1860:1: rule__Smell__SymptomAssignment_5 : ( ruleSymptom ) ;
    public final void rule__Smell__SymptomAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1864:1: ( ( ruleSymptom ) )
            // InternalSmellDsl.g:1865:2: ( ruleSymptom )
            {
            // InternalSmellDsl.g:1865:2: ( ruleSymptom )
            // InternalSmellDsl.g:1866:3: ruleSymptom
            {
             before(grammarAccess.getSmellAccess().getSymptomSymptomParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSymptom();

            state._fsp--;

             after(grammarAccess.getSmellAccess().getSymptomSymptomParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__SymptomAssignment_5"


    // $ANTLR start "rule__Smell__TreatmentAssignment_6"
    // InternalSmellDsl.g:1875:1: rule__Smell__TreatmentAssignment_6 : ( ruleTreatment ) ;
    public final void rule__Smell__TreatmentAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1879:1: ( ( ruleTreatment ) )
            // InternalSmellDsl.g:1880:2: ( ruleTreatment )
            {
            // InternalSmellDsl.g:1880:2: ( ruleTreatment )
            // InternalSmellDsl.g:1881:3: ruleTreatment
            {
             before(grammarAccess.getSmellAccess().getTreatmentTreatmentParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTreatment();

            state._fsp--;

             after(grammarAccess.getSmellAccess().getTreatmentTreatmentParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Smell__TreatmentAssignment_6"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // InternalSmellDsl.g:1890:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1894:1: ( ( RULE_ID ) )
            // InternalSmellDsl.g:1895:2: ( RULE_ID )
            {
            // InternalSmellDsl.g:1895:2: ( RULE_ID )
            // InternalSmellDsl.g:1896:3: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Feature__OptscalesAssignment_2"
    // InternalSmellDsl.g:1905:1: rule__Feature__OptscalesAssignment_2 : ( ruleOptscale ) ;
    public final void rule__Feature__OptscalesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1909:1: ( ( ruleOptscale ) )
            // InternalSmellDsl.g:1910:2: ( ruleOptscale )
            {
            // InternalSmellDsl.g:1910:2: ( ruleOptscale )
            // InternalSmellDsl.g:1911:3: ruleOptscale
            {
             before(grammarAccess.getFeatureAccess().getOptscalesOptscaleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOptscale();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getOptscalesOptscaleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__OptscalesAssignment_2"


    // $ANTLR start "rule__Feature__MeasuresAssignment_4"
    // InternalSmellDsl.g:1920:1: rule__Feature__MeasuresAssignment_4 : ( ruleMeasure ) ;
    public final void rule__Feature__MeasuresAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1924:1: ( ( ruleMeasure ) )
            // InternalSmellDsl.g:1925:2: ( ruleMeasure )
            {
            // InternalSmellDsl.g:1925:2: ( ruleMeasure )
            // InternalSmellDsl.g:1926:3: ruleMeasure
            {
             before(grammarAccess.getFeatureAccess().getMeasuresMeasureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMeasure();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getMeasuresMeasureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__MeasuresAssignment_4"


    // $ANTLR start "rule__Optscale__ScaletypeAssignment_1"
    // InternalSmellDsl.g:1935:1: rule__Optscale__ScaletypeAssignment_1 : ( ruleScaletype ) ;
    public final void rule__Optscale__ScaletypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1939:1: ( ( ruleScaletype ) )
            // InternalSmellDsl.g:1940:2: ( ruleScaletype )
            {
            // InternalSmellDsl.g:1940:2: ( ruleScaletype )
            // InternalSmellDsl.g:1941:3: ruleScaletype
            {
             before(grammarAccess.getOptscaleAccess().getScaletypeScaletypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleScaletype();

            state._fsp--;

             after(grammarAccess.getOptscaleAccess().getScaletypeScaletypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optscale__ScaletypeAssignment_1"


    // $ANTLR start "rule__Measure__NameAssignment_0"
    // InternalSmellDsl.g:1950:1: rule__Measure__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Measure__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1954:1: ( ( RULE_ID ) )
            // InternalSmellDsl.g:1955:2: ( RULE_ID )
            {
            // InternalSmellDsl.g:1955:2: ( RULE_ID )
            // InternalSmellDsl.g:1956:3: RULE_ID
            {
             before(grammarAccess.getMeasureAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMeasureAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__NameAssignment_0"


    // $ANTLR start "rule__Measure__NameAssignment_1_0"
    // InternalSmellDsl.g:1965:1: rule__Measure__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Measure__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1969:1: ( ( RULE_ID ) )
            // InternalSmellDsl.g:1970:2: ( RULE_ID )
            {
            // InternalSmellDsl.g:1970:2: ( RULE_ID )
            // InternalSmellDsl.g:1971:3: RULE_ID
            {
             before(grammarAccess.getMeasureAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMeasureAccess().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__NameAssignment_1_0"


    // $ANTLR start "rule__Measure__MeasureAssignment_1_2"
    // InternalSmellDsl.g:1980:1: rule__Measure__MeasureAssignment_1_2 : ( ruleMeasure ) ;
    public final void rule__Measure__MeasureAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1984:1: ( ( ruleMeasure ) )
            // InternalSmellDsl.g:1985:2: ( ruleMeasure )
            {
            // InternalSmellDsl.g:1985:2: ( ruleMeasure )
            // InternalSmellDsl.g:1986:3: ruleMeasure
            {
             before(grammarAccess.getMeasureAccess().getMeasureMeasureParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMeasure();

            state._fsp--;

             after(grammarAccess.getMeasureAccess().getMeasureMeasureParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__MeasureAssignment_1_2"


    // $ANTLR start "rule__Symptom__NameAssignment_1"
    // InternalSmellDsl.g:1995:1: rule__Symptom__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Symptom__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:1999:1: ( ( RULE_ID ) )
            // InternalSmellDsl.g:2000:2: ( RULE_ID )
            {
            // InternalSmellDsl.g:2000:2: ( RULE_ID )
            // InternalSmellDsl.g:2001:3: RULE_ID
            {
             before(grammarAccess.getSymptomAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSymptomAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symptom__NameAssignment_1"


    // $ANTLR start "rule__Treatment__NameAssignment_1"
    // InternalSmellDsl.g:2010:1: rule__Treatment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Treatment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:2014:1: ( ( RULE_ID ) )
            // InternalSmellDsl.g:2015:2: ( RULE_ID )
            {
            // InternalSmellDsl.g:2015:2: ( RULE_ID )
            // InternalSmellDsl.g:2016:3: RULE_ID
            {
             before(grammarAccess.getTreatmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTreatmentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Treatment__NameAssignment_1"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalSmellDsl.g:2025:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:2029:1: ( ( RULE_ID ) )
            // InternalSmellDsl.g:2030:2: ( RULE_ID )
            {
            // InternalSmellDsl.g:2030:2: ( RULE_ID )
            // InternalSmellDsl.g:2031:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__LogicExpressionAssignment_3"
    // InternalSmellDsl.g:2040:1: rule__Rule__LogicExpressionAssignment_3 : ( ruleLogicExpression ) ;
    public final void rule__Rule__LogicExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:2044:1: ( ( ruleLogicExpression ) )
            // InternalSmellDsl.g:2045:2: ( ruleLogicExpression )
            {
            // InternalSmellDsl.g:2045:2: ( ruleLogicExpression )
            // InternalSmellDsl.g:2046:3: ruleLogicExpression
            {
             before(grammarAccess.getRuleAccess().getLogicExpressionLogicExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicExpression();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getLogicExpressionLogicExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__LogicExpressionAssignment_3"


    // $ANTLR start "rule__Rule__ResultAssignment_5"
    // InternalSmellDsl.g:2055:1: rule__Rule__ResultAssignment_5 : ( ruleResult ) ;
    public final void rule__Rule__ResultAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:2059:1: ( ( ruleResult ) )
            // InternalSmellDsl.g:2060:2: ( ruleResult )
            {
            // InternalSmellDsl.g:2060:2: ( ruleResult )
            // InternalSmellDsl.g:2061:3: ruleResult
            {
             before(grammarAccess.getRuleAccess().getResultResultParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleResult();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getResultResultParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ResultAssignment_5"


    // $ANTLR start "rule__LogicExpression__ExpressionAssignment_0"
    // InternalSmellDsl.g:2070:1: rule__LogicExpression__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__LogicExpression__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:2074:1: ( ( ruleExpression ) )
            // InternalSmellDsl.g:2075:2: ( ruleExpression )
            {
            // InternalSmellDsl.g:2075:2: ( ruleExpression )
            // InternalSmellDsl.g:2076:3: ruleExpression
            {
             before(grammarAccess.getLogicExpressionAccess().getExpressionExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLogicExpressionAccess().getExpressionExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpression__ExpressionAssignment_0"


    // $ANTLR start "rule__LogicExpression__ExpressionAssignment_1_0"
    // InternalSmellDsl.g:2085:1: rule__LogicExpression__ExpressionAssignment_1_0 : ( ruleExpression ) ;
    public final void rule__LogicExpression__ExpressionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:2089:1: ( ( ruleExpression ) )
            // InternalSmellDsl.g:2090:2: ( ruleExpression )
            {
            // InternalSmellDsl.g:2090:2: ( ruleExpression )
            // InternalSmellDsl.g:2091:3: ruleExpression
            {
             before(grammarAccess.getLogicExpressionAccess().getExpressionExpressionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLogicExpressionAccess().getExpressionExpressionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpression__ExpressionAssignment_1_0"


    // $ANTLR start "rule__LogicExpression__LogicOperatorAssignment_1_1"
    // InternalSmellDsl.g:2100:1: rule__LogicExpression__LogicOperatorAssignment_1_1 : ( ruleLogicOperator ) ;
    public final void rule__LogicExpression__LogicOperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:2104:1: ( ( ruleLogicOperator ) )
            // InternalSmellDsl.g:2105:2: ( ruleLogicOperator )
            {
            // InternalSmellDsl.g:2105:2: ( ruleLogicOperator )
            // InternalSmellDsl.g:2106:3: ruleLogicOperator
            {
             before(grammarAccess.getLogicExpressionAccess().getLogicOperatorLogicOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicOperator();

            state._fsp--;

             after(grammarAccess.getLogicExpressionAccess().getLogicOperatorLogicOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpression__LogicOperatorAssignment_1_1"


    // $ANTLR start "rule__LogicExpression__LogicExpressionAssignment_1_2"
    // InternalSmellDsl.g:2115:1: rule__LogicExpression__LogicExpressionAssignment_1_2 : ( ruleLogicExpression ) ;
    public final void rule__LogicExpression__LogicExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:2119:1: ( ( ruleLogicExpression ) )
            // InternalSmellDsl.g:2120:2: ( ruleLogicExpression )
            {
            // InternalSmellDsl.g:2120:2: ( ruleLogicExpression )
            // InternalSmellDsl.g:2121:3: ruleLogicExpression
            {
             before(grammarAccess.getLogicExpressionAccess().getLogicExpressionLogicExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicExpression();

            state._fsp--;

             after(grammarAccess.getLogicExpressionAccess().getLogicExpressionLogicExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExpression__LogicExpressionAssignment_1_2"


    // $ANTLR start "rule__Expression__RelationalOperatorAssignment_2"
    // InternalSmellDsl.g:2130:1: rule__Expression__RelationalOperatorAssignment_2 : ( ruleRelationalOperator ) ;
    public final void rule__Expression__RelationalOperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:2134:1: ( ( ruleRelationalOperator ) )
            // InternalSmellDsl.g:2135:2: ( ruleRelationalOperator )
            {
            // InternalSmellDsl.g:2135:2: ( ruleRelationalOperator )
            // InternalSmellDsl.g:2136:3: ruleRelationalOperator
            {
             before(grammarAccess.getExpressionAccess().getRelationalOperatorRelationalOperatorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationalOperator();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRelationalOperatorRelationalOperatorEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RelationalOperatorAssignment_2"


    // $ANTLR start "rule__Result__NameAssignment"
    // InternalSmellDsl.g:2145:1: rule__Result__NameAssignment : ( RULE_ID ) ;
    public final void rule__Result__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmellDsl.g:2149:1: ( ( RULE_ID ) )
            // InternalSmellDsl.g:2150:2: ( RULE_ID )
            {
            // InternalSmellDsl.g:2150:2: ( RULE_ID )
            // InternalSmellDsl.g:2151:3: RULE_ID
            {
             before(grammarAccess.getResultAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResultAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__NameAssignment"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\14\uffff\1\15\2\uffff";
    static final String dfa_3s = "\1\4\1\45\1\4\1\21\6\4\1\45\2\4\2\uffff";
    static final String dfa_4s = "\1\4\1\45\1\4\1\26\6\4\1\45\1\4\1\44\2\uffff";
    static final String dfa_5s = "\15\uffff\1\1\1\2";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15\12\uffff\2\16\23\uffff\1\15",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "473:1: rule__LogicExpression__Alternatives : ( ( ( rule__LogicExpression__ExpressionAssignment_0 ) ) | ( ( rule__LogicExpression__Group_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000401800002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000314000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000007E0000L});

}