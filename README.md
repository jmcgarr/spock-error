Mysterious Spock Exception
===========

While authoring some spock tests, I noticed that a certain syntax in my test would pass just fine if the conditions were met, but would throw an exception if the test condition was not met.  I am using this project to isolate the error conditions. 

To replicate the errors, just clone this repo and run:

```
./gradlew test
```

What's wrong
===========

In all tests, my asserts look something like this:
```
      "foo" == '''\
           foo'''.stripIndent()
```
Where I am asserting equality of a string to a Groovy multiline string.  The problem only occurs when:

1. I include the assert in a Spock 'expects' or 'when' block
1. I use the backslash as the first charecter in the Groovy multiline string

Would love some insight into why this is happening.
