package com.mile1.service;
import com.mile1.bean.*;
import com.mile1.exception.*;
public class StudentReport {
	public String findGrades(Student studentObject)
	{
		int a[]=studentObject.marks;
		String grade;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<35)
				return "F";
			sum=sum+a[i];
			
		}
		if(sum<150)
			grade="C";
		else if(sum<200)
			grade="B";
		else if(sum<250)
			grade="A";
		else
			grade="A+";
		return grade;
	}
	public String validate(Student s)throws NullNameException , NullMarksArrayException , NullStudentObjectException
	{
		if(s==null)
			throw new NullStudentObjectException();
		if(s.name==null)
			throw new NullNameException();
		
		else if(s.marks==null)
			throw new NullMarksArrayException(); 
		else
			return "VALID";
	}
	public int findNumberOfNullMarksArray(Student s[]){
		int c=0;
		for(int i=0;i<s.length;i++)
		{
		if(s[i]==null) {
			if(s[i].marks==null)
				c++;
		}
		}
		return c;
	}
}
