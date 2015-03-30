package cs220.evaluator

/**
 * An EvaluationException represents a problem with an expression program.
 * An EvaluationException is thrown when there is a problem with
 * evaluating an expression program.
 */
class EvaluationException(msg: String) extends RuntimeException(msg)

/**
 * An EvaluationResult represents the result of an evaluation.
 */
case class EvaluationResult(value: Value, env: Environment)

/**
 * An AbstractEvaluator defines the operations that our evaluator
 * will use to evaluation [[Expr]] objects in an [[Environment]].
 */
abstract class AbstractEvaluator {
  /**
   * eval returns an [[EvaluationResult]] given an expression `expr` and
   * an environment `env`. It determines which of the other `eval` methods
   * to invoke based off of the type of [[Expr]].
   */
  def eval(expr: Expr, env: Environment): EvaluationResult

  /**
   * evalNumber evaluates a [[Number]] `num` in an [[Environment]] `env`.
   */
  def evalNumber(num: Number, env: Environment): EvaluationResult

  /**
   * evalVar evaluates a [[Var]] `v` in an [[Environment]] `env`.
   */
  def evalVar(v: Var, env: Environment): EvaluationResult

  /**
   * evalAdd evaluates an add expression in an [[Environment]] `env`.
   */
  def evalAdd(op: Add, env: Environment): EvaluationResult

  /**
   * evalSub evaluates an subtract expression in an [[Environment]] `env`.
   */
  def evalSub(op: Sub, env: Environment): EvaluationResult

  /**
   * evalMul evaluates a multiply expression in an [[Environment]] `env`.
   */
  def evalMul(op: Mul, env: Environment): EvaluationResult

  /**
   * evalDiv evaluates a divide expression in an [[Environment]] `env`.
   */
  def evalDiv(op: Div, env: Environment): EvaluationResult

  /**
   * evalAssign evaluates an assignment expression in an [[Environment]] `env`.
   */
  def evalAssign(op: Assign, env: Environment): EvaluationResult

  /**
   * evalProgram evaluates a program expression in an [[Environment]] `env`.
   */
  def evalProgram(prog: Program, env: Environment): EvaluationResult
}

// TODO: Part 5 - implement a simple evaluator.
class SimpleEvaluator extends AbstractEvaluator {
  def eval(expr: Expr, env: Environment): EvaluationResult = ???
  def evalNumber(num: Number, env: Environment): EvaluationResult = ???
  def evalVar(v: Var, env: Environment): EvaluationResult = ???
  def evalAdd(op: Add, env: Environment): EvaluationResult = ???
  def evalSub(op: Sub, env: Environment): EvaluationResult = ???
  def evalMul(op: Mul, env: Environment): EvaluationResult = ???
  def evalDiv(op: Div, env: Environment): EvaluationResult = ???
  def evalAssign(op: Assign, env: Environment): EvaluationResult = ???
  def evalProgram(prog: Program, env: Environment): EvaluationResult = ???
}

/** A factory object for an evaluator. */
object Evaluator extends SimpleEvaluator
