#01 - UT Scope

![alt tag](/MD/coffee-talk/img/def-unit-test.png)

## Characteristic
* Easy

** Assert.assertEquals(new NameGenerate().generate(), "ONE_NAME");
** Assert.assertEquals(validator.validate(new ValidObject()), true);   

* Unit Tests Should Be Atomic

** [speak]
** Atomic tests are order-independent, relying on and causing no side effects.

* Independent and Isolated

** [speak]
** Order Independent
** Resource Independent   

* Runs Fast

** [speak]

#Example

##single

** [class](/../../JUnitExample-core/src/main/java/org/junitexample/coffeetalk/ut/simple/EmailValidator.java)
** [test](/../../JUnitExample-core/src/test/java/org/junitexample/coffeetalk/ut/simple/EmailValidatorTest.java)

##subtype

### type

** [class](/../../JUnitExample-core/src/main/java/org/junitexample/coffeetalk/ut/subtype/AbstractTransformerCollectionTo.java)
** [test](/../../JUnitExample-core/src/main/java/org/junitexample/coffeetalk/ut/subtype/AbstractTransformerCollectionTo.java)

### subtype

** [class](/../../JUnitExample-core/src/main/java/org/junitexample/coffeetalk/ut/subtype/Bean2XMLTransformer.java)
** [test](/../../JUnitExample-core/src/main/java/org/junitexample/coffeetalk/ut/subtype/Bean2XMLTransformerTest.java)

##depedency

** [class](/../../JUnitExample-core/src/main/java/org/junitexample/coffeetalk/ut/depedency/PasswordValidatorDepency.java)
** [test](/../../JUnitExample-core/src/main/java/org/junitexample/coffeetalk/ut/depedency/PasswordValidatorDepencyTest.java)

** [class](/../../JUnitExample-core/src/main/java/org/junitexample/coffeetalk/ut/depedency/PasswordValidatorImp.java)
** [test](/../../JUnitExample-core/src/main/java/org/junitexample/coffeetalk/ut/depedency/PasswordValidatorImpTest.java) 