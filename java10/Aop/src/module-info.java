/**
 * 
 */
/**
 * @author mithun
 *
 */
module Aop {
	requires spring.core;
	requires spring.aop;
	requires java.xml.bind;
	requires jdk.xml.bind;
	requires spring.context;
	requires spring.beans;
	requires java.sql;
	requires org.aspectj.runtime;
	exports com.example.bean;
	opens com.example.bean;
}