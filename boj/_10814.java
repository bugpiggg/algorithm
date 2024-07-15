import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class _10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Person[] personList = new Person[n];
        for (int i = 0; i < n; i++) {
            String[] wordList = br.readLine().split(" ");
            personList[i] = new Person(Integer.parseInt(wordList[0]), wordList[1]);
        }

        Arrays.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person s1, Person s2) {
				return s1.age - s2.age;
			}
        });

        StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			sb.append(personList[i]);
		}
        
		System.out.println(sb);
        
        br.close();
    }

    static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name + "\n";
        }
    }
}
