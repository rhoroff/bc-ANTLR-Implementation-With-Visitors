// Generated from /Users/ryanhoroff/OneDrive/Spring 2019 School Work/COP4020/P2/Calculator.g4 by ANTLR 4.7.1

    import java.util.Hashtable;
    import java.lang.Math;
    import java.util.*;
    import java.io.Console;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, COMMENT=28, ID=29, INT=30, DOUBLE=31, WS=32;
	public static final int
		RULE_input = 0, RULE_comment = 1, RULE_varAssign = 2, RULE_topBool = 3, 
		RULE_bool = 4, RULE_topExpr = 5, RULE_expr = 6;
	public static final String[] ruleNames = {
		"input", "comment", "varAssign", "topBool", "bool", "topExpr", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'=='", "'<'", "'>'", "'>='", "'<='", "'!='", "'&&'", 
		"'||'", "'!'", "'-'", "'('", "')'", "'++'", "'--'", "'^'", "'/'", "'*'", 
		"'%'", "'+'", "'s('", "'c('", "'l('", "'e('", "'sqrt('", "'read()'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "COMMENT", "ID", "INT", "DOUBLE", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	     Hashtable<String, Double> variables = new Hashtable<String,Double>();

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InputContext extends ParserRuleContext {
		public List<VarAssignContext> varAssign() {
			return getRuleContexts(VarAssignContext.class);
		}
		public VarAssignContext varAssign(int i) {
			return getRuleContext(VarAssignContext.class,i);
		}
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<TopBoolContext> topBool() {
			return getRuleContexts(TopBoolContext.class);
		}
		public TopBoolContext topBool(int i) {
			return getRuleContext(TopBoolContext.class,i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(14);
					varAssign();
					}
					} 
				}
				setState(19);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(20);
					topExpr();
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(26);
				comment();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(32);
				topBool();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(38);
					match(T__0);
					setState(39);
					topExpr();
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(45);
					match(T__0);
					setState(46);
					comment();
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					match(T__0);
					setState(53);
					varAssign();
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59);
					match(T__0);
					setState(60);
					topBool();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					match(T__0);
					setState(67);
					topExpr();
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(73);
				match(T__0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(CalculatorParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarAssignContext extends ParserRuleContext {
		public Token varName;
		public ExprContext ex;
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssign; }
	}

	public final VarAssignContext varAssign() throws RecognitionException {
		VarAssignContext _localctx = new VarAssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((VarAssignContext)_localctx).varName = match(ID);
			setState(79);
			match(T__1);
			setState(80);
			((VarAssignContext)_localctx).ex = expr(0);
			variables.put((((VarAssignContext)_localctx).varName!=null?((VarAssignContext)_localctx).varName.getText():null), ((VarAssignContext)_localctx).ex.i);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopBoolContext extends ParserRuleContext {
		public BoolContext bool;
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TopBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topBool; }
	}

	public final TopBoolContext topBool() throws RecognitionException {
		TopBoolContext _localctx = new TopBoolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_topBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			((TopBoolContext)_localctx).bool = bool();
			System.out.println("result: " + ((TopBoolContext)_localctx).bool.j);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public int j;
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public ExprContext ex;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bool);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((BoolContext)_localctx).el = expr(0);
				setState(87);
				((BoolContext)_localctx).op = match(T__2);
				setState(88);
				((BoolContext)_localctx).er = expr(0);
				 
				        if(((BoolContext)_localctx).el.i == ((BoolContext)_localctx).er.i){ 
				            ((BoolContext)_localctx).j =  1; 
				        }
				        else{ 
				             ((BoolContext)_localctx).j =  0; 
				        }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				((BoolContext)_localctx).el = expr(0);
				setState(92);
				((BoolContext)_localctx).op = match(T__3);
				setState(93);
				((BoolContext)_localctx).er = expr(0);

				        if(((BoolContext)_localctx).el.i < ((BoolContext)_localctx).er.i){ 
				            ((BoolContext)_localctx).j =  1; 
				        }
				        else{ 
				             ((BoolContext)_localctx).j =  0; 
				        }
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				((BoolContext)_localctx).el = expr(0);
				setState(97);
				((BoolContext)_localctx).op = match(T__4);
				setState(98);
				((BoolContext)_localctx).er = expr(0);

				        if(((BoolContext)_localctx).el.i > ((BoolContext)_localctx).er.i){ 
				            ((BoolContext)_localctx).j =  1; 
				        }
				        else{ 
				             ((BoolContext)_localctx).j =  0; 
				        }
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				((BoolContext)_localctx).el = expr(0);
				setState(102);
				((BoolContext)_localctx).op = match(T__5);
				setState(103);
				((BoolContext)_localctx).er = expr(0);

				        if(((BoolContext)_localctx).el.i >= ((BoolContext)_localctx).er.i){ 
				            ((BoolContext)_localctx).j =  1; 
				        }
				        else{ 
				             ((BoolContext)_localctx).j =  0; 
				        }
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				((BoolContext)_localctx).el = expr(0);
				setState(107);
				((BoolContext)_localctx).op = match(T__6);
				setState(108);
				((BoolContext)_localctx).er = expr(0);

				        if(((BoolContext)_localctx).el.i <= ((BoolContext)_localctx).er.i){ 
				            ((BoolContext)_localctx).j =  1; 
				        }
				        else{ 
				             ((BoolContext)_localctx).j =  0; 
				        }
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				((BoolContext)_localctx).el = expr(0);
				setState(112);
				((BoolContext)_localctx).op = match(T__7);
				setState(113);
				((BoolContext)_localctx).er = expr(0);

				        if(((BoolContext)_localctx).el.i != ((BoolContext)_localctx).er.i){ 
				            ((BoolContext)_localctx).j =  1; 
				        }
				        else{ 
				             ((BoolContext)_localctx).j =  0; 
				        }
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				((BoolContext)_localctx).el = expr(0);
				setState(117);
				((BoolContext)_localctx).op = match(T__8);
				setState(118);
				((BoolContext)_localctx).er = expr(0);

				        if(((BoolContext)_localctx).el.i != 0 && ((BoolContext)_localctx).er.i != 0){
				           ((BoolContext)_localctx).j =  1; 
				        }
				        else{ 
				             ((BoolContext)_localctx).j =  0; 
				        }
				    
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				((BoolContext)_localctx).el = expr(0);
				setState(122);
				((BoolContext)_localctx).op = match(T__9);
				setState(123);
				((BoolContext)_localctx).er = expr(0);

				        if(((BoolContext)_localctx).el.i != 0 || ((BoolContext)_localctx).er.i != 0){
				           ((BoolContext)_localctx).j =  1; 
				        }
				        else{ 
				             ((BoolContext)_localctx).j =  0; 
				        }
				    
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(126);
				match(T__10);
				setState(127);
				((BoolContext)_localctx).ex = expr(0);

				        if(((BoolContext)_localctx).ex.i == 0 ){
				           ((BoolContext)_localctx).j =  1; 
				        }
				        else{ 
				             ((BoolContext)_localctx).j =  0; 
				        }
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TopExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topExpr; }
	}

	public final TopExprContext topExpr() throws RecognitionException {
		TopExprContext _localctx = new TopExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_topExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public double i;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.i = ctx.i;
		}
	}
	public static class LnContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LnContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AddSubContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CosContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CosContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SqrtContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SqrtContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DoubleContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(CalculatorParser.DOUBLE, 0); }
		public DoubleContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DivTimesModContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivTimesModContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(CalculatorParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ReadContext extends ExprContext {
		public ReadContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class VarAssContext extends ExprContext {
		public Token var;
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public VarAssContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PostCrementContext extends ExprContext {
		public ExprContext variable;
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PostCrementContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SinContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SinContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PowContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NegateContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExpContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PreCrementContext extends ExprContext {
		public Token op;
		public ExprContext variable;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PreCrementContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(135);
				match(T__11);
				setState(136);
				((NegateContext)_localctx).ex = expr(16);
				}
				break;
			case T__12:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(T__12);
				setState(138);
				((ParenContext)_localctx).ex = expr(0);
				setState(139);
				match(T__13);
				 ((ParenContext)_localctx).i =  ((ParenContext)_localctx).ex.i; 
				}
				break;
			case T__14:
			case T__15:
				{
				_localctx = new PreCrementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				((PreCrementContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
					((PreCrementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(143);
				((PreCrementContext)_localctx).variable = expr(13);
				 
				        if((((PreCrementContext)_localctx).op!=null?((PreCrementContext)_localctx).op.getText():null).equals("++")){
				            if(variables.get((((PreCrementContext)_localctx).variable!=null?_input.getText(((PreCrementContext)_localctx).variable.start,((PreCrementContext)_localctx).variable.stop):null)) == null){
				                ((PreCrementContext)_localctx).i = 1;
				                variables.put((((PreCrementContext)_localctx).variable!=null?_input.getText(((PreCrementContext)_localctx).variable.start,((PreCrementContext)_localctx).variable.stop):null), 1.0);
				            }else{ 
				                ((PreCrementContext)_localctx).i =  variables.get((((PreCrementContext)_localctx).variable!=null?_input.getText(((PreCrementContext)_localctx).variable.start,((PreCrementContext)_localctx).variable.stop):null)) + 1;
				                variables.put((((PreCrementContext)_localctx).variable!=null?_input.getText(((PreCrementContext)_localctx).variable.start,((PreCrementContext)_localctx).variable.stop):null), variables.get((((PreCrementContext)_localctx).variable!=null?_input.getText(((PreCrementContext)_localctx).variable.start,((PreCrementContext)_localctx).variable.stop):null)) + 1);
				            }
				        } 
				        if((((PreCrementContext)_localctx).op!=null?((PreCrementContext)_localctx).op.getText():null).equals("--")){
				            if(variables.get((((PreCrementContext)_localctx).variable!=null?_input.getText(((PreCrementContext)_localctx).variable.start,((PreCrementContext)_localctx).variable.stop):null)) == null){
				                ((PreCrementContext)_localctx).i = -1;
				                variables.put((((PreCrementContext)_localctx).variable!=null?_input.getText(((PreCrementContext)_localctx).variable.start,((PreCrementContext)_localctx).variable.stop):null), -1.0);
				            }else{ 
				                ((PreCrementContext)_localctx).i =  variables.get((((PreCrementContext)_localctx).variable!=null?_input.getText(((PreCrementContext)_localctx).variable.start,((PreCrementContext)_localctx).variable.stop):null)) -1;
				                variables.put((((PreCrementContext)_localctx).variable!=null?_input.getText(((PreCrementContext)_localctx).variable.start,((PreCrementContext)_localctx).variable.stop):null), variables.get((((PreCrementContext)_localctx).variable!=null?_input.getText(((PreCrementContext)_localctx).variable.start,((PreCrementContext)_localctx).variable.stop):null)) - 1);
				            }
				        } 
				    
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(INT);
				}
				break;
			case DOUBLE:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(DOUBLE);
				}
				break;
			case ID:
				{
				_localctx = new VarAssContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				((VarAssContext)_localctx).var = match(ID);
				 
				        if(variables.get((((VarAssContext)_localctx).var!=null?((VarAssContext)_localctx).var.getText():null)) == null){
				            ((VarAssContext)_localctx).i = 0;
				        }else{ 
				            ((VarAssContext)_localctx).i =  variables.get((((VarAssContext)_localctx).var!=null?((VarAssContext)_localctx).var.getText():null));
				        }
				    
				}
				break;
			case T__21:
				{
				_localctx = new SinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(T__21);
				setState(151);
				((SinContext)_localctx).ex = expr(0);
				setState(152);
				match(T__13);
				 ((SinContext)_localctx).i =  Math.sin(((SinContext)_localctx).ex.i);
				}
				break;
			case T__22:
				{
				_localctx = new CosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(T__22);
				setState(156);
				((CosContext)_localctx).ex = expr(0);
				setState(157);
				match(T__13);
				 ((CosContext)_localctx).i =  Math.cos(((CosContext)_localctx).ex.i);
				}
				break;
			case T__23:
				{
				_localctx = new LnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(T__23);
				setState(161);
				((LnContext)_localctx).ex = expr(0);
				setState(162);
				match(T__13);
				 ((LnContext)_localctx).i =  Math.log(((LnContext)_localctx).ex.i);
				}
				break;
			case T__24:
				{
				_localctx = new ExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(T__24);
				setState(166);
				((ExpContext)_localctx).ex = expr(0);
				setState(167);
				match(T__13);
				 ((ExpContext)_localctx).i =  Math.exp(((ExpContext)_localctx).ex.i);
				}
				break;
			case T__25:
				{
				_localctx = new SqrtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(T__25);
				setState(171);
				((SqrtContext)_localctx).ex = expr(0);
				setState(172);
				match(T__13);
				((SqrtContext)_localctx).i =  Math.sqrt(((SqrtContext)_localctx).ex.i);
				}
				break;
			case T__26:
				{
				_localctx = new ReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(T__26);
				 
				        Scanner s = new Scanner(System.in);
				        String input = s.next();
				        ((ReadContext)_localctx).i =  Double.parseDouble(input);
				        s.close();
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExprContext(_parentctx, _parentState));
						((PowContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(180);
						((PowContext)_localctx).op = match(T__16);
						setState(181);
						((PowContext)_localctx).er = expr(13);
						 
						                  ((PowContext)_localctx).i =  Math.pow(((PowContext)_localctx).el.i, ((PowContext)_localctx).er.i);
						              
						}
						break;
					case 2:
						{
						_localctx = new DivTimesModContext(new ExprContext(_parentctx, _parentState));
						((DivTimesModContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(185);
						((DivTimesModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
							((DivTimesModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(186);
						((DivTimesModContext)_localctx).er = expr(12);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(188);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__20) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						((AddSubContext)_localctx).er = expr(11);
						}
						break;
					case 4:
						{
						_localctx = new PostCrementContext(new ExprContext(_parentctx, _parentState));
						((PostCrementContext)_localctx).variable = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(191);
						((PostCrementContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
							((PostCrementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						 
						                  if((((PostCrementContext)_localctx).op!=null?((PostCrementContext)_localctx).op.getText():null).equals("++")){
						                      if(variables.get((((PostCrementContext)_localctx).variable!=null?_input.getText(((PostCrementContext)_localctx).variable.start,((PostCrementContext)_localctx).variable.stop):null)) == null){
						                          ((PostCrementContext)_localctx).i = 0;
						                          variables.put((((PostCrementContext)_localctx).variable!=null?_input.getText(((PostCrementContext)_localctx).variable.start,((PostCrementContext)_localctx).variable.stop):null), 1.0);
						                      }else{ 
						                          ((PostCrementContext)_localctx).i =  variables.get((((PostCrementContext)_localctx).variable!=null?_input.getText(((PostCrementContext)_localctx).variable.start,((PostCrementContext)_localctx).variable.stop):null));
						                          variables.put((((PostCrementContext)_localctx).variable!=null?_input.getText(((PostCrementContext)_localctx).variable.start,((PostCrementContext)_localctx).variable.stop):null), variables.get((((PostCrementContext)_localctx).variable!=null?_input.getText(((PostCrementContext)_localctx).variable.start,((PostCrementContext)_localctx).variable.stop):null)) + 1);
						                      }
						                  } 
						                  if((((PostCrementContext)_localctx).op!=null?((PostCrementContext)_localctx).op.getText():null).equals("--")){
						                      if(variables.get((((PostCrementContext)_localctx).variable!=null?_input.getText(((PostCrementContext)_localctx).variable.start,((PostCrementContext)_localctx).variable.stop):null)) == null){
						                          ((PostCrementContext)_localctx).i = 0;
						                          variables.put((((PostCrementContext)_localctx).variable!=null?_input.getText(((PostCrementContext)_localctx).variable.start,((PostCrementContext)_localctx).variable.stop):null), -1.0);
						                      }else{ 
						                          ((PostCrementContext)_localctx).i =  variables.get((((PostCrementContext)_localctx).variable!=null?_input.getText(((PostCrementContext)_localctx).variable.start,((PostCrementContext)_localctx).variable.stop):null));
						                          variables.put((((PostCrementContext)_localctx).variable!=null?_input.getText(((PostCrementContext)_localctx).variable.start,((PostCrementContext)_localctx).variable.stop):null), variables.get((((PostCrementContext)_localctx).variable!=null?_input.getText(((PostCrementContext)_localctx).variable.start,((PostCrementContext)_localctx).variable.stop):null)) - 1);
						                      }
						                  } 
						              
						}
						break;
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2"+
		"\25\13\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\7\2\36\n\2\f\2\16\2!\13\2"+
		"\3\2\7\2$\n\2\f\2\16\2\'\13\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2"+
		"\7\2\62\n\2\f\2\16\2\65\13\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\7"+
		"\2@\n\2\f\2\16\2C\13\2\3\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\5\2M\n\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u0085\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b4\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c4\n"+
		"\b\f\b\16\b\u00c7\13\b\3\b\2\3\16\t\2\4\6\b\n\f\16\2\5\3\2\21\22\3\2\24"+
		"\26\4\2\16\16\27\27\2\u00e2\2\23\3\2\2\2\4N\3\2\2\2\6P\3\2\2\2\bU\3\2"+
		"\2\2\n\u0084\3\2\2\2\f\u0086\3\2\2\2\16\u00b3\3\2\2\2\20\22\5\6\4\2\21"+
		"\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\31\3\2\2\2\25"+
		"\23\3\2\2\2\26\30\5\f\7\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31"+
		"\32\3\2\2\2\32\37\3\2\2\2\33\31\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36"+
		"!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 %\3\2\2\2!\37\3\2\2\2\"$\5\b\5\2#"+
		"\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&,\3\2\2\2\'%\3\2\2\2()\7\3\2"+
		"\2)+\5\f\7\2*(\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\63\3\2\2\2.,\3\2"+
		"\2\2/\60\7\3\2\2\60\62\5\4\3\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2"+
		"\63\64\3\2\2\2\64:\3\2\2\2\65\63\3\2\2\2\66\67\7\3\2\2\679\5\6\4\28\66"+
		"\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;A\3\2\2\2<:\3\2\2\2=>\7\3\2\2>"+
		"@\5\b\5\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BH\3\2\2\2CA\3\2\2\2"+
		"DE\7\3\2\2EG\5\f\7\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IL\3\2\2\2"+
		"JH\3\2\2\2KM\7\3\2\2LK\3\2\2\2LM\3\2\2\2M\3\3\2\2\2NO\7\36\2\2O\5\3\2"+
		"\2\2PQ\7\37\2\2QR\7\4\2\2RS\5\16\b\2ST\b\4\1\2T\7\3\2\2\2UV\5\n\6\2VW"+
		"\b\5\1\2W\t\3\2\2\2XY\5\16\b\2YZ\7\5\2\2Z[\5\16\b\2[\\\b\6\1\2\\\u0085"+
		"\3\2\2\2]^\5\16\b\2^_\7\6\2\2_`\5\16\b\2`a\b\6\1\2a\u0085\3\2\2\2bc\5"+
		"\16\b\2cd\7\7\2\2de\5\16\b\2ef\b\6\1\2f\u0085\3\2\2\2gh\5\16\b\2hi\7\b"+
		"\2\2ij\5\16\b\2jk\b\6\1\2k\u0085\3\2\2\2lm\5\16\b\2mn\7\t\2\2no\5\16\b"+
		"\2op\b\6\1\2p\u0085\3\2\2\2qr\5\16\b\2rs\7\n\2\2st\5\16\b\2tu\b\6\1\2"+
		"u\u0085\3\2\2\2vw\5\16\b\2wx\7\13\2\2xy\5\16\b\2yz\b\6\1\2z\u0085\3\2"+
		"\2\2{|\5\16\b\2|}\7\f\2\2}~\5\16\b\2~\177\b\6\1\2\177\u0085\3\2\2\2\u0080"+
		"\u0081\7\r\2\2\u0081\u0082\5\16\b\2\u0082\u0083\b\6\1\2\u0083\u0085\3"+
		"\2\2\2\u0084X\3\2\2\2\u0084]\3\2\2\2\u0084b\3\2\2\2\u0084g\3\2\2\2\u0084"+
		"l\3\2\2\2\u0084q\3\2\2\2\u0084v\3\2\2\2\u0084{\3\2\2\2\u0084\u0080\3\2"+
		"\2\2\u0085\13\3\2\2\2\u0086\u0087\5\16\b\2\u0087\r\3\2\2\2\u0088\u0089"+
		"\b\b\1\2\u0089\u008a\7\16\2\2\u008a\u00b4\5\16\b\22\u008b\u008c\7\17\2"+
		"\2\u008c\u008d\5\16\b\2\u008d\u008e\7\20\2\2\u008e\u008f\b\b\1\2\u008f"+
		"\u00b4\3\2\2\2\u0090\u0091\t\2\2\2\u0091\u0092\5\16\b\17\u0092\u0093\b"+
		"\b\1\2\u0093\u00b4\3\2\2\2\u0094\u00b4\7 \2\2\u0095\u00b4\7!\2\2\u0096"+
		"\u0097\7\37\2\2\u0097\u00b4\b\b\1\2\u0098\u0099\7\30\2\2\u0099\u009a\5"+
		"\16\b\2\u009a\u009b\7\20\2\2\u009b\u009c\b\b\1\2\u009c\u00b4\3\2\2\2\u009d"+
		"\u009e\7\31\2\2\u009e\u009f\5\16\b\2\u009f\u00a0\7\20\2\2\u00a0\u00a1"+
		"\b\b\1\2\u00a1\u00b4\3\2\2\2\u00a2\u00a3\7\32\2\2\u00a3\u00a4\5\16\b\2"+
		"\u00a4\u00a5\7\20\2\2\u00a5\u00a6\b\b\1\2\u00a6\u00b4\3\2\2\2\u00a7\u00a8"+
		"\7\33\2\2\u00a8\u00a9\5\16\b\2\u00a9\u00aa\7\20\2\2\u00aa\u00ab\b\b\1"+
		"\2\u00ab\u00b4\3\2\2\2\u00ac\u00ad\7\34\2\2\u00ad\u00ae\5\16\b\2\u00ae"+
		"\u00af\7\20\2\2\u00af\u00b0\b\b\1\2\u00b0\u00b4\3\2\2\2\u00b1\u00b2\7"+
		"\35\2\2\u00b2\u00b4\b\b\1\2\u00b3\u0088\3\2\2\2\u00b3\u008b\3\2\2\2\u00b3"+
		"\u0090\3\2\2\2\u00b3\u0094\3\2\2\2\u00b3\u0095\3\2\2\2\u00b3\u0096\3\2"+
		"\2\2\u00b3\u0098\3\2\2\2\u00b3\u009d\3\2\2\2\u00b3\u00a2\3\2\2\2\u00b3"+
		"\u00a7\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00c5\3\2"+
		"\2\2\u00b5\u00b6\f\16\2\2\u00b6\u00b7\7\23\2\2\u00b7\u00b8\5\16\b\17\u00b8"+
		"\u00b9\b\b\1\2\u00b9\u00c4\3\2\2\2\u00ba\u00bb\f\r\2\2\u00bb\u00bc\t\3"+
		"\2\2\u00bc\u00c4\5\16\b\16\u00bd\u00be\f\f\2\2\u00be\u00bf\t\4\2\2\u00bf"+
		"\u00c4\5\16\b\r\u00c0\u00c1\f\20\2\2\u00c1\u00c2\t\2\2\2\u00c2\u00c4\b"+
		"\b\1\2\u00c3\u00b5\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3"+
		"\u00c0\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\17\3\2\2\2\u00c7\u00c5\3\2\2\2\20\23\31\37%,\63:AHL\u0084\u00b3"+
		"\u00c3\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}