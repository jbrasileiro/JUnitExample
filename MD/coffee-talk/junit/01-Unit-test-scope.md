#01 - UT Scope

## Characteristic (KEYWORDS)
* Easy

    * Assert.assertEquals(new NameGenerate().generate(), "ONE_NAME");
    * Assert.assertEquals(validator.validate(new ValidObject()), true); 

* Atomic

## Principles

### F.I.R.S.T.
* __[F]__ AST
* __[I]__ SOLATED/INDEPENDENT
* __[R]__ EPEATABLE
* __[S]__ ELF-VALIDATING
* __[T]__ HOROUGH/TIMELY
    * Should cover every use case scenario and NOT just aim for 100% coverage.
    * Should try to aim for Test Driven Development (TDD) so that code does not need re-factoring later.


### 3A (AAA).

* __[A]__ rrange
* __[A]__ ct
* __[A]__ ssert

#Example

##single
JUnitExample-core/pom.xml
* [class](/JUnitExample-core/src/main/java/org/junitexample/coffeetalk/ut/simple/EmailValidator.java)
* [test](/JUnitExample-core/src/test/java/org/junitexample/coffeetalk/ut/simple/EmailValidatorTest.java)

##subtype

1. Type

    * [class](/JUnitExample-core/src/main/java/org/junitexample/coffeetalk/ut/subtype/AbstractTransformerCollectionTo.java)
    * [test](/JUnitExample-core/src/test/java/org/junitexample/coffeetalk/ut/subtype/AbstractTransformerCollectionToTest.java)

2. Subtype

    * [class](/JUnitExample-core/src/main/java/org/junitexample/coffeetalk/ut/subtype/Bean2XMLTransformer.java) 
    * [test](/JUnitExample-core/src/test/java/org/junitexample/coffeetalk/ut/subtype/Bean2XMLTransformerTest.java)

##depedency

* DESIGN #01

    * [class](/JUnitExample-core/src/main/java/org/junitexample/coffeetalk/ut/depedency/PasswordValidatorDepency.java)
    * [test](/JUnitExample-core/src/test/java/org/junitexample/coffeetalk/ut/depedency/PasswordValidatorDepencyTest.java)

* DESIGN #02

    * [class](/JUnitExample-core/src/main/java/org/junitexample/coffeetalk/ut/depedency/PasswordValidatorImp.java)
    * [test](/JUnitExample-core/src/test/java/org/junitexample/coffeetalk/ut/depedency/PasswordValidatorImpTest.java) 