/**
 * 
 */
/**
 * @author mithun
 *
 */
module DIXML {
	requires spring.core;
	requires spring.context;
	requires spring.beans;
	requires java.sql;
	exports com.example;
	opens com.example;
}