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
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(20);
				topExpr();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(26);
					match(T__0);
					setState(27);
					topExpr();
					}
					} 
				}
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(33);
					match(T__0);
					setState(34);
					varAssign();
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(40);
					match(T__0);
					setState(41);
					topExpr();
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(47);
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
			setState(50);
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
			setState(52);
			((VarAssignContext)_localctx).varName = match(ID);
			setState(53);
			match(T__1);
			setState(54);
			((VarAssignContext)_localctx).ex = expr(0);
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
			setState(56);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				((BoolContext)_localctx).el = expr(0);
				setState(60);
				((BoolContext)_localctx).op = match(T__2);
				setState(61);
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
				setState(64);
				((BoolContext)_localctx).el = expr(0);
				setState(65);
				((BoolContext)_localctx).op = match(T__3);
				setState(66);
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
				setState(69);
				((BoolContext)_localctx).el = expr(0);
				setState(70);
				((BoolContext)_localctx).op = match(T__4);
				setState(71);
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
				setState(74);
				((BoolContext)_localctx).el = expr(0);
				setState(75);
				((BoolContext)_localctx).op = match(T__5);
				setState(76);
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
				setState(79);
				((BoolContext)_localctx).el = expr(0);
				setState(80);
				((BoolContext)_localctx).op = match(T__6);
				setState(81);
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
				setState(84);
				((BoolContext)_localctx).el = expr(0);
				setState(85);
				((BoolContext)_localctx).op = match(T__7);
				setState(86);
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
				setState(89);
				((BoolContext)_localctx).el = expr(0);
				setState(90);
				((BoolContext)_localctx).op = match(T__8);
				setState(91);
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
				setState(94);
				((BoolContext)_localctx).el = expr(0);
				setState(95);
				((BoolContext)_localctx).op = match(T__9);
				setState(96);
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
				setState(99);
				match(T__10);
				setState(100);
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
			setState(105);
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
	public static class VarReadContext extends ExprContext {
		public Token var;
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public VarReadContext(ExprContext ctx) { copyFrom(ctx); }
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
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(108);
				match(T__11);
				setState(109);
				((NegateContext)_localctx).ex = expr(16);
				}
				break;
			case T__12:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(T__12);
				setState(111);
				((ParenContext)_localctx).ex = expr(0);
				setState(112);
				match(T__13);
				}
				break;
			case T__14:
			case T__15:
				{
				_localctx = new PreCrementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
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
				setState(115);
				((PreCrementContext)_localctx).variable = expr(13);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(INT);
				}
				break;
			case DOUBLE:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(DOUBLE);
				}
				break;
			case ID:
				{
				_localctx = new VarReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				((VarReadContext)_localctx).var = match(ID);
				}
				break;
			case T__21:
				{
				_localctx = new SinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(T__21);
				setState(120);
				((SinContext)_localctx).ex = expr(0);
				setState(121);
				match(T__13);
				}
				break;
			case T__22:
				{
				_localctx = new CosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(T__22);
				setState(124);
				((CosContext)_localctx).ex = expr(0);
				setState(125);
				match(T__13);
				}
				break;
			case T__23:
				{
				_localctx = new LnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(T__23);
				setState(128);
				((LnContext)_localctx).ex = expr(0);
				setState(129);
				match(T__13);
				}
				break;
			case T__24:
				{
				_localctx = new ExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(T__24);
				setState(132);
				((ExpContext)_localctx).ex = expr(0);
				setState(133);
				match(T__13);
				}
				break;
			case T__25:
				{
				_localctx = new SqrtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(T__25);
				setState(136);
				((SqrtContext)_localctx).ex = expr(0);
				setState(137);
				match(T__13);
				}
				break;
			case T__26:
				{
				_localctx = new ReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(T__26);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExprContext(_parentctx, _parentState));
						((PowContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(143);
						((PowContext)_localctx).op = match(T__16);
						setState(144);
						((PowContext)_localctx).er = expr(13);
						}
						break;
					case 2:
						{
						_localctx = new DivTimesModContext(new ExprContext(_parentctx, _parentState));
						((DivTimesModContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(145);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(146);
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
						setState(147);
						((DivTimesModContext)_localctx).er = expr(12);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(148);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(149);
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
						setState(150);
						((AddSubContext)_localctx).er = expr(11);
						}
						break;
					case 4:
						{
						_localctx = new PostCrementContext(new ExprContext(_parentctx, _parentState));
						((PostCrementContext)_localctx).variable = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(152);
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
						}
						break;
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2"+
		"\25\13\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\7\2\37\n\2\f\2\16\2\""+
		"\13\2\3\2\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13"+
		"\2\3\2\5\2\63\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6j\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008f\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u009c\n\b\f\b\16\b\u009f\13\b\3\b\2\3\16\t\2\4"+
		"\6\b\n\f\16\2\5\3\2\21\22\3\2\24\26\4\2\16\16\27\27\2\u00b6\2\23\3\2\2"+
		"\2\4\64\3\2\2\2\6\66\3\2\2\2\b:\3\2\2\2\ni\3\2\2\2\fk\3\2\2\2\16\u008e"+
		"\3\2\2\2\20\22\5\6\4\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24"+
		"\3\2\2\2\24\31\3\2\2\2\25\23\3\2\2\2\26\30\5\f\7\2\27\26\3\2\2\2\30\33"+
		"\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32 \3\2\2\2\33\31\3\2\2\2\34\35\7"+
		"\3\2\2\35\37\5\f\7\2\36\34\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2"+
		"!\'\3\2\2\2\" \3\2\2\2#$\7\3\2\2$&\5\6\4\2%#\3\2\2\2&)\3\2\2\2\'%\3\2"+
		"\2\2\'(\3\2\2\2(.\3\2\2\2)\'\3\2\2\2*+\7\3\2\2+-\5\f\7\2,*\3\2\2\2-\60"+
		"\3\2\2\2.,\3\2\2\2./\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\61\63\7\3\2\2\62"+
		"\61\3\2\2\2\62\63\3\2\2\2\63\3\3\2\2\2\64\65\7\36\2\2\65\5\3\2\2\2\66"+
		"\67\7\37\2\2\678\7\4\2\289\5\16\b\29\7\3\2\2\2:;\5\n\6\2;<\b\5\1\2<\t"+
		"\3\2\2\2=>\5\16\b\2>?\7\5\2\2?@\5\16\b\2@A\b\6\1\2Aj\3\2\2\2BC\5\16\b"+
		"\2CD\7\6\2\2DE\5\16\b\2EF\b\6\1\2Fj\3\2\2\2GH\5\16\b\2HI\7\7\2\2IJ\5\16"+
		"\b\2JK\b\6\1\2Kj\3\2\2\2LM\5\16\b\2MN\7\b\2\2NO\5\16\b\2OP\b\6\1\2Pj\3"+
		"\2\2\2QR\5\16\b\2RS\7\t\2\2ST\5\16\b\2TU\b\6\1\2Uj\3\2\2\2VW\5\16\b\2"+
		"WX\7\n\2\2XY\5\16\b\2YZ\b\6\1\2Zj\3\2\2\2[\\\5\16\b\2\\]\7\13\2\2]^\5"+
		"\16\b\2^_\b\6\1\2_j\3\2\2\2`a\5\16\b\2ab\7\f\2\2bc\5\16\b\2cd\b\6\1\2"+
		"dj\3\2\2\2ef\7\r\2\2fg\5\16\b\2gh\b\6\1\2hj\3\2\2\2i=\3\2\2\2iB\3\2\2"+
		"\2iG\3\2\2\2iL\3\2\2\2iQ\3\2\2\2iV\3\2\2\2i[\3\2\2\2i`\3\2\2\2ie\3\2\2"+
		"\2j\13\3\2\2\2kl\5\16\b\2l\r\3\2\2\2mn\b\b\1\2no\7\16\2\2o\u008f\5\16"+
		"\b\22pq\7\17\2\2qr\5\16\b\2rs\7\20\2\2s\u008f\3\2\2\2tu\t\2\2\2u\u008f"+
		"\5\16\b\17v\u008f\7 \2\2w\u008f\7!\2\2x\u008f\7\37\2\2yz\7\30\2\2z{\5"+
		"\16\b\2{|\7\20\2\2|\u008f\3\2\2\2}~\7\31\2\2~\177\5\16\b\2\177\u0080\7"+
		"\20\2\2\u0080\u008f\3\2\2\2\u0081\u0082\7\32\2\2\u0082\u0083\5\16\b\2"+
		"\u0083\u0084\7\20\2\2\u0084\u008f\3\2\2\2\u0085\u0086\7\33\2\2\u0086\u0087"+
		"\5\16\b\2\u0087\u0088\7\20\2\2\u0088\u008f\3\2\2\2\u0089\u008a\7\34\2"+
		"\2\u008a\u008b\5\16\b\2\u008b\u008c\7\20\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008f\7\35\2\2\u008em\3\2\2\2\u008ep\3\2\2\2\u008et\3\2\2\2\u008ev\3"+
		"\2\2\2\u008ew\3\2\2\2\u008ex\3\2\2\2\u008ey\3\2\2\2\u008e}\3\2\2\2\u008e"+
		"\u0081\3\2\2\2\u008e\u0085\3\2\2\2\u008e\u0089\3\2\2\2\u008e\u008d\3\2"+
		"\2\2\u008f\u009d\3\2\2\2\u0090\u0091\f\16\2\2\u0091\u0092\7\23\2\2\u0092"+
		"\u009c\5\16\b\17\u0093\u0094\f\r\2\2\u0094\u0095\t\3\2\2\u0095\u009c\5"+
		"\16\b\16\u0096\u0097\f\f\2\2\u0097\u0098\t\4\2\2\u0098\u009c\5\16\b\r"+
		"\u0099\u009a\f\20\2\2\u009a\u009c\t\2\2\2\u009b\u0090\3\2\2\2\u009b\u0093"+
		"\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\17\3\2\2\2\u009f\u009d\3\2\2"+
		"\2\f\23\31 \'.\62i\u008e\u009b\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}