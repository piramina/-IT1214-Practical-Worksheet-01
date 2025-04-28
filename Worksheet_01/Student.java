class Student {
    private String name;
    private int regNo;
    private String course;

    Student(String name, int regNo, String course){
        this.name = name;
        this.regNo = regNo;
        this.course = course;
    }

	 public String getName(){
        return name;
    }
	
    public void setName(String name) {
        this.name = name;
    }
	
	public int getregNo(){
        return regNo;
    }

    public void setregNo(int regNo) {
        this.regNo = regNo;
    }

	public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

  
    
    public void display() {
        System.out.println("Student Name: " +name);
        System.out.println("Registration Number: " +regNo);
        System.out.println("Course: " +course);
    }
}
