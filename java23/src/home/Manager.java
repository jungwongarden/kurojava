package home;

import company.Employee;

//자동 import 컨트롤+쉬프트+o
public class Manager extends Employee {
	private int bonus;
	
	public void test() {
		System.out.println("관리 감독하다.");
	}
	public void print() {
		System.out.println(name); //public
		System.out.println(salary); //protected
		//System.out.println(address); //default
		//System.out.println(rrn); //private
	}
}
