# Expression Evaluator Rubric

## Overview

Each criteria for the assignment will be either objective or
subjective. The objective criteria will be based on facts about the
assignment that are identifiable in the submission and can be given a
score by observation. The subjective criteria are based on the
grader's understanding of the submission and the score is determined
by the reviewer alone.

A `feedback.md` file will be provided in the student's git repository
folder. No comment is required if the student achieves a perfect score
on any of the criteria below. A comment will be put inside the
`feedback.md` file if a perfect score is not achieved. The comment
will consists of a copy of the text for the criteria and a brief
explanation of why the points were lost. The final score will be
placed in the `feedback.md` file at the top:

```
Score: X
```

Where `X` is replaced with the student's score.

**The assignment has a total of 235 points.**

## Objective Criteria

### Part 3: Representing Expressions

**O1 (5 points):** Does the submission compile with the `sbt compile`
  command. If it does the student receives 5 points. If it does not
  the student receives 0 points. If the problem is simple then it
  should be corrected by the reviewer and graded according to the rest
  of the rubric. If the problem is complicated or unclear the
  submission receives a 0.

**O2 (8 points):** Does the submission provide a case class definition
  for each of the 8 requested case classes in *Part 3*? 1 point for
  each case class definition (not implementation) for a total of 8
  points.

**O3 (8 points):** Does the submission provide a *toString* method for
  each of the expression case classes? 1 point for each case class
  with a *toString* method for a total of 8 points.

**O4 (13 points):** Run the following command:

```scala
> test-only cs220.evaluator.ExprTestSuite
```

This will run the 13 unit tests testing the expression classes. 1
point for each of the tests that pass.

### Part 4: Environments

**O5 (5 points):** Does the `InitialEnvironment.lookup` method return
  `None`? 5 points if it does. 0 if it does not.

**O6 (8 points):** Does the `InitialEnvironment.extend` method return
  a new `ExtendedEnvironment` with a binding from `v` to `a` and a
  link to the current environment object (`this`)?

* 8 points if the implementation is perfect.
* 6 points if the link is not `this`.
* 4 points if the binding is not correct.
* 1-3 points if there are other problems.
* 0 if no implementation.

**O7 (5 points):** Does the `InitialEnvironment.toString` method
  return the "{}" string? 5 points if it does; 0 otherwise.

**O8 (5 points):** Does the `InitialEnvironment.toList` method return
  the empty list (`List()` or `Nil`)? 5 points if it does; 0
  otherwise.

**O9 (5 points):** Does the `ExtendedEnvironment.lookup` method return
  `Some` if a binding is found for `v` and `None` otherwise?

**O10 (8 points):** Does the `ExtendedEnvironment.extend` method
  return a new `ExtendedEnvironment` with a binding from `v` to `a`
  and a link to the current environment (`this`)?

* 8 points if the implementation is perfect.
* 6 points if the link is not `this`.
* 4 points if the binding is not correct.
* 1-3 points if there are other problems.
* 0 if no implementation.

**O11 (5 points):** Does the `ExtendedEnvironment.toString` method
  return a comma separated list of the bindings surrounded by "{" and
  "}"? 5 points if it does; 0 otherwise.

**O12 (5 points):** Does the submission provide an `Environment`
  object that extends the `InitialEnvironment`? 5 points if it does; 0
  otherwise.

**O13 (6 points):** Does the submission provide ScalaDoc for each of
  the required methods for environments (excluding `toString`)? 1
  point for each ScalaDoc documentation provided.

### Part 5: Evaluation and Interpretation of Expressions

**O14 (20 points):** Does the submission provide a correct
  implementation of the `SimpleEvaluator.eval` method?

1. 5 points for using Scala's `match` expression.
1. 2 points for each `Expr` X that is properly matched and its `evalX`
method called.
1. -4 points if the implementation matches `Program`.
1. 1 points for throwing an `EvaluationException` exception if there
is no match.

**O15 (20 points):** Does the submission provide an implementation for
  each `evalX` method (excluding `evalProgram`)?

1. 2 points for each `evalX` method that is implemented.
1. 3 points if an `EvaluationException` is thrown in `evalVar` when a
binding is not found.
1. 3 points if a new extended environment is created for the binding
in `evalAssign`.

**O16 (10 points):** Does the submission implement the `evalProgram`
method correctly?

1. 5 points if an implementation is provided.
1. 5 points if an `EvaluationException` is thrown if the program is
empty (no expressions to evaluate).

**O17 (8 points):** Does the submission provide ScalaDoc for each of
  the required methods for `SimpleEvaluator`? 1 point for each
  ScalaDoc documentation provided.

**O18 (26 points):** Does the submission pass the provided tests? 1
point for each test that passes.

### Part 6: Testing

**O19 (5 points):** Does the submission provide the file
  `StudentIDNUMBERTestSuite.scala` (replacing IDNUMBER with the
  student's 8-digit spire id number)? 5 points if it does; 0
  otherwise.

**O20 (10 points):** Does the submission provide 10 additional unit
  tests in the provided `StudentIDNUMBERTestSuite.scala` (replacing
  IDNUMBER with the student's 8-digit spire id number)? 10 points for
  each unit test that is provided.

**O21 (10 points):** Run ScalaStyle in `sbt`:

```scala
$ sbt scalastyle
```

Subtract 1 point for each error found in their submission. Provide a
comment in the feedback file explaining the problem (or a copy of the
output).

**O22 (10 points):** Did the submission provide at least 10 `git`
  commits? If there was only a single commit make a note in the
  feedback file for the student to contact course staff to determine
  if it was a git issue.


*Student submitted unit tests will be gathered and applied to all
 submissions at a later date for bonus points to be applied to this
 assignment by the end of the semester.*

## Subjective Criteria

**S1 (10 points):** Did the submission demonstrate good Scala coding
  practices? 10 points if it did; otherwise a sensible number of
  points and comments in the student's `feedback.md` file explaining
  any issues.

**S2 (10 points):** Did the submission demonstrate good ScalaDoc
  comments? 10 points if it did; otherwise a sensible number of points
  and comments in the student's `feedback.md` file explaining any
  issues.

**S3 (10 points):** Did the submission demonstrate good unit tests?
  That is, they were not simply copies of existing unit tests? 10
  points if it did; otherwise a sensible number of points and comments
  in the student's `feedback.md` file explaining any issues.
