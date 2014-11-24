class FooSpec extends spock.lang.Specification {

   void "expect this pass with no exceptions"( ){
       expect:
       "foo" == '''\
            foo'''.stripIndent()
   }

   void "expect this to fail the assert but throws an exception instead"() {
       expect:
       "bar" == '''\
            foo'''.stripIndent()
   }

   void "expect this to fail the assert, but throws an exception instead (using different syntax)"() {
       when:
       String foo = 'foo'
       
       then:
       foo == '''\
            bar'''.stripIndent()
   }

   void "expect this to fail the assert"() {
       expect:
       "bar" == '''\
foo'''
   }

   void "expect this to fail the assert (multiline string in when)"() {
        when:
	      String expected = '''\
		        foo'''.stripIndent()

        then:
        "bar" == expected
   }

   void "fails as expected"() {
	expect:
        "bar" == '''foo
               foo'''.stripIndent()
   }
}
