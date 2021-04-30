
public class Main {

	public static void main(String[] args) {
		Lesson lesson1 = new Lesson (1,"Java","Programlama","Engin Demirog","%57");
		Lesson lesson2 = new Lesson (2,"C#","Programlama","Engin Demirog","%24");
		Lesson lesson3 = new Lesson (3,"C++","Programlama","Engin Demirog","%7");
		Lesson lesson4 = new Lesson (4,"Python","Programlama","Engin Demirog","%100");

		Lesson[] lessons = {lesson1,lesson2,lesson3,lesson4};

		for (Lesson lesson : lessons) {
			System.out.println(lesson.name);

		}

		LessonManager lessonManager = new LessonManager();
		lessonManager.addLesson(lesson1);
		lessonManager.addLesson(lesson2);
		lessonManager.addLesson(lesson3);
		lessonManager.addLesson(lesson4);

	}

}
