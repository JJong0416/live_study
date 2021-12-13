package stream;

import stream.domain.Person;

import java.util.*;
import java.util.stream.Collectors;

public class streamTest {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("박종찬",20,"010-1111-2222",15.2),
                new Person("하성화",21,"010-2222-3333",18.3),
                new Person("김민석",22,"010-3333-4444",20.5),
                new Person("이지수",22,"010-4444,5555",21.5)
        );

        List<String> streamNameList = personList.stream()
                .filter(person -> person.getAge() > 21)
                .sorted(Comparator.comparing(Person::getHouseArea))
                .map(Person::getPhoneNumber)
                .collect(Collectors.toList());

        Iterator<String> iter = streamNameList.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next() + " ");
        }
    }
}
