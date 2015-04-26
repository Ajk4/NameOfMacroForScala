import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context

object NameOf {

  /**
   * Returns variable name as a string. <br><br>
   *
   * Example:
   * {{{
   *   val someVariable = 5
   *   nameOf(someVariable) shouldEqual "someVariable"
   * }}}
   */
  def nameOf(variable: Any): String = macro nameOf_impl

  def nameOf_impl(c: Context)(variable: c.Expr[Any]): c.Expr[String] = {
    import c.universe._
    val variableName = show(variable.tree)
    c.Expr[String](Literal(Constant(variableName)))
  }

}