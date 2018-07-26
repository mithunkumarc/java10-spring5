/*

  Both @Autowired (or @Inject) and @Resource work equally well. 
  But there is a conceptual difference or a difference in the meaning

    @Resource means get me a known resource by name. 
    The name is extracted from the name of the annotated setter or field, or it is taken from the name-Parameter.
    
    @Inject or @Autowired try to wire in a suitable other component by type.




 * @Resource does the same thing as @Annotation
 * difference : approach 
 * 
 * @Autowired and @Inject : follow below flow
    Matches by Type
    Restricts by Qualifiers
    Matches by Name

	@Resource :	follow below flow
    Matches by Name
    Matches by Type
    Restricts by Qualifiers (ignored if match is found by name)

	
	
 * The JSR 250 @Resource annotation is used to mark a reference as a resource. 
 * This annotation may be applied on class, field and method.
	Spring supports injection using the @Resource annotation, 
	when it is applied on a field or setter method of a bean.
	The @Resource annotation follows by-name semantics i.e. 
	it takes a name attribute for injection, which is analogous to ‘autowiring by Name’ in XML based configuration.
	
	@Resource 	javax.annotation -	Java
	@Autowired 	org.springframework.bean.factory -	Spring
*/


Both @Autowired (or @Inject) and @Resource work equally well. 
But there is a conceptual difference or a difference in the meaning

    @Resource means get me a known resource by name. 
    The name is extracted from the name of the annotated setter or field, or it is taken from the name-Parameter.
    
    @Inject or @Autowired try to wire in a suitable other component by type.

So, basically these are two quite distinct concepts. Unfortunately the Spring-Implementation of @Resource has a built-in fallback, which kicks in when resolution by-name fails. In this case, it falls back to the @Autowired-kind resolution by-type. While this fallback is convenient, IMHO it causes a lot of confusion, because people are unaware of the conceptual difference and tend to use @Resource for type-based autowiring.



source : https://www.sourceallies.com/2011/08/spring-injection-with-resource-and-autowired/#more-2350
