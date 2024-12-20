package Lambdas.Exercises.Exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmailManager {
    public static void main(String[] args) {
        List<Email> emailList = createEmailList();
        
        // Filtrowanie wysłanych maili
        List<Email> sentEmails = filterEmails(emailList, Email::isSent);
        System.out.println("Wysłane maile:");
        System.out.println(sentEmails);
        
        // Filtrowanie maili po nadawcy lub odbiorcy
        List<Email> bartEmails = filterEmails(emailList, 
            email -> email.getSender().equals("bart@example.com") || 
                     email.getRecipient().equals("bart@example.com"));
        System.out.println("Maile przefiltrowane na podstawie nadawcy lub odbiorcy");
        System.out.println(bartEmails);
    }

    private static List<Email> filterEmails(List<Email> emails, Predicate<Email> predicate) {
        List<Email> filteredEmails = new ArrayList<>();
        for (Email email : emails) {
            if (predicate.test(email)) {
                filteredEmails.add(email);
            }
        }
        return filteredEmails;
    }

    private static List<Email> createEmailList() {
        List<Email> emails = new ArrayList<>();
        emails.add(new Email(
                "joe@example.com",
                "barbara@example.com",
                "Kup bułki",
                "Cześć!, Kup proszę bułki, gdy będziesz wracać z pracy.",
                false)
        );
        emails.add(new Email(
                "carl@example.com",
                "joe@example.com",
                "Nowa inwestycja",
                "Siema! Musimy omówić temat nowej inwestycji, pasuje Ci jutro?",
                true)
        );
        emails.add(new Email(
                "joe@example.com",
                "bart@example.com",
                "Wypad na miasto",
                "Cześć. Idziemy dzisiaj wieczorem z chłopakami na miasto. Dołączasz do nas?",
                true)
        );
        return emails;
    }
}
