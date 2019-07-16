# TestFirstDevelopment
Test-driven development (TDD)  is an evolutionary approach to development which combines test-first development (TFD), 
where you write a test before you write just enough production code to fulfill that test, and refactoring. 
The primary goal of TDD is to make the code clearer, simple and bug-free.

## How to perform TDD Test
1. Add a test with a new requirement
2. Run all tests and ckeck if all the test fails (news and older)
    - If some test fails, write only the necessary code to pass it
    - If any test fails, continue with the next step
4. Refactor code
5. Ensure the tests all still pass
6. Repeat

![alt text](https://robertonovacid.files.wordpress.com/2014/01/tdd_flow.gif)

### At each point in the TDD cycle:
- Write a small test
- Ensure the new test fails. If it doesn’t, why not? 
- Write the code you think makes the test pass. Are you writing no more
code than needed to meet the current set of behaviors specified by the
tests? 
- Ensure all the tests pass. If not, did you code things incorrectly, or is your
specification incorrect?
- Clean up the code changes you just made. 
- Ensure the tests all still pass. Do you trust that you have adequate unit
test coverage? 

## The Three Rules of TDD
Robert C. Martin provides a concise set of rules for practicing TDD:
1. Write production code only to pass a failing unit test.
2. Write no more of a unit test than sufficient to fail (compilation failures
are failures).
3. Write no more production code than necessary to pass the one failing
unit test.

Bibliography: Langr, Jeff. Modern C++ Programming with Test-Driven Development: Code Better, Sleep Better.
