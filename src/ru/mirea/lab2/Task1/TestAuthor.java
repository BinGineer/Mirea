package ru.mirea.lab2.Task1;

public class TestAuthor {
    public static void main(String[] args){
        Author Orwall = new Author("George Orwall", "Orwall@email.com", 'm');
        System.out.println(Orwall.toString());
        System.out.println(Orwall.getEmail());
        Orwall.setEmail("GeorgeOrwall@mail.ru");
        System.out.println(Orwall.getEmail());
    }
}
