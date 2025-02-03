import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import java.util.Scanner;

public class Main {
    public static void printMenu(){
        System.out.println("Что вы хотите сделать?");
        System.out.println("Добавить задачу - 1;");
        System.out.println("Добавить эпик - 2;");
        System.out.println("Добавить подзадачу - 3.");
    }
    public static void main(String[] args) {
        System.out.println("Начало тестирования: ");

        TaskManager taskManager = new TaskManager();

        while(true) {
            Scanner scanner = new Scanner(System.in);
            printMenu();

            int work = scanner.nextInt();
            System.out.println("Вы ввели " + work);

            switch (work) {
                case (1): {
                    System.out.println("Добавление задачи: ");
                    Task task1 = new Task("Задача 1");
                    Task task2 = new Task("Задача 2");
                    Task task3 = new Task("Задача 3");

                    taskManager.addTask(task1);
                    taskManager.addTask(task2);
                    taskManager.addTask(task3);

                    System.out.println("Список задач: ");

                    for (Integer key  : taskManager.getTaskList().keySet()){
                        System.out.print(taskManager.getTaskList().get(key).getTaskName());
                        System.out.println(" с ключем : "+key);
                    }


                    System.out.println("Успешно!");
                    break;
                }
                case (2): {
                    System.out.println("Добавление эпика: ");

                    Epic epic1 = new Epic("Эпик 1");
                    Epic epic2 = new Epic("Эпик 2");
                    Epic epic3 = new Epic("Эпик 3");

                    taskManager.addEpic(epic1);
                    taskManager.addEpic(epic2);
                    taskManager.addEpic(epic3);

                    System.out.println("Список эпиков: ");

                    for (Integer key  : taskManager.getEpicList().keySet()){
                        System.out.print(taskManager.getEpicList().get(key).getTaskName());
                        System.out.println(" с ключем : "+key);
                    }
                    System.out.println("Успешно!");
                    break;
                }
                case (3): {
                    System.out.println("Добавление подзадачи: ");

                    System.out.println("Список доступных эпиков: ");

                    for (Integer key  : taskManager.getEpicList().keySet()){
                        System.out.print(taskManager.getEpicList().get(key).getTaskName());
                        System.out.println(" с ключем : "+key);
                    }

                    SubTask subTask1 = new SubTask("Подзадача 1",3);
                    SubTask subTask2 = new SubTask("Подзадача 2",3);
                    SubTask subTask3 = new SubTask("Подзадача 3",3);

                    taskManager.addSubTask(taskManager.getEpicList().get(3),subTask1);
                    taskManager.addSubTask(taskManager.getEpicList().get(3),subTask2);
                    taskManager.addSubTask(taskManager.getEpicList().get(3),subTask3);

                    for (Integer key  : taskManager.getEpicList().get(3).getSubTaskList().keySet()){
                        System.out.print(taskManager.getEpicList().get(3).getSubTaskList().get(key).getTaskName());
                        System.out.println(" с ключем : "+key);
                    }


                    break;
                }
                default: {
                    System.out.println("Не знаю такой команды.");
                    System.out.println("Конец тестирования.");
                    return;
                }
            }
        }

    }

}