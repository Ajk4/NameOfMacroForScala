import org.scalatest.{Matchers, FlatSpec}

class NameOfTest extends FlatSpec with Matchers {

  import NameOf._

  it should "corectly output variable's name" in {
    val variableName = 3
    nameOf(variableName) shouldEqual "variableName"
  }

}
