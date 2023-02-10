# Мои наработки Java
## Библиотеки

### Чтение и запись .io:
- import java.io.IOException (исключения);
- import java.io.BufferedReader (быстрый способ чтения и записи файлов, консоли);
- import java.io.File;
- import java.io.FileNotFoundException (обработка исключений);
- import java.io.FileReader;
- import java.util.Scanner (работа со считыванием данных, медленная);
- 


## Конструкции/фичи кода
Конвертация в строку:
    
    int i = 23;
    Integer.toString(i);

Распечатаем сплитованный массив строк:

    string[] arr = "2 2 4 6".split(" ");
    System.out.println(Arrays.ToString(arr));


Нахождения элемента строки по индексу:

    String s = "sdada";
    System.out.println(s.charAt(2));

Префиксный инкримент и постфиксный:

    int a = 123;
    a--; постфиксный инкримент (низкий)
    System.out.println(--a); префиксный инкримент (высокий приоритет)
    boolean f = 123 != 124;
    System.out.println(f);

Побитовый сдвиг:

    int a = 8;
    1000
    a = a << 1; Побитовый сдвиг (10000)
    int b = 18;
    10010
    b = b >> 1; Побитовый сдвиг (1001)
    System.out.println(a);
    System.out.println(b);

Логика:

    int a = 5;  101
    int b = 2;  010 => 111
    System.out.println(a |b);  5 или 2? ответ 7

Аперсанты (быстрые медленные):

    String a = "sad3";
    boolean b = a.length() >= 5 && a.charAt(4) == '1';
    boolean b = a.length() >= 5 & a.charAt(4) == '1';
    System.out.println(b);
    && быстрая аперсанта - если одно false, то все будет false
    & обычная - проверяет в любом случае все выражения на истинность
    || and | работает также

Массивы: 

    int[] arr = new int[4];  одномерный
    System.out.println(arr.length);

    arr = new int[] {3, 2, 1, 6, 8};
    System.out.println(arr.length);
    arr[2] = 5;
    System.out.println(arr[2]);

    int[][] arr = new int[2][4]; двумерный
    for (int i = 0; i < arr.length; i ++){
    for (int j = 0; j < arr[i].length; j++){
    System.out.printf("%d", arr[i][j]);
    }
    System.out.println();
    }

Преобразования:

    byte b = Byte.parseByte("12");  явно
    System.out.println(b);
    
    int i = 234;
    Integer.parseTo...(i);

Считывание данных с консоли:

    Медленный способ:
    import java.util.Scanner;
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("name: ");
    boolean flag = iScanner.hasNextLine();
    System.out.println(flag);
    String name = iScanner.nextLine();
    System.out.printf("Привет, %s!", name);
    iScanner.close();

    Быстрый способ buffer:
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите число: ");
    int a = Integer.parseInt(reader.readLine());
    System.out.println("Введите число: ");
    int b = Integer.parseInt(reader.readLine());
    int c = a + b;
    System.out.println(c);
    reader.close();

Форматированный вывод:

    int z = 2, x = 5;
    int c = z + x;
    String res = String.format("%d + %d = %d\ncomplete", z, x, c);
    System.out.println(res);
    System.out.printf("%d + %d = %d\ncomplete", z, x, c);

    %d - целые числа
    %x - шестнадцатеричные числа
    %f - плавающая запятая
    %e - экспонента
    %s - строковые значения
    %c - вывод одного символа

Функции и методы:

    public class lib {
        static void sayHi() {
            System.out.println("Hello");
        }
    }

Управляющие конструкции:
    int a = 1, b = 2;
    int c = 0;
    if (a > b) c = a;
    else c = b;

    Тернарный оператор:
    int c = a < b ? a : b;  если условие выполняется а < б, то с = а, если нет, то б
    System.out.println(c);

    Оператор выбора:
    int a = 1;
    String text = "";

    switch (a) {
    case 1:
    text = "hello";
    break;
    }
    System.out.println(text);

Циклы:

    int a = 342;
    int count = 0;

    while (a != 0) {
    a /= 10;
    count++;
    }
    System.out.println(count);

    for (int i = 0; i < 10; i++) {
    if (i%2==0) continue;  печает не четные (видит условие и возвращается в начало цикла)
    System.out.println(i);
    }
    лучше обходиться без break continue

    int[] arr = new int[] {1,2,3,4,5,6};  foreach для коллекций
    for (int item : arr) {
    System.out.println(item);
    }

Работа с файлами:

    Запись
    try (FileWriter fw = new FileWriter("file.txt", true)) {
    String line1 = "Its my first line\n";
    String line2 = "Its my second line\n";
    String line3 = "Its my third line\n";
    fw.write(line1 + line2 + line3);
    fw.flush();
    }
    catch(IOException ex){
    System.out.println(ex.getMessage());
    }

    Чтение
    try {
    File file = new File("file.txt");
    FileReader fr = new FileReader(file);
    BufferedReader newReader = new BufferedReader(fr);
    String line = newReader.readLine();

    while (line != null) {
    System.out.println(line);
    line = newReader.readLine();
    }
    } catch (FileNotFoundException e) {
    e.printStackTrace();
    } catch (IOException e) {
    e.printStackTrace();
    }
    }
    }
