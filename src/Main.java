
public class Main {
    public static void main(String[] args) {
        var dog = 8.0 ;

        System.out.println(dog);

var cat = 3.6 ;

        System.out.println (cat);

 var paper = 763789 ;

         System.out.println(paper);

          dog = dog + 4;

        System.out.println(dog);

          cat = cat + 4;

        System.out.println(cat);
        paper = paper + 4;

        System.out.println(paper);

        dog = dog - 3.5;

        System.out.println(dog);

        cat = cat - 1.6;

        System.out.println(cat);
        paper = paper - 7639;

        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2 ;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxing = 78.2;
        System.out.println(firstBoxing + " килограмм");
        var secondBoxing = 82.7;
        System.out.println(secondBoxing + " килограмм");
        var totalWeight = firstBoxing + secondBoxing;
        System.out.println("Общий Вес боксеров " + totalWeight + " килограмм ");
        var differenceWeight = secondBoxing % firstBoxing;
        System.out.println("разница между весами бойцов " + differenceWeight + " килограмм ");
        var differenceWeight2 = secondBoxing - firstBoxing;
        System.out.println("разница между весами бойцов " + differenceWeight2 + " килограмм ");

        var totalWork = 640;
        var time = 8;
        var work = totalWork / time ;
        System.out.println( "Всего работников в компании - " + work + " человек ");

        var work2 = work + 94;
        var moreWork = totalWork / work2;
        System.out.println( "Если в компании работает " + work2 + " человек , то всего " + moreWork + " часа работы может быть поделено между сотрудниками");



    }
}