

# NameOf macro for Scala
Simple **nameOf** macro for Scala allowing to get variable name from source code as a string

Example:
   
```scala
val someVariable = 5
nameOf(someVariable) shouldEqual "someVariable"
```
