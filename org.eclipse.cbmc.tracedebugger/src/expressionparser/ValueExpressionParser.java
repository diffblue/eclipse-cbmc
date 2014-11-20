// Generated from ValueExpression.g by ANTLR 4.3

    package expressionparser;
    import trace.*;
    import org.eclipse.emf.common.util.EList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValueExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, STRING=5, WS=6;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "','", "'}'", "'='", "STRING", "WS"
	};
	public static final int
		RULE_expression = 0, RULE_pair = 1, RULE_value = 2, RULE_structDef = 3, 
		RULE_arrayDef = 4;
	public static final String[] ruleNames = {
		"expression", "pair", "value", "structDef", "arrayDef"
	};

	@Override
	public String getGrammarFileName() { return "ValueExpression.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ValueExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionContext extends ParserRuleContext {
		public Value newValue;
		public ValueContext v;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValueExpressionListener ) ((ValueExpressionListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValueExpressionListener ) ((ValueExpressionListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); ((ExpressionContext)_localctx).v = value();
			 ((ExpressionContext)_localctx).newValue =  ((ExpressionContext)_localctx).v.newValue; 
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

	public static class PairContext extends ParserRuleContext {
		public NameValuePair p;
		public Token STRING;
		public ValueContext v;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ValueExpressionParser.STRING, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValueExpressionListener ) ((ValueExpressionListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValueExpressionListener ) ((ValueExpressionListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); ((PairContext)_localctx).STRING = match(STRING);
			setState(14); match(T__0);
			setState(15); ((PairContext)_localctx).v = value();
			 ((PairContext)_localctx).p = new NameValuePair((((PairContext)_localctx).STRING!=null?((PairContext)_localctx).STRING.getText():null).substring(1), ((PairContext)_localctx).v.newValue); 
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

	public static class ValueContext extends ParserRuleContext {
		public Value newValue;
		public Token STRING;
		public StructDefContext s;
		public ArrayDefContext a;
		public ArrayDefContext arrayDef() {
			return getRuleContext(ArrayDefContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ValueExpressionParser.STRING, 0); }
		public StructDefContext structDef() {
			return getRuleContext(StructDefContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValueExpressionListener ) ((ValueExpressionListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValueExpressionListener ) ((ValueExpressionListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value);
		try {
			setState(26);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18); ((ValueContext)_localctx).STRING = match(STRING);
				 ((ValueContext)_localctx).newValue =  TraceFactory.eINSTANCE.createSimpleValue(); ((SimpleValue) _localctx.newValue).setValue((((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null)); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20); ((ValueContext)_localctx).s = structDef();
				 ((ValueContext)_localctx).newValue =  ((ValueContext)_localctx).s.newStruct; 
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(23); ((ValueContext)_localctx).a = arrayDef();
				 ((ValueContext)_localctx).newValue =  ((ValueContext)_localctx).a.newArray; 
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

	public static class StructDefContext extends ParserRuleContext {
		public StructValue newStruct;
		public PairContext p1;
		public PairContext p2;
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public StructDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValueExpressionListener ) ((ValueExpressionListener)listener).enterStructDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValueExpressionListener ) ((ValueExpressionListener)listener).exitStructDef(this);
		}
	}

	public final StructDefContext structDef() throws RecognitionException {
		StructDefContext _localctx = new StructDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((StructDefContext)_localctx).newStruct =  TraceFactory.eINSTANCE.createStructValue(); 
			setState(29); match(T__3);
			setState(30); ((StructDefContext)_localctx).p1 = pair();
			 _localctx.newStruct.getValues().put(((StructDefContext)_localctx).p1.p.getName(), ((StructDefContext)_localctx).p1.p.getValue()); 
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(32); match(T__2);
				setState(33); ((StructDefContext)_localctx).p2 = pair();
				 _localctx.newStruct.getValues().put(((StructDefContext)_localctx).p2.p.getName(), ((StructDefContext)_localctx).p2.p.getValue() ); 
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41); match(T__1);
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

	public static class ArrayDefContext extends ParserRuleContext {
		public ArrayValue newArray;
		public ValueContext v;
		public ValueContext v2;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValueExpressionListener ) ((ValueExpressionListener)listener).enterArrayDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValueExpressionListener ) ((ValueExpressionListener)listener).exitArrayDef(this);
		}
	}

	public final ArrayDefContext arrayDef() throws RecognitionException {
		ArrayDefContext _localctx = new ArrayDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arrayDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ArrayDefContext)_localctx).newArray =  TraceFactory.eINSTANCE.createArrayValue(); 
			setState(44); match(T__3);
			setState(45); ((ArrayDefContext)_localctx).v = value();
			 _localctx.newArray.getValues().add(((ArrayDefContext)_localctx).v.newValue);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(47); match(T__2);
				setState(48); ((ArrayDefContext)_localctx).v2 = value();
				 _localctx.newArray.getValues().add(((ArrayDefContext)_localctx).v2.newValue);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56); match(T__1);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\b=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\35\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\'"+
		"\n\5\f\5\16\5*\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\66\n\6"+
		"\f\6\16\69\13\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2;\2\f\3\2\2\2\4\17\3\2"+
		"\2\2\6\34\3\2\2\2\b\36\3\2\2\2\n-\3\2\2\2\f\r\5\6\4\2\r\16\b\2\1\2\16"+
		"\3\3\2\2\2\17\20\7\7\2\2\20\21\7\6\2\2\21\22\5\6\4\2\22\23\b\3\1\2\23"+
		"\5\3\2\2\2\24\25\7\7\2\2\25\35\b\4\1\2\26\27\5\b\5\2\27\30\b\4\1\2\30"+
		"\35\3\2\2\2\31\32\5\n\6\2\32\33\b\4\1\2\33\35\3\2\2\2\34\24\3\2\2\2\34"+
		"\26\3\2\2\2\34\31\3\2\2\2\35\7\3\2\2\2\36\37\b\5\1\2\37 \7\3\2\2 !\5\4"+
		"\3\2!(\b\5\1\2\"#\7\4\2\2#$\5\4\3\2$%\b\5\1\2%\'\3\2\2\2&\"\3\2\2\2\'"+
		"*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\5\2\2,\t\3\2\2\2"+
		"-.\b\6\1\2./\7\3\2\2/\60\5\6\4\2\60\67\b\6\1\2\61\62\7\4\2\2\62\63\5\6"+
		"\4\2\63\64\b\6\1\2\64\66\3\2\2\2\65\61\3\2\2\2\669\3\2\2\2\67\65\3\2\2"+
		"\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\5\2\2;\13\3\2\2\2\5\34(\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}