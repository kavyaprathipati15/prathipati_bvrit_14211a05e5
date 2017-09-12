import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		Student students[];
		Student s1=new Student;
		s1.id=21;
		s1.fullName="Ka P";
		s1.birthDate = "1996-08-15";
		s1.avgMark =100;
		
		Student s2=new Student;
		s2.id=22;
		s2.fullName="Ra M";
		s2.birthDate = "1994-05-15";
		s2.avgMark =80;
		if(students==null)
		throws new IllegalArgumentException
		
		return null;
	}

	@Override
	public void setStudents(Student[] students){
		// Add your implementation here
		int index[];
		if(index<0||index>=student.length())
			throws new IllegalArgumentException
		
		
		
		
			
			
		
	}

	@Override
	public Student getStudent(int index) {
		s1.students=index[1];
		s2.students=index[2];
		if(index<0||index>=student.length())
				throws new IllegalArgumentException
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		
		for(i=0;i<=students.length();i++)
		System.out.println("The index of %d student is:",index);
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
