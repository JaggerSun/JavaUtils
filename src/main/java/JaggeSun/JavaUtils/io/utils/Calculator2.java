package JaggeSun.JavaUtils.io.utils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public enum Calculator2 {
	Instance;
	private final static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");
	public Object cal(String expression) throws ScriptException{
		return jse.eval(expression);
	}
}