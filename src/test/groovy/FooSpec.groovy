class FooSpec extends spock.lang.Specification {

   void "why does this pass"() {
       expect:
       "foo" == '''\
            foo'''.stripIndent()
   }

   void "why does this fail with a compilation error"() {
       when:
       String foo = 'foo'
       
       then:
       foo == '''\
            bar'''.stripIndent()
   }
}
