package o1_ProgrammingByBook.Chapter_1_LetsProgram.a2_AnalyzeFirstProgram;

// Сега анализираме кода на програмата. Първата инструкция е
import javax.swing.*; // е неоходима, за да може да
// използван в програмата класът JOptionPane от библиотеката Swing.

/*
* Бележка:
* Библиотека Swing съдържа набор от класове за разработване на приложения с графичен интерфейс. Тя е
* неотменна част от платформата на Java. С библиотеката Swing ще се запознаем отблизо малко по-късно
* когато ще разгледаме създаването на приложения с графичен интерфейс.
*
* Диалговоия прозорец на нашата програма се показва с помощта на метода showMessageDialog(). Това е статичен
* метод на класа JOptionPane - с други думи, методът е дефиниран в този клас и да се говори за метод
* showMessageDialog() извън контекта на класа JOptionPane просто няма смисъл.
*
* Детайли:
* При извикване на един метод се изпълнява определен блок от програмен код или съвкупност от команди.
* В конкретния случай дори не е важна какви конкретно команди се изпълняват при извикването на метод
* showMessageDialog(), а е важен резултатът - създава се и се покзва диалогов прозорец. Т.е ние просто
* използваме един вече съществуващ метод, създаден не от нас.
* Методите биват статични и обикновени, или нестатични. Ако методът е обикновен (нестатичен), тогава той се
* извиква от обекта. Засега такива методи не ни интересуват. Статичните методи се извикват от класа, в
* който те са дефинирани. С други думи, при извикване на статичен метод е необходимо да бъде указан класът
* в който е дефиниран методът showMessageDialog() e дефиниранв клака JOptionPane на свой ред влиза в състава
* на библиотеката Swing.
*
* В общия случай инстукцията import се използва за импортиране /добавяне/ в програмата на всевъзможни полезни
* инструменти - обикновено класове. При това след инструкцията import се задава не просто името на импортирания
* клас, а пълния път към него, покзващ йерархията на пакетите чак до мястото в което се намира класът.
* В частност, изразът javax.swing.JOptionPane означава, че класът JOptionPane влиза в пакета swing, който е
* подпакет на пакета javax.
* Целия останал код отпрограмата представлява дефиниране на класа ShowMeAWindowDemo. Аефинирането на класа
* започва с ключова дума class, след която следва името на класа. Изразът class ShowMeAWindowDemo, например
* означава , че се дефинира клас с името ShowMeAWindowDemo.
*
* Детайли:
* В Java се използва система за разпределение на класовете по пакети. Идеята е в пределите на пакета имената на всички
* влизащи в състава на този пакет класове да са уникални /различни/, но ако класовете се намират в различни пакети
* техните имена могат да съвпадат. Следтсвията от това са следните: всеки классе пази в някакъв пакет, при което
* самия пакет може да влиза в състава на друг пакет и т.н. (пакет, влизащ в състава на друг пакет се нарича подпакет). В
* крайна сметка се получава йерархия от пакети. Когато в import инстуркцията се указва името на импортирания клас, заедно
* с името на класа се пише и цялата йерархична верига на пакетите.
*
* Бележка:
* Названието на класа съвпада с името, което въведохме в полето Create Main Class при създаването на проеткта. В програмата
* могат да бъдат дефинирани и използвани няколко класове, но след тях зъдлъжително (ако не става дума за аплети) трябва да има
* главен клас (В него се дефинира главния метод на програмата). Името на главия клас съвпада с името, зададено в полето Create Main Class.
* В кокретния случай в прогарама се дефинира (явно) само един клас, който се явава и главен клас.
*
* Самото описание на класа се съдължа във фигуралните скоби (между отварщята скоба { и затварящя скоба}). Класът се състои
* само от главния метод на програмата. Този метод се нарича main(). Пред името му са оказани следните ключови думи:
*
* * Инстуркция public означава, че методът е открит и може да бъде достъпен и извън пределите на класа. Имайки предвид, че
* изпълнението на програмата представлява изпълнение на кода на методът main(), тогава достъпността на този метод изън
* пределите на класа е напълно логична.
* * Ключовата дума static означава, че методът е статичен и за неговото извикване не е необходимода бъде зъдаван обект
* (методът се извиква от класа). Това също е напълно логично, тъй като за създаването на обект е нужно да бъде стартирана
* програмата, за което пък следва да бъде извикан методът main(). Ако методът main() не беше статичен, за да бъде извикан,
* трябваше да се създаде обект, който обаче може да бъде създаден, само слекато програмата бъде стартирана, и т.н. - получава
* се затворен кръг.
* * Ключовата дума void означава, че методът main() не връща резултат. Тук също всичко е логично, тъй като просто няма
* къде да бъде върнат такъв резултат.
*
* Бележка:
* Методите могат да връщат резултат. Ако един метод връща някъква стойност в качестово на друг резултат, тогава
* инструкцията за извикванетона метода може да бъде използвана във всеки израз, отъждествявайки се с въщания резултат.
* Има и методи, които не връщат резултат. При извикването на такива методи просто бива изпълнена определена последователност
* от команди (каквито именно - зависи от описанието на метода).
*
* След името на главния метод main(), в кръгли скоби е указана  инструкцията String[] args. С тази конструкция се декларира
* аргументът args на метод main(), който сам по себе си представлява текство масив. В програмния код ние не използваме аргумента
* на метод main(). Въпреки това, по правилата на Java аргументът на главния мето трябва да бъде деклариран.
*
* Детайли:
* Един метод може да има аргументи - сойности, които се предават на метода при извикването му и от който зависи резултатът
* от изпълнението на метода. При извикване на метода аргументите му се задават, отделяни с запетая, в кръгли скоби след името
* на метода. Ако методът няма аргументи, тогава при извикването му след името се пишат празни скоби .
* Що се отнася до главния метод на програмата, той има аргументи (по-точно един аргумент, но той представлява текстов масив -
* съвкупност от текствони стойности). По този начин при стартирането на програмата могат да и бъдат предавани параметри.
* Именно параметрите, който се предаватна програмата при стартирането й, се отъждествяват с текстовия масив, който се явява
* аргумент на метод main(). Аргументите на главния мето не се използват много често. Ние също те възнамеряваме да ги използваме.
* Въпреки това, стандартът за дефиниране на метод main() предполага и деклариране на аргумента на метода.
*
* Ключовата дума String представлява името на класа, чрез обектите на който в Java се реализират текстови стойности.
* Обектите ще, разгледаме по-късно, а за сега ще отъждествим идентификатора String със стойност от текстов тип. Празните
* квадратни скоби [] след ключовата дума String покзват, че имаме работа с масив. Името на аргумента на главния метод
* може да бъде произволно (но традизионно се нарича args).
*
*
* */

public class Analyze {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Първа прогарама на Java");
    }
}
