package anotherOne.ast.expression.booleanExpr;

import anotherOne.ast.expression.VariablesCollectionVisitor;
import anotherOne.ast.expression.arithmeticExpr.ArithmeticExpression;

public class SmallerThanExpr extends BinaryBooleanExpr{

//	public ArithmeticExpression left;
//	public ArithmeticExpression right;
	
	public SmallerThanExpr(ArithmeticExpression left, ArithmeticExpression right){
		super(left,right);
	}

	@Override
	public boolean accept(BooleanExpressionEvaluationVisitor visitor){//, Map<String, Id> varsMap) {
		return visitor.visit(this);//, varsMap);
	}

	public void accept(VariablesCollectionVisitor visitor){
	visitor.visit(this);
	}
}
