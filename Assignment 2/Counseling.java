package main.java.util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/**
 * This class simulates the counseling process.
 * @author Amit Sharma
 *
 */
public class Counseling {
	
	/**
	 * method for simulate counseling process
	 * @param candidateQueue - queue of candidate
	 * @param collegeList - list of college
	 * @param input - array of college selected by candidates
	 * @return final list containing candidate and college name
	 */
	public List<String> startCounselling(Queue<Candidate> candidateQueue, List<College> collegeList, int[] input) {
		int inputCounter = 0;
		int choiceForSelectingCollege;
		int totalStudents = candidateQueue.length();
		List<Candidate> candidateList = new ArrayList<Candidate>();
		
		Arrays.sort(candidateQueue.getQueueArray());				//Sorting candidates according to their marks
		
		for(int i = 0; i < totalStudents;i++) {
			Candidate c = candidateQueue.deQueue();
			candidateList.add(c);
			boolean flag = false;
			int j;
			
			/*Iterating through the list of colleges to check 
			 * if seats are available*/
			for( j = 0; j < collegeList.size(); j++) {
				if(collegeList.get(j).isSeatAvailable()) {
					flag = true;
				}
			}
			
			if(flag) {
				/*Choice entered by the candidate.*/
				choiceForSelectingCollege = input[inputCounter++]-1;   	
				
				/*For invalid choice*/
				if(((choiceForSelectingCollege > j)&&(choiceForSelectingCollege <= 0)) || (collegeList.get(choiceForSelectingCollege).getAvailableSeats()<=0)) {
					throw new IllegalArgumentException("Wrong Choice");
				}
				/*Assigning college to Candidate*/
				c.setCollegeName(collegeList.get(choiceForSelectingCollege).getName());
				/*Updating available seats of the selected college*/
				collegeList.get(choiceForSelectingCollege).updateAvailableSeats();
			}
		}
		List<String> result = new ArrayList<>();   		//Final college list for candidates.
		
		for(Candidate c : candidateList) {
			result.add("Name: "+c.getName()+" "+"College Allotted: "+c.getCollegeName());
		}
		return result;
	}

}
