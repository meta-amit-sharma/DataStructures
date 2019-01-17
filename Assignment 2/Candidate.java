package main.java.util;
/**
 * This class represents a candidate.
 * @author Amit Sharma
 */
public class Candidate implements Comparable<Candidate> {
	private String name;
	private float marks;
	private String collegeName;
	
	/**
	 * constructor
	 * @param name - name of candidate
	 * @param marks - marks of candidate
	 */
	public Candidate(String name, float marks) {
		this.name = name;
		this.marks = marks;
	}
	
	/**
	 * getter for getting name of candidate
	 * @return name of candidate
	 */
	public String getName() {
		return name;
	}

	/**
	 * setter for name of candidate
	 * @param name - name of candidate
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * getter for getting college of candidate
	 * @return
	 */
	public String getCollegeName() {
		return collegeName;
	}

	/**
	 * setter for college name alloted to candidate
	 * @param collegeName - name of college
	 */
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	/**
	 * method to compare the marks of candidates
	 */
	@Override
	public int compareTo(Candidate candidate) {
		if( this.marks > candidate.marks){
			return -1;
		} else if( this.marks == candidate.marks){
			return  0;
		}else{
			return 1;
		}
	}

}
