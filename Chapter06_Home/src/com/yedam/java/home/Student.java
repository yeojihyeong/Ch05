package com.yedam.java.home;

public class Student {
	//필드
	private int studentID;	//학번
	private String studentName;	//이름
	private Subject[] subjectList;//수강과목 목록
	private int subjectIndex = 0; //수강과목 목록에 저장된 수강과목 수 
	
	//생성자
	public Student(int studentID, String studentName) {
		this.studentID = studentID;//매개변수를 통해 학번 초기화
		this.studentName = studentName;//매개변수를 통해 이름 초기화
		this.subjectList = new Subject[3];//수강가능한 과목 수는 3개
		
	}
	
	public void addSubject(String name, int scorePoint) {
		Subject subject = new Subject();//수강과목 정보를 담을 인스턴스 생성하기
		subject.setName(name);//매개변수를 통해 과목이름 추가하기
		subject.setScorePoint(scorePoint);//매개변수를 통해 점수 추가하기
		subjectList[subjectIndex++]=subject;//배열에 저장하기
	}
	
	
	public void showStudentInfo() {
		int total = 0;
		for(int i = 0 ; i <subjectIndex ; i++)//for문을 통해 학생의 수강과목과 과목의 점수를 모두 출력하세요.
		{
		System.out.printf("학생 %s 의 %s 과목은 %d점입니다\n",studentName,subjectList[i].getName(),subjectList[i].getScorePoint());	
		}
		//출력형태 : 학생 홍길동의 수학 과목은 80점입니다.
		
		//학생의 총점을 계산해서 출력하세요.
		
		int sum = 0;
		for(int i=0 ; i<subjectIndex;i++) {
			sum+=subjectList[i].getScorePoint();
		
		}
		System.out.printf("학생 %s의 총점은 %d점 입니다.\n",studentName,sum);
		//출력형태 : 학생 홍길동의 총점은 300점입니다.
	}
	
	
	
}
