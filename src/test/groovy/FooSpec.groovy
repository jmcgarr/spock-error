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
}
