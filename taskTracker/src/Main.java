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

        // Добавление задач

        Task task1 = new Task("Задача 1");
        Task task2 = new Task("Задача 2");
        Task task3 = new Task("Задача 3");

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);

        //  Добавление Эпиков

        Epic epic1 = new Epic("Эпик 1");
        Epic epic2 = new Epic("Эпик 2");
        Epic epic3 = new Epic("Эпик 3");

        taskManager.addEpic(epic1);
        taskManager.addEpic(epic2);
        taskManager.addEpic(epic3);

        // Добавление подзадач к Эпикам

        SubTask subTask1 = new SubTask("Подзадача 1",3,taskManager.getEpicList().get(3));
        SubTask subTask2 = new SubTask("Подзадача 2",3,taskManager.getEpicList().get(3));
        SubTask subTask3 = new SubTask("Подзадача 3",3,taskManager.getEpicList().get(3));

        taskManager.addSubTask(3,subTask1);
        taskManager.addSubTask(3,subTask2);
        taskManager.addSubTask(3,subTask3);

        // Распечатка всего

        System.out.println("Простые задачи: ");

        for (Integer key  : taskManager.getTaskList().keySet()){
            System.out.print(taskManager.getTaskList().get(key).getTaskName());
            System.out.println(" с ключем : "+key);
        }

        System.out.println("Эпики : ");

        for (Integer key  : taskManager.getEpicList().keySet()){
            System.out.print(taskManager.getEpicList().get(key).getTaskName());
            System.out.println(" с ключем : "+key);
        }

        System.out.println("Подзадачи: ");

        for (Integer key  : taskManager.getEpicList().get(3).getSubTaskList().keySet()){
            System.out.print(taskManager.getEpicList().get(3).getSubTaskList().get(key).getTaskName());
            System.out.println(" с ключем : "+key);
        }



        System.out.println("Статус эпика с подзадачами");

        System.out.println(taskManager.getEpicList().get(3).getProcessDone().toString());

        System.out.println("Сменим одну подзадачу на IN_PROGRESS и посмотрим как изменился статус эпика");

        subTask1.setProcessDone(ProcessReadness.IN_PROGRESS);

        System.out.println(taskManager.getEpicList().get(3).getProcessDone().toString());



        System.out.println("Сменим все подзадачи на IN_PROGRESS и посмотрим как изменился статус эпика");

        subTask1.setProcessDone(ProcessReadness.IN_PROGRESS);
        subTask2.setProcessDone(ProcessReadness.IN_PROGRESS);
        subTask3.setProcessDone(ProcessReadness.IN_PROGRESS);

        System.out.println(taskManager.getEpicList().get(3).getProcessDone().toString());

        System.out.println("Удаление одной задачи c индексом 0, эпика с индексом 4 и подзадачи с индексом 6");

        taskManager.RemoveTask(0);
        taskManager.RemoveEpic(4);
        taskManager.RemoveSubTask(3,6);

        // Распечатка всего

        System.out.println("Простые задачи: ");

        for (Integer key  : taskManager.getTaskList().keySet()){
            System.out.print(taskManager.getTaskList().get(key).getTaskName());
            System.out.print(" со статусом - "+ taskManager.getTaskList().get(key).getProcessDone().toString());
            System.out.println(" с ключем - "+key);
        }

        System.out.println("Эпики : ");

        for (Integer key  : taskManager.getEpicList().keySet()){
            System.out.print(taskManager.getEpicList().get(key).getTaskName());
            System.out.print(" со статусом - "+ taskManager.getEpicList().get(key).getProcessDone().toString());
            System.out.println(" с ключем - "+key);
        }

        System.out.println("Подзадачи: ");

        for (Integer key  : taskManager.getEpicList().get(3).getSubTaskList().keySet()){
            System.out.print(taskManager.getEpicList().get(3).getSubTaskList().get(key).getTaskName());
            System.out.print(" со статусом - "+ taskManager.getEpicList().get(3).getSubTaskList().get(key).getProcessDone().toString());
            System.out.println(" и ключем - "+key);
        }



        System.out.println("Окончание тестирования!");


    }

}