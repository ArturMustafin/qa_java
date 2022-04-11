# Unit-test (java)
____


## Сводка
- [Скачивание и запуск проекта](#Скачивание-и-запуск-проекта)
- [Информация о проекте](#Информация-о-проекте)
    - [Информация по отчету jacoco](#Информация-по-отчету-jacoco)
- [Автор](#Автор)


## Скачивание и запуск проекта
<a name="Скачивание-и-запуск-проекта"></a>
Возможно скачать архив или клонировать проект при наличии git.
[Ссылка на скачивание архива](https://github.com/ArturMustafin/CasinoTestTask/archive/master.zip)
Команда для клонирования проекта:
```
$ git clone https://github.com/ArturMustafin/qa_java.git
```
Для запуска тестового набора необходимо в командной строке перейти в директорию проекта и выполнить команду:
```
mvn clean test 
```


## Информация о проекте
<a name="Информация-о-проекте"></a>
1. JDK 11
2. Maven 3.8.1
3. junit 4.13.1
4. mockito 3.12.4
5. jacoco 0.8.7


### Информация по отчету jacoco
<a name="Информация-по-отчету-jacoco"></a>
Для просмотра отчета по результатам прохождения тестов используется команда:
```
mvn verify 
```
Отчет расположен 
```
...\qa_java\target\site\jacoco\index.html
```
Пример отчета: [JaCoCo Overview ](https://docs.google.com/presentation/d/16li1UqAAE_2-gxBfQbJgkmBe2u_pNGSpMuJfK02dQKc/edit?usp=sharing)


## Автор
- **Артур Мустафин** - <artur5mustafin@gmail.com>, <artur90mustafin@mail.ru>
