package people;

import java.util.ArrayList;

import bugs.Bugs;

public class SoftwareEngineer extends Employee {
	ArrayList<Bugs> List = new ArrayList<Bugs>();
	
	public ArrayList<Bugs> getList() {
		return List;
	}

	public void setList(ArrayList<Bugs> list) {
		List = list;
	}


	Bugs listBugs;
	
	public SoftwareEngineer(String name, String id) {
		super(name, id);
		//create many more things
		//1-100
	}
	
	public SoftwareEngineer(String name, String id, int age, int year) {
		this(name, id);
		//1-100
		//101-300
		//do something with age and year
	}
	
	public SoftwareEngineer(String name, String id, int age, int year, int salary) {
		this(name, id, age, year);
	}

	public void addNewBugs(String id_bugs, int priority){
		Bugs newBugs = new Bugs(id_bugs, priority);
		List.add(newBugs);
	}
	
	public int getTotalScore(ArrayList<Bugs> contacs){
		int totalScore = 0;
		for(int i = 0 ; i < contacs.size(); i ++){
			listBugs= contacs.get(i);
			totalScore = totalScore + listBugs.getScore(listBugs.getPriority());
		}
		return totalScore;
	}
	
	@Override
	public long getSalary() {
		long seSalary = super.getSalary() + 1300000;
		return seSalary;
	}
	

	public long getSalary(int totalScore) {
		long seSalary = super.getSalary() + 1300000 + (totalScore*10000) ;
		return seSalary;
	}
	
}
