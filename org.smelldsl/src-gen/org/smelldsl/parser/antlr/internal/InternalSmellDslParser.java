package org.smelldsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.smelldsl.services.SmellDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmellDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'smelltype'", "'smell'", "'extends'", "'{'", "'}'", "'feature'", "'with threshold'", "'is'", "','", "'symptom'", "'treatment'", "'rule'", "'when'", "'then'", "'.'", "'Nominal'", "'Ordinal'", "'Interval'", "'Ratio'", "'AND'", "'OR'", "'>='", "'<='", "'!='", "'<'", "'>'", "'=='"
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

        public InternalSmellDslParser(TokenStream input, SmellDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected SmellDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalSmellDsl.g:65:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalSmellDsl.g:65:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalSmellDsl.g:66:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalSmellDsl.g:72:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalSmellDsl.g:78:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalSmellDsl.g:79:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalSmellDsl.g:79:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSmellDsl.g:80:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalSmellDsl.g:80:3: (lv_elements_0_0= ruleType )
            	    // InternalSmellDsl.g:81:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.smelldsl.SmellDsl.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleType"
    // InternalSmellDsl.g:101:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSmellDsl.g:101:45: (iv_ruleType= ruleType EOF )
            // InternalSmellDsl.g:102:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSmellDsl.g:108:1: ruleType returns [EObject current=null] : (this_SmellType_0= ruleSmellType | this_Smell_1= ruleSmell | this_Rule_2= ruleRule ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SmellType_0 = null;

        EObject this_Smell_1 = null;

        EObject this_Rule_2 = null;



        	enterRule();

        try {
            // InternalSmellDsl.g:114:2: ( (this_SmellType_0= ruleSmellType | this_Smell_1= ruleSmell | this_Rule_2= ruleRule ) )
            // InternalSmellDsl.g:115:2: (this_SmellType_0= ruleSmellType | this_Smell_1= ruleSmell | this_Rule_2= ruleRule )
            {
            // InternalSmellDsl.g:115:2: (this_SmellType_0= ruleSmellType | this_Smell_1= ruleSmell | this_Rule_2= ruleRule )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 22:
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
                    // InternalSmellDsl.g:116:3: this_SmellType_0= ruleSmellType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSmellTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SmellType_0=ruleSmellType();

                    state._fsp--;


                    			current = this_SmellType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmellDsl.g:125:3: this_Smell_1= ruleSmell
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSmellParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Smell_1=ruleSmell();

                    state._fsp--;


                    			current = this_Smell_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmellDsl.g:134:3: this_Rule_2= ruleRule
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getRuleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rule_2=ruleRule();

                    state._fsp--;


                    			current = this_Rule_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSmellType"
    // InternalSmellDsl.g:146:1: entryRuleSmellType returns [EObject current=null] : iv_ruleSmellType= ruleSmellType EOF ;
    public final EObject entryRuleSmellType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmellType = null;


        try {
            // InternalSmellDsl.g:146:50: (iv_ruleSmellType= ruleSmellType EOF )
            // InternalSmellDsl.g:147:2: iv_ruleSmellType= ruleSmellType EOF
            {
             newCompositeNode(grammarAccess.getSmellTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmellType=ruleSmellType();

            state._fsp--;

             current =iv_ruleSmellType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmellType"


    // $ANTLR start "ruleSmellType"
    // InternalSmellDsl.g:153:1: ruleSmellType returns [EObject current=null] : (otherlv_0= 'smelltype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSmellType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSmellDsl.g:159:2: ( (otherlv_0= 'smelltype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSmellDsl.g:160:2: (otherlv_0= 'smelltype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSmellDsl.g:160:2: (otherlv_0= 'smelltype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSmellDsl.g:161:3: otherlv_0= 'smelltype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSmellTypeAccess().getSmelltypeKeyword_0());
            		
            // InternalSmellDsl.g:165:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmellDsl.g:166:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmellDsl.g:166:4: (lv_name_1_0= RULE_ID )
            // InternalSmellDsl.g:167:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSmellTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSmellTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmellType"


    // $ANTLR start "entryRuleSmell"
    // InternalSmellDsl.g:187:1: entryRuleSmell returns [EObject current=null] : iv_ruleSmell= ruleSmell EOF ;
    public final EObject entryRuleSmell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmell = null;


        try {
            // InternalSmellDsl.g:187:46: (iv_ruleSmell= ruleSmell EOF )
            // InternalSmellDsl.g:188:2: iv_ruleSmell= ruleSmell EOF
            {
             newCompositeNode(grammarAccess.getSmellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmell=ruleSmell();

            state._fsp--;

             current =iv_ruleSmell; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmell"


    // $ANTLR start "ruleSmell"
    // InternalSmellDsl.g:194:1: ruleSmell returns [EObject current=null] : (otherlv_0= 'smell' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_smellcontent_5_0= ruleFeature ) )* ( (lv_symptom_6_0= ruleSymptom ) )? ( (lv_treatment_7_0= ruleTreatment ) )? otherlv_8= '}' ) ;
    public final EObject ruleSmell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_smellcontent_5_0 = null;

        EObject lv_symptom_6_0 = null;

        EObject lv_treatment_7_0 = null;



        	enterRule();

        try {
            // InternalSmellDsl.g:200:2: ( (otherlv_0= 'smell' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_smellcontent_5_0= ruleFeature ) )* ( (lv_symptom_6_0= ruleSymptom ) )? ( (lv_treatment_7_0= ruleTreatment ) )? otherlv_8= '}' ) )
            // InternalSmellDsl.g:201:2: (otherlv_0= 'smell' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_smellcontent_5_0= ruleFeature ) )* ( (lv_symptom_6_0= ruleSymptom ) )? ( (lv_treatment_7_0= ruleTreatment ) )? otherlv_8= '}' )
            {
            // InternalSmellDsl.g:201:2: (otherlv_0= 'smell' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_smellcontent_5_0= ruleFeature ) )* ( (lv_symptom_6_0= ruleSymptom ) )? ( (lv_treatment_7_0= ruleTreatment ) )? otherlv_8= '}' )
            // InternalSmellDsl.g:202:3: otherlv_0= 'smell' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_smellcontent_5_0= ruleFeature ) )* ( (lv_symptom_6_0= ruleSymptom ) )? ( (lv_treatment_7_0= ruleTreatment ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSmellAccess().getSmellKeyword_0());
            		
            // InternalSmellDsl.g:206:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmellDsl.g:207:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmellDsl.g:207:4: (lv_name_1_0= RULE_ID )
            // InternalSmellDsl.g:208:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSmellAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSmellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSmellDsl.g:224:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSmellDsl.g:225:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getSmellAccess().getExtendsKeyword_2_0());
                    			
                    // InternalSmellDsl.g:229:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSmellDsl.g:230:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSmellDsl.g:230:5: (otherlv_3= RULE_ID )
                    // InternalSmellDsl.g:231:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSmellRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getSmellAccess().getSuperTypeSmellTypeCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getSmellAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmellDsl.g:247:3: ( (lv_smellcontent_5_0= ruleFeature ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSmellDsl.g:248:4: (lv_smellcontent_5_0= ruleFeature )
            	    {
            	    // InternalSmellDsl.g:248:4: (lv_smellcontent_5_0= ruleFeature )
            	    // InternalSmellDsl.g:249:5: lv_smellcontent_5_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getSmellAccess().getSmellcontentFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_smellcontent_5_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSmellRule());
            	    					}
            	    					add(
            	    						current,
            	    						"smellcontent",
            	    						lv_smellcontent_5_0,
            	    						"org.smelldsl.SmellDsl.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSmellDsl.g:266:3: ( (lv_symptom_6_0= ruleSymptom ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSmellDsl.g:267:4: (lv_symptom_6_0= ruleSymptom )
                    {
                    // InternalSmellDsl.g:267:4: (lv_symptom_6_0= ruleSymptom )
                    // InternalSmellDsl.g:268:5: lv_symptom_6_0= ruleSymptom
                    {

                    					newCompositeNode(grammarAccess.getSmellAccess().getSymptomSymptomParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_symptom_6_0=ruleSymptom();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSmellRule());
                    					}
                    					set(
                    						current,
                    						"symptom",
                    						lv_symptom_6_0 != null,
                    						"org.smelldsl.SmellDsl.Symptom");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmellDsl.g:285:3: ( (lv_treatment_7_0= ruleTreatment ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmellDsl.g:286:4: (lv_treatment_7_0= ruleTreatment )
                    {
                    // InternalSmellDsl.g:286:4: (lv_treatment_7_0= ruleTreatment )
                    // InternalSmellDsl.g:287:5: lv_treatment_7_0= ruleTreatment
                    {

                    					newCompositeNode(grammarAccess.getSmellAccess().getTreatmentTreatmentParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_treatment_7_0=ruleTreatment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSmellRule());
                    					}
                    					set(
                    						current,
                    						"treatment",
                    						lv_treatment_7_0 != null,
                    						"org.smelldsl.SmellDsl.Treatment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSmellAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmell"


    // $ANTLR start "entryRuleFeature"
    // InternalSmellDsl.g:312:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalSmellDsl.g:312:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalSmellDsl.g:313:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalSmellDsl.g:319:1: ruleFeature returns [EObject current=null] : (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optscales_2_0= ruleOptscale ) )? otherlv_3= 'with threshold' ( (lv_measures_4_0= ruleMeasure ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_optscales_2_0 = null;

        EObject lv_measures_4_0 = null;



        	enterRule();

        try {
            // InternalSmellDsl.g:325:2: ( (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optscales_2_0= ruleOptscale ) )? otherlv_3= 'with threshold' ( (lv_measures_4_0= ruleMeasure ) )* ) )
            // InternalSmellDsl.g:326:2: (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optscales_2_0= ruleOptscale ) )? otherlv_3= 'with threshold' ( (lv_measures_4_0= ruleMeasure ) )* )
            {
            // InternalSmellDsl.g:326:2: (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optscales_2_0= ruleOptscale ) )? otherlv_3= 'with threshold' ( (lv_measures_4_0= ruleMeasure ) )* )
            // InternalSmellDsl.g:327:3: otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ( (lv_optscales_2_0= ruleOptscale ) )? otherlv_3= 'with threshold' ( (lv_measures_4_0= ruleMeasure ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getFeatureKeyword_0());
            		
            // InternalSmellDsl.g:331:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmellDsl.g:332:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmellDsl.g:332:4: (lv_name_1_0= RULE_ID )
            // InternalSmellDsl.g:333:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSmellDsl.g:349:3: ( (lv_optscales_2_0= ruleOptscale ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmellDsl.g:350:4: (lv_optscales_2_0= ruleOptscale )
                    {
                    // InternalSmellDsl.g:350:4: (lv_optscales_2_0= ruleOptscale )
                    // InternalSmellDsl.g:351:5: lv_optscales_2_0= ruleOptscale
                    {

                    					newCompositeNode(grammarAccess.getFeatureAccess().getOptscalesOptscaleParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_optscales_2_0=ruleOptscale();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFeatureRule());
                    					}
                    					set(
                    						current,
                    						"optscales",
                    						lv_optscales_2_0 != null,
                    						"org.smelldsl.SmellDsl.Optscale");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getWithThresholdKeyword_3());
            		
            // InternalSmellDsl.g:372:3: ( (lv_measures_4_0= ruleMeasure ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSmellDsl.g:373:4: (lv_measures_4_0= ruleMeasure )
            	    {
            	    // InternalSmellDsl.g:373:4: (lv_measures_4_0= ruleMeasure )
            	    // InternalSmellDsl.g:374:5: lv_measures_4_0= ruleMeasure
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getMeasuresMeasureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_measures_4_0=ruleMeasure();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"measures",
            	    						lv_measures_4_0,
            	    						"org.smelldsl.SmellDsl.Measure");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleOptscale"
    // InternalSmellDsl.g:395:1: entryRuleOptscale returns [EObject current=null] : iv_ruleOptscale= ruleOptscale EOF ;
    public final EObject entryRuleOptscale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptscale = null;


        try {
            // InternalSmellDsl.g:395:49: (iv_ruleOptscale= ruleOptscale EOF )
            // InternalSmellDsl.g:396:2: iv_ruleOptscale= ruleOptscale EOF
            {
             newCompositeNode(grammarAccess.getOptscaleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptscale=ruleOptscale();

            state._fsp--;

             current =iv_ruleOptscale; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptscale"


    // $ANTLR start "ruleOptscale"
    // InternalSmellDsl.g:402:1: ruleOptscale returns [EObject current=null] : (otherlv_0= 'is' ( (lv_scaletype_1_0= ruleScaletype ) ) ) ;
    public final EObject ruleOptscale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_scaletype_1_0 = null;



        	enterRule();

        try {
            // InternalSmellDsl.g:408:2: ( (otherlv_0= 'is' ( (lv_scaletype_1_0= ruleScaletype ) ) ) )
            // InternalSmellDsl.g:409:2: (otherlv_0= 'is' ( (lv_scaletype_1_0= ruleScaletype ) ) )
            {
            // InternalSmellDsl.g:409:2: (otherlv_0= 'is' ( (lv_scaletype_1_0= ruleScaletype ) ) )
            // InternalSmellDsl.g:410:3: otherlv_0= 'is' ( (lv_scaletype_1_0= ruleScaletype ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getOptscaleAccess().getIsKeyword_0());
            		
            // InternalSmellDsl.g:414:3: ( (lv_scaletype_1_0= ruleScaletype ) )
            // InternalSmellDsl.g:415:4: (lv_scaletype_1_0= ruleScaletype )
            {
            // InternalSmellDsl.g:415:4: (lv_scaletype_1_0= ruleScaletype )
            // InternalSmellDsl.g:416:5: lv_scaletype_1_0= ruleScaletype
            {

            					newCompositeNode(grammarAccess.getOptscaleAccess().getScaletypeScaletypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_scaletype_1_0=ruleScaletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptscaleRule());
            					}
            					set(
            						current,
            						"scaletype",
            						lv_scaletype_1_0,
            						"org.smelldsl.SmellDsl.Scaletype");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptscale"


    // $ANTLR start "entryRuleMeasure"
    // InternalSmellDsl.g:437:1: entryRuleMeasure returns [EObject current=null] : iv_ruleMeasure= ruleMeasure EOF ;
    public final EObject entryRuleMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasure = null;


        try {
            // InternalSmellDsl.g:437:48: (iv_ruleMeasure= ruleMeasure EOF )
            // InternalSmellDsl.g:438:2: iv_ruleMeasure= ruleMeasure EOF
            {
             newCompositeNode(grammarAccess.getMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasure=ruleMeasure();

            state._fsp--;

             current =iv_ruleMeasure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasure"


    // $ANTLR start "ruleMeasure"
    // InternalSmellDsl.g:444:1: ruleMeasure returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_measure_3_0= ruleMeasure ) ) ) ) ;
    public final EObject ruleMeasure() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_measure_3_0 = null;



        	enterRule();

        try {
            // InternalSmellDsl.g:450:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_measure_3_0= ruleMeasure ) ) ) ) )
            // InternalSmellDsl.g:451:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_measure_3_0= ruleMeasure ) ) ) )
            {
            // InternalSmellDsl.g:451:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_measure_3_0= ruleMeasure ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==19) ) {
                    alt9=2;
                }
                else if ( (LA9_1==EOF||LA9_1==RULE_ID||(LA9_1>=15 && LA9_1<=16)||(LA9_1>=20 && LA9_1<=21)) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmellDsl.g:452:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalSmellDsl.g:452:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalSmellDsl.g:453:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalSmellDsl.g:453:4: (lv_name_0_0= RULE_ID )
                    // InternalSmellDsl.g:454:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getMeasureAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSmellDsl.g:471:3: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_measure_3_0= ruleMeasure ) ) )
                    {
                    // InternalSmellDsl.g:471:3: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_measure_3_0= ruleMeasure ) ) )
                    // InternalSmellDsl.g:472:4: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_measure_3_0= ruleMeasure ) )
                    {
                    // InternalSmellDsl.g:472:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalSmellDsl.g:473:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalSmellDsl.g:473:5: (lv_name_1_0= RULE_ID )
                    // InternalSmellDsl.g:474:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getMeasureAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeasureAccess().getCommaKeyword_1_1());
                    			
                    // InternalSmellDsl.g:494:4: ( (lv_measure_3_0= ruleMeasure ) )
                    // InternalSmellDsl.g:495:5: (lv_measure_3_0= ruleMeasure )
                    {
                    // InternalSmellDsl.g:495:5: (lv_measure_3_0= ruleMeasure )
                    // InternalSmellDsl.g:496:6: lv_measure_3_0= ruleMeasure
                    {

                    						newCompositeNode(grammarAccess.getMeasureAccess().getMeasureMeasureParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_measure_3_0=ruleMeasure();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureRule());
                    						}
                    						set(
                    							current,
                    							"measure",
                    							lv_measure_3_0,
                    							"org.smelldsl.SmellDsl.Measure");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeasure"


    // $ANTLR start "entryRuleSymptom"
    // InternalSmellDsl.g:518:1: entryRuleSymptom returns [EObject current=null] : iv_ruleSymptom= ruleSymptom EOF ;
    public final EObject entryRuleSymptom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymptom = null;


        try {
            // InternalSmellDsl.g:518:48: (iv_ruleSymptom= ruleSymptom EOF )
            // InternalSmellDsl.g:519:2: iv_ruleSymptom= ruleSymptom EOF
            {
             newCompositeNode(grammarAccess.getSymptomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSymptom=ruleSymptom();

            state._fsp--;

             current =iv_ruleSymptom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymptom"


    // $ANTLR start "ruleSymptom"
    // InternalSmellDsl.g:525:1: ruleSymptom returns [EObject current=null] : (otherlv_0= 'symptom' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSymptom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSmellDsl.g:531:2: ( (otherlv_0= 'symptom' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSmellDsl.g:532:2: (otherlv_0= 'symptom' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSmellDsl.g:532:2: (otherlv_0= 'symptom' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSmellDsl.g:533:3: otherlv_0= 'symptom' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSymptomAccess().getSymptomKeyword_0());
            		
            // InternalSmellDsl.g:537:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmellDsl.g:538:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmellDsl.g:538:4: (lv_name_1_0= RULE_ID )
            // InternalSmellDsl.g:539:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSymptomAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSymptomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymptom"


    // $ANTLR start "entryRuleTreatment"
    // InternalSmellDsl.g:559:1: entryRuleTreatment returns [EObject current=null] : iv_ruleTreatment= ruleTreatment EOF ;
    public final EObject entryRuleTreatment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTreatment = null;


        try {
            // InternalSmellDsl.g:559:50: (iv_ruleTreatment= ruleTreatment EOF )
            // InternalSmellDsl.g:560:2: iv_ruleTreatment= ruleTreatment EOF
            {
             newCompositeNode(grammarAccess.getTreatmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTreatment=ruleTreatment();

            state._fsp--;

             current =iv_ruleTreatment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTreatment"


    // $ANTLR start "ruleTreatment"
    // InternalSmellDsl.g:566:1: ruleTreatment returns [EObject current=null] : (otherlv_0= 'treatment' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTreatment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSmellDsl.g:572:2: ( (otherlv_0= 'treatment' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSmellDsl.g:573:2: (otherlv_0= 'treatment' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSmellDsl.g:573:2: (otherlv_0= 'treatment' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSmellDsl.g:574:3: otherlv_0= 'treatment' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTreatmentAccess().getTreatmentKeyword_0());
            		
            // InternalSmellDsl.g:578:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmellDsl.g:579:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmellDsl.g:579:4: (lv_name_1_0= RULE_ID )
            // InternalSmellDsl.g:580:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTreatmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTreatmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTreatment"


    // $ANTLR start "entryRuleRule"
    // InternalSmellDsl.g:600:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalSmellDsl.g:600:45: (iv_ruleRule= ruleRule EOF )
            // InternalSmellDsl.g:601:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalSmellDsl.g:607:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'when' ( (lv_logicExpression_3_0= ruleLogicExpression ) )* otherlv_4= 'then' ( (lv_result_5_0= ruleResult ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_logicExpression_3_0 = null;

        EObject lv_result_5_0 = null;



        	enterRule();

        try {
            // InternalSmellDsl.g:613:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'when' ( (lv_logicExpression_3_0= ruleLogicExpression ) )* otherlv_4= 'then' ( (lv_result_5_0= ruleResult ) )* ) )
            // InternalSmellDsl.g:614:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'when' ( (lv_logicExpression_3_0= ruleLogicExpression ) )* otherlv_4= 'then' ( (lv_result_5_0= ruleResult ) )* )
            {
            // InternalSmellDsl.g:614:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'when' ( (lv_logicExpression_3_0= ruleLogicExpression ) )* otherlv_4= 'then' ( (lv_result_5_0= ruleResult ) )* )
            // InternalSmellDsl.g:615:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'when' ( (lv_logicExpression_3_0= ruleLogicExpression ) )* otherlv_4= 'then' ( (lv_result_5_0= ruleResult ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalSmellDsl.g:619:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmellDsl.g:620:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmellDsl.g:620:4: (lv_name_1_0= RULE_ID )
            // InternalSmellDsl.g:621:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getWhenKeyword_2());
            		
            // InternalSmellDsl.g:641:3: ( (lv_logicExpression_3_0= ruleLogicExpression ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSmellDsl.g:642:4: (lv_logicExpression_3_0= ruleLogicExpression )
            	    {
            	    // InternalSmellDsl.g:642:4: (lv_logicExpression_3_0= ruleLogicExpression )
            	    // InternalSmellDsl.g:643:5: lv_logicExpression_3_0= ruleLogicExpression
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getLogicExpressionLogicExpressionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_logicExpression_3_0=ruleLogicExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"logicExpression",
            	    						lv_logicExpression_3_0,
            	    						"org.smelldsl.SmellDsl.LogicExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getThenKeyword_4());
            		
            // InternalSmellDsl.g:664:3: ( (lv_result_5_0= ruleResult ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSmellDsl.g:665:4: (lv_result_5_0= ruleResult )
            	    {
            	    // InternalSmellDsl.g:665:4: (lv_result_5_0= ruleResult )
            	    // InternalSmellDsl.g:666:5: lv_result_5_0= ruleResult
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getResultResultParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_result_5_0=ruleResult();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"result",
            	    						lv_result_5_0,
            	    						"org.smelldsl.SmellDsl.Result");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleLogicExpression"
    // InternalSmellDsl.g:687:1: entryRuleLogicExpression returns [EObject current=null] : iv_ruleLogicExpression= ruleLogicExpression EOF ;
    public final EObject entryRuleLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicExpression = null;


        try {
            // InternalSmellDsl.g:687:56: (iv_ruleLogicExpression= ruleLogicExpression EOF )
            // InternalSmellDsl.g:688:2: iv_ruleLogicExpression= ruleLogicExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicExpression=ruleLogicExpression();

            state._fsp--;

             current =iv_ruleLogicExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicExpression"


    // $ANTLR start "ruleLogicExpression"
    // InternalSmellDsl.g:694:1: ruleLogicExpression returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) | ( ( (lv_expression_1_0= ruleExpression ) ) ( (lv_logicOperator_2_0= ruleLogicOperator ) ) ( (lv_logicExpression_3_0= ruleLogicExpression ) ) ) ) ;
    public final EObject ruleLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        EObject lv_expression_1_0 = null;

        Enumerator lv_logicOperator_2_0 = null;

        EObject lv_logicExpression_3_0 = null;



        	enterRule();

        try {
            // InternalSmellDsl.g:700:2: ( ( ( (lv_expression_0_0= ruleExpression ) ) | ( ( (lv_expression_1_0= ruleExpression ) ) ( (lv_logicOperator_2_0= ruleLogicOperator ) ) ( (lv_logicExpression_3_0= ruleLogicExpression ) ) ) ) )
            // InternalSmellDsl.g:701:2: ( ( (lv_expression_0_0= ruleExpression ) ) | ( ( (lv_expression_1_0= ruleExpression ) ) ( (lv_logicOperator_2_0= ruleLogicOperator ) ) ( (lv_logicExpression_3_0= ruleLogicExpression ) ) ) )
            {
            // InternalSmellDsl.g:701:2: ( ( (lv_expression_0_0= ruleExpression ) ) | ( ( (lv_expression_1_0= ruleExpression ) ) ( (lv_logicOperator_2_0= ruleLogicOperator ) ) ( (lv_logicExpression_3_0= ruleLogicExpression ) ) ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalSmellDsl.g:702:3: ( (lv_expression_0_0= ruleExpression ) )
                    {
                    // InternalSmellDsl.g:702:3: ( (lv_expression_0_0= ruleExpression ) )
                    // InternalSmellDsl.g:703:4: (lv_expression_0_0= ruleExpression )
                    {
                    // InternalSmellDsl.g:703:4: (lv_expression_0_0= ruleExpression )
                    // InternalSmellDsl.g:704:5: lv_expression_0_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getLogicExpressionAccess().getExpressionExpressionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expression_0_0=ruleExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLogicExpressionRule());
                    					}
                    					set(
                    						current,
                    						"expression",
                    						lv_expression_0_0,
                    						"org.smelldsl.SmellDsl.Expression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSmellDsl.g:722:3: ( ( (lv_expression_1_0= ruleExpression ) ) ( (lv_logicOperator_2_0= ruleLogicOperator ) ) ( (lv_logicExpression_3_0= ruleLogicExpression ) ) )
                    {
                    // InternalSmellDsl.g:722:3: ( ( (lv_expression_1_0= ruleExpression ) ) ( (lv_logicOperator_2_0= ruleLogicOperator ) ) ( (lv_logicExpression_3_0= ruleLogicExpression ) ) )
                    // InternalSmellDsl.g:723:4: ( (lv_expression_1_0= ruleExpression ) ) ( (lv_logicOperator_2_0= ruleLogicOperator ) ) ( (lv_logicExpression_3_0= ruleLogicExpression ) )
                    {
                    // InternalSmellDsl.g:723:4: ( (lv_expression_1_0= ruleExpression ) )
                    // InternalSmellDsl.g:724:5: (lv_expression_1_0= ruleExpression )
                    {
                    // InternalSmellDsl.g:724:5: (lv_expression_1_0= ruleExpression )
                    // InternalSmellDsl.g:725:6: lv_expression_1_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getLogicExpressionAccess().getExpressionExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_expression_1_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_1_0,
                    							"org.smelldsl.SmellDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmellDsl.g:742:4: ( (lv_logicOperator_2_0= ruleLogicOperator ) )
                    // InternalSmellDsl.g:743:5: (lv_logicOperator_2_0= ruleLogicOperator )
                    {
                    // InternalSmellDsl.g:743:5: (lv_logicOperator_2_0= ruleLogicOperator )
                    // InternalSmellDsl.g:744:6: lv_logicOperator_2_0= ruleLogicOperator
                    {

                    						newCompositeNode(grammarAccess.getLogicExpressionAccess().getLogicOperatorLogicOperatorEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_logicOperator_2_0=ruleLogicOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicExpressionRule());
                    						}
                    						set(
                    							current,
                    							"logicOperator",
                    							lv_logicOperator_2_0,
                    							"org.smelldsl.SmellDsl.LogicOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmellDsl.g:761:4: ( (lv_logicExpression_3_0= ruleLogicExpression ) )
                    // InternalSmellDsl.g:762:5: (lv_logicExpression_3_0= ruleLogicExpression )
                    {
                    // InternalSmellDsl.g:762:5: (lv_logicExpression_3_0= ruleLogicExpression )
                    // InternalSmellDsl.g:763:6: lv_logicExpression_3_0= ruleLogicExpression
                    {

                    						newCompositeNode(grammarAccess.getLogicExpressionAccess().getLogicExpressionLogicExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_logicExpression_3_0=ruleLogicExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicExpressionRule());
                    						}
                    						set(
                    							current,
                    							"logicExpression",
                    							lv_logicExpression_3_0,
                    							"org.smelldsl.SmellDsl.LogicExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicExpression"


    // $ANTLR start "entryRuleExpression"
    // InternalSmellDsl.g:785:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSmellDsl.g:785:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSmellDsl.g:786:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSmellDsl.g:792:1: ruleExpression returns [EObject current=null] : (this_ID_0= RULE_ID (otherlv_1= '.' this_ID_2= RULE_ID ) ( (lv_relationalOperator_3_0= ruleRelationalOperator ) ) this_ID_4= RULE_ID (otherlv_5= '.' this_ID_6= RULE_ID ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token otherlv_1=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        Token otherlv_5=null;
        Token this_ID_6=null;
        Enumerator lv_relationalOperator_3_0 = null;



        	enterRule();

        try {
            // InternalSmellDsl.g:798:2: ( (this_ID_0= RULE_ID (otherlv_1= '.' this_ID_2= RULE_ID ) ( (lv_relationalOperator_3_0= ruleRelationalOperator ) ) this_ID_4= RULE_ID (otherlv_5= '.' this_ID_6= RULE_ID ) ) )
            // InternalSmellDsl.g:799:2: (this_ID_0= RULE_ID (otherlv_1= '.' this_ID_2= RULE_ID ) ( (lv_relationalOperator_3_0= ruleRelationalOperator ) ) this_ID_4= RULE_ID (otherlv_5= '.' this_ID_6= RULE_ID ) )
            {
            // InternalSmellDsl.g:799:2: (this_ID_0= RULE_ID (otherlv_1= '.' this_ID_2= RULE_ID ) ( (lv_relationalOperator_3_0= ruleRelationalOperator ) ) this_ID_4= RULE_ID (otherlv_5= '.' this_ID_6= RULE_ID ) )
            // InternalSmellDsl.g:800:3: this_ID_0= RULE_ID (otherlv_1= '.' this_ID_2= RULE_ID ) ( (lv_relationalOperator_3_0= ruleRelationalOperator ) ) this_ID_4= RULE_ID (otherlv_5= '.' this_ID_6= RULE_ID )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            			newLeafNode(this_ID_0, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_0());
            		
            // InternalSmellDsl.g:804:3: (otherlv_1= '.' this_ID_2= RULE_ID )
            // InternalSmellDsl.g:805:4: otherlv_1= '.' this_ID_2= RULE_ID
            {
            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getFullStopKeyword_1_0());
            			
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            				newLeafNode(this_ID_2, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_1_1());
            			

            }

            // InternalSmellDsl.g:814:3: ( (lv_relationalOperator_3_0= ruleRelationalOperator ) )
            // InternalSmellDsl.g:815:4: (lv_relationalOperator_3_0= ruleRelationalOperator )
            {
            // InternalSmellDsl.g:815:4: (lv_relationalOperator_3_0= ruleRelationalOperator )
            // InternalSmellDsl.g:816:5: lv_relationalOperator_3_0= ruleRelationalOperator
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getRelationalOperatorRelationalOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_relationalOperator_3_0=ruleRelationalOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					add(
            						current,
            						"relationalOperator",
            						lv_relationalOperator_3_0,
            						"org.smelldsl.SmellDsl.RelationalOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_18); 

            			newLeafNode(this_ID_4, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_3());
            		
            // InternalSmellDsl.g:837:3: (otherlv_5= '.' this_ID_6= RULE_ID )
            // InternalSmellDsl.g:838:4: otherlv_5= '.' this_ID_6= RULE_ID
            {
            otherlv_5=(Token)match(input,25,FOLLOW_4); 

            				newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getFullStopKeyword_4_0());
            			
            this_ID_6=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(this_ID_6, grammarAccess.getExpressionAccess().getIDTerminalRuleCall_4_1());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleResult"
    // InternalSmellDsl.g:851:1: entryRuleResult returns [EObject current=null] : iv_ruleResult= ruleResult EOF ;
    public final EObject entryRuleResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResult = null;


        try {
            // InternalSmellDsl.g:851:47: (iv_ruleResult= ruleResult EOF )
            // InternalSmellDsl.g:852:2: iv_ruleResult= ruleResult EOF
            {
             newCompositeNode(grammarAccess.getResultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResult=ruleResult();

            state._fsp--;

             current =iv_ruleResult; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalSmellDsl.g:858:1: ruleResult returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleResult() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSmellDsl.g:864:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSmellDsl.g:865:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSmellDsl.g:865:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSmellDsl.g:866:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSmellDsl.g:866:3: (lv_name_0_0= RULE_ID )
            // InternalSmellDsl.g:867:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getResultAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getResultRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResult"


    // $ANTLR start "ruleScaletype"
    // InternalSmellDsl.g:886:1: ruleScaletype returns [Enumerator current=null] : ( (enumLiteral_0= 'Nominal' ) | (enumLiteral_1= 'Ordinal' ) | (enumLiteral_2= 'Interval' ) | (enumLiteral_3= 'Ratio' ) ) ;
    public final Enumerator ruleScaletype() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSmellDsl.g:892:2: ( ( (enumLiteral_0= 'Nominal' ) | (enumLiteral_1= 'Ordinal' ) | (enumLiteral_2= 'Interval' ) | (enumLiteral_3= 'Ratio' ) ) )
            // InternalSmellDsl.g:893:2: ( (enumLiteral_0= 'Nominal' ) | (enumLiteral_1= 'Ordinal' ) | (enumLiteral_2= 'Interval' ) | (enumLiteral_3= 'Ratio' ) )
            {
            // InternalSmellDsl.g:893:2: ( (enumLiteral_0= 'Nominal' ) | (enumLiteral_1= 'Ordinal' ) | (enumLiteral_2= 'Interval' ) | (enumLiteral_3= 'Ratio' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 28:
                {
                alt13=3;
                }
                break;
            case 29:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSmellDsl.g:894:3: (enumLiteral_0= 'Nominal' )
                    {
                    // InternalSmellDsl.g:894:3: (enumLiteral_0= 'Nominal' )
                    // InternalSmellDsl.g:895:4: enumLiteral_0= 'Nominal'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getScaletypeAccess().getNominalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getScaletypeAccess().getNominalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmellDsl.g:902:3: (enumLiteral_1= 'Ordinal' )
                    {
                    // InternalSmellDsl.g:902:3: (enumLiteral_1= 'Ordinal' )
                    // InternalSmellDsl.g:903:4: enumLiteral_1= 'Ordinal'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getScaletypeAccess().getOrdinalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getScaletypeAccess().getOrdinalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmellDsl.g:910:3: (enumLiteral_2= 'Interval' )
                    {
                    // InternalSmellDsl.g:910:3: (enumLiteral_2= 'Interval' )
                    // InternalSmellDsl.g:911:4: enumLiteral_2= 'Interval'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getScaletypeAccess().getIntervalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getScaletypeAccess().getIntervalEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmellDsl.g:918:3: (enumLiteral_3= 'Ratio' )
                    {
                    // InternalSmellDsl.g:918:3: (enumLiteral_3= 'Ratio' )
                    // InternalSmellDsl.g:919:4: enumLiteral_3= 'Ratio'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getScaletypeAccess().getRatioEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getScaletypeAccess().getRatioEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScaletype"


    // $ANTLR start "ruleLogicOperator"
    // InternalSmellDsl.g:929:1: ruleLogicOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleLogicOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmellDsl.g:935:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // InternalSmellDsl.g:936:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // InternalSmellDsl.g:936:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            else if ( (LA14_0==31) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmellDsl.g:937:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalSmellDsl.g:937:3: (enumLiteral_0= 'AND' )
                    // InternalSmellDsl.g:938:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmellDsl.g:945:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalSmellDsl.g:945:3: (enumLiteral_1= 'OR' )
                    // InternalSmellDsl.g:946:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicOperator"


    // $ANTLR start "ruleRelationalOperator"
    // InternalSmellDsl.g:956:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>=' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '==' ) ) ;
    public final Enumerator ruleRelationalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalSmellDsl.g:962:2: ( ( (enumLiteral_0= '>=' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '==' ) ) )
            // InternalSmellDsl.g:963:2: ( (enumLiteral_0= '>=' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '==' ) )
            {
            // InternalSmellDsl.g:963:2: ( (enumLiteral_0= '>=' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '==' ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt15=1;
                }
                break;
            case 33:
                {
                alt15=2;
                }
                break;
            case 34:
                {
                alt15=3;
                }
                break;
            case 35:
                {
                alt15=4;
                }
                break;
            case 36:
                {
                alt15=5;
                }
                break;
            case 37:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSmellDsl.g:964:3: (enumLiteral_0= '>=' )
                    {
                    // InternalSmellDsl.g:964:3: (enumLiteral_0= '>=' )
                    // InternalSmellDsl.g:965:4: enumLiteral_0= '>='
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getGreaterThanOrEqualToEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getGreaterThanOrEqualToEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmellDsl.g:972:3: (enumLiteral_1= '<=' )
                    {
                    // InternalSmellDsl.g:972:3: (enumLiteral_1= '<=' )
                    // InternalSmellDsl.g:973:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getLessThanOrEqualToEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getLessThanOrEqualToEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmellDsl.g:980:3: (enumLiteral_2= '!=' )
                    {
                    // InternalSmellDsl.g:980:3: (enumLiteral_2= '!=' )
                    // InternalSmellDsl.g:981:4: enumLiteral_2= '!='
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getNotEqualToEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getNotEqualToEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmellDsl.g:988:3: (enumLiteral_3= '<' )
                    {
                    // InternalSmellDsl.g:988:3: (enumLiteral_3= '<' )
                    // InternalSmellDsl.g:989:4: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getLessThanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getLessThanEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmellDsl.g:996:3: (enumLiteral_4= '>' )
                    {
                    // InternalSmellDsl.g:996:3: (enumLiteral_4= '>' )
                    // InternalSmellDsl.g:997:4: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getGreaterThanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getGreaterThanEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSmellDsl.g:1004:3: (enumLiteral_5= '==' )
                    {
                    // InternalSmellDsl.g:1004:3: (enumLiteral_5= '==' )
                    // InternalSmellDsl.g:1005:4: enumLiteral_5= '=='
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getRelationalOperatorAccess().getEqualToEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRelationalOperatorAccess().getEqualToEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalOperator"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\14\uffff\1\16\2\uffff";
    static final String dfa_3s = "\1\4\1\31\1\4\1\40\6\4\1\31\2\4\2\uffff";
    static final String dfa_4s = "\1\4\1\31\1\4\1\45\6\4\1\31\1\4\1\37\2\uffff";
    static final String dfa_5s = "\15\uffff\1\2\1\1";
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
            "\1\16\23\uffff\1\16\5\uffff\2\15",
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

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "701:2: ( ( (lv_expression_0_0= ruleExpression ) ) | ( ( (lv_expression_1_0= ruleExpression ) ) ( (lv_logicOperator_2_0= ruleLogicOperator ) ) ( (lv_logicExpression_3_0= ruleLogicExpression ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000401802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000318000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003F00000000L});

}